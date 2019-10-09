package 分组测试;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author admin
 * @ClassName Trst
 * @Description
 * @Date 2019/8/7
 */
public class Trst {

  public static void main(String[] args) {
    /*List<NameEntity> list=getList();
    Map<Integer, List<NameEntity>> collect1=list.stream().collect(Collectors.groupingBy(NameEntity::getProject_type));
    Set<Integer> integers=collect1.keySet();
    Iterator<Integer> iterator=integers.iterator();
    while(iterator.hasNext()){
      int i=+iterator.next();
      System.out.println("iterator.next()--------------->"+i);
      List<NameEntity> entities=collect1.get(i);
      entities.forEach(e-> System.out.println(e));
    }*/


    List<Map<String, Object>> listMap=getListMap();
    Map<Object, List<Map<String, Object>>> project_type=listMap.stream().collect(Collectors.groupingBy(e -> e.get("project_type")));
    Set<Object> integers=project_type.keySet();
    for(Object i : integers) {
      System.out.println("iterator.next()--------------->" + i);
      List<Map<String, Object>> maps=project_type.get(i);
      maps.forEach(System.out::println);
    }

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    List<Map<String, Object>> list =new ArrayList<>();
    Map<String,Object>map=new HashMap<>();
    map.put("data",getList());
    String data=map.get("data").getClass().getTypeName();
    System.out.println(data);
    if(map.get("data") instanceof  java.util.ArrayList){
      System.out.println("instanceof ok ArrayList");
    }

  }





  private static List<NameEntity> getList(){
    List<NameEntity>list =new ArrayList<>();
    NameEntity nameEntity1 =new NameEntity(1,3,2,"DS项目",123,"agent-1");
    NameEntity nameEntity2 =new NameEntity(2,3,2,"DS项目",123,"agent-2");
    NameEntity nameEntity3 =new NameEntity(3,3,3,"AS-65",345,"agent-3");
    NameEntity nameEntity4 =new NameEntity(4,3,3,"AS-65",345,"agent-4");
    NameEntity nameEntity5 =new NameEntity(5,3,4,"LC项目",1341,"agent-5");
    NameEntity nameEntity6 =new NameEntity(6,3,4,"LC项目",1341,"agent-6");
    NameEntity nameEntity7 =new NameEntity(7,3,5,"LoveC项目",999,"agent-7");
    list.add(nameEntity1);
    list.add(nameEntity2);
    list.add(nameEntity3);
    list.add(nameEntity4);
    list.add(nameEntity5);
    list.add(nameEntity6);
    list.add(nameEntity7);
    return list;
  }

  private static List<Map<String,Object>> getListMap(){
    List<Map<String,Object>>list =new ArrayList<>();
    Map<String,Object> nameEntity1 =new HashMap<String,Object>(){{
      put("project_type",2);
      put("project_name","DS项目");
      put("project_id",123);
    }};
    Map<String,Object> nameEntity2 =new HashMap<String,Object>(){{
      put("project_type",2);
      put("project_name","AA项目");
      put("project_id",234);
    }};
    Map<String,Object> nameEntity3 =new HashMap<String,Object>(){{
      put("project_type",3);
      put("project_name","DS项目");
      put("project_id",123);
    }};
    Map<String,Object> nameEntity4 =new HashMap<String,Object>(){{
      put("project_type",3);
      put("project_name","DS项目");
      put("project_id",123);
    }};
    Map<String,Object> nameEntity5 =new HashMap<String,Object>(){{
      put("project_type",4);
      put("project_name","DS项目");
      put("project_id",123);
    }};
    Map<String,Object> nameEntity6 =new HashMap<String,Object>(){{
      put("project_type",4);
      put("project_name","444项目");
      put("project_id",123);
    }};
    Map<String,Object> nameEntity7 =new HashMap<String,Object>(){{
      put("project_type",5);
      put("project_name","999项目");
      put("project_id",123);
    }};

    list.add(nameEntity1);
    list.add(nameEntity2);
    list.add(nameEntity3);
    list.add(nameEntity4);
    list.add(nameEntity5);
    list.add(nameEntity6);
    list.add(nameEntity7);
    return list;
  }

}
