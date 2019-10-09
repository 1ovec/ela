package controller.线程池;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * @author admin
 * @ClassName SelectTask
 * @Description
 * @Date 2019/9/24
 */
public class SelectTask<T> implements Callable<T> {

  private Object object;
  private Object[] args;
  private String methodName;

  public SelectTask(Object object, String methodName, Object[] args) {
    this.object = object;
    this.args = args;
    this.methodName = methodName;
  }

  @Override
  public T call() throws Exception {
    Method method = object.getClass().getMethod(methodName,String.class);   //此处应用反射机制，String.class是根据实际方法参数设置的
    return (T) method.invoke(object, args);
  }
}
