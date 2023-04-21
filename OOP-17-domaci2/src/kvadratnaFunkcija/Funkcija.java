package kvadratnaFunkcija;

public interface Funkcija {
	
// 1. Interfejs Funkcija sadrži pet metoda: 
// 1) učitavanje parametara funkcije iz tekstualne datoteke - ucitajParametre, 
// 2) izračunavanje vrednosti funkcije u zadatoj tački - izracunajVrednost, 
// 3) ispitivanje da li funkcija ima realne nule - proveriRealneNule, 
// 4) nalaženje nula funkcije - izracunajNule, i
// 5) upis izračunatih vrednosti u izlaznu datoteku - upisiVrednost.
	
	void ucitajParametre(String nazivDatoteke);
	double izracunajVrednost(double x);
	boolean proveriRealneNule();
	double [] izracunajNule();
	void upisiVrednost(String nazivDatoteke);

}
