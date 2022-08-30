package question04;

public class NissanCar implements Car {
	
	CarAirBag carairbag;

	public NissanCar(CarAirBag carairbag) {
		super();
		System.out.println("Assembling for Nissan");
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
