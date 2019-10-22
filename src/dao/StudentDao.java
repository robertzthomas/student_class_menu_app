package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDao {
	
	private Connection connection;
	private final String GET_STUDENTS_BY_CLASS_ID = "select * from students where id = ?";
	
	public StudentDao() {
		connection = DBConnection.getConnection();
		
	}
	
	public List<Student> getStudentsByClassId(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_STUDENTS_BY_CLASS_ID);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<Student> students = new ArrayList<Student>();
		
		while (rs.next()) {
			students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		return null;
	}
	
}
