import jade.core.Agent;

public class klasa_1 extends Agent{

	protected void setup() {
		System.out.println("startuje"+getLocalName());
		}
		protected void takeDown() { 
		System.out.println("usuwa sie");
		}
}
