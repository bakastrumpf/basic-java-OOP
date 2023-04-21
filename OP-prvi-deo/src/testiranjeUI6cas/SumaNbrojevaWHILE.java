package testiranjeUI6cas;
/**************************************************************************************
* Primer programa za računanje sume prvih N prirodnih brojeva primenom while iteracije.
* 
* --> URADI DO-WHILE UMESTO WHILE
/***************************************************************************************/

public class SumaNbrojevaWHILE {
	public static void main(String[] args) {
		
	int N = 1;
	int i, suma = 0;
	System.out.println("Program za racunanje sume prvih N prirodnih brojeva.");
	System.out.println("Unesite N: ");
	
	do {
		N = TextIO.getlnInt();
		if (N < 1)
		System.out.println("N mora biti veći od 0. Unesite ponovo N: ");
	} while (N < 1);
		i = 1;				//inicijalizacija brojača
	while (i <= N) { 		//uslov
		suma += i;			//telo
		i++;				//ažuriranje brojača
		}
		System.out.println("Suma prvih " + N + " prirodnih brojeva je: " + suma + ".");
	}
}