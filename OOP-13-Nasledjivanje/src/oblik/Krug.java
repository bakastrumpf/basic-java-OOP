package oblik;
/*
 * Realizovati klase Kvadrat (dodatni atribut
duzinaStranice tipa double) i Krug (dodatni atribut
poluprecnik tipa double) koje nasleđuju klasu Oblik i
implementiraju metode za računanje površine.
 */

public class Krug extends Oblik {

	
	private double poluprecnik;
	
	Krug(){}

		public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
			return poluprecnik;
		}

	public void setPoluprecnik(double poluprecnik) {
			this.poluprecnik = poluprecnik;
		}

	public double racunajPovrsinu() {
		povrsina = 2 * poluprecnik * 3.14;
		return povrsina;
	}
	
	public String promeniBoju() {
		return boja;
	}
	
	@Override
	void stampajPodatke() {
		System.out.println("Oblik krug ima " + super.getBrojStrana() + " stranica i površinu " + super.getPovrsina());
	}
}
