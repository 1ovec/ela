package controller;

import java.util.*;

/**
 * @author admin
 * @ClassName Test
 * @Description
 * @Date 2019/9/18
 */
public class Test {

  static String can="abcbabacaaaerdfsga";

  public static void main(String[] args) {
    char[] chars=can.toCharArray();
    Set<String> set=new HashSet<>();
    Map<String, Integer> map=new HashMap<>();
    for(char aChar : chars) {
      int oldSize=set.size();
      String s=String.valueOf(aChar);
      set.add(s);
      if(oldSize == set.size()) {
        map.put(s,map.get(s) + 1);
      } else {
        map.put(s,1);
      }
    }
    String maxKex = "";
    int maxValue = 0;
    System.out.println(map);
    Set<String> strings=map.keySet();
    strings.forEach(e->{
      int c = map.get(e);
    });


    //compress(can);
  }


  public static void compress(String str) {
    Map<String, Integer> count=new HashMap<>();
    String[] myStrs=str.split("");
    for(int i=0; i < myStrs.length; i++) {
      int totalNum=1;
      String currentStr=myStrs[i];
      if(count.containsKey(currentStr)) {
        totalNum=count.get(currentStr) + 1;
      }
      count.put(currentStr,totalNum);
    }
    int num=count.size();
    System.out.println("压缩结果");
    if(num == myStrs.length) {
      System.out.println("各个字母都不一样，直接返回");
      System.out.println(str);
      return;
    }
    String result="";
    Iterator<Map.Entry<String, Integer>> it=count.entrySet().iterator();
    while(it.hasNext()) {
      Map.Entry<String, Integer> entry=it.next();
      result=result + entry.getKey() + entry.getValue();
    }
    System.out.println(result);
  }
}
