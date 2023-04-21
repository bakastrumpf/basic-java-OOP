package poslovanjeRestorana;

public interface RadSaJelovnikom {

	//• Dodavanje, brisanje i traženje stavki u jelovniku
	
	public void dodajJelo(Jelovnik jelo);
	public void obrisiJelo(String nazivJela);
	public void pronadjiJelo(String nazivJela);
	void ucitajIzDatoteke(String nazivDatoteke);
	
}
