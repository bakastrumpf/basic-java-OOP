package statickeStrukture7cas;
//Prebrojavanje slova i beleženje pozicija na kojima se slovo sve nalazi: 

public class PrebrojavanjeSlovaPozicije {
	public static void main(String[] args) {
		
		String str;  		// linija teksta koju unosi korisnik.
		int ukSlova; 		// ukupan broj različitih slova u str tekstu.
		int ukPojSlova; 	// ukupan broj pojavljivanja jednog slova u str tekstu.
		char slovo;  		// Slovo iz alfabeta.
		int i;       		// indeks slova u nizu karaktera string str.
		System.out.println("Unesite jedan red teksta:");
		str = TextIO.getln();
		str = str.toUpperCase();
		ukSlova = 0;
		System.out.println("Vaš red teksta sadrži sledeća slova:");
		System.out.println();
		System.out.print("   ");

			for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) {
				ukPojSlova = 0;
				for ( i = 0; i < str.length(); i++ ) {
					if ( slovo == str.charAt(i) ) {					// ako je pronašao slovo
						if (ukPojSlova < 1)							// ako je pronašao to slovo prvi put
							System.out.print(slovo + "("+ i);		// ispiši slovo, otvori zagradu i ispiši prvi koordinatu, ne možemo staviti
																	// zarez jer ne znamo da li ima još pojava slova, niti možemo zatvoriti 
																	// zagradu iz istog razloga
						ukPojSlova++; 								// povećamo broj koji broji koliko puta se pojavilo to slovo
						if (ukPojSlova > 1)							// ako nije prva pojava tog slova 
							System.out.print(","+ i);				// za svaku sledeću pojavu slova, ispiši zaraz (jer ide iza prvog) 
																	// i njegovu koordinatu
					}
				}
				if (ukPojSlova > 0) {								// ako je oktrio slovo
					System.out.print(") ");							// moramo zatvoriti zagradu oko ispisa koordinata (našao je sigurno jedno slovo
																	// tako da je sigurno otvorio zagradu
					ukSlova++;
				}
			}      
			System.out.println();
			System.out.println();
			System.out.println("Otkriveno je " + ukSlova + " različitih slova.");
	}
}