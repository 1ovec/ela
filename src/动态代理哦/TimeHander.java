package 动态代理哦;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author admin
 * @ClassName TimeHander
 * @Description
 * @Date 2019/7/31
 */
public class TimeHander implements InvocationHandler {
  private Object object;

  public TimeHander(Object object) {
    this.object=object;
  }

  @Override
  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
    long start=System.currentTimeMillis();
    System.out.println("start:" + start);
    method.invoke(object,args);
    Thread.sleep((int) (Math.random() * 2000));
    long end=System.currentTimeMillis();
    System.out.println("end:" + end);
    System.out.println("total:" + (end - start));
    return null;
  }

}
