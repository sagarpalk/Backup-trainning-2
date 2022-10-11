package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of employee");
		int ec=sc.nextInt();
		
		//Arraylist obj
		ArrayList<String>al=new ArrayList<String>();
		
		System.out.println("Enter the employee names");
		for(int i=0;i<ec;i++)
		{
			String name=sc.next();
			al.add(name);
		}
		System.out.println("Employee list");
		
		//for(dataType var_name:array_name or collection_name){}
		for(String val:al) {
			System.out.println(val);
		}
	}

}
