package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ClassDao {
	private Connection connection;
	private StudentDao studentDao;
	private final String GET_CLASSES_QUERY = "SELECT * FROM classes";
	private final String GET_CLASS_BY_ID_QUERY = "select * from classes where id + ?";
	
	public ClassDao() {
		connection = DBConnection.getConnection();
	}
	public List<Class> getClasses() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_CLASSES_QUERY).executeQuery();
		List<Class> classes = new ArrayList<Class>();
		
		while(rs.next()) {
			classes.add(pupulateClass(rs.getInt(1), rs.getString(2)));
		}
		return classes;
	}
	
	private Class pupulateClass(int id, String name) throws SQLException {
		return new Class(id, name, studentDao.getStudentsByClassId(id));
	}
	public Class getClassById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CLASS_BY_ID_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return pupulateClass(rs.getInt(1), rs.getString(2));
	}
}
