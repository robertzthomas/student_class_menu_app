package entity;

import java.util.List;

public class Class {
	private int classId;
	private String name;
	private List<Student> students;
	
	public Class(int classId, String name, List<Student> students) {
		this.classId = classId;
		this.name = name;
		this.students = students;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
