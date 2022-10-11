package abstraction;



abstract class Game
{
	public void start()
	{
		System.out.println("Game started");
	}
	public void stop()
	{
		System.out.println("Game stopped");
	}
	abstract void run();
}
class G1_game extends Game
{
	public void run()
	{
		System.out.println("g1_Game Running");
	}

}
abstract class G2_game extends Game
{
	public void run()
	{
		System.out.println("g2_Game Running");
	}

}
public class AbstarctClass {

	public static void main(String[] args) {
		G1_game g1=new G1_game();
		g1.start();
		g1.run();
		g1.stop();
		
//		G2_game g2=new G2_game();
//		g2.start();
//	
//		g2.stop();
//		

	}

}
