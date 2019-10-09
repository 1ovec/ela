import java.util.ArrayList;

/**
 * @author admin
 * @ClassName HelloWorld
 * @Description
 * @Date 2019/9/16
 */
public class HelloWorld {
  public static void main(String[] args) {
    /*boolean b=Objects.equals(1,1);
    System.out.println(b);*/

    /*List<Integer>list=new ArrayList<>();
    System.out.println(list.isEmpty());
    System.out.println(CollectionUtils.isNotEmpty(list));*/

    ArrayList<String> strings=new ArrayList<String>() {{
      add("a");add("b");
    }};

    System.out.println(strings);
  }

}
