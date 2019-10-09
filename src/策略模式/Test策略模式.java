package 策略模式;

/**
 * @author admin
 * @ClassName Test策略模式
 * @Description
 * @Date 2019/7/18
 */
public class Test策略模式 {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setStrategy(new ChengFa());
    //calculator.setStrategy(new Addition());
    int result=calculator.getResult(2,3);
    System.out.println(result);


  }

}
