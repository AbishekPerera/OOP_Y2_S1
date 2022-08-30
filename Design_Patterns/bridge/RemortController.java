package bridge;

public class RemortController implements Remort {

	private Tv tv;
	
	public RemortController(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

		tv.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

		tv.off();
	}

	@Override
	public void turn(int channel) {
		// TODO Auto-generated method stub
		
		tv.tune(channel);
	}

	

}
