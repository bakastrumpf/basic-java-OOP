package nasledjivanje13cas;

	public class Student extends Osoba {
		private int brojIndeksa;
		private double test1, test2; // broj poena na testovima

	Student(String ime, String prezime, int starost, int brojIndeksa, double test1, double test2) {
		super(ime, prezime, starost);
		this.brojIndeksa = brojIndeksa;
		this.test1 = test1;
		this.test2 = test2;
	}
	
	public double racunajPoene() { // metoda za prosek poena
		double prosek = (test1 + test2) / 2;
		return prosek;
		}
	
	public void stampajPoene(){ // metoda za stampu
		System.out.println("Student " + pribaviIme() +	" "+ pribaviPrezime() + " - prosecan broj poena: "	+ racunajPoene());
		}
	}
