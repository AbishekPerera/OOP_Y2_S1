package bridge;

public class LgTv implements Tv {

	@Override
	public void on() {
		// TODO Auto-generated method stub

		System.out.println("LG Tv is On");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

		System.out.println("LG Tv is Offf");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LG Channel is : "+channel);
		
	}

}
