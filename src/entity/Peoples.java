package entity;

/**
 * @author admin
 * @ClassName Peoples
 * @Description
 * @Date 2019/10/30
 */
public class Peoples {

  private  Integer id ;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id=id;
  }

  public static void main(String[] args) {
    /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String a= "12351224";
    Long b = 1000l;
    Date date = new Date(b);
    System.out.println(sdf.format(date));*/
    String a = "123456789";
    printReverse(a.toCharArray());
    char[] chars=a.toCharArray();
    char[] chars2=new char[]{'h','e','l','l','o'};
  }


  private static void printReverse(char [] str) {
    helper(0, str);
  }

  private static void helper(int index, char [] str) {
    if (str == null || index >= str.length) {
      return;
    }
    helper(index + 1, str);
    System.out.print(str[index]);
  }
}
