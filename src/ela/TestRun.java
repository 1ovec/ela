package ela;

import java.util.Timer;

public class TestRun {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count = 0;
        for(int i = 0;i<= n;i++) {
            for(int j = 0;j<= n;j++) {
                sum += (i + j);
                count++;
            }
        }
        System.out.println(count);
    }
}
