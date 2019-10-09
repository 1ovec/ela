package controller.线程3;

/**
 * @author admin
 * @ClassName Pp
 * @Description
 * @Date 2019/9/16
 */
public class Pp implements Runnable {

  public static int NUM=50;

  String name ;

  public Pp(String name) {
    this.name=name;
  }

  @Override
  public void run() {
    for(int i=0; i < 50; i++) {
      if(NUM > 0) {
        NUM--;
        System.out.println("Thread "+name+" get one tick---------this tick=" + NUM);
      }
    }
  }
}
