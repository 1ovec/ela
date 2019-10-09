package java递归;

/**
 * @author admin
 * @ClassName Test1
 * @Description
 * @Date 2019/7/25
 */
public class Test1 {

  static int multiply(int n) {
    if(n == 1 || n == 0)
      return n;
    else
      return n * multiply(n - 1);
  }

  public static void main(String[] args) {
    count(0);
  }

  static void count(int n) //递归方法
  {
    if(n < 5)
      count(n + 1);
    System.out.print(" " + n);
  }

}
