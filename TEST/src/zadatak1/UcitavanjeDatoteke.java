package zadatak1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Tekstualna datoteka sadrži podatke o energentima 
 * kojima se trguje na energetskoj berzi u sledećem obliku: 
 * 
 * EnergyWorld 67.66 false. 
 * 
 * Prvi parametar je naziv kompanije vlasnika energenta, 
 * drugi je količina energenta u megavatima, 
 * a treći inormacija o tome da li je energent iz obnovljivih izvora ili ne. 
 * Napisati funkciju kojom se iz ove datoteke mogu učitati 
 * podaci o proizvoljnom broju energenata u dinamički niz listaEnergenata.
 */

public class UcitavanjeDatoteke {

	public void ucitajFajl (String nazivDatoteke) {	
		Scanner scan = null;
		ArrayList<ListaEnergenata> energent = new ArrayList<ListaEnergenata>();
		try {
			scan = new Scanner(new File(nazivDatoteke));
			String nazivKompanije = scan.next();
			String kolicinaUmW = scan.next();
			boolean obnovljivIzvor = scan.nextInt();
			energent noviEnergent = new energent(nazivKompanije, kolicinaUmW, obnovljivIzvor);
			ListaEnergenata.add(energent);
		}while (s.hasNext());
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}finally {
		if (s != null) {
			s.close();
		}
	
}
