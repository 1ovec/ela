package 动态代理哦;

import java.lang.reflect.Proxy;

/**
 * @author admin
 * @ClassName ProxyTest
 * @Description
 * @Date 2019/7/31
 */
public class ProxyTest {

  public static void main(String[] args) {
    Laptop laptop=new Laptop();
    TimeHander hander=new TimeHander(laptop);
    IComputer computer=(IComputer) Proxy.newProxyInstance(laptop.getClass().getClassLoader(),laptop.getClass().getInterfaces(),hander);
    computer.execute();
  }

}
