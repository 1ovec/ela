package controller;

import controller.线程实战.Consumer;
import controller.线程实战.Person;
import controller.线程实战.Producer;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @ClassName controller.condition
 * @Description
 * @Date 2019/9/9
 */
public class condition {

  @Test
  public void test() throws InterruptedException {

    Person person=new Person();
    person.push("aaa",12);
    Thread thread = new Thread(new Producer(person));
    thread.start();

    Thread thread1 = new Thread(new Consumer(person));
    thread1.start();
  }


  @Test
  public void aaa() {
    ExecutorService executorService=Executors.newFixedThreadPool(2);
  }
}
