import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ParallelBehaviour;

public class klasa_2_3 extends Agent{
	
	protected void setup()
	{
		System.out.println("START");
		
		ParallelBehaviour parallel = new ParallelBehaviour(ParallelBehaviour.WHEN_ALL);
		parallel.addSubBehaviour(new OneShotBehaviour()
				{
					public void action()
					{
						System.out.println("I");
					}
				});
		parallel.addSubBehaviour(new OneShotBehaviour() {
				public void action()
				{
						System.out.println("II");
				}
		});
		parallel.addSubBehaviour(new OneShotBehaviour()
				{
					public void action()
					{
						System.out.println("III");
					}
				});
		
		addBehaviour(parallel);
		
	}
	
	protected void takeDown()
	{
		System.out.println("Usuwa sie");
	}
	
}
