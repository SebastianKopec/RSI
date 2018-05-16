import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;

public class klasa_2_4 extends Agent{
	
	protected void setup()
	{
		System.out.println("START");
		
		SequentialBehaviour sequential = new SequentialBehaviour();
		sequential.addSubBehaviour(new OneShotBehaviour()
				{
					public void action()
					{
						System.out.println("I");
					}
				});
		sequential.addSubBehaviour(new OneShotBehaviour() {
				public void action()
				{
						System.out.println("II");
				}
		});
		sequential.addSubBehaviour(new OneShotBehaviour()
				{
					public void action()
					{
						System.out.println("III");
					}
				});
		
		addBehaviour(sequential);
		
	}
	
	protected void takeDown()
	{
		System.out.println("Usuwa sie");
	}
	
}
