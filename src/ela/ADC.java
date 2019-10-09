package ela;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @ClassName ADC
 * @Description
 * @Date 2019/9/25
 */
public class ADC {

  public static void main(String[] args) throws ParseException {
    /*Map<String, Object> map=new HashMap<>();
    map.put("6","aaa");
    map.put("5","bbb");
    map.put("4","ccc");
    map.put("3","ddd");
    map.put("2","eee");
    map.put("1","fff");

    System.out.println(map);*/


    Map<String, String> date=getDate(1);
    System.out.println(date);
  }

  private final static int WEEK=1;
  private final static int MONTH=2;

  public static Map<String, String> getDate(int type) throws ParseException {
    Map<String, String> map=new HashMap<>();
    Calendar c=Calendar.getInstance();
    String a= "2019-09-25 00:00:00";
    Calendar ca=Calendar.getInstance();
    ca.setTime(sdf2.parse(a));
    if(type == WEEK) {
      //获取本周的时间字段
      c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
      String weekStart=sdf2.format(c.getTime());
      ca.setFirstDayOfWeek(Calendar.MONDAY);
      ca.set(Calendar.DAY_OF_WEEK,ca.getFirstDayOfWeek() + 6);
      String weekEnd=sdf2.format(ca.getTime());
      map.put("Start",weekStart);
      map.put("End",weekEnd);
    } else if(type == MONTH) {
      //获取当前月的开始时间和结束时间
      c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
      String monthStart=sdf2.format(c.getTime());
      ca.set(Calendar.DAY_OF_MONTH,ca.getActualMaximum(Calendar.DAY_OF_MONTH));
      String monthEnd=sdf2.format(ca.getTime());
      map.put("Start",monthStart);
      map.put("End",monthEnd);
    } else {
      return map;
    }
    return map;
  }


  /**
   * 转换时间  patten yyyy-MM-dd
   *
   * @param date
   * @return
   */
  public static String transformDate2(Date date) {
    return sdf2.format(date);
  }


  /**
   * 日期函数，以当天为基数，返回指定天数后的日期
   * 返回日期格式为： yyyy-MM-dd
   *
   * @param field  操作的数据类型，如年，月，日
   * @param amount 总数
   * @return
   */
  public static String getStrDate(int field,int amount) {
    Calendar c=Calendar.getInstance();
    c.add(field,amount);
    return sdf2.format(c.getTime());
  }


  private final static SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  private final static SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");


}
