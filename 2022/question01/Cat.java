package question01;

public class Cat extends Pet{

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the Cat");
		setter(getter()+5.0);
		
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning the Cat");
		setter(getter()+10.0);
		
	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("Cuddling the Cat");
		setter(getter()+15.0);
		
	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		
		System.out.println("Total Point is" + getter());
	}

}
