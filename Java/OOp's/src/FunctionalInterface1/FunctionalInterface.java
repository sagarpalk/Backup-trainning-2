package FunctionalInterface1;


interface My_inter
{
	void show();
}
public class FunctionalInterface 
{
	public static void main(String[] args) {
		My_inter i=()->System.out.println("Functional Interface");
		i.show();
	
	}
}