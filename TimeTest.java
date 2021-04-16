package seven;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TimeTest {

	public static void main(String[] args) {

		LinkedList<Integer> numbersList = new LinkedList<>();
		for(int i = 0; i < 5_000_000; i++) {
			numbersList.add(i);
		}
		
		long timeStarted = System.currentTimeMillis();
		
    	int get = 0;
    	
//		for(int i = 0; i < 5_000_000; i++) {
//			get = numbersList.get(i);
//		}
		
		for (Integer i : numbersList) {
			get = i;
        }
		
		long timeEnded = System.currentTimeMillis();
		
		long totalTime = timeEnded - timeStarted;
		
		System.out.println(get);
		System.out.println(totalTime);
	}

}
