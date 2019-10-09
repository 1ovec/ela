package ela;

/**
 * @author admin
 * @ClassName 累不累
 * @Description
 * @Date 2019/9/29
 */
public class 累不累 {
  //心累，2019-9-29 17:07：13

  public static void main(String[] args) {
    String s1 = "a";
    String s2 = new String("a");
    //调用intern时,如果s2中的字符不在常量池，则加入常量池并返回常量的引用
    String s3 = s2.intern();
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
  }
}
