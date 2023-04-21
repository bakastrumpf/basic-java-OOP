package testiranjeUI6cas;

public class MinimumBezNizaDOWHILE {
	public static void main(String[] args) {
	
		// Određivanje minimuma bez niza:
	int N = -1;
	int broj;
	int minimum = 101;
	int i = 0;
	int pozicija = 0;

	do {
	    System.out.println("Unesite koliko brojeva želite da poredite:");
	    N = TextIO.getInt();
	    if (N <= 0)
	      System.out.println("Uneta vrednost mora biti veća od 0!");
	  }while(N <= 0);
	   
	  for (i = 1; i <= N; i++) {
	    do {
	      System.out.println("Unesite " + i + ". broj:");
	      broj = TextIO.getInt();
	      if ((broj < -10)||(broj > 100))
					System.out.println("Uneta vrednost mora biti veća od -10 i manja od 101");
	    }while((broj < -10)||(broj > 100));
	    if (broj < minimum) {
				minimum = broj; pozicija = i;
	    }
	  }
	  System.out.println(pozicija + ". broj " + minimum + " je najmanji broj koji ste uneli.");	
	}
}