import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.core.behaviours.TickerBehaviour;

public class Agent6 extends Agent {

		  protected void setup() {
		    System.out.println("Agent "+getLocalName()+" started.");

		    // Add the TickerBehaviour (period 1 sec)
		    addBehaviour(new TickerBehaviour(this, 1000) {
		      protected void onTick() {
		        System.out.println("Agent "+myAgent.getLocalName()+": tick="+getTickCount());
		      } 
		    });

		    // Add the WakerBehaviour (wakeup-time 10 secs)
		    // po 2 minutach
		    addBehaviour(new WakerBehaviour(this, 120000) {
		      protected void handleElapsedTimeout() {
		        System.out.println("Agent "+myAgent.getLocalName()+": It's wakeup-time. Bye...");
		        myAgent.doDelete();
		      } 
		    });
		  } 
}

