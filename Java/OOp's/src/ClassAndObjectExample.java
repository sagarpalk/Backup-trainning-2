class Employee
{
	//data members(variables)
	int emp_code=26695;
	String name="Sonali Mindhe";
	//member methods(Functions)
	//return_type function_name(arg list)
	void getInfo()
	{
		System.out.println
		("Employee Code:"+emp_code+"\nEmployee Name:"+name);
	}

}
public class ClassAndObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		//ClassName objectName=new ClassName()
		Employee emp=new Employee();
		emp.getInfo();
		System.out.println(emp.emp_code);
	}
}








