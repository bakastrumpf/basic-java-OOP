package testiranjeUI6cas;

/***********************************************************************
* Primer programa za ispis uspeha na osnovu unete ocene (switch verzija).
************************************************************************/

public class IspisOceneSWITCH {
	public static void main(String[] args) {
	
	/* Definicija promenljive */
	int ocena;
	/* Unos podatka */
	System.out.println("Program za ispis uspeha na osnovu unete ocene!");
	System.out.print("Unesite ocenu: ");
	ocena = TextIO.getlnInt();
	/* Odredjivanje uspeha i ispis */
	switch (ocena){
		case 1: System.out.println("Sedi, JEDAN!");
			break;
		case 2: System.out.println("Žalosno!");
			break;
		case 3: System.out.println("Tuga!");
			break;
		case 4: System.out.println("Solidno!");
			break;
		case 5: System.out.println("Jedva 5!");
			break;
		}
	}
}