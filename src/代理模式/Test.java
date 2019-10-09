package 代理模式;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/19
 */
public class Test {
  public static void main(String[] args) {
    Image image=new ProxyImage("test_10mb.jpg");

    // 图像将从磁盘加载
    image.display();
    System.out.println("");
    // 图像不需要从磁盘加载
    image.display();
  }

}
