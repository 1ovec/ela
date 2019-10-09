package controller.线程2;


import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @ClassName MyTestThread
 * @Description
 * @Date 2019/9/12
 */
public class MyTestThread {

  public static List<Integer> list=new ArrayList<>();

  public static void main(String[] args) {
      String host = "https://idenauthen.market.alicloudapi.com";
      String path = "/idenAuthentication";
      String method = "POST";
      String appcode = "你自己的AppCode";
      Map<String, String> headers = new HashMap<String, String>();
      //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
      headers.put("Authorization", "APPCODE " + appcode);
      //根据API的要求，定义相对应的Content-Type
      headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
      Map<String, String> querys = new HashMap<String, String>();
      Map<String, String> bodys = new HashMap<String, String>();
      bodys.put("idNo", "340421190210182345");
      bodys.put("name", "张三");


      try {
        /**
         * 重要提示如下:
         * HttpUtils请从
         * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
         * 下载
         *
         * 相应的依赖请参照
         * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
         */
        URL url = new URL(host);
        URLConnection urlcon = url.openConnection();
        //boolean b=HttpUtils.hasGzipOrPack200Encoding(urlcon);
        InputStream is = urlcon.getInputStream();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
        StringBuffer bs = new StringBuffer();
        String l = null;
        while((l=buffer.readLine())!=null){
          bs.append(l).append("/n");
        }
        System.out.println(bs.toString());
        /*HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
        System.out.println(response.toString());
        //获取response的body
        System.out.println(EntityUtils.toString(response.getEntity()));*/
      } catch (Exception e) {
        e.printStackTrace();
      }
  }

  @Test
  public void test() {
    Thread thread1=new Thread(new tt());
    Thread thread2=new Thread(new qq());
    thread1.start();
    thread2.start();
    list.forEach(e -> System.out.println(e));
    System.err.println(list.size());
  }


  public class tt implements Runnable {

    @Override
    public void run() {
      for(int i=0; i < 10; i++) {
        list.add(i);
      }
    }
  }

  public class qq implements Runnable {

    @Override
    public void run() {
      for(int i=10; i < 20; i++) {
        list.add(i);
      }
    }
  }
}
