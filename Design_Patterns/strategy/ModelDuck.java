package strategy;

public class ModelDuck extends Duck {

	ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new ModelQuack());
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model Duck");

	}

}
