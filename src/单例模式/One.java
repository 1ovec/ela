package 单例模式;

/**
 * @author admin
 * @ClassName One
 * @Description
 * @Date 2019/7/19
 */
public class One {

  private One() {
    System.out.println("one constructor");
  }

  private static One one = new One();

  public static One getInstance(){
    return one;
  }

}
