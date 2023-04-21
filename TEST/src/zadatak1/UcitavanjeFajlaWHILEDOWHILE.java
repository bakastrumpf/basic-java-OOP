package zadatak1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*Tekstualna datoteka sadrži podatke o programerima u sledećem obliku: 
 * Imenko Prezimenić 38 junior 820.00. 
 * Napisati funkciju kojom se iz ove datoteke mogu 
 * učitati podaci o proizvoljnom broju programera iz prethodnog zadatka. 
 * Podaci se u programu pamte u dinamičkom nizu čiji su elementi tipa Programer.
 */

public class UcitavanjeFajlaWHILEDOWHILE {

	public void ucitajFajl (String nazivDatoteke) {	
	Scanner scan = null;
	ArrayList<Programer> spisakProgramera = new ArrayList<Programer>();
	try {
		scan = new Scanner(new File(nazivDatoteke));
		String ime = scan.next();
		String prezime = scan.next();
		int starost = scan.nextInt();
		String iskustvo = scan.next();
		double plata = scan.nextDouble();
		Programer noviProgramer = new Programer(ime, prezime, starost, iskustvo, plata);
		spisakProgramera.add(noviProgramer);
	}while (s.hasNext());
}catch(IOException e) {
	System.out.println(e.getMessage());
}finally {
	if (s != null) {
		s.close();
	}
	
	/*Scanner scan = null;
	*ArrayList<Programer> spisak = new ArrayList<Programer>();
	*try {
		scan = new Scanner(new File(nazivDatoteke));
		while (s.hasNext());
			String ime = scan.next();
			String prezime = scan.next();
			int starost = scan.nextInt();
			String iskustvo = scan.next();
			double plata = scan.nextDouble();
			Programer noviProgramer = new Programer(ime, prezime, starost, iskustvo, plata);
		spisak.add(noviProgramer);
	}
	 */
}
