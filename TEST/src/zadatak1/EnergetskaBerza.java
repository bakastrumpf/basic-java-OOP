package zadatak1;

import java.util.ArrayList;

/*
 * Napisati klasu EnergetskaBerza koja 
 * nasleđuje apstraktnu klasu Berza i 
 * implementira interfejs RadSaTransakacijama. 
 * Klasa ima atribute listaTrgovaca (tipa ArrayList<Trgovac>), 
 * listaEnergenata(tipa ArrayList<Kompanija>) i 
 * listaTransakcija (tipa ArrayList<Transakcija>), 
 * 
 * konstruktor (napomena: roditeljska klasa ima atribute: naziv, tipa String; 
 * grad, tipa String; nazivIndeksa tipa String; vrednostIndeksa, tipa double) 
 * i metode za pribavljanje i postavljanje atributa (getere i setere). 
 * 
 * Interfejs RadSaTransakcijama ima samo metodu izvrsiTransakciju 
 * koja vlasnistvo nad energentom iz niza listaEnergenata 
 * prenosi sa jednog na drugog trgovca iz niza listaTrgovaca. 
 * 
 * Prepostaviti da je svaki element niza listaEnergenata 
 * energent koji kao svoje atribute sadrži vlasnika, količinu 
 * i tip (iz obnovljivih izvora ili ne). 
 * Kod svih atributa i metoda navesti i odgovarajuće pristupne atribute.
 */

public class EnergetskaBerza extends Berza implements RadSaTransakcijama {

	protected ArrayList<Trgovac> listaTrgovaca;
	protected ArrayList<Energent> listaEnergenata;
	protected ArrayList<Transakcija> listaTransakcija;
	public EnergetskaBerza(ArrayList<Trgovac> listaTrgovaca, ArrayList<Energent> listaEnergenata,
			ArrayList<Transakcija> listaTransakcija) {
		super(String naziv, String grad, String nazivIndeksa, double vrednostIndeksa);
		this.listaTrgovaca = listaTrgovaca;
		this.listaEnergenata = listaEnergenata;
		this.listaTransakcija = listaTransakcija;
	}
	public ArrayList<Trgovac> getListaTrgovaca() {
		return listaTrgovaca;
	}
	public void setListaTrgovaca(ArrayList<Trgovac> listaTrgovaca) {
		this.listaTrgovaca = listaTrgovaca;
	}
	public ArrayList<Energent> getListaEnergenata() {
		return listaEnergenata;
	}
	public void setListaEnergenata(ArrayList<Energent> listaEnergenata) {
		this.listaEnergenata = listaEnergenata;
	}
	public ArrayList<Transakcija> getListaTransakcija() {
		return listaTransakcija;
	}
	public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) {
		this.listaTransakcija = listaTransakcija;
	}
	
	
}
