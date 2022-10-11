package multithreading;

public class MyThread3 implements Runnable {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*6+"\t"+Thread.currentThread().getName());
			try {
				Thread.sleep(3000); //non-runnable
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		MyThread3 m1=new MyThread3();
		MyThread3 m2=new MyThread3();
		
		Thread t1=new Thread(m1);
		t1.start();
		
		t1.setName("Hello");
		
		
		Thread t2=new Thread(m2);
		t2.start();
		
		t2.setName("Bye");
		
		
		
	}
	
}
