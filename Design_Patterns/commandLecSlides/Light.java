package commandLecSlides;

public class Light {
	
	String Location;

	public Light(String location) {
		super();
		Location = location;
	}
	
	public void On() {
		System.out.println(Location + " Lihght is on ");
	}
	
	public void Off() {
		System.out.println(Location + " Light is Off ");
	}

}
