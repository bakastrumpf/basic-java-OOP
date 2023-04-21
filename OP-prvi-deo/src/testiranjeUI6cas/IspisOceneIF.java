package testiranjeUI6cas;

/***********************************************************************************************
* Primer programa za ispis uspeha na osnovu unete ocene (verzija sa visestrukom if selekcijom).
*************************************************************************************************/

public class IspisOceneIF {
		
	public static void main(String[] args) {		
	
	/* Definicija promenljive */
	int ocena;										
	/* Unos podatka */
	System.out.println		("Program za ispis uspeha na osnovu unete ocene!");		
	System.out.print		("Unesite ocenu: ");
	ocena = TextIO.getlnInt();
	if (ocena >0) {
		if (ocena <=5)
	/* Odredjivanje uspeha i ispis */
	if (ocena == 1)
		System.out.println		("Nedovoljan!");
	else if (ocena == 2)
		System.out.println		("Dovoljan!");
	else if (ocena == 3)
		System.out.println		("Dobar!");
	else if (ocena == 4)
		System.out.println		("Vrlo dobar!");
		System.out.println		("Odlican!");
		}
	}
}