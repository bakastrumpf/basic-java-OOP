package nizoviMatrice8cas;

import testiranjeUI6cas.TextIO;

public class MaxMatrice {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int i, j, brVrsta, brKolona;
		int[][] matricaPrirodnihBrojeva = new int[MAXVRSTA][MAXKOLONA];
		int max = 0;

		System.out.println("Програм за рачунање НАЈВЕЋЕ ВРЕДНОСТИ МАТРИЦЕ природних бројева.\n");
		System.out.println("Унесите број врста (до 10):\t"); // prihvati broj vrsta
		brVrsta = TextIO.getlnInt();
		System.out.println("\nУнесите број колона (до 20):\t"); // prihvati broj kolona
		brKolona = TextIO.getlnInt();
		
		for (i = 0; i < brVrsta; i++) // prihvati elemente matrice od korisnika
			for (j = 0; j < brKolona; j++) {
				System.out.println("\nУнесите елемент матрице на координати [" + (i + 1) + "][" + (j + 1) + "]:\t");
				matricaPrirodnihBrojeva[i][j] = TextIO.getlnInt();
				if (i == 0 && j == 0) {
					max = matricaPrirodnihBrojeva[0][0];
					// maxVrsta=i;
					// maxKolona=j;
				}
				if (matricaPrirodnihBrojeva[i][j] > max) {
					max = matricaPrirodnihBrojeva[i][j];
					// maxVrsta = i;
					// maxKolona = j;
				}
			}
		System.out.println("\nНАЈВЕЋИ ЕЛЕМЕНТ МАТРИЦЕ је " + max + ".");
}
}
	
