package 其他;

import javafx.concurrent.Task;

/**
 * @author admin
 * @ClassName JavaTaskClass
 * @Description
 * @Date 2019/7/31
 */
public class JavaTaskClass {

  static String a;

  public static void main(String[] args) {
    String b=null;
    System.out.println(b);
    System.out.println(a);
    /*Task task=new Task() {
      @Override
      protected Object call() throws Exception {
        return null;
      }
    };*/
  }
}
