package 策略模式222222;

/**
 * @author admin
 * @ClassName Tset
 * @Description
 * @Date 2019/7/18
 */
public class Tset {

  public static void main(String[] args) {

    boolean from=USBinterface.class.isAssignableFrom(Cemer.class);
    boolean isC=Cemer.class.isAssignableFrom(USBinterface.class);
    System.out.println(isC);

    USBinterface usBinterface = new USBinterface();
    usBinterface.setComputer(new Cemer());
    usBinterface.doSomeThing();
  }

}
