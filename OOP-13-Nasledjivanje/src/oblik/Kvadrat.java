package oblik;

public class Kvadrat extends Oblik {
	/*
	 * Realizovati klase Kvadrat (dodatni atribut
duzinaStranice tipa double) i Krug (dodatni atribut
poluprecnik tipa double) koje nasleđuju klasu Oblik i
implementiraju metode za računanje površine.
	 */
	private double duzinaStranice;
	
	Kvadrat(){}

	public Kvadrat(double duzinaStranice) {
		super();
		this.duzinaStranice = duzinaStranice;
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	public double racunajPovrsinu() {
		povrsina = 4 * duzinaStranice;
		return povrsina;
	}
	
	public String promeniBoju() {
		return boja;
	}
	
	@Override
	void stampajPodatke() {
		System.out.println("Oblik kvadrat ima " + super.getBrojStrana() + " stranica i povrsinu " + super.getPovrsina());
	}
}
