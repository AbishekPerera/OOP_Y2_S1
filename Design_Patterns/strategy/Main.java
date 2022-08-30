package strategy;

public class Main {
	public static void main(String[] args) {

	Duck ob = new ModelDuck();
	ob.display();
	ob.performFly();
	ob.performQuack();
	
	Duck ob2 = new RoboDuck();
	ob2.display();
	ob2.performFly();
	ob2.performQuack();
	
	}
}
