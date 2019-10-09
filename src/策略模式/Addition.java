package 策略模式;

/**
 * @author admin
 * @ClassName Addition
 * @Description
 * @Date 2019/7/18
 */
public class Addition implements Strategy {

  @Override
  public int calculate(int a,int b) {
    return a + b;//这里我们做加法运算
  }
}
