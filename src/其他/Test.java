package 其他;

import javafx.scene.Group;
import org.apache.commons.collections4.SplitMapUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/7/29
 */
public class Test {

  /*public static void main(String[] args) {
    List<Map<String, Object>> mapList=getList();
    Map<Integer, List<Map<String, Object>>> p_agentId=mapList.stream().collect(groupingBy(e -> Integer.parseInt(e.get("p_agentId").toString())));
    Set<Integer> integers=p_agentId.keySet();
    integers.forEach(e->{
      List<Map<String, Object>> maps=p_agentId.get(e);
      List<Map<String, Object>> newList =new ArrayList<>();
      maps.forEach(k->{
        Map<String,Object> map = new HashMap<>();
        map.put("dividing",k.get("dividing"));
        map.put("p_agentId",k.get("p_agentId"));
        map.put("company_name",k.get("company_name"));
        map.put("name",k.get("name"));
        map.put("provinceId",k.get("provinceId"));
        for(int i=0;i<k.size();i++){

          k.put("children",map);
        }
      });
      Map<Integer, List<Map<String, Object>>> p_agentId1=maps.stream().collect(groupingBy(c -> Integer.parseInt(c.get("p_agentId").toString())));
      System.out.println(maps);
    });
  }*/

  public static List<Map<String,Object>> getList(){
    List<Map<String,Object>>listMap=new ArrayList<>();

    Map<String,Object>map1=new HashMap<>();
    map1.put("id", 1);
    map1.put("provinceId",3);
    map1.put("p_agentId",310001);
    map1.put("dividing",20);
    map1.put("company_name","环维");
    map1.put("name","上海");
    map1.put("child_projectids","1,5");

    Map<String,Object>map2=new HashMap<>();
    map2.put("id",2);
    map2.put("provinceId",3);
    map2.put("p_agentId",310002);
    map2.put("dividing",30);
    map2.put("company_name","嘉顶");
    map2.put("name","上海");
    map2.put("child_projectids","3,4,5");

    Map<String,Object>map3=new HashMap<>();
    map3.put("id", 3);
    map3.put("provinceId",7);
    map3.put("p_agentId",310001);
    map3.put("dividing",50);
    map3.put("company_name","环维");
    map3.put("name","河北");
    map3.put("child_projectids","1,2,3");

    listMap.add(map1);
    listMap.add(map2);
    listMap.add(map3);

    listMap.forEach(e-> System.out.println(e));
    System.out.println("-----------------------------------------------------------------------------");
    return listMap;
  }


  public static void main(String[] args) {
    Integer a = 5;
    List<Map<String, Object>> list=getList();
    list.forEach(e->{
      List<String> strings=Arrays.asList(e.get("child_projectids").toString().split(","));
      if(strings.contains(a.toString())){
        System.out.println(strings+"-----------------contains:"+a);
      }
    });
    System.out.println("----------------------------------------------------------------");

    List<Map<String, Object>> child_projectids=list.stream().filter(e -> Arrays.asList(e.get("child_projectids").toString().split(",")).contains(a.toString())).collect(Collectors.toList());
    child_projectids.forEach(e-> System.out.println(e));
  }
}
