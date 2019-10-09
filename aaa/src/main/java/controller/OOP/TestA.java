package controller.OOP;

/**
 * @author admin
 * @ClassName TestA
 * @Description
 * @Date 2019/9/19
 */
public class TestA {


  int a ;
  String b;

  public TestA() {
  }

  public TestA(int a) {
    this.a=a;
  }

  @Override
  public String toString() {
    return "TestA{" +
            "a=" + a +
            ", b='" + b + '\'' +
            '}';
  }

  public static void main(String[] args) {
    StringBuffer sz= new StringBuffer();
    StringBuilder sb= new StringBuilder();
  }
}
