package poslovanjeRestorana;

public class Porudzbina {
	
	//Narudžbina se sastoji od 
	// jedne ili više stavki iz jelovnika koje je naručio određeni klijent, 
	// kao i informacije o tome da li je narudžbina uspešno realizovana ili ne.

	private int porcija;
	private Jelovnik porucenoJelo;
	private Musterija primalac;
	private float cena;
	private float racun;
	private boolean realizovana;
	
	public Porudzbina(int porcija, Jelovnik porucenoJelo, Musterija primalac, float cena, float racun,
			boolean realizovana) {
		super();
		this.porcija = porcija;
		this.porucenoJelo = porucenoJelo;
		this.primalac = primalac;
		this.cena = cena;
		this.racun = racun;
		this.realizovana = realizovana;
	}

	public int getPorcija() {
		return porcija;
	}

	public void setPorcija(int porcija) {
		this.porcija = porcija;
	}

	public Jelovnik getPorucenoJelo() {
		return porucenoJelo;
	}

	public void setPorucenoJelo(Jelovnik porucenoJelo) {
		this.porucenoJelo = porucenoJelo;
	}

	public Musterija getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Musterija primalac) {
		this.primalac = primalac;
	}

	public boolean isRealizovana() {
		return realizovana;
	}

	public void setRealizovana(boolean realizovana) {
		this.realizovana = realizovana;
	}

	public float getCena() {
		return cena;
	}

	public float getRacun() { 
		// porcija * jelo kroz niz, sa for i i++ (kad je poruceno vise jela)
		return racun;
	}
	
	
	
}
