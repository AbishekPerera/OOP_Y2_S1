package question02;

import java.util.ArrayList;

public class TCalculation<T extends Number> {
	
	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T para) {
		
		numList.add(para);
		
	}
	
	public Double average() {
		
		int count = 0;
		double tot=0;
		
		for (T t : numList) {
			
			tot = tot + t.doubleValue();
			count++;
			
		}
		return tot/count;
		
	}

}
