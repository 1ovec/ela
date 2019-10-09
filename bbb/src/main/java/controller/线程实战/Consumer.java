package controller.线程实战;

/**
 * @author admin
 * @ClassName Consumer
 * @Description
 * @Date 2019/9/11
 */
public class Consumer implements Runnable {
  //共享资源对象
  public static Person p=null;

  public Consumer(Person p) {
    this.p=p;
  }

  @Override
  public void run() {
    for(int i=0; i < 50; i++) {
      //消费对象
      p.pop();
    }
  }
}
