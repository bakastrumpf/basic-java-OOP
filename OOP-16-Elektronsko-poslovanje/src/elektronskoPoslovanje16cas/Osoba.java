package elektronskoPoslovanje16cas;

public class Osoba {

	private String ime;
	private String prezime;
	private int starost;

	Osoba() {
	}

	Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}

	public String pribaviIme() {
		return this.ime;
	}

	public String pribaviPrezime() {
		return this.prezime;
	}

	public int pribaviStarost() {
		return this.starost;
	}

	public void postaviIme(String ime) {
		this.ime = ime;
	}

	public void postaviPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void postaviStarost(int starost) {
		this.starost = starost;
	}

	void predstaviSe() {
		System.out.println("Ime: " + pribaviIme() + " Prezime: " + pribaviPrezime() + " Starost: " + pribaviStarost());
	}
}
