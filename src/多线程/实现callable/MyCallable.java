package 多线程.实现callable;

import java.util.concurrent.Callable;

/**
 * @author admin
 * @ClassName MyCallable
 * @Description
 * @Date 2019/7/22
 */
public class MyCallable implements Callable {

  @Override
  public Object call() throws Exception {
    System.out.println(Thread.currentThread().getName()+" thead start");
    System.out.println(Thread.currentThread().getName()+" thead end");
    return null;
  }
}
