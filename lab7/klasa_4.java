import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_4 extends Agent{
	
	protected void setup()
	{
		System.out.println("startuję");
		
		addBehaviour(new MyThreeStepBehaviour());
		
		System.out.println("zaraz się usunię");
	}

}
//zachowanie generyczne
class MyThreeStepBehaviour extends Behaviour{
	 private int step = 0;
	 public void action() {
		 switch (step) {
		 	case 0:
		 		System.out.println("Krok pierwszy");
		 		step++;
		 		break;
		 	case 1:
		 		System.out.println("Krok drugi");
		 		step++;
		 		break;
		 	case 2:
		 		System.out.println("Krok trzeci");
		 		step++;
		 		break;
	 	}
	 }
	 
	 
	 public boolean done() {
		 return step == 3;
	 }
}