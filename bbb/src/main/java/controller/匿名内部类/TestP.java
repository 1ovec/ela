package controller.匿名内部类;

/**
 * @author admin
 * @ClassName TestP
 * @Description
 * @Date 2019/9/16
 */
public class TestP {

  public static void main(String[] args) {
    Person p=() -> System.out.println("eat something--->");
    p.eat();
    String a = "";

  }

}
