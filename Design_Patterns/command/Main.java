package command;

public class Main {
	public static void main(String[] args) {

		Remort myRemort = new Remort();

		Light LivingRoomLight = new LivingRoom();

		Command onLiving = new OnCommand(LivingRoomLight);
		Command offLiving = new OffCommand(LivingRoomLight);

		myRemort.setButtons(onLiving, offLiving);

		myRemort.onButtonPushed();
		myRemort.offButtonPushed();
		

		Light BedRoomLight = new LivingRoom();

		Command onBed = new OnCommand(BedRoomLight);
		Command offBed = new OffCommand(BedRoomLight);

		myRemort.setButtons(onBed, offBed);

		myRemort.onButtonPushed();
		myRemort.offButtonPushed();

	}
}
