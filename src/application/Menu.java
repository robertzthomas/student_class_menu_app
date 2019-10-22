package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import dao.ClassDao;
import entity.Class;

public class Menu {

	private ClassDao classDao;
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList("Display Classes", "Display a Class", "Create Class", "Delete Class",
			"Create Student", "Delete Student");

	public void start() {
		String selection = "";

		do {
			printMenu();
			selection = scanner.nextLine();
			try {
				if (selection.equals("1")) {
					// displayClasses();
				} else if (selection.equals("2")) {
					// displayClass();
				} else if (selection.equals("3")) {
					// createClass();
				} else if (selection.equals("4")) {
					// deleteClass();
				} else if (selection.equals("5")) {
					// createStudent();
				} else if (selection.equals("6")) {
					// deleteStudent();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.println("press enter to contunue");
			scanner.hasNextLine();

		} while (selection.equals("-1"));
	}

	private void printMenu() {
		System.out.println("Select an Option:\n---------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
		}
	}
	private void displayClass() {
		System.out.print("enter class id");
		int id = Integer.parseInt(scanner.nextLine());
		Class class = classDao.getClassById(id);
		System.out.println(class.get);
	}
}
