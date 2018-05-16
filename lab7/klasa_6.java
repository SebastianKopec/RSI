import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import java.util.Scanner;

public class klasa_6 extends Agent {
	
	protected void setup()
	{
		System.out.println("Agent "+ getLocalName() + " startuję");
		
		addBehaviour(new CheckNumberVersionTwo());
		
	}

}

class CheckNumberVersionTwo extends SimpleBehaviour{

	boolean finished = false;

	public void action()
	{
		System.out.println("Zachowanie startuję");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int mat = scanner.nextInt();
		if(mat < 0) {
			System.out.println("kończenie");
			finished = true;
		}
	}
		
	
	public boolean done()
	{
		if(finished)
			System.out.println("Zachowanie zakończone");
		return finished;
	}
}