package 多线程.继承Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/22
 */
public class Test {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    ThreadTest threadTest = new ThreadTest(list1);
    System.out.println(Thread.currentThread().getName()+" main thread start");
    threadTest.start();
    System.out.println(Thread.currentThread().getName()+" main thread end");
    list1.forEach(e-> System.out.println(e));


    ThreadTest2 threadTest2 = new ThreadTest2(list2);
    System.out.println(Thread.currentThread().getName()+" main thread start");
    threadTest2.start();
    System.out.println(Thread.currentThread().getName()+" main thread end");
    list2.forEach(e-> System.out.println(e));


    ThreadTest3 threadTest3 = new ThreadTest3(list3);
    System.out.println(Thread.currentThread().getName()+" main thread start");
    threadTest3.start();
    System.out.println(Thread.currentThread().getName()+" main thread end");
    list3.forEach(e-> System.out.println(e));
  }
}
