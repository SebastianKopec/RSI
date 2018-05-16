
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SimpleBehaviour;
import jade.core.behaviours.FSMBehaviour;



public class klasa_1_2 extends Agent{
	
	
	private static final String A = "A";
	private static final String B = "B";
	private static final String C = "C";
	private static final String D = "D";
	private static final String E = "E";
	
	
	
	
	protected void setup()
	{
		FSMBehaviour fsm = new FSMBehaviour(this){
					public int onEnd()
					{
						System.out.println("AGENT");
						myAgent.doDelete();
						return super.onEnd();
					}
				};
				
		fsm.registerFirstState(new NamePrintBehaviour(), A);
		fsm.registerState(new GenerateNumberBehaviour(2), B);
		fsm.registerState(new NamePrintBehaviour(), C);
		fsm.registerState(new GenerateNumberBehaviour(2), D);
		fsm.registerLastState(new NamePrintBehaviour(), E);
		
		
		fsm.registerDefaultTransition(A, B);		
		fsm.registerTransition(B, D, 0);			
		fsm.registerTransition(B, C, 1);			
		fsm.registerDefaultTransition(C, D);		
		fsm.registerTransition(D, A, 1);			
		fsm.registerTransition(D ,E, 0);			
		addBehaviour(fsm);
		
	}
	private class NamePrintBehaviour extends OneShotBehaviour
	{
		public void action()
		{
			System.out.println("Agent: " + getBehaviourName());
		}
	}
	
	
	private class GenerateNumberBehaviour extends NamePrintBehaviour
	{
		private int maxNum;
		private int Number;
		
		private GenerateNumberBehaviour(int max)
		{
			super();
			this.maxNum= max;
		}
		
		public void action()
		{
			System.out.println("Agent: " + getBehaviourName());
			Number = (int)(Math.random() * maxNum);
			System.out.println("Generowana: " + Number);
		}
		
		public int onEnd()
		{
			return Number;
		}
		
		
	}
}

