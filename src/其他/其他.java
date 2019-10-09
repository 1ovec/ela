package 其他;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author admin
 * @ClassName 其他
 * @Description
 * @Date 2019/8/5
 */
public class 其他 {

  private static List<Integer> list2 =Arrays.asList(1,2,3,4,5,6,7,8,9,10);

  private static List<Integer>ids =Arrays.asList(1,2);
  public static void main(String[] args) {
   /* list2.stream().filter(e->e!=2).filter(e->e!=4).collect(Collectors.toList()).forEach(e-> System.out.println(e));*/
    List<Integer> page=getPage();
    page.forEach(System.out::println);
  }

  /**
   * 将数据保留两位小数
   */
  private static double getTwoDecimal(double num) {
    DecimalFormat dFormat = new DecimalFormat("#.00");
    String yearString = dFormat.format(num);
    Double temp = Double.valueOf(yearString);
    return temp;
  }

  private static List<Integer> getPage(){
    //int a= 2649338304;
    Paging paging = Paging.pagination(list2.size(),5,0);
    int fromIndex = paging.getQueryIndex();
    int toIndex = 0;
    if (fromIndex + paging.getPageSize() >= list2.size()){
      toIndex = list2.size();
    }else {
      toIndex = fromIndex +  paging.getPageSize();
    }
    if (fromIndex > toIndex){
      return Collections.EMPTY_LIST;
    }
    return list2.subList(fromIndex,toIndex);
  }

}
