package multithreading;

public class MyThread extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*6);
		}
	}
	public static void main(String args[]) {
		MyThread t1=new MyThread();
		t1.start();
		
		MyThread t2=new MyThread();
		t2.start();
		
		
	}
	
}
