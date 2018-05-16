import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;

public class klasa_2_5 extends Agent{
	
	protected void setup()
	{
		System.out.println("START");
		
		ParallelBehaviour parallel = new ParallelBehaviour();
		parallel.addSubBehaviour(new CyclicBehaviour(this)
				{
					public void action()
					{
						System.out.println("I");
					}
				});
		
		parallel.addSubBehaviour(new CyclicBehaviour(this)
		{
			public void action()
			{
				System.out.println("II");
			}
		});
		addBehaviour(parallel);
		
	}
	
	protected void takeDown()
	{
		System.out.println("Usuwa sie");
	}
	
}
