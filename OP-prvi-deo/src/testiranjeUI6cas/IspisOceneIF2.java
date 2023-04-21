package testiranjeUI6cas;

/***********************************************************************************************
* Primer programa za ispis uspeha na osnovu unete ocene (verzija sa visestrukom if selekcijom).
*************************************************************************************************/

public class IspisOceneIF2 {
	public static void main(String[] args) {		
	
	int ocena;							/* Definicija promenljive */			
	System.out.println		("Program za ispis uspeha na osnovu unete ocene!");		
	System.out.print		("Unesite ocenu: ");
	ocena = TextIO.getlnInt(); 			/* Unos podatka */
	
	/* Odredjivanje uspeha i ispis */
	if (ocena == 1)
		System.out.println		("Nedovoljan!");
	else if (ocena == 2)
		System.out.println		("Dovoljan!");
	else if (ocena == 3)
		System.out.println		("Dobar!");
	else if (ocena == 4)
		System.out.println		("Vrlo dobar!");
	else if (ocena ==5)
		System.out.println		("Odlican!");
	else
		System.out.println("Ocena izvan opsega 1-5. Molimo, unesite ispravnu vrednost!");
		}
	}
