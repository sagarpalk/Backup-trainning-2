import java.util.Scanner;

public class ArrayExample
{
	public static void main(String[] args) {
		
		//datatype array_name[]=new datatype[size];
		int arr[]=new int[5];//4*5=20 bytes
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
