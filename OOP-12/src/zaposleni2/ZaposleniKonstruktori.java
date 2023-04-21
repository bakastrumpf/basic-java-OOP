package zaposleni2;

public class ZaposleniKonstruktori {

	public class Zaposleni {
		private String ime;
		private String prezime;
		private double koefRM;
		private double plata;
		
		Zaposleni() {}
		
		Zaposleni(String ime, String prezime,double koefRM){
			this.ime = ime;
			this.prezime = prezime;
			this.koefRM = koefRM;
		}

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

		public double pribaviKoefRM() {
			return koefRM;
		}

		public void postaviKoefRM(double koefRM) {
			this.koefRM = koefRM;
			izracunajPlatu();
		}
		
		double izracunajPlatu() {
			plata = koefRM * 100;
			return plata;
		} 
		
		void stampanjePodataka() {
			System.out.println(ime + " " + prezime + " ima platu " + izracunajPlatu());
		}
		
//		int uporediSa(Zaposleni z) {
//			if (this.izracunajPlatu() > z.izracunajPlatu()) {
//				return 1;
//			} else {
//				return -1;
//			}
//		}
		
	}
}