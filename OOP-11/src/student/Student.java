package student;

public class Student {

	String ime, prezime;
	double test1, test2, prosek;

	void postaviImePrezime(String i, String p) {
		ime = i;
		prezime = p;
	}

	void postaviKoeficijent(double t1, double t2){
		test1 = t1;
		test2 = t2;
	}
	
	void racunajProsek() {		// prosek poena		
		prosek = (test1 + test2) / 2;
	}

	void stampajPoene() {
		// stampa rezultata
		System.out.println("Student " + ime + " " + prezime + " - ostvario je prosečan broj poena na prva 2 kolokvijuma: " + prosek + ".");
	}
}