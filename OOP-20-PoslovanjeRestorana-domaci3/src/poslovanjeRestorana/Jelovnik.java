package poslovanjeRestorana;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

//Za svaku od stavki u jelovniku pamti se 
	//1. naziv stavke, 
	//2. tip (predjelo, glavno jelo, salata, dezert, piće) i 
	//3. cena.

public class Jelovnik implements RadSaFajlovima, RadSaJelovnikom{ 
	
	private ArrayList<Jelovnik> spisakJela;

	Jelovnik(){
		this.spisakJela = new ArrayList<Jelovnik> spisakJela;
	}
	
	private String naziv;
	private String tip;
	private float cena;
	
	public Jelovnik(String naziv, String tip, float cena) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.cena = cena;
	}

	public void ucitajJelovnik() throws FileNotFoundException{
	
	}
	
	@Override
	public void stampajJelovnik() {
		System.out.println();
		
	}
	
	@Override
	public void dodajJelo(Jelovnik jelo) {
		// TODO Auto-generated method stub
		jelo.add(jelo);
	}
	
	@Override
	public void obrisiJelo(String imeJela) {
		// TODO Auto-generated method stub
		boolean i = false;
		Jelo l = null;
		for (jelo j:spisakJela) {
			if(j.getNaziv().equalsIgnoreCase(naziv)) {
				System.out.println(j.toString() + "je успешно обрисано из јеловника.");
			l = j;
			i = true;
			}
		}
	if (i == false)
		System.out.println("Јело" + naziv + "не постоји у јеловнику.");
	}

	@Override
	public void pronadjiJelo(String nazivJela) {
		// TODO Auto-generated method stub
		Jelovnik pronadjiJelo(String naziv) {
			if(Jelovnik.contains(nazivJela)) {
				System.out.println(nazivJela.toString()+ "већ постоји у Јеловнику.");
			}
			System.out.println("Јело " + nazivJela + "није у Јеловнику.");
		}
	}

	@Override
	public void ucitajIzDatoteke(String nazivDatoteke)throws IOException { //FileReader... ("jelovnik.txt");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upisiUDatoteku(String nazivDatoteke) { //FileWriter... ();
		// TODO Auto-generated method stub
		
	}
}
