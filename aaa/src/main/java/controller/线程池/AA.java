package controller.线程池;

/**
 * @author admin
 * @ClassName AA
 * @Description
 * @Date 2019/9/24
 */
public class AA {

  public static void main(String[] args) {
    int a=getA();
    System.out.println(a);

    System.out.println(getB());
  }

  public static int getA() {
    int x=1;
    try {
      int a  =1/0;
      return ++x;
    } catch(Exception e) {
      System.out.println(++x);
    } finally {
      return ++x;
    }
  }

  public static String getB() {
    String x="asd";
    try {
      x = "www";
      return x;
    } catch(Exception e) {
    } finally {
      x ="zzz";
      System.out.println(x);
    }


    return x;
  }

}
