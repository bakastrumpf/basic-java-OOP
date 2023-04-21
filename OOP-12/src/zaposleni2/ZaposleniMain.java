package zaposleni2;

public class ZaposleniMain {
	static final int BRZAPOSLENIH = 3;
	public static void main(String[] args) {
//		Zaposleni z1 = new Zaposleni();
//		z1.postaviIme("Marko");
//		z1.postaviPrezime("Markovic");
//		z1.postaviKoefRM(10.5);
//		z1.stampanjePodataka();
//		double p;
//		p = z1.izracunajPlatu();
//		System.out.println(p);
		
		Zaposleni[] z = new Zaposleni[BRZAPOSLENIH];
		
		Zaposleni z1 = new Zaposleni("Jovan", "Jovanic", 10);
		z[1] = new Zaposleni("Marko", "Markovic", 20);
		z[2] = new Zaposleni("Sara", "Saric", 15);
		
		for (int i = 0; i < BRZAPOSLENIH - 1; i++) {
			for (int j = i + 1; j < BRZAPOSLENIH; j++) {
				if (z[i].izracunajPlatu() > z[j].izracunajPlatu()) {
					Zaposleni p = z[i];
					z[i] = z[j];
					z[j] = p;
				}				
			}
		}
		
		for (int i = 0; i < BRZAPOSLENIH; i++) {
			z[i].stampanjePodataka();
		}
	}
}