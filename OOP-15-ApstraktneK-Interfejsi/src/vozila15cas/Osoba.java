package vozila15cas;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected int starost;
	
	Osoba() {
		// TODO Auto-generated constructor stub
	}
	Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	public void predstaviSe() {
		System.out.println("Zdravo! Ja sam " + this.ime + " " + this.prezime + ". Imam " + this.starost + " godina.");
	}
}
