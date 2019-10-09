package controller.线程池;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author admin
 * @ClassName CreatThreadPool
 * @Description
 * @Date 2019/9/18
 */
public class CreatThreadPool {
  static  Map<String, Object> map=new HashMap<String, Object>();
  static List<Integer>list =new ArrayList<Integer>();
  public static void main(String[] args) {

    ExecutorService executorService=Executors.newFixedThreadPool(10);
    Future<Object> submit=executorService.submit(new Callable<Object>() {
      public Object call() {
        for(int i=0; i < 50; i++) {
          System.out.println(Thread.currentThread().getName() + "---->" + i);
          list.add(i);
        }
        return "aaaa";
      }
    });

    Future<Object> submit2=executorService.submit(new Callable<Object>() {
      public Object call() {
        for(int i=50; i < 100; i++) {
          System.out.println(Thread.currentThread().getName() + "---->" + i);
          list.add(i);
        }
        return "zzzz";
      }
    });
    try {
      System.out.println(list.toString());
      Object o=submit.get();
      Object o1=submit2.get();
      System.out.println(o1 == null ? null :o1.toString());
      System.out.println(o == null ? null :o.toString());
    } catch(InterruptedException e) {
      e.printStackTrace();
    } catch(ExecutionException e) {
      e.printStackTrace();
    }
  }

}
