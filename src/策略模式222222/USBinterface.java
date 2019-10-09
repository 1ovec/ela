package 策略模式222222;

/**
 * @author admin
 * @ClassName USBinterface
 * @Description
 * @Date 2019/7/18
 */
public class USBinterface {
  private Computer computer;

  public Computer getComputer() {
    return computer;
  }

  public void setComputer(Computer computer) {
    this.computer=computer;
  }

  public void doSomeThing(){
    computer.howDo();
  }

}
