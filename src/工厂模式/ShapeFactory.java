package 工厂模式;

/**
 * @author admin
 * @ClassName ShapeFactory
 * @Description
 * @Date 2019/7/19
 */
public class ShapeFactory {
  //使用 getShape 方法获取形状类型的对象
  public Shape getShape(String shapeType){
    if(shapeType == null){
      return null;
    }
    if(shapeType.equalsIgnoreCase("CIRCLE")){
      return new Circle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
    }
    return null;
  }
}
