package FunctionalInt;

import java.util.function.Predicate;

class A implements Predicate<String>
{
	public boolean test(String str)
	{
		return str.equalsIgnoreCase("Sagar");
	}
}
public class builtinInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a1=new A();
//		System.out.println(a1.test("SAgar"));
	Predicate<String> pre=str->str.equalsIgnoreCase("Sgar");
	System.out.println(pre.test("Sagar"));
	
	};

}
