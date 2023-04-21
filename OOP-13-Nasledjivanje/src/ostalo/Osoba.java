package ostalo;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected int starost;

	Osoba() {}

	Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}

//	public void predstaviSe() {
//		System.out.println("Ime: " + this.ime
//		+ " Prezime: " + this.prezime
//		+ " Starost: " + this.starost
//		+ " godina");
//	}

	public String pribaviIme() {
		return ime;
	}

	public void postaviIme(String ime) {
		this.ime = ime;
	}

	public String pribaviPrezime() {
		return prezime;
	}

	public void postaviPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int pribaviStarost() {
		return starost;
	}

//	public void postaviStarost() {
//		this.starost = starost;
//	}
	
	public void predstaviSe() {
		System.out.println(
				"Ime: " + pribaviIme() 
				+ " Prezime: " + pribaviPrezime() 
				+ " Starost: " + pribaviStarost() + " godina");
	}
}
