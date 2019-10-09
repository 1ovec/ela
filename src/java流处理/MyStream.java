package java流处理;

import entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author admin
 * @ClassName MyStream
 * @Description 流实际使用的demo
 * @Date 2019/7/29
 */
public class MyStream {

  private static List<Integer> list =Arrays.asList(2,3,8,5,6,4,8);
  private static List<Integer> list2 =Arrays.asList(2,2,4,4,6,8,8);
  private static List<Integer> list4 =Arrays.asList(1,2,3);
  private static List<Person> list3 =new ArrayList<>();
  private static List<String> list5 =Arrays.asList("1","2","4","6");

  public static void main(String[] args) {
    List<Integer> collect=list.stream().filter(e -> list4.contains(e)).collect(toList());
    collect.forEach(System.out::print);


    list2.stream().distinct().collect(toList()).forEach(System.out::print);

    list.stream().sorted().collect(toList()).forEach(System.out::print);//基础默认是从小到大排序

    list.stream().skip(8).limit(2).collect(toList());//删的超出了范围是没关系的，只会返回一个空集合，如果没有元素取前几个都无所谓，不会报错什么的

    //将对象中的某一个值取出来成新的集合
    Person p = new Person("ll",10);
    Person p1 = new Person("cc",20);
    Person p2 = new Person("lc",30);
    list3.add(p);list3.add(p1);list3.add(p2);
    list3.stream().map(Person::getAge).collect(toList()).forEach(System.out::print);


    list5.stream().map(Integer::parseInt).collect(toList()).forEach(e-> System.out.println(e.getClass()));//使用map的类型转换

    System.out.println(list5.stream().anyMatch(e -> e.equals("5")));//看list5集合中是否存在'5'这个对象

    System.out.println(list4.stream().noneMatch(e -> e > 3));//该集合中没有一个大于3则返回true

    System.out.println(list4.stream().findAny().get());//findAny是找到任意一个元素，默认是第一个，然后返回的是Optional<T> 对象，需要使用get()方法获取相应的值

    System.out.println(list4.stream().reduce(0,(a,b) -> a + b));//reduce用于组合流中的元素，如求和，求积，求最大值等,其中，reduce 第一个参数 0 代表起始值为 0，lambda (a, b) -> a + b 即将两值相加产生一个新值

    System.out.println(list4.stream().mapToInt(e -> e).sum());
    //将流转换成数值流，再进行操作，效率比用流中的reduce高

    //private static List<Integer> list2 =Arrays.asList(2,2,4,4,6,8,8);
    list2.stream().filter(e->e==2).filter(e->e==4).collect(Collectors.toList()).forEach(e-> System.out.println(e));
  }

}
