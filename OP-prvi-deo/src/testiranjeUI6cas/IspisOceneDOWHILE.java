package testiranjeUI6cas;

/******************************************************************************************************************
* Primer programa za ispis uspeha na osnovu unete ocene (do-while petlja se koristi ya proveru ispravnosti ulazne
* vrednosti).
******************************************************************************************************************/

public class IspisOceneDOWHILE {
	public static void main(String[] args) {
		
	int ocena;
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
				
	do{						// do-while petlja se koristi da se proveri ulazna vrednost
				System.out.print("Unesite ocenu: ");
	ocena = TextIO.getlnInt();
		if ((ocena < 1)||(ocena > 5))
					System.out.println("Ocena mora biti između 1 i 5.");
	} while ((ocena < 1)||(ocena > 5));
		switch (ocena){
			case 1: System.out.println("Sedi, JEDAN!");
				break;
			case 2: System.out.println("Tuga pregolema!");
				break;
			case 3: System.out.println("Srednje očajno!");
				break;
			case 4: System.out.println("Solidno!");
				break;
			case 5: System.out.println("Jedva 5!");
		}
	}
}