package poslovanjeRestorana;

public class Musterija {
	
	//Za klijente beleže ime, prezime, adresu i broj mobilnog telefona. 

	private String ime;
	private String prezime;
	private String adresa;
	private String brojMobTel;
	
	public Musterija(String ime, String prezime, String adresa, String brojMobTel) {
		// super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.brojMobTel = brojMobTel;
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojMobTel() {
		return brojMobTel;
	}

	public void setBrojMobTel(String brojMobTel) {
		this.brojMobTel = brojMobTel;
	}
	
	
}
