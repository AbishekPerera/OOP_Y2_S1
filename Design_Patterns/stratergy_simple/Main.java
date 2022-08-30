package stratergy_simple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird bird = new Bird();
		
		bird.setFlyBehavior(new FlyWithWings());
		bird.performFly();
		
		bird.setFlyBehavior(new FlyNoWay());
		bird.performFly();
		
		bird.setFlyBehavior(new FlyFaster());
		bird.performFly();

		
		bird.setSpeakBehaviour(new SpeekFast());
		bird.performSpeak();
		
		bird.performFly();
	}

}
