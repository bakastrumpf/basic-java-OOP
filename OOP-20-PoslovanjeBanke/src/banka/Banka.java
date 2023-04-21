package banka;

import java.util.ArrayList;

public class Banka implements RadSaTransakcijama {
	private ListaKlijenata klijenti;    // private ListaKlijenata klijenti;
	private ArrayList<Transakcija> transakcije;
	
	public Banka() {
		super();
		this.klijenti = new ListaKlijenata();
		this.transakcije = new ArrayList<Transakcija>();
	}

	public ListaKlijenata getKlijenti() {
		return klijenti;
	}

	public ArrayList<Transakcija> getTransakcije() {
		return transakcije;
	}

	public void setKlijenti(ListaKlijenata klijenti) {
		this.klijenti = klijenti;
	}

	public void setTransakcije(ArrayList<Transakcija> transakcije) {
		this.transakcije = transakcije;
	}
	
	public boolean izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos) {
		
		float stanjePosiljalac = posiljalac.getBrojRacuna().getStanje();
		float stanjePrimalac = primalac.getBrojRacuna().getStanje();
		
		if (stanjePosiljalac >= iznos) {
			posiljalac.getBrojRacuna().setStanje(stanjePosiljalac - iznos);
			primalac.getBrojRacuna().setStanje(stanjePrimalac + iznos);
			return true;
		}
		else {
			System.out.println("Nema dovoljno stanja na racunu za realizaciju transakcije!");
			return false;
		}
	}
}
