package statickeStrukture7cas;
//Maksimalna vrednost u nizu i njegova pozicija, verzija 2:

public class MaxNizaPozicija2 {
	public static void main(String[] args) {
	
	final int MAXELNIZA = 5;
	int N = 1, i;
	int NizPrirodnihBrojeva[] = new int[MAXELNIZA];
	//int maks;
	int pozMaks;

	  pozMaks = 0;
	      
	  System.out.println("Program za racunanje sume elemenata niza N prirodnih brojeva.");
	  System.out.print("Unesite N:\t"); // prihvati broi elemenata niza
	  N = TextIO.getlnInt();
	      
	  for (i = 0; i < N; i++){ // prihvati elemente niza od korisnika
	    System.out.println("Unesite " + (i+1) + ". element niza:\t");
	    NizPrirodnihBrojeva[ i ] = TextIO.getlnInt();
	  }   
	  pozMaks = 0;
	  for (i = 0; i < N; i++)
	    if (NizPrirodnihBrojeva[pozMaks] < NizPrirodnihBrojeva[i])
	      pozMaks = i;
	  System.out.println("Najveću vrednost, " + NizPrirodnihBrojeva[pozMaks] + ", ima "+ (pozMaks+1) +". element niza.");
	}
}