package slaganjeVozilaOsobe;

public class Motor {
	private boolean radi;
	private String tip;
	private int snaga;
	private int kubikaza;

	Motor() {
	}

	Motor(boolean radi, String tip, int snaga, int kubikaza) {
		this.radi = radi;
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
	}

	public void postaviRadi(boolean radi) {
		this.radi = radi;
	}

	public boolean pribaviRadi() {
		return this.radi;
	}

	public void ukljuci() {
		if (this.pribaviRadi() == false)
			this.postaviRadi(true);
	}

	public void iskljuci() {
		if (this.pribaviRadi() == true)
			this.postaviRadi(false);
	}

	public void stampajPodatke() {
		System.out.println("Informacije o motoru:");
		System.out.println("Ukljucen:" + pribaviRadi() + " Tip: " + this.tip + " Snaga: " + this.snaga + " Kubikaza: "
				+ this.kubikaza);
	}
}
