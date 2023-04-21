package oblik;

public class Oblik {
	/*
	 * Realizovati klasu Oblik sa atributima boja
(String), tip (String), brojStrana (int),
površina (double), standardnim konstruktorom i
konstruktorom koji postavlja inicijalne vrednosti,
metodama za postavljanje i pribavljanje atributa, kao i
metodama za promenu boje oblika i štampanje podataka
o obliku.
	 */
	protected String boja;
	private String tip;
	private int brojStrana;
	protected double povrsina;
	
	Oblik(){}

	public Oblik(String boja, String tip, int brojStrana, double povrsina) {
		super();
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
		this.povrsina = povrsina;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	
	
	public String promeniBoju () {
		return boja;
	}
	
	void stampajPodatke() {
		System.out.println("Oblik koji ima "+brojStrana+" stranica zove se "+tip+" .");
	}
}
