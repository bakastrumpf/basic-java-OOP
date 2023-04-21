package nizoviMatrice8cas;

import testiranjeUI6cas.TextIO;

public class ViseMinMatriceV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int brVrsta, brKolona;
		// minVrsta = 0, minKolona = 0;
		int i = 0, j = 0;
		int[][] matricaPrirodnihBrojeva = new int[MAXVRSTA][MAXKOLONA];

		System.out.println("Програм за проналажење ЛОКАЦИЈА ВИШЕ НАЈМАЊИХ ВРЕДНОСТИ МАТРИЦЕ природних бројева.\n");
		System.out.println("Унесите број врста (до 10):"); // prihvati broj vrsta
		brVrsta = TextIO.getlnInt();
		System.out.println("\nУнесите број колона (до 20):"); // prihvati broj kolona
		brKolona = TextIO.getlnInt();

		for (i = 0; i < brVrsta; i++) // prihvati elemente matrice od korisnika
			for (j = 0; j < brKolona; j++) {
				System.out.println("\nУнесите елемент матрице на координати [" + (i + 1) + "][" + (j + 1) + "]:\t");
				matricaPrirodnihBrojeva[i][j] = TextIO.getlnInt();
			}
		int min = matricaPrirodnihBrojeva[0][0];
		
		for (i = 0; i < matricaPrirodnihBrojeva.length; i++) {
			for (j = 0; j < matricaPrirodnihBrojeva.length; j++) {
				if (matricaPrirodnihBrojeva[i][j] < min) {
					min = matricaPrirodnihBrojeva[i][j];
					//minVrsta = i;
					//minKolona = j;
					System.out.println("\nНАЈМАЊИ ЕЛЕМЕНТ МАТРИЦЕ је " + min +".");
				}
			}
		}
		

		for (i = 0; i < brVrsta; i++)
			for (j = 0; j < brKolona; j++)
				if (matricaPrirodnihBrojeva[i][j] == min)
					System.out.println("Налази у " + (i + 1) + ". врсти у " + (j + 1) + ". колони");
	}

}
