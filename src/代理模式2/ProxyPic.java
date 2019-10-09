package 代理模式2;

/**
 * @author admin
 * @ClassName ProxyPic
 * @Description
 * @Date 2019/7/19
 */
public class ProxyPic implements Pic {

  private RealPic realPic;
  private String name;
  private int size;

  public ProxyPic(String name,int size) {
    this.name=name;
    this.size=size;
  }


  @Override
  public void show() {
    if(realPic == null) {
      System.out.println("创建真实图片---------------->");
      realPic = new RealPic("lovec",10);
    }
    realPic.show();
  }
}
