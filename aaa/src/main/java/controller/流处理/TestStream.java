package controller.流处理;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author admin
 * @ClassName TestStream
 * @Description
 * @Date 2019/9/24
 */
public class TestStream {

  static List<Sys> list=new ArrayList<Sys>() {{
    add(new Sys(1,"a"));
    add(new Sys(2,"b"));
    add(new Sys(3,"c"));
    add(new Sys(4,"d"));
    add(new Sys(5,"e"));
    add(new Sys(6,"f"));
    add(new Sys(7,"g"));
  }};

  public static void main(String[] args) {
    List<Integer> idCollect=list.stream().map(Sys::getId).collect(Collectors.toList());//获取集合中所有对象的id集合
    List<String> nameCollect=list.stream().map(Sys::getName).collect(Collectors.toList());//获取集合中所有对象的name集合

    System.out.println(idCollect);
    System.out.println(nameCollect);

    int a  = "asd".length();


  }

}
