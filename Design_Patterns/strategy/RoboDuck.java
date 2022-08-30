package strategy;

public class RoboDuck extends Duck {
	
	RoboDuck(){
		setFlyBehavior(new FlyRocketPower());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a Robo duck");
	}

}
