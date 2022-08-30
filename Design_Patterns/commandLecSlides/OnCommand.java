package commandLecSlides;

public class OnCommand implements Command {

	Light light;

	
	public OnCommand(Light light) {
		super();
		this.light = light;
	}

	public void Execute() {
		// TODO Auto-generated method stub
		light.On();
	}

}
