package banka;

public class Klijent {

	private String ime;
	private String prezime;
	private String jmbg;
	private Racun brojRacuna;

	//public Klijent(String ime, String prezime, String jmbg, Racun brojRacuna) {
	//	super();
	//	this.ime = ime;
	//	this.prezime = prezime;
	// this.jmbg = jmbg;
	// this.brojRacuna = brojRacuna;
		
	public Klijent(String ime, String prezime, String jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brojRacuna = new Racun(1000, true, "RSD");
	}

	public String getIme() {
		return ime;
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

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public Racun getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(Racun brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
}