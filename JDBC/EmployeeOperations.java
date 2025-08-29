
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class EmployeeOperations {
	String URL = "jdbc:mysql://localhost:3306/employeedb";
	String USER = "root";
	String PASSWORD = "12345678";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Connection con;

	public Connection getCon() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "12345678");

			System.out.println(con);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static void main(String[] args) {
		EmployeeOperations obj = new EmployeeOperations();
//        try (Connection connection = DriverManager.getConnection(obj.URL, obj.USER, obj.PASSWORD);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Connection connn = obj.getCon();
		try {

			while (true) {
				System.out.println("\nEmployee Database Operations:");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					obj.insertEmployee(con);
					break;

				case 2:
					obj.updateEmployee(con);
					break;

				case 3:
					obj.deleteEmployee(con);
					break;

				case 4:
					System.out.println("Exiting program...");
					return;

				default:
					System.out.println("Invalid choice. Please enter a number between 1 to 4.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertEmployee(Connection connn) throws SQLException, IOException {
		System.out.print("Enter Employee ID: ");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter Employee Name: ");
		String name = br.readLine();
		System.out.print("Enter Employee Age: ");
		int age = Integer.parseInt(br.readLine());

		String sql = "INSERT INTO employee (id, ename, age) VALUES (?, ?, ?)";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setInt(3, age);

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted != 0) {
				System.out.println("Employee inserted successfully.");
			} else {
				System.out.println("Failed to insert employee.");
			}
		}
	}

	public void updateEmployee(Connection connn) throws SQLException, IOException {
		System.out.print("Enter Employee ID to update: ");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter New Employee Name: ");
		String name = br.readLine();
		System.out.print("Enter New Employee Age: ");
		int age = Integer.parseInt(br.readLine());

		String sql = "UPDATE employee SET ename = ?, age = ? WHERE id = ?";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setInt(3, id);

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated != 0) {
				System.out.println("Employee updated successfully.");
			} else {
				System.out.println("Failed to update employee. Employee ID not found.");
			}
		}
	}

	public void deleteEmployee(Connection con) throws SQLException, IOException {
		System.out.print("Enter Employee ID to delete: ");
		int id = Integer.parseInt(br.readLine());

		String sql = "DELETE FROM employee WHERE id = ?";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setInt(1, id);

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted != 0) {
				System.out.println("Employee deleted successfully.");
			} else {
				System.out.println("Failed to delete employee. Employee ID not found.");
			}
		}
	}
}
