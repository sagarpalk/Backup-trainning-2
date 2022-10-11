package callable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class My_Task2 implements Callable<String>
{

	@Override
	public String call() throws Exception {
		
		return "Cybage";
	}
	
}
public class FeatureExample 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService s=Executors.newFixedThreadPool(5);
		//Single
		Future<String> f=s.submit(new My_Task2());
		String i=f.get();//blocking operation
		System.out.println(i);
		
		
		
		System.out.println("Multiple");
		List<Future<String>> l=new ArrayList<Future<String>>();
		for(int j=0;j<10;j++)
		{
			Future<String> f1=s.submit(new My_Task2());
			l.add(f1);
		}
		for(Future<String> obj:l)
		{
			String val=obj.get();
			System.out.println(val);
		}
	}

}
