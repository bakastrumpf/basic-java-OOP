package oblici15cas;

public class Krug extends Oblik {

	private double poluprecnik;

	public Krug(String boja,String tip,int brojStrana,double poluprecnik) {
		super(boja,tip,brojStrana);
		this.poluprecnik = poluprecnik;
	}

	public double racunajPovrsinu() {
		return this.poluprecnik * this.poluprecnik * Math.PI;
	}

	public double racunajObim() {
		return 2 * this.poluprecnik * Math.PI;
	}
}