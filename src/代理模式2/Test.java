package 代理模式2;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/19
 */
public class Test {
  public static void main(String[] args) {
    Pic pic = new ProxyPic("name",10);
    System.err.println("-----------------");
    pic.show();
  }

}
