package vozilo;

public class Vozilo {
	String marka, tip, registracija;
	int godiste, maksBrzina, snaga, cena;

	Vozilo() {
	}

	void postaviMarku(String m) {
		marka = m;
	}

	void postaviTip(String t) {
		tip = t;

	}

	void postaviRegistraciju(String r) {
		registracija = r;
	}

	void postaviGodiste(int g) {
		godiste = g;
	}

	void postaviMaksBrzinu(int mb) {
		maksBrzina = mb;
	}

	void postaviSnagu(int s) {
		snaga = s;
	}

	public double racunajVrednost(){
		cena=maksBrzina*snaga/(2021-godiste);
	return cena;
	}

	void stampajVrednost() { 						// stampa rezultata
		System.out.println("Automobil " + marka + " " + tip +", "+ godiste + ". godište, "
			+ "poslednji put registrovan " +registracija +". godine - košta: " + cena + " evra.");
	}
	
	void uporediVrednost(Vozilo vozilo) {
	if(this.cena<vozilo.cena) {
			System.out.println("Vozilo " + this.marka + " je jeftinije od " + vozilo.marka);
	} else if (this.cena > vozilo.cena)
			System.out.println("Vozilo " + this.marka + " skuplje je od " + vozilo.marka);
	else {
			System.out.println("Cene ovih vozila su iste!");
	}
	}
}