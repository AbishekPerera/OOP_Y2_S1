package commandLecSlides;

public class Remort {

	private Command []onBtn;
	private Command []offBtn;
	
	public Remort() {
		super();
		this.onBtn = new Command[7];
		this.offBtn = new Command[7];
		
		for (int i = 0; i < 7; i++) {
			
			this.offBtn[i]=null;
			this.onBtn[i]=null;
			
		}
	}

	public void setButtons(int slot, Command onBtn,Command offBtn) {
	
		this.onBtn[slot] = onBtn;
		this.offBtn[slot] = offBtn;
		
	}
	
	public void onBtnPush(int slot) {
		onBtn[slot].Execute();
	}
	
	public void offBtnPush(int slot) {
		offBtn[slot].Execute();
	}
}
