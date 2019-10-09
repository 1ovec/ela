package 多线程;

/**
 * @author admin
 * @ClassName RunnableTest
 * @Description
 * @Date 2019/7/22
 */
public class RunnableTest implements Runnable {

  @Override
  public void run() {
    Thread.currentThread().setName("lovec");
    System.out.println(Thread.currentThread().getName() + " subthread start");
    System.out.println(Thread.currentThread().getName() + " subthread end");
  }
}
