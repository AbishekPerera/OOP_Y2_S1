package question01;

public class Squirrel extends Pet{
	
	private String Command;

	public Squirrel(String command) {
		super();
		Command = command;
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the Squirrel");
		setter(getter()+5.0);
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("clean the Squirrel");
		setter(getter()+10.0);
		
	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("cuddle the Squirrel");
		setter(getter()+15.0);
		
	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		if(isCaught()) {
			setter(0);
		}
		else {
			System.out.println("total point is "+getter());
		}
		
	}
	
	public Boolean isCaught() {
		
		boolean ans = false;

		try {
			if(Command.equalsIgnoreCase("Run5")) {
				
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
