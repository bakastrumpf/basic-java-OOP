package operatori5cas;
/* *********************************************************************
* Program koji koristi enumeraciju za dane u nedelji i mesece u godini. 
* I ispisuje podatke o njima.
***********************************************************************/
	
public class EnumDemo {
	
enum Dan { PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA}
enum Mesec { JANUAR, FEBRUAR, MART, APRIL, MAJ, JUN, JUL, AUGUST, SEPTEMBR, OKTOBR, NOVEMBR, DECEMBR }
	
public static void main(String[] args) {
	Dan danRodjenja;					// promenljiva tipa Dan.
	Mesec mesecRodjenja; 				// promenljiva tipa Mesec.
	danRodjenja = Dan.SUBOTA;			// dodela vrednosti promenljivoj tipa Dan.
	mesecRodjenja = Mesec.OKTOBR;		// dodela vrednosti promenljivoj tipa Mesec.
	System.out.println("Moj horoskopski znak je Škorpija, jer sam rođena u " + mesecRodjenja + "u.");
	System.out.println("To je "+ (mesecRodjenja.ordinal() + 1) + ". mesec u godini."); // zasto +1
	System.out.println("Dan kada sam se rodila je " + danRodjenja + ".");
	System.out.println( danRodjenja + " je " + (danRodjenja.ordinal()+1) + ". dan u nedelji.");
	}
}