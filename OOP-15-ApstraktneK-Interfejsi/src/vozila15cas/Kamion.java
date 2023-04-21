package vozila15cas;

abstract public class Kamion extends Vozilo {
	private int brojOsovina;

	Kamion(String marka, String tip, String registracija, int godiste, Osoba vlasnik, 
			int brojOsovina, boolean radi, String tipMotor, int snaga, int kubikaza){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza);
		this.brojOsovina = brojOsovina;
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	
	public void stampajPodatke() {
		super.stampajPodatke();
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			getBrojOsovina() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime());
		this.popAgregat.stampajPodatke();
	}
}
