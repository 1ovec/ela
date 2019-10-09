package controller.线程For;

/**
 * @author admin
 * @ClassName ForThread
 * @Description
 * @Date 2019/9/24
 */
public class ForThread {

  public static void main(String[] args) {

    for(int i=1;i<=1000;i++){
      if(i%100==0){
        System.out.println(i);
      }
    }
  }

}
