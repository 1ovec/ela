package controller.线程实战;

/**
 * @author admin
 * @ClassName Person
 * @Description
 * @Date 2019/9/11
 */
public class Person {
  private String name;
  private int age;


  private boolean isEmpty = true;

  /**
   * 生产数据
   *
   * @param name
   * @param age
   */
  public void push(String name,int age) throws InterruptedException {

    //不能用 if，因为可能有多个线程
    while(!isEmpty){//进入到while语句内，说明 isEmpty==false，那么表示有数据了，不能生产，必须要等待消费者消费
      this.wait();//导致当前线程等待，进入等待池中，只能被其他线程唤醒
    }
    this.name=name;
    Thread.sleep(10);
    this.age = age;
    //-------生产数据结束-------
    isEmpty = false;//设置 isEmpty 为 false,表示已经有数据了
    //this.notifyAll();//生产完毕，唤醒所有消费者
  }

  /**
   * 取数据，消费数据
   *
   * @return
   */
  public synchronized  void pop() {
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("取到数据进行--->消费数据"+this.name + "---" + this.age);
  }


  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
