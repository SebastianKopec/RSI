import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_3 extends Agent{
	
	protected void setup()
	{
		System.out.println("startuję");
		addBehaviour(new CyclicBehaviour() {
			public void action()
			{
				System.out.println("wykonywanie");
			}
		});
		System.out.println("zaraz się usunię");
		//doDelete();
	}
}
