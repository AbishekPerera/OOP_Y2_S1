package command;

public class OnCommand implements Command {

	private Light light;
	
	OnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		light.On();
		
	}

}
