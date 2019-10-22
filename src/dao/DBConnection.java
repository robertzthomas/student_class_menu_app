package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnection {
	public static Scanner scanner = new Scanner(System.in);
	private final static String URL = "jdbc:mysql://localhost:3306/teams";
	private final static String USERNAME = "";
	private final static String PASSWORD = "";
	private static Connection connection;
	private static DBConnection instance;

	private DBConnection(Connection connection) {
		this.connection = connection;
	}

	public static Connection getConnection() {
		if(instance == null) {
			try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			instance = new DBConnection(connection);
			System.out.println("connection successfull");
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return DBConnection.connection;
	}
}
