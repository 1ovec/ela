package 状态模式;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/18
 */
public class Test {

  public static void main(String[] args) {
    Switcher switcher = new Switcher();
    switcher.setState(new On());
    switcher.switchOff();
  }
}
