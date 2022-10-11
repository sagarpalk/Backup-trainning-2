package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		try {
			// all critical code must written in try block
			System.out.println("enter no1");
			int arr[] = new int[3];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[3] = arr[0] / arr[1];
			System.out.println(arr[3]);
//			int a = sc.nextInt();
//			System.out.println("enter no 2");
//			int b = sc.nextInt();
//			int c = a / b; //--create object of ArithmeticExceptione
			
//			System.out.println("division" + c);
			try {
				String str = null;
				System.out.println(str);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("cannot divide by zero..");
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("cannot divide by zero..");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("index bound becoz size is 3");
		}
		System.out.println("run cpde....");

	}
}
