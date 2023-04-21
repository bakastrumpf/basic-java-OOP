package obliciPolimorfizam14cas;

public class Krug extends Oblik {

	private double poluprecnik;

	Krug(String boja, int brojStrana, double poluprecnik){
	super(boja, "Krug", brojStrana);
	this.poluprecnik = poluprecnik;
	}

	public double racunajPovrsinu() {
		return this.poluprecnik * this.poluprecnik * Math.PI;
	}

	public double racunajObim() {
		return 2 * this.poluprecnik * Math.PI;
	}

	public void stampajPodatke() {
		System.out.println(pribaviBoju() + " " + pribaviTip() + " " + pribaviBrojStrana() + " " + racunajPovrsinu()
				+ " " + racunajObim());
	}
}