package ExceptionHandling;
public class FinallyBlock
{
	public static void main(String args[]) {
		try {
			String str = null;
			System.out.println(str);
		}
		finally {
		  System.out.println("code in finally block");
		}
		System.out.println("code ends...");
	}
}