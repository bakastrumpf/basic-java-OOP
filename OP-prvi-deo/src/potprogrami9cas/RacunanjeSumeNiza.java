package potprogrami9cas;

public class RacunanjeSumeNiza {
	static final int MAXELNIZA = 50;
	public static void main(String[] args) {

	int N = 1;
	int[] nizPrirodnihBrojeva = new int[MAXELNIZA];
			System.out.println("Program za računanje sume elemenata niza N prirodnih brojeva.");
	N = unosBrojaElemNiza();
	unosElemNiza(N, nizPrirodnihBrojeva);
			System.out.println("Suma elemenata niza iznosi " + sumaVrednostNiza(N, nizPrirodnihBrojeva));
	}

	static int unosBrojaElemNiza() {
		int brojEl = 0;
			System.out.println("Unesite N:");
	brojEl = TextIO.getlnInt();
	return brojEl;
	}

	static void unosElemNiza(int n, int[] nizElem) {
		int i = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Unesite " + (i + 1) + ". element niza: ");
	nizElem[i] = TextIO.getlnInt();
		}
			System.out.println();
	}

	static int sumaVrednostNiza(int n, int[] nizElem) {
		int suma = 0;
		int i = 0;
		for (i = 0; i < n; i++)
	suma += nizElem[i];
	return suma;
	}
}