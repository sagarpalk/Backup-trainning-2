package multithreading;

public class ThreadExtends extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*6+"\t"+Thread.currentThread().getName()+"/t"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000); //non-runnable
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		ThreadExtends m1=new ThreadExtends();
		ThreadExtends m2=new ThreadExtends();
		ThreadExtends m3=new ThreadExtends();
		
//		Thread t1=new Thread(m1);
		m1.start();
		m2.start();
		m3.start();
		
		m1.setName("Hello");
		m2.setName("Bye");
		m3.setName("Sagar");
		
		m1.setPriority(6);
		m2.setPriority(Thread.MAX_PRIORITY);
		m3.setPriority(Thread.MIN_PRIORITY);
		
		
//		Thread t2=new Thread(m2);
		
		
		
		
		
		
	}
	
}
