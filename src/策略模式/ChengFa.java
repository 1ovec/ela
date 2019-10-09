package 策略模式;

/**
 * @author admin
 * @ClassName ChengFa
 * @Description
 * @Date 2019/7/18
 */
public class ChengFa implements Strategy {

  @Override
  public int calculate(int a,int b) {
    return a*b;
  }
}
