package controller.线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author admin
 * @ClassName Test8
 * @Description
 * @Date 2019/9/24
 */
public class Test8 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    long start = System.currentTimeMillis();

    // 开启线程执行
    // 注意，此处Future对象接收线程执行结果不会阻塞，只有future.get()时候才会阻塞（直到线程执行完返回结果）
    Future future1 = executorService.submit(new SelectTask<>(new Test8(), "selectAaData", new Object[]{"aaaa"}));
    Future future2 = executorService.submit(new SelectTask<>(new Test8(), "selectBblData", new Object[]{"aaaa"}));
    Future future3 = executorService.submit(new SelectTask<>(new Test8(), "selectCcData", new Object[]{"aaaa"}));
    //此处用循环保证三个线程执行完毕，再去拼接三个结果
    do{
      System.out.println("多任务同时执行中...");
    }while (!(future1.isDone() && future2.isDone() && future3.isDone()));

    String result = (String)future1.get() + future2.get() + future3.get();

    long end = System.currentTimeMillis();
    System.out.println("并行执行：" + (end-start));
    System.out.println(result);

  }

  //下面是三个真正执行任务（查数据库）的方法
  public String selectAaData(String cardId) throws Exception{
    String result = "AAAA";
    Thread.sleep(1000);    //模拟添加1s耗时
    return result;
  }

  public String selectBblData(String cardId) throws Exception{
    String result = "BBBB";
    Thread.sleep(1000);
    return result;
  }

  public String selectCcData(String cardId) throws Exception{
    String result = "CCCC";
    Thread.sleep(1000);
    return result;
  }


}
