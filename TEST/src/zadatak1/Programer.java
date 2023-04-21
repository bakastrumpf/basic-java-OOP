package zadatak1;
/*
 * Programer koja nasleđuje klasu Osoba i implementira interfejs Iterator. 
 * Klasa ima atribute iskustvo (tipa String) i plata (tipa double), 
 * konstruktor (napomena: roditeljska klasa ima atribute ime, tipa String, prezime, tipa String i starost, tipa int) 
 * i metode za pribavljanje i postavljanje atributa (getere i setere). 
 * Kod svih atributa i metoda navesti i odgovarajuće pristupne atribute.
 */

public class Programer extends Osoba implements Iterator {
	private String iskustvo; 
	private double plata;
	
	public Programer(String iskustvo, double plata) {
		super(String ime, String prezime, int starost);
		this.iskustvo = iskustvo;
		this.plata = plata;
	}

	public String getIskustvo() {
		return iskustvo;
	}

	public void setIskustvo(String iskustvo) {
		this.iskustvo = iskustvo;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
	
}
