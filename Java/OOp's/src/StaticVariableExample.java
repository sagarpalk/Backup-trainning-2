class Emp
{
	int id;
	String name,desig;
	static String company="Cybage";
	
	Emp(int id, String name, String desig)
	{
		this.id = id;
		this.name = name;
		this.desig = desig;
	}
	void show()
	{
		company="Cybage Software pvt. ltd.";
		System.out.println(id+"\t"+name+"\t"+desig+"\t"+company);
	}
	

}
public class StaticVariableExample {
	public static void main(String[] args) {
		Emp e1=new Emp(1, "Pratik", "DBA");
		Emp e2=new Emp(2, "Anagha", "Tester");
		
		e1.show();
		e2.show();
	}
}









