package 其他;

import java.io.IOException;
import java.util.*;

/**
 * @author admin
 * @ClassName HelloWorld
 * @Description
 * @Date 2019/9/2
 */
public class HelloWorld {

  private static final Object[] EMPTY_ELEMENTDATA = {};

  /**
   * Shared empty array instance used for default sized empty instances. We
   * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
   * first element is added.
   */
  private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

  /**
   * The array buffer into which the elements of the ArrayList are stored.
   * The capacity of the ArrayList is the length of this array buffer. Any
   * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
   * will be expanded to DEFAULT_CAPACITY when the first element is added.
   */
  transient Object[] elementData; // non-private to simplify nested class access

  public static void main(String[] args) throws IOException {
    //打开记事本
   /* ProcessBuilder pBuilder = new ProcessBuilder("notepad");
    pBuilder.start();*/

    Runtime run = Runtime.getRuntime();
    //打开记事本
    run.exec("notepad");
  }

}
