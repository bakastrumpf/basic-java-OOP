package polaznici18cas;

public class Osoba {

	private String ime;
	private String prezime;
	private String jmbg;

	Osoba() {
	}

	Osoba(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String pribaviIme() {
		return this.ime;
	}

	public String pribaviPrezime() {
		return this.prezime;
	}

	public String pribaviJmbg() {
		return jmbg;
	}

	public void postaviIme(String ime) {
		this.ime = ime;
	}

	public void postaviPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void postaviJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	void predstaviSe() {
		System.out.println("Ime: " + pribaviIme() + " Prezime: " + pribaviPrezime() + " jmbg: " + pribaviJmbg());
	}

	@Override
	public String toString() {
		return ("Ime:" + this.pribaviIme() + " Prezime: " + this.pribaviPrezime() + " JMBG: " + this.pribaviJmbg());
	}

}
