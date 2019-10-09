package controller.线程3;

import controller.User;

import java.util.concurrent.Callable;

/**
 * @author admin
 * @ClassName TestThread
 * @Description
 * @Date 2019/9/16
 */
public class TestThread<T> implements Callable<T> {

  @Override
  public T call() throws Exception {
    System.out.println("thread call-method is run ning !");
    return (T) new User("love",11);
  }
}
