package controller.线程3;

/**
 * @author admin
 * @ClassName Dd
 * @Description
 * @Date 2019/9/16
 */
public class Dd implements Runnable {

   static int  NUM=50;

  @Override
  public void run() {
    for(int i=0; i < 20; i++) {
      if(NUM > 0) {
        NUM--;
        System.out.println(Thread.currentThread().getName() + "Thread get one tick---------this tick=" + NUM);
      }
    }
  }
}
