package ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Student> StudentList = new ArrayList<>();
		
		Student std1 = new Student("IT10", "Sunera", 3.44);
		Student std2 = new Student("IT20", "Lochi", 3.55);
		Student std3 = new Student("IT30", "Kamal", 3.24);
		
		StudentList.add(std3);
		StudentList.add(std2);
		StudentList.add(std1);
		
		for (Student st : StudentList) {
			
			System.out.println(st.getName());
			System.out.println(st.getStudentID());
			System.out.println(st.getGPA());
			
			System.out.println("");
		}
		
	}
}
