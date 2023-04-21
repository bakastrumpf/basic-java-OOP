package slaganjeVozilaOsobe;

public class Motocikl extends Vozilo {
	private boolean registrovan;

	Motocikl(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean registrovan,
			boolean radi, String tipMotor, int snaga, int kubikaza) {
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza);
		this.registrovan = registrovan;
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}

	public void stampajPodatke() {
		System.out.println(getMarka() + " " + getTip() + " " + getGodiste() + " " + getRegistracija() + " "
				+ isRegistrovan() + " " + vlasnik.getIme() + " " + vlasnik.getPrezime());
		this.popAgregat.stampajPodatke();
	}

}
