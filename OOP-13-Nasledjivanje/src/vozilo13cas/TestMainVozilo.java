package vozilo13cas;

public class TestMainVozilo {
	public static void main(String[] args) {

		Osoba o1 = new Osoba("Petar", "Petrović", 35);
		Osoba o2 = new Osoba("Ivana", "Ivanović", 32);
		// Vozilo v = new Vozilo("Opel", "Corsa", "NS021IT", 2004, o1);
		Automobil a = new Automobil("Opel", "Corsa", "NS021IT", 2004, o1, 5);
		Kamion k = new Kamion("Volvo", "FH", "NS021RS", 2016, o1, 3);
		Motocikl m = new Motocikl("Honda", "Rebel", "ZA018RS", 1998, o1, false);

		// v.stampajPodatke();
		a.stampajPodatke();
		k.stampajPodatke();
		m.stampajPodatke();
		a.prenosVlasnistva(o2);
		k.prenosVlasnistva(o2);
		m.prenosVlasnistva(o2);
		a.stampajPodatke();
		k.stampajPodatke();
		m.stampajPodatke();
	}
}