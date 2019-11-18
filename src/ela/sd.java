package ela;

import java.io.FileNotFoundException;
import java.util.concurrent.Executor;

public class sd implements Executor{

	public static void main(String[] args) throws FileNotFoundException {
		/*for(int i=0;i<5;i++){
			Peoples p=new Peoples();
			System.out.println(p);
		}
		sd a= new sd();
		a.execute(new Thread());
		a.execute(new ThreadTest());*/

		String num  = "21.000";
		boolean contains=num.contains(".");
		System.out.println(contains);
	}

	@Override
	public void execute(Runnable command) {
		System.out.println("00000000000");
	}
}