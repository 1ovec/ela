package controller.线程丶join;

/**
 * @author admin
 * @ClassName JoinDemo
 * @Description
 * @Date 2019/9/17
 */
public class JoinDemo {
  public static void main(String[] args) throws Exception {
    Demo d=new Demo();
    Thread t1=new Thread(d);
    Thread t2=new Thread(d);
    t1.start();

    //t1.setPriority(Thread.MAX_PRIORITY);

    t2.start();

    t1.join();

    for(int x=0; x < 80; x++) {
      //System.out.println("main....."+x);
    }
    System.out.println("over");
  }
}
