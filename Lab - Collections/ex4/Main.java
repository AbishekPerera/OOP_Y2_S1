package ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student std1 = new Student("IT10", "Sunera", 3.44);
		Student std2 = new Student("IT20", "Lochi", 3.55);
		Student std3 = new Student("IT30", "Kamal", 3.24);

		Map<Integer, Student> stDetails = new HashMap<>();

		stDetails.put(01, std1);
		stDetails.put(02, std2);
		stDetails.put(03, std3);

		Scanner scn = new Scanner(System.in);

		System.out.println("input No: ");
		int no = scn.nextInt();

		Student ob = stDetails.get(no);

		System.out.println(ob.getName());
		System.out.println(ob.getStudentID());
		System.out.println(ob.getGPA());

		// foreach loop

//		for (Map.Entry<Integer, Student> badu : stDetails.entrySet()) {
//			System.out.println(badu.getKey());
//			badu.getValue().print();
//		}
//		
		scn.close();
	}

}
