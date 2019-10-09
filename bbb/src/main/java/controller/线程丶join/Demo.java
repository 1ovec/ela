package controller.线程丶join;

/**
 * @author admin
 * @ClassName Demo
 * @Description
 * @Date 2019/9/17
 */
public class Demo implements Runnable {

  @Override
  public void run() {
    for(int x=0; x < 70; x++) {
      System.out.println(Thread.currentThread().toString() + "....." + x);
      Thread.yield();
    }
  }
}
