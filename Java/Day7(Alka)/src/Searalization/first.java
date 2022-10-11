package Searalization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import demo2.Employee;

public class first {

	public static void main(String[] args) {
//		Employee emp=null;
	Employee emp=new Employee("sagar", "saving",34345);
		try(ObjectInputStream os=new ObjectInputStream
				(new FileInputStream("C://Users//sagarpalk//Desktop//demo.txt")))
				{
					emp=(Employee) os.readObject();
					System.out.println(emp);
				}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
