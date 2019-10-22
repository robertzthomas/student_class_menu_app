package entity;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	
	public Student(int StudentId, String firstName, String lastName) {
		this.setStudentId(StudentId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
