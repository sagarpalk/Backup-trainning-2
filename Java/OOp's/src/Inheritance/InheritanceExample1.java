package Inheritance;
class Employee// extends Object
{
	int id;
	String name;
	float sal;
	
	public Employee(int id, String name) {
		super();//Call parent class const
		this.id = id;
		this.name = name;
	}
	void show()
	{
		System.out.println(id+"\t"+name+"\t"+sal);
	}
	
}
//IS_A
class FullTimeEmp extends Employee
{
	int fsal,enhrs,hrs_sal;//Instance
	FullTimeEmp(int id,String name,int fsal,int enhrs,int hrs_sal)
	{
		super(id, name);//call to parent constructor
		this.fsal=fsal;
		this.enhrs=enhrs;
		this.hrs_sal=hrs_sal;
	}
	
	void calSal()
	{
		sal=fsal+(enhrs*hrs_sal);//Inheritance
	}
	
}
public class InheritanceExample1 {
	public static void main(String[] args) 
	{
		FullTimeEmp p=new FullTimeEmp(1, "Anagha", 45000, 20, 500);
		p.calSal();
		p.show();//Inheritance
	}
}







