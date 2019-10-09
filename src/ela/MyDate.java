package ela;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author admin
 * @ClassName MyDate
 * @Description
 * @Date 2019/9/29
 */
public class MyDate {
  public static void main(String[] args) {
    /*System.out.println(DatesUtil.getBeginDayOfWeek());
    System.out.println(DatesUtil.getEndDayOfWeek());*/

    /*System.out.println(getBeginDayOfWeek());
    System.out.println(getEndDayOfWeek());*/

    String a="succcall_count";
    String b="call_duration";
    System.out.println(a.length());
    System.out.println(b.length());
    System.out.println(9 >>> 2);
    System.out.println(~(0xa5) & 0xaa);
    char zcz=0xa5;

    int c=0;
    if(c < 4)

      for(int i=2; i < 2; ) {
        System.out.println(i--);
      }
  }


  public static Date getBeginDayOfWeek() {
    Date date=new Date();
    if(date == null) {
      return null;
    }
    Calendar cal=Calendar.getInstance();
    cal.setTime(date);
    int dayofweek=cal.get(Calendar.DAY_OF_WEEK);
    if(dayofweek == 1) {
      dayofweek+=7;
    }
    cal.add(Calendar.DATE,2 - dayofweek);
    return cal.getTime();
  }

  public static Date getEndDayOfWeek() {
    Calendar cal=Calendar.getInstance();
    cal.setTime(getBeginDayOfWeek());
    cal.add(Calendar.DAY_OF_WEEK,6);
    Date weekEndSta=cal.getTime();
    return weekEndSta;
  }


  private final static SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
}
