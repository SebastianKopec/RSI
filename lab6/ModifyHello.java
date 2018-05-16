//package examples.hello;

import jade.core.Agent;

public class ModifyHello extends Agent {

  protected void setup() {
  	System.out.println("Hello World! Teraz ten agent "+getLocalName()+" sie nie usunie");
  	
  	//doDelete();
  } 
}

