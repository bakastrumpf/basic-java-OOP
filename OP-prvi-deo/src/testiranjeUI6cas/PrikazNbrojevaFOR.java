package testiranjeUI6cas;

public class PrikazNbrojevaFOR {
	public static void main(String[] args) {
		
	int i;
	int N;
		
	System.out.println("Program za prikaz prvih N prirodnih brojeva.");
	System.out.println("Unesite N: ");
	do {
		N = TextIO.getlnInt();
			if (N < 1)
				System.out.println("N mora biti veći od 0. Unesite ponovo N: ");
				System.out.println("Ovo je prvih " + N + " prirodnih brojeva: ");
			for (i = 1; i <= N; i++){
				System.out.printf("\n%d\n", i);
				}
	}while (N < 1);
		{
			for (i = 1; i <= N ; i++);
		}
	}
}