package potprogrami9cas;

public class PrenosParametaraNizPotprogrami {
	public static void main(String[] args) {

	int[] intNiz = {1, 2, 3};
	promeniNiz(intNiz);
		System.out.print("Vrednost niza nakon povratka u main: ");
		System.out.print(" [" + intNiz[0] + "," + intNiz[1] + "," + intNiz[2] + "]");
		System.out.println();
	}
	
	static void promeniNiz(int[] intNizPar){
	int i = 0;
		System.out.print("Vrednost niza koji stiže u potprogram: ");
		System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
		System.out.println();
	for (i = 0; i < 3; i++)
		intNizPar[i]++;
		System.out.print("Vrednost niza nakon uvećanja u potprogramu: ");
		System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
		System.out.println();
	}
}