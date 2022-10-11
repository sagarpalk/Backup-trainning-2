package Starter;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "root");
			Statement stmt = con.createStatement();
			System.out.println("Created DB connection...");
			ResultSet resultSet = stmt.executeQuery("select * from student");
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				int id = resultSet.getInt(2);
				System.out.println(id + " " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
