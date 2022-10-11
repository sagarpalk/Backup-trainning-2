package callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * ScheduledThreadPool used blocking queue
 * BlockingQueue doesn't maintain task in 
 * sequence instead it maintain it on the basis of
 * priority of execution of task
 * 
 * ScheduleThreadPool is used to execute task after 
 * fixed time delay
 */
class MyTask implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class ScheduleThreadPool
{
	public static void main(String[] args) 
	{
		ScheduledExecutorService s=Executors.newScheduledThreadPool(10);
		//s.schedule(new MyTask(), 10, TimeUnit.SECONDS);
		//s.scheduleAtFixedRate(new MyTask(), 10, 5, TimeUnit.SECONDS);
		s.scheduleWithFixedDelay(new MyTask(), 5,15,TimeUnit.SECONDS);
		
		
		
		
	}

}
