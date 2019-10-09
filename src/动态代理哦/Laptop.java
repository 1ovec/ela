package 动态代理哦;

/**
 * @author admin
 * @ClassName Laptop
 * @Description
 * @Date 2019/7/31
 */
public class Laptop implements IComputer {

  @Override
  public void execute() {
    System.out.println("电脑正在执行中......");
  }
}
