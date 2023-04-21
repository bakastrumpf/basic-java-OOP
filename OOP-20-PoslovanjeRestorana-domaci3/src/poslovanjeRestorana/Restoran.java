package poslovanjeRestorana;

import java.util.ArrayList;

//Restorani koji nude isporuku hrane na kućnu adresu
	// u svom poslovanju vode evidenciju o klijentima, jelovniku i narudžbinama.

	/*
	 * Realizovati sledeće funkcionalnosti: 
	 * • Učitavanje podataka o mušterijama i jelovniku iz datoteka (klijenti.txt, jelovnik.txt) ???
	 * • Dodavanje, brisanje i traženje stavki u jelovniku 
	 * • Dodavanje, brisanje i traženje mušterija 
	 * • Dodavanje, brisanje i traženje porudžbine 
	 * • Upis podataka o svim porudžbinama u datoteku
	 */

public class Restoran implements RadSaMusterijama, RadSaPorudzbinama {

	ListaMusterija lista = new ListaMusterija();
	private ArrayList<Porudzbina> porudzbine;
	
	public Restoran () {
		super();
		// this.musterije = new ArrayList<musterije>();
		this.porudzbina = new ArrayList<porudzbine>();
	}

	public ListaMusterija getLista() {
		return lista;
	}
	
	@Override
	public void dodajMusteriju(Musterija m) {
		lista.dodajMusteriju(m);
	}

	@Override
	public void obrisiMusteriju(Musterija m) {

	}
	
	@Override
	public void traziMusteriju(String brojMobTel) {
		return lista.traziMusteriju(brojMobTel);
	}

	@Override
	public void dodajJelo(Jelovnik j) {
		// if (pronadjiMusteriju(Musterija.brojMobTel));
		return lista.dodajJelo(String);
	}

	@Override
	public void obrisiJelo(Jelovnik j) {}

	@Override
	public void traziJelo(jelo j) {}
	
	@Override
	public void dodajPorudzbinu(Porudzbina p) {
		// if (pronadjiMusteriju(Musterija.brojMobTel));
	}

	@Override
	public void obrisiPorudzbinu(Porudzbina p) {}
	
	@Override
	public void traziPorudzbinu(Porudzbina p) {	}
	
	@Override
	public void izdajRacun()
	
	@Override
	public void upisiPodatke(nazivDatoteke) {}
}
