package vozilo13cas;

public class Kamion extends Vozilo {
	private int brojOsovina;
	
	Kamion(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojOsovina){
		super(marka, tip, registracija, godiste, vlasnik);
		this.brojOsovina = brojOsovina;
	}
	
	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}

	public void stampajPodatke() {
		System.out.println(getMarka() + " " + getTip() + " " + getGodiste() + " " +
	getRegistracija() + " " + getBrojOsovina() + " " + vlasnik.getIme() + " " +	vlasnik.getPrezime());
	}
}
