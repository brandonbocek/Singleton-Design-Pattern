package Singleton;
import java.util.LinkedList;

public class GetTheTiles implements Runnable{
	
	public void run(){
		
		//the thread layout for singleton pattern
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player "+ playerOneTiles);
		System.out.println(newInstance.getLetterList());
		System.out.println("Got Tiles");
	}

	
}
