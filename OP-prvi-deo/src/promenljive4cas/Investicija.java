package promenljive4cas;

public class Investicija {

public static void main(String[] args) {	/* Deklaracija promenljivih. */
	double investicija; 					// Vrednost investicije.
	double stopa;							// Kamatna stopa.
	double zarada;							// Ukupna kamata po godini.
	/* Izracunavanje. */
	investicija = 1000;
	stopa = 0.027;
	zarada = investicija * stopa;			// Compute the interest.
	investicija = investicija + zarada;		// Izracunavanje investicije posle godinu dana sa kamatom.
	// (Obratiti pažnju na to da nova vrednost investicije prepisuje staru.)
	/* Ispisivanje rezultata. */
	System.out.println("Investicija: " + investicija);
	System.out.println("Kamatna stopa: " + stopa);
	System.out.print("Za godinu dana zarađeno je: ");
	System.out.print(zarada);
	System.out.println(" dinara.");
	System.out.print("Ukupna vrednost investicije je sada: ");
	System.out.print(investicija);
	System.out.print(" dinara.");
	} 										// kraj main metode
}											// kraj klase