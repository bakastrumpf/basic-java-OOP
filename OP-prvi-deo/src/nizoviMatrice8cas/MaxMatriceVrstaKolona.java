package nizoviMatrice8cas;

public class MaxMatriceVrstaKolona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int Nvr = 1, Nkol = 1, i, j;
		int[][] Matrica = new int[MAXVRSTA][MAXKOLONA];
		int[] MaxVrsta = new int[MAXVRSTA];
		int[] MaxKolona = new int[MAXKOLONA];
		System.out.println("Program za max elemenata matrice.\n\n");

		System.out.println("Unesite broj vrsta (do 10):\t"); // prihvati broj vrsta i kolona
		Nvr = TextIO.getlnInt();
		System.out.println("\nUnesite broj kolona (do 10):\t");
		Nkol = TextIO.getlnInt();

		for (i = 0; i < Nvr; i++) {// prihvati elemente matrice od korisnika
			for (j = 0; j < Nkol; j++) {
				System.out.println("Unesite element matrice na koordinati [" + (i + 1) + "][" + (j + 1) + "]:\t");
				Matrica[i][j] = TextIO.getlnInt();
			}
		}

		for (i = 0; i < Nvr; i++)
			MaxVrsta[i] = Matrica[i][0];

		for (j = 0; j < Nkol; j++)
			MaxKolona[j] = Matrica[0][j];

		for (i = 0; i < Nvr; i++) {// prihvati elemente matrice od korisnika
			for (j = 0; j < Nkol; j++) {
				if (Matrica[i][j] > MaxVrsta[i])
					MaxVrsta[i] = Matrica[i][j];
				if (Matrica[i][j] > MaxKolona[j])
					MaxKolona[j] = Matrica[i][j];
			}
		}

		for (i = 0; i < Nvr; i++)
			System.out.print("Max u " + (i + 1) + ". vrsti je: " + MaxVrsta[i] + "  \n");
		
	}

}

//System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE); 
//System.out.println("Integer.MIN_VALUE = "+ Integer.MIN_VALUE); 
//
//int a = Integer.MIN_VALUE;
//System.out.println(a);
