import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_7 extends Agent{
	
	protected void setup()
	{
		System.out.println("startuję");
		addBehaviour(new NewTickBehaviour(this));
		System.out.println("zaraz sie usunie");
	}

}

class NewTickBehaviour extends Behaviour{
	 private int step = 0;
	 Agent temp007;
	 public NewTickBehaviour(Agent a)
	 {
		 super(a);
		 temp007 = a;
	 }
	 public void action() {
		 switch (step) {
		 	case 0:
		 		temp007.addBehaviour(new Behaviour()
		 				{
		 					boolean finished = false;
		 					public void action()
		 					{
		 						System.out.println("krok drugi");
		 						finished = true;
		 					}
		 					public boolean done()
		 					{
		 						return finished;
		 					}
		 				});
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