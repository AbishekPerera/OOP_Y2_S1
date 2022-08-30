package strategy;

public abstract class Duck {
	
	private FlyBehavior flybehavior;
	private QuackBehavior quackbehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flybehavior=flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackbehavior=quackBehavior;
	}
	
	public void performFly() {
		flybehavior.fly();
	}
	
	public void performQuack() {
		quackbehavior.quack();
	}
	
	public abstract void display();
	
	
}
