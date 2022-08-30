package singleton;

public class Singleton {

	Singleton uniq=null;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Singleton getSingle() {
		
		if(uniq==null) {
			uniq = new Singleton();
			return uniq;
		}else {
			return uniq;
		}
	}
}
