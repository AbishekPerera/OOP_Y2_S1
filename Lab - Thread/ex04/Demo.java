package ex04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		Map<String, Integer> number = new LinkedHashMap<String, Integer>();
		
		T1 t1 = new T1(number);
		T2 t2 = new T2(number);
		t1.start();
		t2.start();
	}
	
	
	

}
