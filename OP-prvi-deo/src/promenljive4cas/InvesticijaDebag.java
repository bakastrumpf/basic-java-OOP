package promenljive4cas;

public class InvesticijaDebag {

	public static void main(String[] args) { 
		double investicija; 
		double stopa; 										// Kamatna stopa: int u double
		double zarada; 

		/* Izracunavanje. */
		investicija = 1000;
		stopa = 0.027;
		zarada = investicija * stopa;
		investicija = investicija / zarada; 
	
		/* Ispisivanje rezultata. */
		System.out.print("Za godinu dana zaradjeno je: ");
		System.out.print(zarada); 							// zarade u zarada
		System.out.println(" dinara.");
		System.out.print("Ukupna vrednost investicije je sada: ");
		System.out.print(stopa);
		System.out.print(" dinara.");
	} 
} 
