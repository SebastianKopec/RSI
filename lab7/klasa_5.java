import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import java.util.Scanner;

public class klasa_5 extends Agent {
	
	protected void setup()
	{
		System.out.println("Agent "+ getLocalName() + " startuję");
		
		addBehaviour(new CheckNumberBehaviour());
		
		System.out.println("Agent "+getLocalName()+" skończyl dzialanie!");
	}

}
//pobieranie z klawiatury
class CheckNumberBehaviour extends SimpleBehaviour{

	boolean finished = false;

	public void action()
	{
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
		return finished;
	}
}