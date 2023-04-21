package vozila15cas;

abstract public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba o1 = new Osoba("Petar", "Petrovic", 35);
		Osoba o2 = new Osoba("Ivana", "Ivanovic", 32);
		
		// Vozilo v = new Vozilo("Opel", "Corsa", "NS021IT", 2004, o1);
		Automobil a = new Automobil("Opel", "Corsa", "NS021IT", 2004, o1, 5, false, "Tip Motora 1", 1333, 125);
		Kamion k = new Kamion("Volvo", "FH", "NS021RS", 2016, o1, 3, false, "Tip Motora 2", 1999, 185);
		Motocikl m = new Motocikl("Honda", "Rebel", "ZA018RS", 1998, o1, false, false, "Tip Motora 3", 750, 55);
		a.stampajPodatke();
		System.out.println();
		k.stampajPodatke();
		System.out.println();
		m.stampajPodatke();
		System.out.println();
		
		o1.setIme("Visnja");
		
		//Osoba o3 = m.getVlasnik();

		a.prenosVlasnistva(o2);
		k.prenosVlasnistva(o2);
		m.prenosVlasnistva(o2);
		
		a.pokreniVozilo();

		a.stampajPodatke();
		System.out.println();
		k.stampajPodatke();
		System.out.println();
		m.stampajPodatke();
		System.out.println();
		
		a.zaustaviVozilo();
		a.stampajPodatke();
	}

}
