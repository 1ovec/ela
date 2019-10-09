package controller.线程;

/**
 * @author admin
 * @ClassName TheadTest
 * @Description
 * @Date 2019/9/11
 */
public class TheadTest {

  public static void main(String[] args) {
    MyThead th1=new MyThead();
    Thread thread=new Thread(th1);
    Thread thread1=new Thread(th1);
    Thread thread2=new Thread(th1);
    thread.start();
    thread1.start();
    thread2.start();
  }
}
