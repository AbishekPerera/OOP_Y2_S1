package ex2;

public class Student {
	
	private String studentID;
	private String Name;
	private Double GPA;
	
	public Student(String studentID, String name, Double gPA) {
		
		this.studentID = studentID;
		Name = name;
		GPA = gPA;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getName() {
		return Name;
	}

	public Double getGPA() {
		return GPA;
	}

	
	

}
