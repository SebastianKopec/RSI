import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
public class klasa_8 extends Agent{
	
	protected void setup()
	{
		System.out.println("Start ");
		
		
		addBehaviour(new TickerBehaviour(this, 2000) {
			 protected void onTick() {
			 		System.out.println("maly tick");
			 	}
			 } );
		Big_tick TICK = new Big_tick(this,5000);
		addBehaviour(TICK);
		
		addBehaviour(new TickerBehaviour(this,50000)
				{
					protected void onTick()
					{
						removeBehaviour(TICK);
					}
				});
		
		addBehaviour(new TickerBehaviour(this,100000)
				{
					protected void onTick()
					{
						System.out.println("Usuniecie agenta");
						doDelete();
					}
				});
		System.out.println("Koniec ");
	}

}

class Big_tick extends TickerBehaviour
{
	public Big_tick(Agent a, long period) {
		super(a, period);
	}

	protected void onTick()
	{
		System.out.println("duzy tick");
	}
}