package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static ArrayList<Integer> inertData() {

		ArrayList<Integer> ob = new ArrayList<>();

		if (ob.isEmpty()) {
			Scanner scn = new Scanner(System.in);

			for (int count = 0; count < 10; count++) {

				System.out.println("Input Number " + (count + 1) + ":");
				int num = scn.nextInt();

				ob.add(num);

			}
			scn.close();
		}

		return ob;

	}

	public static void display(ArrayList<Integer> ob) {

		for (Integer num : ob) {
			System.out.println("Data in Array List : " + num);
		}

		int tot = 0;
		for (Integer num : ob) {
			tot = tot + num;
		}

		System.out.println(tot);
	}

	public static void main(String[] args) {

		display(inertData());

	}

}
