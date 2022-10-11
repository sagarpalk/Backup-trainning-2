package FunctionalInterface1;

import java.util.Scanner;
//Functional Interface holding single abstract method
interface Shape
{
	void area();
}

interface Math
{
	float div(int a,int b);
}
interface Calculation
{
	void squareArea(float s);
}

//class A implements Calculation
//{
//	public void squareArea(float s)
//	{
//		float ans=s*s;
//		System.out.println("Area of the Square is :"+ans);
//	}
//}

public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Shape s=()->{
			System.out.println("Enter value:");
			float r=sc.nextFloat();
			float ans=3.14f*r*r;
			System.out.println("Area is:"+ans);
			};
			s.area();
			
		Math m=( a, b)-> a/b;
		float ans=m.div(23, 3);
		System.out.println("Division is :"+ans);
			
//		A a1=new A();
//		a1.squareArea(4);
			
Calculation c=side->
System.out.println("Area of the square is :"+side*side);
			c.squareArea(5);
	}

}





