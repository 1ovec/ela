package 策略模式;

/**
 * @author admin
 * @ClassName Calculator
 * @Description
 * @Date 2019/7/18
 */
public class Calculator {//计算器类

  private Strategy strategy;//拥有某种算法策略

  public Calculator() {
  }

  public int getResult(int a,int b) {
    return this.strategy.calculate(a,b);//返回具体策略的结果
  }

  public void setStrategy(Strategy strategy) {
    this.strategy=strategy;
  }
}
