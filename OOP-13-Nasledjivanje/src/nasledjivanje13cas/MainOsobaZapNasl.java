package nasledjivanje13cas;

public class MainOsobaZapNasl {
	public static void main(String[] args) {
	
		Zaposleni z1 = new Zaposleni("Petar","Petrović", 35, 3800);
		Zaposleni z2 = new Zaposleni("Ivana","Ivanović", 32, 3900);
		Student s1 = new Student("Marko", "Marković", 21, 10482, 25.5, 28.7);
		Student s2 = new Student("Marina", "Marinković", 20, 10505, 28.8, 30.5);
		
		z1.predstaviSe();
		z2.predstaviSe();
		s1.predstaviSe();
		s2.predstaviSe();
		z1.getPlata();
		z2.getPlata();
		s1.racunajPoene();
		s2.racunajPoene();
		z1.stampajPlatu();
		z2.stampajPlatu();
		s1.stampajPoene();
		s2.stampajPoene();
}
}