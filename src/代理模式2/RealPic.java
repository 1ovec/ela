package 代理模式2;

/**
 * @author admin
 * @ClassName RealPic
 * @Description
 * @Date 2019/7/19
 */
public class RealPic implements Pic {

  private String name;
  private int size;

  public RealPic(String name,int size) {
    this.name=name;
    this.size=size;
  }


  @Override
  public void show() {
    System.out.println("展示图片---------->图片名字："+name+",图片尺寸："+size+".");
  }
}
