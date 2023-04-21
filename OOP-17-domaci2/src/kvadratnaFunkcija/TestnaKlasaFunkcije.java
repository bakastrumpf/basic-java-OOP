package kvadratnaFunkcija;

public class TestnaKlasaFunkcije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * U testnoj klasi definišemo dve promenljive tipa interfejsa Funkcija.
		 * Jedna referencira na objekat tipa LinearnaFunkcija, a druga na tip KvadratnaFunkcija. 
		 * Parametre funkcija učitati iz datoteka
		 * funkcijaLinearnaUlaz.txt (u datoteci su zapisani parametri a i b) i
		 * funkcijaKvadratnaUlaz.txt (u datoteci su zapisani parametri a, b i c). 
		 * Potom upisati nule funkcija (ukoliko postoje) u izlazne datoteke finkcijaLinearnaIzlaz.txt i funkcijaKvadratnaIzlaz.txt.
		 * 
		 * @author MarijaSavić
		 * 
		 * @version "Od matematike se beži ali se pobeći ne može".
		 * @OOP | 2. obavezni domaći | kvadratna i linearna funkcija, realne i imaginarne nule.
		 * 
		 * ~~~|ODRICANJE OD ODGOVORNOSTI|~~~
		 * Priznajem da sam se dosta oslonila na rešenja koja smo danas pominjali na dodatnoj/dopunskoj.
		 * Najveći mi je problem što ne znam šta ovaj program treba da izračuna. 
		 * Mislim, "znam", ali treba mi neki matematičar da potvrdi  da je sve to tačno.
		 * Formule sam kopirala s neta, tako da to radi. 
		 * Kad promenim ulazne brojeve, promene se i izlazni.
		 * U obe klase funkcija morala sam importovati nekoliko stavki - u petak na času toga nije bilo,
		 * a kodovi sa slajdova su radili i bez toga.
		 */

		Funkcija LF = new LinearnaFunkcija();
		Funkcija KF = new KvadratnaFunkcija();

		LF.ucitajParametre("funkcijaLinearnaUlaz.txt");
		LF.izracunajNule();
		LF.izracunajVrednost(2);
		LF.upisiVrednost("funkcijaLinearnaIzlaz.txt");

		KF.ucitajParametre("funkcijaKvadratnaUlaz.txt");
		KF.izracunajVrednost(3);
		KF.proveriRealneNule();
		KF.izracunajNule();
		KF.upisiVrednost("funkcijaKvadratnaIzlaz.txt");
	}
}
