package statickeStrukture7cas;
//Maksimalna vrednost u nizu i njegova pozicija, verzija 1:

public class MaxNizaPozicija1 {
	public static void main(String[] args) {
		
	final int MAXELNIZA = 50; // final služi da označi vrednost koja se više ne može menjati
	  int N = 1, i;
	  int NizPrirordnihBrojeva[] = new int[MAXELNIZA];
	  int maks;
	  int pozMaks;
	  maks = NizPrirordnihBrojeva[0];
	  pozMaks = 0;
	      
	  System.out.println("Program za racunanje minimalnog elementa u nizu N prirodnih brojeva.");
	  System.out.print("Unesite N:\t"); // prihvati broi elemenata niza
	  N = TextIO.getlnInt();
	      
	  for (i = 0; i < N; i++){ // prihvati elemente niza od korisnika
	    System.out.println("Unesite " + (i+1) + ". element niza:\t");
	    NizPrirordnihBrojeva[ i ] = TextIO.getlnInt();
	  }   

	  for (i = 0; i < N; i++) {
	    if (maks < NizPrirordnihBrojeva[i]) {
	      maks = NizPrirordnihBrojeva[i];
	      pozMaks = i;
	    }         
	  }
	  System.out.println("Najveću vrednost, " + maks + ", ima "+ (pozMaks+1) +". element niza.");
	}

}
