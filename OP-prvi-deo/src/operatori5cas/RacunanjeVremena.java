package operatori5cas;

public class RacunanjeVremena {
/**************************************************************************************************
* Program koji obavlja određene matematicke proracune pomocu Math klase i ispisuje rezultat. 
* U primeru se koristi i konstanta PI. 
* Takođe koristi se ugrađena i metoda System.currentTimeMillis kako bi se preuzelo trenutno vreme.
***************************************************************************************************
*/
	public static void main(String[] args) {

	long vremePocetka; 				// Vreme početka rada programa u milisekundama.
	long vremeKraja;				// Vreme kraja rada programa u milisekundama.
	double vreme;					// Ukupno vreme trajanja programa.
	double sirina = 42.0, visina = 17.0, hipotenuza; // strane trougla
	vremePocetka = System.currentTimeMillis();
	hipotenuza = Math.sqrt( sirina*sirina + visina*visina );
	System.out.print		("Pravougli trougao čije su stranice a=42cm i b=17cm ima hipotenuzu c=");
	System.out.print		(hipotenuza);
	System.out.println		("cm.");
	System.out.print		("sin(1)*sin(1) + cos(1)*cos(1) - 1 je ");
	System.out.println		(Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1 );
	System.out.print		("Slučajno generisana vrednost: ");
	System.out.println		(Math.random());
	System.out.print		("Broj PI ima vrednost: ");
	System.out.println		( Math.PI );
	vremeKraja = System.currentTimeMillis();
	vreme = (vremeKraja - vremePocetka) / 1000.0;
	System.out.print		("Ukupno trajanje programa u sekundama je: ");
	System.out.println		(vreme);
	}
}