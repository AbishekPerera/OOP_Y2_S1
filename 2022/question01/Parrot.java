package question01;

public class Parrot extends Pet {

	private String Command;

	public Parrot(String command) {
		super();
		Command = command;
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the Parrot");
		setter(getter()+5.0);

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("clean the Parrot");
		setter(getter()+10.0);

	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("cuddle the Parrot");
		setter(getter()+15.0);

	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub

		if(isCaught()) {
			setter(0.0);
		}else {
			System.out.println("total point is "+getter());
		}
	}

	public Boolean isCaught() {
		
		boolean ans = false;

		try {
			if(Command.equalsIgnoreCase("Walk")) {
				
				ans = true;
				throw new CaughtException("Caught");
				
			}
			else {
				ans = false;
				System.out.println("Did not Caucht");
			}
			
		} catch (CaughtException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e);
			
		}
		
		return ans;
	}

}
