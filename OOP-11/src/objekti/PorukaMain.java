package objekti;

public class PorukaMain {
	public static void main(String[] args) {

		Poruka prvaPoruka = new Poruka();
		prvaPoruka.tekst = "Zdravo, svete!";
		prvaPoruka.postaviTekst("Zdravo, OOP svete!");
		prvaPoruka.pribaviTekst();

		Poruka p, p1, p2, p3;
		p = new Poruka();
		p1 = new Poruka();
		p2 = new Poruka();
		p3 = new Poruka();
		p.tekst = "Hello, world!";
		p1.tekst = "Marija";
		p2.tekst = "Marija";
		// p3 = null;
		p3.tekst = "uh";

		if (p == p1)
			System.out.println("Isti tekst!");
		else
			System.out.println("Nije isti tekst!");
	}
}