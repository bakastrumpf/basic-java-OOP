package neNastavniciPlate;

/*Klasa Nastavnik ima dodatne atribute zvanje (tipa String) i brojSCIRadova (tipa int),
 * realizovati metodu predstaviSe i racunajPlatu
 * platu za nastavnike računati kao 60000+brojSCIRadova*3000
*/

public class Nastavnik extends Zaposleni {

	private String zvanje;
	private int brojSCIradova;
	
	public Nastavnik(String zvanje, int brojSCIradova) {
		super();
		this.zvanje = zvanje;
		this.brojSCIradova = brojSCIradova;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public int getBrojSCIradova() {
		return brojSCIradova;
	}

	public void setBrojSCIradova(int brojSCIradova) {
		this.brojSCIradova = brojSCIradova;
	}
	
	void predstaviSe() {
		
	}
	
//	public double racunajPlatu() {
//		plata = 60000+brojSCIRadova*3000;
//		return plata;
//	}
}
