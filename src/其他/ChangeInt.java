package 其他;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 * @author admin
 * @ClassName ChangeInt
 * @Description
 * @Date 2019/8/14
 */
public class ChangeInt {
  public static void main(String[] args) {
    System.out.println(new BigDecimal((float) (5577*100/85631)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
    System.out.println(new BigDecimal((float) 5577*100 / 85631).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
    int a=5577;
    int b=85631;
    double v=new BigDecimal((float) a * 100 / b).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    System.out.println(v);
  }
}
