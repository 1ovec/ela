package controller.线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author admin
 * @ClassName MyThead
 * @Description
 * @Date 2019/9/11
 */
public class MyThead implements Runnable {

  public static int num=50;

 /* @Override
  public void run() {
    //sell();
    synchronized(this.getClass()) {
      //票分 50 次卖完
      for(int i=0; i <num; i++) {
        System.out.println("------------------------>第" + (num+1) + "轮---------------------------------");
        if(num > 0) {
          try {
            //模拟卖一次票所需时间
            Thread.sleep(500);
          } catch(InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + (--num) + "张");
        }
      }
    }
  }*/


  Lock l = new ReentrantLock();


  synchronized void sell() {
    //票分 50 次卖完
    for(int i=1; i <= num; i++) {
      System.out.println("------------------------>第" + num + "轮---------------------------------");
      if(num > 0) {
        try {
          //模拟卖一次票所需时间
          Thread.sleep(500);
        } catch(InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + (--num) + "张");
      }
    }
  }

  @Override
  public void run() {
    //票分 50 次卖完
    for(int i = 0 ; i < 50 ;i ++){
      //获取锁
      l.lock();
      try {
        if(num > 0){
          //模拟卖一次票所需时间
          Thread.sleep(10);
          System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+(--num)+"张");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }finally{
        //释放锁
        l.unlock();
      }
    }
  }
}
