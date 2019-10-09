package 单例模式;

public class Two {
  private static Two ourInstance=new Two();

  public static Two getInstance() {
    return ourInstance;
  }

  private Two() {
  }
}
