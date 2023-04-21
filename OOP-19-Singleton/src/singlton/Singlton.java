package singlton;

public class Singlton {
	private static Singlton instanca = null;
	
	public String str;
	protected Singlton() {
	// Postoji samo kako bi sprecili instanciranje
	this.str = "Pozdrav!";
	}
	
	public static Singlton pribaviInstancu() {
		if(instanca == null) {
			instanca = new Singlton();
	}
	return instanca;
	}
}
	
