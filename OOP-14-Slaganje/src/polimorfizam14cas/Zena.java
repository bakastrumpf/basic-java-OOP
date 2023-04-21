package polimorfizam14cas;

public class Zena extends Osoba {

	String devojackoPrezime;

	Zena(String ime, String prezime, String devojackoPrezime, int starost) {
		super(ime, prezime, starost);
		this.devojackoPrezime = devojackoPrezime;
	}

	public String pribaviDevojackoPrezime() {
		return this.devojackoPrezime;
	}

	public void postaviDevojackoPrezime(String devojackoPrezime) {
		this.devojackoPrezime = devojackoPrezime;
	}

	void predstaviSe() {
		System.out.println("Ime: " + pribaviIme() + " Prezime: " + pribaviPrezime() + " Devojacko prezime: "
				+ pribaviDevojackoPrezime());
	}
}
