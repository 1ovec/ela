package 多线程.实现callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/22
 */
public class Test {
  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();

    System.out.println(Thread.currentThread().getName()+" main thread start");

    ExecutorService executor = Executors.newSingleThreadExecutor(); //创建线程池
    MyCallable callableTest = new MyCallable();
    executor.submit(callableTest);

    System.out.println(Thread.currentThread().getName()+" main thread end");
  }
}
