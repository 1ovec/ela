package 状态模式;

/**
 * @author admin
 * @ClassName Switcher
 * @Description
 * @Date 2019/7/18
 */
public class Switcher {

  //开关的初始状态设置为“关”
  private State state = new Off();

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void switchOn(){
    state.switchOn(this);//这里调用的是当前状态的开方法
  }

  public void switchOff(){
    state.switchOff(this);//这里调用的是当前状态的关方法
  }


}
