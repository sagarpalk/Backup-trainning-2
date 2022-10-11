package multithreading;

public class MyThread2 implements Runnable {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*6);
		}
	}
	public static void main(String args[]) {
		MyThread2 m1=new MyThread2();
	MyThread2 m2=new MyThread2();
		
		Thread t1=new Thread(m1);
		t1.start();
		t1.stop();
		Thread t2=new Thread(m2);
		t2.start();
		
		
	}
	
}
