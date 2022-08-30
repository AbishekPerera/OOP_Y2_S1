package command;

public class Remort {

	private Command onCommand;
	private Command offCommand;
	
	public void setButtons(Command onCommand,Command offCommand) {
		this.offCommand=offCommand;
		this.onCommand=onCommand;
	}
	
	public void onButtonPushed() {
		onCommand.execute();
	}
	
	public void offButtonPushed() {
		offCommand.execute();
	}
	
}
