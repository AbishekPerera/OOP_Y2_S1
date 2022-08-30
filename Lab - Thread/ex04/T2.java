package ex04;

import java.util.Map;

public class T2 extends Thread {

	Map<String, Integer> number1;

	public T2(Map<String, Integer> number1) {
		super();
		this.number1 = number1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		synchronized (number1) {

			System.out.println("Thread 02 Started");
			System.out.println("you entered no1 * no2 = result as Out put ");

			for (Map.Entry<String, Integer> element : number1.entrySet()) {

				System.out.print(element.getKey());
				System.out.println(element.getValue());

			}
			
			System.out.println("Thread 01 notified\n");
			
			number1.notify();
		}

	}

}
