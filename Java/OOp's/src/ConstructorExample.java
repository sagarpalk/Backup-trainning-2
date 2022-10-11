class Student
{
	//Instance variables
	int id;//0
	String name;//null
	float percentage;//0.0
	
	Student()
	{
		System.out.println("Default constructor!!!");
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student(int id,String name,float percentage)//Local variable
	{
		this(id,name);//Constructor call
		this.percentage=percentage;
	}
	void show()
	{
		System.out.println(id+"\t"+name+"\t"+percentage);
	}
	
}
public class ConstructorExample
{
	public static void main(String[] args) {
//		Student s1=new Student();
//		s1.show();
//		
		Student s2=new Student(1, "Amit Jadhav", 76.46f);
		s2.show();
	}

}





