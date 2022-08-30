package bridge;

public class SonyTv implements Tv{

	@Override
	public void on() {
		// TODO Auto-generated method stub

		System.out.println("Sony Tv is On");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

		System.out.println("Sony Tv is Offf");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Sony Channel is : "+channel);
		
	}
}
