package promenljive4cas;

public class Menjacnica {

	public static void main(String[] args) {	/* Deklaracija promenljivih. */
	float ukupnoDinara; 						// Iznos za menjačnicu.
	float vrednostEvra;							// Vrednost evra u dinarima.
	float transakcija;							// Kalkulator.
	/* Izracunavanje. */
	ukupnoDinara = 70620;
	vrednostEvra = 117.7f;
	transakcija = ukupnoDinara / vrednostEvra;			// Compute the interest.
	// (Obratiti pažnju na to da nova vrednost investicije prepisuje staru.)
	/* Ispisivanje rezultata. */
	System.out.println("Investicija: " + ukupnoDinara);
	System.out.println("Vrednost evra: " + vrednostEvra);
	System.out.print("Za iznos od " + ukupnoDinara + " dinara može se kupiti " + transakcija + " evra.");
	} 											// kraj main metode
} 												// kraj klase
