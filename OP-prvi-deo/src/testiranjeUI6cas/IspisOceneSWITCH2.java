package testiranjeUI6cas;

/*******************************************************************************************************
* Primer programa za ispis uspeha na osnovu unete ocene (switch verzija u kombinaciji sa break i default).
*********************************************************************************************************/

public class IspisOceneSWITCH2 {
	public static void main(String[] args) {
				
	int ocena;								/* Definicija promenljive */
	
	System.out.println("Program za ispis uspeha na osnovu unete ocene!");
	System.out.print("Unesite ocenu: ");
	ocena = TextIO.getlnInt(); 				/* Unos podatka */
	
	switch (ocena){							/* Odredjivanje uspeha i ispis */
		case 1: System.out.println("Nedovoljan!");
			break;
		case 2: System.out.println("Dovoljan!");
			break;
		case 3: System.out.println("Dobar!");
			break;
		case 4: System.out.println("Vrlo dobar!");
			break;
		case 5: System.out.println("Odlican!");
			break;
		default: System.out.println("Neodgovarajuća vrednost. Ocena mora biti između 1 i 5!");
		}
	}
}