package Starter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {
			conn = JDBCUtility.getConnection();
			preparedStatement = conn.prepareStatement("insert into student(name,id) values(?,?)");
			preparedStatement.setInt(2, 100);
			preparedStatement.setString(1, "Amit");
			preparedStatement.executeUpdate();

			preparedStatement.addBatch();
			int count[] = preparedStatement.executeBatch();
			for (int i = 0; i < count.length; i++) {
				System.out.println(count[i] + " " + i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
