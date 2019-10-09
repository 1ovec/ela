package 多线程;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/22
 */
public class Test {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName()+" - thread start");
    RunnableTest runnableTest = new RunnableTest();
    Thread thread = new Thread(runnableTest);
    thread.start();
    System.out.println(Thread.currentThread().getName()+" - thread end");
  }
}
