package obliciPolimorfizam14cas;

public class Kvadrat extends Oblik {

	private double stranica;

	Kvadrat(String boja, int brojStrana, double stranica){
	super(boja, "Kvadrat", brojStrana);
	this.stranica = stranica;
	}

	public double racunajPovrsinu() {
		return this.stranica * this.stranica;
	}

	public double racunajObim() {
		return 4 * this.stranica;
	}

	public void stampajPodatke() {
		System.out.println(pribaviBoju() + " " + pribaviTip() + " " + pribaviBrojStrana() + " " + racunajPovrsinu()
				+ " " + racunajObim());
	}
}