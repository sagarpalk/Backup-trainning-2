package Abstraction;

interface Game
{
	//public abstract 
	void start();
	void stop();
	void run();
	default void pause()
	{
		System.out.println("Game Paused!!!");
	}
	static void resume()
	{
		System.out.println("Game resume!!!!");
	}
	
}
class G1_Game implements Game
{
	public void start()
	{
		System.out.println("G1_game started");
	}
	public void stop()
	{
		System.out.println("G1_Game stoped");
	}
	public void run()
	{
		System.out.println("G1_Game running!!!");
	}
}

public class InterfaceExample
{
	public static void main(String[] args) {
		Game g=new G1_Game();
		g.start();
		g.run();
		g.pause();
		Game.resume();
		g.stop();
	}

}
