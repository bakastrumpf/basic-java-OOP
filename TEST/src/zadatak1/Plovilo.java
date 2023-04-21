package zadatak1;
/*
 * Napisati apstraktnu klasu Plovilo koja ima atribute: 
 * naziv (tipa String), vrsta (tipa String) i godište (tipa int); 
 * metode za pribavljanje i postavljanje svih atributa (getere i setere), 
 * konstruktor kojim se postavljaju vrednosti svih atributa i 
 * apstraktne metode za uplovljanje i isplovljavanje. 
 * Kod svih atributa i metoda navesti i odgovarajuće pristupne atribute.
 */

public abstract class Plovilo {
	
	protected String naziv;
	protected String vrsta;
	protected int godiste;
	
	public Plovilo(String naziv, String vrsta, int godiste) {
		super();
		this.naziv = naziv;
		this.vrsta = vrsta;
		this.godiste = godiste;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	
	abstract boolean uploviUluku();
	abstract boolean isploviIzLuke();

}
