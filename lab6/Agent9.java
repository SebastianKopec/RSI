import jade.core.Agent;

public class Agent9 extends Agent{

	protected void setup()
	{
		Object[] obj = getArguments();
		int counter = Integer.parseInt(obj[0].toString());
		System.out.println("Passed argument = "+counter);
		for(int i=0;i<counter;i++)
			System.out.println("Test Agenta 9 : "+i);
	}
}
