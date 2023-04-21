package zadatak1;
/*
 * Oblik koja ima atribute: boja (tipa String), tip (tipa String) i brojStrana (tipa int); 
 * metode za pribavljanje i postavljanje svih atributa (getere i setere), 
 * konstruktor kojim se postavljajuju vrednosti svih atributa i 
 * apstraktne metode za računanje površine i obima. 
 * Kod svih atributa i metoda navesti i odgovarajuće pristupne atribute.
 */

public abstract class Oblik {

	private String boja;
	private String tip;
	private int brojStrana;
	
	Oblik (){}

	public Oblik(String boja, String tip, int brojStrana) {
		super();
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
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
	
	abstract double racunajPovrsinu();
	abstract double racunajObim();
	
}