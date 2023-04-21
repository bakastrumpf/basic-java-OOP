package testiranjeUI6cas;
/****************************************************************
* Primer programa koji preuzima jednu liniju teksta od korisnika 
* i ispisuje koja se sve slova nalaze u tom tekstu,
* i koliko ima ukupno različitih slova.
* ***************************************************************/

public class IzlistavanjeSlovaFOR {
	public static void main(String[] args) {
		
	String str;						//linija teksta koju unosi korisnik.
	int ukSlova;					//ukupan broj razlicitih slova u str tekstu.
	char slovo;						//Slovo iz alfabeta.
	int i;							//indeks slova u nizu karaktera string str.
		
			System.out.println("Unesite jedan red teksta:");
	str = TextIO.getln();
	str = str.toUpperCase();
	ukSlova = 0;
			System.out.println("Vaš red teksta sadrži sledeća slova:");
			System.out.println();
			System.out.print("");
	for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) {
		for ( i = 0; i < str.length(); i++ ) {
			if ( slovo == str.charAt(i) ) {
			System.out.print(slovo);
			System.out.print(' ');
				ukSlova++;
			break;
			}
		}
	}
			System.out.println();
			System.out.println();
			System.out.println("Otkriveno je " + ukSlova + " različitih slova.");
		}
	}