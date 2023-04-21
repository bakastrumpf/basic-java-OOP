package neNastavniciPlate;

public class Zaposleni extends Osoba {

	protected double plata;
	private double godineStaza;
	
	Zaposleni(){}

	public Zaposleni(double plata, double godineStaza) {
		super();
		this.plata = plata;
		this.godineStaza = godineStaza;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public double getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(double godineStaza) {
		this.godineStaza = godineStaza;
	}
	
	public double racunajPlatu() {
		return plata;
	}
}