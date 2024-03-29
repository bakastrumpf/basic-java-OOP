package statickeStrukture7cas;

/******************************************************************************************************************
* Primer za računanje srednje vrednosti elemenata matrice prirodnih brojeva 
* koji sadrži maksimum 10 vrsta i 20 kolona. 
* Program prihvata od korisnika broj vrsta i kolona i vrednost svakog pojedinačnog elementa.
******************************************************************************************************************/

public class SrednjaVrednostMatrice {
	public static void main(String[] args) {
	
		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int Nvr = 1, Nkol = 1, i, j;
		float srvr = 0;
		int[][] MatricaPrirordnihBrojeva = new int[MAXVRSTA][MAXKOLONA];
		System.out.println("Program za računanje srednje vrednosti elemenata matrice prirodnih brojeva.\n\n");
		System.out.println("Unesite broj vrsta:\t"); // prihvati broj vrsta i kolona
		Nvr = TextIO.getlnInt();
		System.out.println("\nUnesite broj kolona:\t");
		Nkol = TextIO.getlnInt();
		for (i = 0; i < Nvr; i++) // prihvati elemente matrice od korisnika
		for (j = 0; j < Nkol; j++){
		System.out.println("Unesite element matrice na koordinati [" + (i+1) + "][" + (j+1) + "]:\t");
		MatricaPrirordnihBrojeva[i][j] = TextIO.getlnInt();
		}
		for (i = 0; i < Nvr; i++) // izračunaj sumu elemenata matrice
		for (j = 0; j < Nkol; j++)
		srvr += MatricaPrirordnihBrojeva[i][j];
		srvr /= (Nvr*Nkol); // izračunaj srednju vrednost elemenata matrice
		System.out.println(" Srednja vrednost elemenata matrice iznosi " + srvr +".");
	}
}