package kompleksniZadaci10cas;

public class AgentOsiguranja {
	static final int KATEGORIJE = 5;
	static final int DANI = 30;

	public static void main(String[] args) {

		double[][] EvidencijaOsiguranja = new double[DANI][KATEGORIJE];
		int izbor;
		do {
			prikazMenija();
			izbor = preuzmiIntVrednost("", "Morate odabrati vrednost u opsegu 0-7", 0, 7);
					
			switch(izbor) {
				case 1: unesiPrihod(EvidencijaOsiguranja);
						break;
				case 2: izmeniPrihod(EvidencijaOsiguranja);
						break;
				case 3: prikazKategorijaZaDan(EvidencijaOsiguranja);
						break;
				case 4: prikazDanaZaKategoriju(EvidencijaOsiguranja);
						break;
				case 5: danSaNajmanjimPrihodom(EvidencijaOsiguranja);
						break;
				case 6: prihodiKategorija(EvidencijaOsiguranja);
						break;
				case 7: prosecniMesecniPrihod(EvidencijaOsiguranja);
			}
		}while(izbor != 0);
		}
			
	static void prikazMenija() {
				// obrise output window
		System.out.println("Dobrodošli u program za vođenje evidencije rada agenta osiguranja!");
		System.out.println("Molim Vas izaberite jednu od ponuđenih opcija:");
		System.out.println("\t 1: Unos ostvarenog prihoda za željenu kategoriju i željeni dan.");
		System.out.println("\t 2: Izmena ostvarenog prihoda za željenu kategoriju i željeni dan.");
		System.out.println("\t 3: ...");
		System.out.println("\t ......");	
		System.out.println("\t ......");
		System.out.println("\t 0: Izlazak iz programa.");
			}

	static int preuzmiIntVrednost(String poruka, String greska, int donja, int gornja) {
	int vrednost = 0;
	do {
		System.out.print(poruka);
		vrednost = TextIO.getlnInt();
		if ((vrednost < donja)||(vrednost > gornja))
		System.out.println(greska);
	} while ((vrednost < donja)||(vrednost > gornja));
	return vrednost;
	}
			
	static void unesiPrihod(double[][] eo) {
	int dan, kat;	
	char odg;
	do {
	dan = preuzmiIntVrednost("Unesite dan za koji unosite prihod:\t", 
											 "Dan mora biti u opsegu 1-"+DANI, 
											 1, DANI);
	kat = preuzmiIntVrednost("Unesite kategoriju za koji unosite prihod:\t",
											 "Kategorija mora biti u opsegu 1-"+KATEGORIJE,
											 1, KATEGORIJE);
	eo[dan-1][kat-1] = TextIO.getlnDouble();
	izlistajMatricu(eo);
		System.out.println("Za unos još jednog prihoda pritisnite taster d");
	odg = TextIO.getlnChar();
	}while(odg == 'd');
	}
			
	static void izmeniPrihod(double[][] eo) {
	int dan, kat;		
	char odg;
	do {
		dan = preuzmiIntVrednost("Unesite dan za koji unosite prihod:\t", 
				"Dan mora biti u opsegu 1-"+DANI, 
							 1, DANI);
		kat = preuzmiIntVrednost("Unesite kategoriju za koji unosite prihod:\t",
							 "Kategorija mora biti u opsegu 1-"+KATEGORIJE,
							 1, KATEGORIJE);
		eo[dan-1][kat-1] += TextIO.getlnDouble();
		izlistajMatricu(eo);
			System.out.println("Za unos još jednog prihoda pritisnite taster d");
		odg = TextIO.getlnChar();
	}while(odg == 'd');
	}
	
	static void prikazKategorijaZaDan(double[][] eo) {
			System.out.println("Usao prikazKategorijaZaDan");
		// preuzmi dan od korisnika
		// izlistaj matricu za taj dan (tu vrstu)
			}
	
	static void prikazDanaZaKategoriju(double[][] eo) {
			System.out.println("Usao prikazDanaZaKategoriju");
		// preuzmi kategoriju od korisnika
		// izlistaj matricu za tu kategoriju (tu kolonu)
			}
	
	static void danSaNajmanjimPrihodom(double[][] eo) {
			System.out.println("Usao danSaNajmanjimPrihodom");
		// suma po vrsti
		// zatim pozicija svih minimuma u nizu
	}
	
	static void prihodiKategorija(double[][] eo) {
			System.out.println("Usao prihodiKategorija");
		// suma po koloni
	}
	
	static void prosecniMesecniPrihod(double[][] eo) {
			System.out.println("Usao prosecniMesecniPrihod");
		// suma cele matrice
		// deljenje sa ukupnim brojem dana 
	}
	
	static void izlistajMatricu(double[][] eo) {
			System.out.println("Usao izlistajMatricu");
	}
}