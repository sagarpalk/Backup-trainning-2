package ThrowsAndThrow;

import java.io.IOException;
import java.sql.SQLException;

import customException.ageAndNationality;

class UserValidation{
	public static void validate(String n,int age)throws ageAndNationality
	{
		if(age==18 && n.equalsIgnoreCase("Indian"))
		{
			System.out.println("welcome");
		}
		else {
			ageAndNationality e=new ageAndNationality("Age must be grater than 18");
			throw e;
//			//generate excep Explicitly
//			ArithmeticException e=new ArithmeticException();
//			NullPointerException e2=new NullPointerException();
//			ArrayIndexOutOfBoundsException e3=new ArrayIndexOutOfBoundsException();
//			
//			SQLException e4 = new SQLException();
//			throw e4;
	}
}
}

public class ThrowAndThrowsExam {
	public static void main(String args[]) {
		try {
			UserValidation.validate("sahgds",18);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			System.out.println("ends the code.....");
		
	}
}
