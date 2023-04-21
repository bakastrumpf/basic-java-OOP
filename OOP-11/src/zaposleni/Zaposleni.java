package zaposleni;

public class Zaposleni {

	String ime, prezime;
	double koeficijent, plata, k1;

	void postaviIme(String i) {
		ime = i;
	}
	
	void postaviPrezime(String p) {
		prezime = p;
	}

	void koeficijentRadnogMesta(double k1){
		koeficijent = k1;
	}
	
	void racunajPlatu() { 			// prosek plate
		plata = (koeficijent *2500);
	}

	void stampajPlatu() {			// stampa rezultata
		System.out.println("Запослени " + ime + " " + prezime + " с коефицијентом радног места " + koeficijent + " прима плату: " + plata + " РСД.");
	}
}