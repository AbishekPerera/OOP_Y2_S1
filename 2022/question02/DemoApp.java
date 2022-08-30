package question02;

public class DemoApp {

	public static void main(String[] args) {
		
		TCalculation<Integer> object1 = new TCalculation<>();
		TCalculation<Double> object2 = new TCalculation<>();
		
		object1.append(10);
		object1.append(20);
		System.out.println(object1.average());
		
		object2.append(10.5);
		object2.append(20.5);
		System.out.println(object2.average());
		
		
		
	}
}
