package promenljive4cas;

public class Gorivo {

public static void main(String[] args) {	/* Deklaracija promenljivih. */
	int km = 350; 							// Iznos za menjačnicu.
	int gorivoL = 17;						// Vrednost evra u dinarima.
	double prosecnaPotrosnja;						
	/* Izracunavanje. */
	prosecnaPotrosnja = km / gorivoL;		// Compute the interest.
	// (Obratiti pažnju na to da nova vrednost investicije prepisuje staru.)
	/* Ispisivanje rezultata. */
	System.out.print("Prosečna potrošnja goriva na 100 km je " + prosecnaPotrosnja 
			+ ", jer je za " + km + " km potrošeno ukupno " + gorivoL + " litara goriva.");
	} 											// kraj main metode
} 												// kraj klase