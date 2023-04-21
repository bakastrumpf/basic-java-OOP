package statickeStrukture7cas;

public class IspisNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] n = 5;
//		int[] nizBrojeva = [n];
//		int i;
//		
//		for (i = 0; i < br_elem; i++) {
//			nizInt[ i ] = TextIO.getlnInt();
//			System.out.println(nizBrojeva)
//		}
//		for (int broj : nizBrojeva){
//			System.out.print(broj + "");
//		}
		
//		final int MAXELNIZA = 50; // final sluzi da oznaci vrednost koja se vise ne moze menjati
//		int N = 1, i, suma = 0;
//		int nizPrirodnihBrojeva[] = new int[MAXELNIZA];
//			System.out.println("Program za racunanje sume elemenata niza N prirodnih brojeva.");
//			System.out.print("Unesite N:\t"); // prihvati broj elemenata niza
//		N = TextIO.getlnInt();
//		for (i = 0; i < N; i++){ // prihvati elemente niza od korisnika
//			System.out.println("Unesite " + (i+1) + ". element niza:\t");
//			nizPrirodnihBrojeva[ i ] = TextIO.getlnInt();
//		}
//		for (i = 0; i < N; i++) // izracunaj sumu elemenata niza
//		suma += nizPrirodnihBrojeva[ i ];
//			System.out.println("Suma elemenata niza izosi " + suma + ".");
		
//		final int MAXELNIZA = 50; // final sluzi da oznaci vrednost koja se vise ne moze menjati
//		int N = 1, i;
//		int nizCelihBrojeva[] = new int[MAXELNIZA];
//			System.out.println("Program za pronalaženje pozicije maksimalnog elementa niza najviše 50 prirodnih brojeva.");
//		
			
//		final int MAXELNIZA = 50; // final sluzi da oznaci vrednost koja se vise ne moze menjati
//		int N = 1, i;
//		int nizBrojeva[] = new int[MAXELNIZA];
//			System.out.println("Program za ispis pozicije svih maksimuma niza najviše 50 prirodnih brojeva.");
//			max = nizBrojeva[0];
//			
//		for (i = 1; i < N; i++) // izracunaj sumu elemenata niza
//			 if (nizBrojeva[i] > max) {
//				 max = nizBrojeva[i];
//			 }
//		
//		for (i = 0; i < N; i++) {
//			if (nizBrojeva[i] == max)
//				System.out.println("Max elemenata niza je " + max + " i nalazi se na " + (i+1) + ". poziciji.");
//			}
		
//		final int MAXVRSTA = 10;
//		final int MAXKOLONA = 20;
//		int Nvr = 1, Nkol = 1, i, j;
//		float srvr = 0;
//		int[][] matricaPrirodnihBrojeva = new int[MAXVRSTA][MAXKOLONA];
//			System.out.println("Program za računanje srednje vrednosti elemenata matrice prirodnih brojeva.\n\n");
//			System.out.println("Unesite broj vrsta:\t"); // prihvati broj vrsta i kolona
//		Nvr = TextIO.getlnInt();
//			System.out.println("\nUnesite broj kolona:\t");
//		Nkol = TextIO.getlnInt();
//		for (i = 0; i < Nvr; i++) // prihvati elemente matrice od korisnika
//		for (j = 0; j < Nkol; j++){
//			System.out.println("Unesite element matrice na koordinati [" + (i+1) + "][" + (j+1) + "]:\t");
//		matricaPrirodnihBrojeva[i][j] = TextIO.getlnInt();
//		}
//		for (i = 0; i < Nvr; i++) // izracunaj sumu elemenata matrice
//		for (j = 0; j < Nkol; j++)
//		srvr += matricaPrirodnihBrojeva[i][j];
//		srvr /= (Nvr*Nkol); // izracunaj srednju vrednost elemenata matrice
//			System.out.println(" Srednja vrednost elemenata matrice iznosi " + srvr +".");
		
//		int n=5;
//		int nizBrojeva=[n];
//		int i;
//		
//		for (i = 0; i < br_elem; i++) {
//			nizInt[ i ] = TextIO.getlnInt();
//			System.out.println(nizBrojeva);
//		}
//		for (int broj : nizBrojeva){
//			System.out.print(broj + "");
//		}
		
		char[] C = new char[15];
		int n;
		do {
			System.out.println("Unesite broj elemenata u niz (maksimalno 12).");
			n = TextIO.getlnInt();
		} while (n < 0 || n > 15);
		
		int[] A = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element.");
			C[i] = TextIO.getlnChar();
			A[i] = (int)C[i];
		}
		
		System.out.println("Niz C");
		for (char ch : C) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		System.out.println("Niz A");
		for (int i : A) {
			System.out.print(i + " ");	
		
		}
	}
}