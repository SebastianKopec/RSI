import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_2 extends Agent{
	
	protected void setup()
	{
		System.out.println("startuję");
		addBehaviour(new BehaviourTest(this));
		System.out.println("zaraz sie usunię");
		//doDelete();
		
	}

}
class BehaviourTest extends OneShotBehaviour
{
	public BehaviourTest(Agent a) { 
        super(a);  
   }
	
	public void action()
	{
		System.out.println( "wykonuje sie agent " + 
                myAgent.getLocalName() );
	}
	

}