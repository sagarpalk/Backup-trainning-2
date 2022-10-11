package Starter;
import java.sql.*;
public class callable {

	// Java program to use Callable Statement
	// in Java to call Stored Procedure

	

	public static void main(String[] args) throws Exception
	    {
	        Class.forName("com.mysql.jdbc.Driver");
	       
	        // Getting the connection
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "root");
	       
	        String sql_string = "insert into student values(?,?)";
	        
	        // Preparing a CallableStateement
	        CallableStatement cs = con.prepareCall(sql_string);
	       
	        cs.setString(1, "xyz");
	        cs.setInt(2, 55);
	        
	        cs.execute();
	        System.out.print("uploaded successfully\n");
	    }
}
