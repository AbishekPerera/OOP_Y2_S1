package stratergy_simple;

public class Bird {
	
	private FlyBehaviour flayBehavior;
	private SpeakBehaviour speakBehavior;
	
	public void setFlyBehavior(FlyBehaviour fly) {
		this.flayBehavior=fly;
	}
	
	public void performFly() {
		flayBehavior.fly();
	}
	
	public void setSpeakBehaviour(SpeakBehaviour speak) {
		this.speakBehavior=speak;
	}
	
	public void performSpeak() {
		    speakBehavior.speak();
	}
	
}
