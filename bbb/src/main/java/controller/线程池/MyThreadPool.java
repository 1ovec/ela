package controller.线程池;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @ClassName MyThreadPool
 * @Description
 * @Date 2019/9/11
 */
public class MyThreadPool {

  public MyThreadPool(int corePoolSize, // 线程池长期维持的线程数，即使线程处于Idle状态，也不会回收。
                      int maximumPoolSize, // 线程数的上限
                      long keepAliveTime,TimeUnit unit, // 超过corePoolSize的线程的idle时长，
                      // 超过这个时间，多余的线程会被回收。
                      BlockingQueue<Runnable> workQueue, // 任务的排队队列
                      ThreadFactory threadFactory, // 新线程的产生方式
                      RejectedExecutionHandler handler) // 拒绝策略
  {

  }
}
