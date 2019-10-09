package 策略模式;

/**
 * @author admin lovec
 * @ClassName Subtraction
 * @Description 减法
 * @Date 2019/7/18
 */
public class Subtraction implements Strategy {

  @Override
  public int calculate(int a,int b) {//减数与被减数
    return a - b;//这里我们做减法运算
  }
}
