package FunctionalInterface1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//T-Type of argument
//R-return type-result type
//class ABC implements Function<String,Boolean>
//{
//	public Boolean apply(String str)
//	{
//		return str.length()<8;
//	}
//}

public class FunctionalInterfaces 
{
	public static void main(String[] args) {
		try
		{
Predicate<String> pre= str->str.equalsIgnoreCase("Cybage");
			System.out.println(pre.test("Amit"));
			
Consumer<Float> con=r->
{
	float ans=3.14f*r*r;
	System.out.println("Area of the circle is:"+ans);
};
con.accept(2.3f);

Function<String, Boolean> fun=str-> str.length()<8;
Boolean res=fun.apply("asf");

if(res)
	System.out.println("Please enter strong value>8");
else
	System.out.println("String Input!!");


			
/*
 * predicate is the built in functional interface
 * It hold test method which accept i/p and return 
 * boolean result  
 */
			Predicate<Integer> p=no->no%2==0;
			boolean i=p.test(7);
			if(i)
				System.out.println("even");
			else
				System.out.println("odd");
/*
 * Consumer is the built in functional interface
 * It hold accept method and 
 * it will not return any value 			
 */
	Consumer<Integer> c=(a)->System.out.println(a);
			c.accept(100);
/*
 * function is one of the built in functional interface
 * it hold apply method that accept input as well
 *  as return output
 *  
 */
			Function<Integer, String> f=(a)->
			"Value is :"+a;
			System.out.println(f.apply(23));
/*
 * Supplier is one of the built in functional interface 
 */
			Supplier<String> s=()->"Hello";
			System.out.println(s.get());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
