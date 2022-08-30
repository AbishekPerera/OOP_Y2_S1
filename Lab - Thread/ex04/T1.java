package ex04;

import java.util.Map;
import java.util.Scanner;

public class T1 extends Thread {

	Map<String, Integer> number1;

	public T1(Map<String, Integer> number1) {
		super();
		this.number1 = number1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	synchronized (number1) {
	
		Scanner scn = new Scanner(System.in);

		System.out.println("Thread 01 started..");

		for (int i = 0; i < 3; i++) {
			
			System.out.println("Please enter no1 and no2 as Keyboard Input 3 Times");
			System.out.println("Enter No1 : ");
			int no1 = scn.nextInt();
			System.out.println("Enter No2 : ");
			int no2 = scn.nextInt();
			number1.put(no1 + "*" + no2 + "= ", no1 * no2);
			
		}
		
		System.out.println("Thread Goes to waiting state\n");
		
		try {
			
			number1.wait();
			
			T1 t1 = new T1(number1);
			t1.start();
			T2 t2 = new T2(number1);
			t2.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	}

}
