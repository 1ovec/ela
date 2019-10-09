package 状态模式;

/**
 * @author admin
 * @ClassName State
 * @Description
 * @Date 2019/7/18
 */
public interface  State {

  public void switchOn(Switcher switcher);//开
  public void switchOff(Switcher switcher);//关
}
