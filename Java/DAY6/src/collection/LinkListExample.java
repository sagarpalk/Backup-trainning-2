package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int id;
	String name;
	float per;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
}


public class LinkListExample {
	public static void main(String args[]) {
		LinkedList<Student> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count of student");
		int c=sc.nextInt();
		
		for(int i=0;i<c;i++) {
			System.out.println("Enter id ,name,per of student");
			int id=sc.nextInt();
			String name=sc.next();
			float p=sc.nextFloat();
			
			Student s=new Student(id,name,p);
			ll.add(s);
		}
		System.out.println("student details");
		for(Student obj:ll) {
			System.out.println(obj);
			
		}
	}

}
