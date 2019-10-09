package 多线程.继承Thread;

import java.util.List;

/**
 * @author admin
 * @ClassName ThreadTest
 * @Description
 * @Date 2019/7/22
 */
public class ThreadTest3 extends Thread {

  private List<Integer> list ;

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list=list;
  }

  public ThreadTest3(List<Integer> list){
    this.list=list;
  }


  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+" 线程启动 start");
    for(int i=10;i<15;i++){
      list.add(i);
    }
    System.out.println(Thread.currentThread().getName()+" 线程结束 end");
  }
}
