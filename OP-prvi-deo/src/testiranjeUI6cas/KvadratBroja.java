package testiranjeUI6cas;

/******************************************************************************************************************
* Primer jednostavnog programa u kojem korisnik unosi ceo broj, racuna njegov kvadrat i to se ispisuje korisniku.
******************************************************************************************************************/
	public class KvadratBroja {
	public static void main(String[] args) {
	int broj;		// Broj koji treba da unese korisnik.
	int kvadrat; 	// Uneti broj pomnozen samim sobom - kvadrat broja.
	System.out.print("Unesite neki ceo broj: ");
	broj = TextIO.getlnInt();
	kvadrat = broj * broj;
	System.out.println();
	System.out.println("Broj koji ste uneli je " + broj);
	System.out.println("Kvadrat unetog broja je " + kvadrat);
	System.out.println();
	}
}