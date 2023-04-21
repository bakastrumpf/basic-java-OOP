package testiranjeUI6cas;

/*******************************************************************************************************
* Primer modifikacije jednostavnog programa koji racuna zaradu na godisnjem nivou tako da investiciju i
* kamatnu stopu unosi korisnik. Ukupna zarada i vrednost investije posle godinu dana se ispisuju u konzolu.
*******************************************************************************************************/
	public class 		Investicija2 {
	public static void 	main(String[] args) {
	double 				investicija; 			// Vrednost investicije.
	double 				stopa;					// Kamatna stopa.
	double 				zarada;					// Ukupna kamata po godini.
	
	System.out.print	("Unesite vrednost investicije: ");
		investicija = TextIO.getlnDouble();
	System.out.print	("Unesite vrednost kamatne stope: ");
		stopa = TextIO.getlnDouble();
		zarada = investicija * stopa;
		investicija = investicija + zarada; 		// Izračunavanje zarade.
	System.out.println	("Za godinu dana zaradjeno je: " + zarada + " dinara.");
	System.out.println	("Ukupna vrednost investije je sada: " + investicija + " dinara.");
	}
}