package testiranjeUI6cas;

/****************************************************************
* Primer programa za računanje sume prvih N prirodnih brojeva. 
* --> WHILE UMESTO FOR! DOVRŠI
*****************************************************************/
public class SumaNbrojevaFOR {

	public static void main(String[] args) {
	int N = 1;
	int i, suma = 0;
			System.out.println("Program za računanje sume prvih N prirodnih brojeva.");
			System.out.println("Unesite N: ");
	do {
		N = TextIO.getlnInt();
	if (N < 1)
			System.out.println("N mora biti veći od 0. Unesite ponovo N: ");
	} while (N < 1);
		for (i = 1; i <= N ; i++)
		suma += i;
			System.out.println("Suma prvih " + N + " prirodnih brojeva je: " + suma + ".");
	}
}