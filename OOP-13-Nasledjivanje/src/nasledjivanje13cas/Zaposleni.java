package nasledjivanje13cas;

	public class Zaposleni extends Osoba {
		private double koefRadnogMesta;
		private double plata;

		Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta) {
			super(ime, prezime, starost);
			this.koefRadnogMesta = koefRadnogMesta;
		}

		public double getKoefRadnogMesta() {
			return koefRadnogMesta;
		}

		public void setKoefRadnogMesta(double koefRadnogMesta) {
			this.koefRadnogMesta = koefRadnogMesta;
		}

		public double getPlata() {
			return plata;
		}

		public void setPlata(double plata) {
			this.plata = plata;
		}

		public void racunajPlatu(int brojDana) {
			plata = koefRadnogMesta * brojDana;
		}

//		public void stampajPlatu() {
//			System.out.println(ime + " " + prezime + ", na radnom mestu sa koeficijentom "	
//		+ koefRadnogMesta +	" ima platu " + plata);
//			}

		public void setPlatu(int brojDana) {
			plata = getKoefRadnogMesta() * brojDana;
		}

		public void stampajPlatu() {
			System.out.println("Zaposleni "+ getIme() + " " + pribaviPrezime() + ", na radnom "
					+ "mestu sa koeficijentom " + getKoefRadnogMesta() + " ima platu " + plata());
				}
}