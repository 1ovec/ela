package controller.BIO_NIO;

import java.util.*;

/**
 * @author admin
 * @ClassName Pl
 * @Description
 * @Date 2019/9/19
 */
public class Pl {

  public static void main(String[] args) {

    List<Map<String,Object>> name =new ArrayList<>();
    Map<String,Object>map =new HashMap<String,Object>(){{put("as","asd");put("tt","123");put("zz","zsw");}};
    Map<String,Object>map1 =new HashMap<String,Object>(){{put("pp","22");put("qq","11");put("mm","33");}};
    name.add(map);name.add(map1);

    name.forEach(e->{
      Set<Map.Entry<String, Object>> entries=e.entrySet();
      entries.forEach(System.out::println);
    });



  }

}
