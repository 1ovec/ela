package 工厂模式;

/**
 * @author admin
 * @ClassName Circle
 * @Description
 * @Date 2019/7/19
 */
public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
