package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv LGtv = new LgTv();
		Remort remortForLg = new RemortController(LGtv);
		remortForLg.on();
		remortForLg.turn(12);
		remortForLg.off();
		
		Tv SonyTv = new SonyTv();
		Remort remortForSony = new RemortController(SonyTv);
		remortForSony.on();
		remortForSony.off();
		
		
		
	}

}
