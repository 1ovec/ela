package 其他;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @ClassName stack
 * @Description
 * @Date 2019/8/14
 */
public class stack {
  public static void main(String[] args) {
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    c.add(Calendar.MONTH, -1);
    c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
    String monthStart = format.format(c.getTime());
    System.out.println(monthStart);
    Calendar ca = Calendar.getInstance();
    ca.add(Calendar.MONTH, -1);
    ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
    String monthEnd = format.format(ca.getTime());
    System.out.println(monthEnd);

  }


}
