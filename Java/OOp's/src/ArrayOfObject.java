import java.util.Scanner;

class Stud extends Object
{
	int id;
	String name;
	
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Method of Object class--overriding
	public String toString() {
		return id+"\t"+name;
	}
	
}
public class ArrayOfObject
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Colunt of Student:");
		int sc=s.nextInt();
		
		Stud arr[]=new Stud[sc];//Class Type Array
		
		for(int i=0;i<sc;i++)
		{
			System.out.println("Enter id and name");
			int id=s.nextInt();
			String n=s.next();
			arr[i]=new Stud(id,n);//Object
		}
		System.out.println("Details:");
		for(int i=0;i<sc;i++)
		{
			System.out.println(arr[i]);
		}
		
//		Stud s=new Stud(1, "Anagha");
//		System.out.println(s);//s.o.p(s.toString())
	}

}



