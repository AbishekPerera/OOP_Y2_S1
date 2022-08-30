package ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Set<Double> insertData(){
		
		Scanner scn = new Scanner(System.in);
		
		Set<Double> set = new HashSet<>();
		
		for(int i=0; i<10;i++) {
			System.out.println("Insert Std "+(i+1)+" hieght :");
			set.add(scn.nextDouble());
			
		}
		scn.close();
		return set;
	}
	
	public static void display(Set o) {
		
		for (Object object : o) {
			System.out.println(object);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		display(insertData());
	}
}
