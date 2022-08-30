package question04;

public class ToyotaCar implements Car {

	CarAirBag carairbag;
	
	public ToyotaCar(CarAirBag carairbag) {
		super();
		System.out.println("Assembling for Toyota");
		this.carairbag = carairbag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub

		carairbag.airBagLightIndecator();
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub

		carairbag.airBagMotionDetection();
	}

}
