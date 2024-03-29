package 状态模式;

/**
 * @author admin
 * @ClassName On
 * @Description
 * @Date 2019/7/18
 */
public class On implements State {

  @Override
  public void switchOn(Switcher switcher) {
    System.out.println("WARN!!!通电状态无需再开");
    return;
  }

  @Override
  public void switchOff(Switcher switcher) {
    switcher.setState(new Off());
    System.out.println("OK...灯灭");
  }
}

