package potprogrami9cas;

public class PotprogramiPrimerPrenosParametara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj = 5;
		povecajBroj(broj);
		System.out.println("Vrednost broja nakon povratka u main: " + broj);
		}
		static void povecajBroj(int brojZaUvecavanje){
		System.out.println("Vrednost broja koji stize u potprogram: " + brojZaUvecavanje);
		brojZaUvecavanje++;
		System.out.println("Vrednost broja nakon uvecanja u potprogramu: " + brojZaUvecavanje);
		
	}

}
