package nizoviMatrice8cas;

import testiranjeUI6cas.TextIO;

public class MinMatriceV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int i, j, brVrsta, brKolona;
		int[][] matricaPrirodnihBrojeva = new int[MAXVRSTA][MAXKOLONA];
		int min = 0;

		System.out.println("Програм за рачунање НАЈМАЊЕ ВРЕДНОСТИ МАТРИЦЕ природних бројева.\n");
		System.out.println("Унесите број врста (до 10):\t"); // prihvati broj vrsta
		brVrsta = TextIO.getlnInt();
		System.out.println("\nУнесите број колона (до 20):\t"); // prihvati broj kolona
		brKolona = TextIO.getlnInt();

		for (i = 0; i < brVrsta; i++) // prihvati elemente matrice od korisnika
			for (j = 0; j < brKolona; j++) {
				System.out.println("Унесите елемент матрице на координати [" + (i + 1) + "][" + (j + 1) + "]:\t");
				matricaPrirodnihBrojeva[i][j] = TextIO.getlnInt();
				if (i == 0 && j == 0) {
					min = matricaPrirodnihBrojeva[0][0];
					// minVrsta=i;
					// minKolona=j;
				}
				if (matricaPrirodnihBrojeva[i][j] < min) {
					min = matricaPrirodnihBrojeva[i][j];
					// minVrsta = i;
					// minKolona = j;
				}
			}
		System.out.println("НАЈМАЊИ ЕЛЕМЕНТ МАТРИЦЕ ЈЕ " + min + ".");
		
	}

}
