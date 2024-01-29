package poslovanjeRestorana;

public class PodrskaPoslovanjuRestoranaMain {

	public static void main(String[] args) {
		// Program za podršku poslovanju restorana sa isporukom
		
		//--> nemojte se šlogirati kad vidite ovu papazjaniju.
		
		// @author MarijaSavić
		// v210322
		
		// DISCLAIMER | NE RADI jer: 
		//1. kasno sam počela da radim te nisam imala vremena da završim,
		//2. pišući testnu klasu shvatih šta mi sve nedostaje u ostalim klasama, 
		// počeh menjati i njih,
		// 3. pa sam se dodatno zbunila razmišljajući da li da unos podataka bude iz .txt 
		// ili da korisnik sam unosi sve, 
		// i tako zadatak ostade nezavršen.
		// Ovim tempom, za koji dan bih se uspela izboriti s greškama.
		
		/* Restorani koji nude isporuku hrane na kućnu adresu 
		u svom poslovanju vode evidenciju o klijentima, jelovniku i narudžbinama. 
		Za klijente beleže ime, prezime, adresu i broj mobilnog telefona. 
		Za svaku od stavki u jelovniku pamti se 
		naziv stavke, tip (predjelo, glavno jelo, salata, dezert, piće) i cena. 
		Narudžbina se sastoji od jedne ili više stavki iz jelovnika 
		koje je naručio određeni klijent, 
		kao i informacije o tome da li je narudžbina uspešno realizovana ili ne.

		Realizovati sledeće funkcionalnosti:
		• Učitavanje podataka o klijentima i jelovniku iz datoteka (klijenti.txt, jelovnik.txt)
		• Dodavanje, brisanje i traženje stavki u jelovniku
		• Dodavanje, brisanje i traženje klijenta
		• Dodavanje, brisanje i traženje narudžbine
		• Upis podataka o svim narudžbinama u datoteku

		Dodati i klase za podršku za listama odgovarajućih objekata 
		(ListaKlijenata, ListaNarudžbina - Jelovnik je sam po sebi već lista Stavki). 
		U test klasi kreirati restoran, 
		učitati podatke o jelovniku 
		i klijentima i 
		kreirati nekoliko narudžbina. 
		
		Podatke o realizovanim narudžbinama upisati u izlaznu datoteku.
		 */
		
		Restoran restoran = new Restoran();
		restoran.ucitajJelovnik("jelovnik.txt");
		restoran.stampajJelovnik();
		restoran.pronadjiJelo("supa");
		restoran.obrisiJelo("supa");
		restoran.stampajJelovnik();
		
		Jelo jelo = new Jelo ("špagete", glavnoJelo, 350.0);
		restoran.dodajJelo(špagete);
		restoran.stampajJelovnik();
		restoran.obrisiJelo(grašak);
		restoran.stampajJelovnik();
		restoran.noviJelovnik("noviJelovnik.txt");
		
		restoran.ucitajListuMusterija("musterije.txt");
		restoran.pronadjiMusteriju("062852225");
		Musterija m1 = new Musterija();
		restoran.dodajMusteriju("Dušanka", "Simić", "Kosovska8", "062852225");
		restoran.ucitajListuMusterija("musterije.txt");
		restoran.dodajMusteriju(m1);
		restoran.stampajSpisakMusterija();
		restoran.upisiPodatke("noviSpisakMusterija.txt");
		
		Porudzbina p1 = new Porudzbina(1, ruskaSalata, m1, true);
		restoran.racun(p1);  //racun = porcija * jelo (+ porcija * jelo...)
		restoran.stampajRacun();
		System.out.println(); //toString: Porudžbina X košta Y
		
		restoran.dodajPorudžbinu();
		Porudzbina p2 = new Porudzbina(2,supa, m1, false);
		restoran.stampajPorudzbinu(p2); //toString: Porudžbina Z nije uspela.
		restoran.upisiPorudzbinu("realizovanePorudzbine.txt");

	}

}
