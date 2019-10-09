package 代理模式;

/**
 * @author admin
 * @ClassName RealImage
 * @Description
 * @Date 2019/7/19
 */
public class RealImage implements Image { //真实图片

  private String fileName;

  public RealImage(String fileName){
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + fileName);
  }

  private void loadFromDisk(String fileName){
    System.out.println("Loading " + fileName);
  }
}
