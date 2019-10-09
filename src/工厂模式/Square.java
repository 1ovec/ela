package 工厂模式;

/**
 * @author admin
 * @ClassName Square
 * @Description
 * @Date 2019/7/19
 */
public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
