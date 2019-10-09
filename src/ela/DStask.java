package ela;

import java.util.TimerTask;

public class DStask extends TimerTask {
    public  static int a = 1;

    @Override
    public void run() {
        System.out.println(a);
        a++;
    }

    public int getA(){
        return a;
    }
}
