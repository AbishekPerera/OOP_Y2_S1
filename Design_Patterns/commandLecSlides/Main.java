package commandLecSlides;

public class Main {

	public static void main(String[] args) {
		
		Remort myRemort = new Remort();
		Light lightLiving = new Light("LivingRoom");
		
		Command lightOnLiving = new OnCommand(lightLiving);
		Command lightOffLiving = new OffCommand(lightLiving);

		
		myRemort.setButtons(0, lightOnLiving, lightOffLiving);
		
		myRemort.onBtnPush(0);
		myRemort.offBtnPush(0);
		
		//------------------------------------------------------
		//
		// for additional  
		//
		//if some one accidentally pushed non-programmed button in remote its gives nullpointerException then i use try catch 
		
		try {
			Light bedRoomLight = new Light("Bed Room");
			
			Command BedRoomOn = new OnCommand(bedRoomLight);
			Command BedRoomOff = new OffCommand(bedRoomLight);
			
			myRemort.setButtons(4, BedRoomOn, BedRoomOff);
			
//			myRemort.onBtnPush(6);
//			myRemort.offBtnPush(6);
			
			myRemort.onBtnPush(4);
			myRemort.offBtnPush(4);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("ema ekak na bng!!");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Obanna ema button ekak na bng");
		}
		
	}
}
