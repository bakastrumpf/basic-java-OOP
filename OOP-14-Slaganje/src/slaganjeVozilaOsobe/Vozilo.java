package slaganjeVozilaOsobe;

public class Vozilo {
	protected String marka;
	protected String tip;
	protected String registracija;
	protected int godiste;
	protected Osoba vlasnik;
	protected Motor popAgregat;

	Vozilo(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean radi, String tipMotor,
			int snaga, int kubikaza) {
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = vlasnik;

		this.popAgregat = new Motor(radi, tipMotor, snaga, kubikaza);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public boolean pokreniVozilo() {
		popAgregat.ukljuci();
		return popAgregat.pribaviRadi();
	}

	public boolean zaustaviVozilo() {
		popAgregat.iskljuci();
		return !popAgregat.pribaviRadi();
	}

	protected void prenosVlasnistva(Osoba noviVlasnik) {
		this.vlasnik = noviVlasnik;
	}

	protected void stampajPodatke() {
		System.out.println(getMarka() + " " + getTip() + " " + getGodiste() + " " + getRegistracija() + " "
				+ vlasnik.getIme() + " " + vlasnik.getPrezime());
	}

}