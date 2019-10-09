package 代理模式;

/**
 * @author admin
 * @ClassName ProxyImage
 * @Description
 * @Date 2019/7/19
 */
public class ProxyImage implements Image {

  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName){
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if(realImage == null){
      realImage = new RealImage(fileName);
    }
    realImage.display();
  }

}
