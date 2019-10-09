package controller.线程3;

import controller.User;
import org.junit.jupiter.api.Test;

import java.util.concurrent.FutureTask;

/**
 * @author admin
 * @ClassName MyTest
 * @Description
 * @Date 2019/9/16
 */
public class MyTest {

  public static void main(String[] args) {
    try {
      //noinspection unchecked
      FutureTask<User> a=new FutureTask<>(new TestThread());
      Thread thread=new Thread(a);
      thread.start();
      System.out.println("a------>" + a);
      while(!a.isDone()) {
        System.out.println(a.get());
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("---------------------nothing-->");
    }

  }

  private static int NUM=50;

  @Test
  public void test1() {
    /*new Thread(() -> {
      for(int i=0; i < 50; i++) {
        if(NUM>0){
          NUM--;
        }
        System.out.println("Thread one get one tick---------this tick="+NUM);
      }
    }).start();

    new Thread(() -> {
      for(int i=0; i < 50; i++) {
        if(NUM>0){
          NUM--;
        }
        System.out.println("Thread two get one tick*********this tick="+NUM);
      }
    }).start();*/

    /*new Thread(new Pp("AA")).start();
    new Thread(new Pp("BB")).start();*/

    new Thread(new Dd(),"AA").start();
    new Thread(new Dd(),"BB").start();
    new Thread(new Dd(),"CC").start();

  }


}
