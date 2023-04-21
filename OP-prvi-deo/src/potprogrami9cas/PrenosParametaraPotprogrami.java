package potprogrami9cas;

public class PrenosParametaraPotprogrami {
	public static void main(String[] args) {

	int broj = 5;
	povecajBroj(broj);
		System.out.println("Vrednost broja nakon povratka u main: " + broj);
	}
	
	static void povecajBroj(int brojZaUvecavanje){
		System.out.println("Vrednost broja koji stiže u potprogram: " + brojZaUvecavanje);
	brojZaUvecavanje++;
		System.out.println("Vrednost broja nakon uvećanja u potprogramu: " + brojZaUvecavanje);
	}
}
			//----------------------------------------------
			//Vrednost broja koji stize u potprogram: 5
			//Vrednost broja nakon uvecanja u potprogramu: 6
			//Vrednost broja nakon povratka u main: 5