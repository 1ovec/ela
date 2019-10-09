package java流处理;

import entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author admin
 * @ClassName SteamTest
 * @Description
 * @Date 2019/7/24
 */
public class SteamTest {

  public static List<Integer> list =Arrays.asList(3,5,6,4,1,2,7,11,23,10);



  public static void main(String[] args) {
    /**
     * 初始化测试数据
     */
    Student student1 = new Student(1,"lic");
    Student student2 = new Student(2,"hoz");
    Student student3 = new Student(3,"agg");
    Student student4 = new Student(4,"cic");
    Student student5 = new Student(5,"lov");
    Student student6 = new Student(6,"eca");
    List<Student> sList = Arrays.asList(student1,student2,student3,student4,student5,student6);

    /**
     * 将集合转变为流，对之进行操作，然后再转换成集合
     */
    //取前五个
    list=list.stream().limit(5).collect(toList());
    list.forEach(l-> System.out.println(l));

    //排序之后再取前6个
    list=list.stream().sorted().limit(6).collect(toList());
    list.forEach(l-> System.out.println(l));

    System.out.println("------------------------------------");
    List<Integer> collect=sList.stream().map(Student::getId).collect(toList());
    collect.forEach(c-> System.out.println(c));


  }

}
