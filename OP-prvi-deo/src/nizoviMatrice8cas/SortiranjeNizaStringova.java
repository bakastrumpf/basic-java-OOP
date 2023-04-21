package nizoviMatrice8cas;
//Sortiranje niza stringova:

public class SortiranjeNizaStringova {
	public static void main(String[] args) {
		
	final int MAXNIZA = 20;
	  String[] niz = new String[MAXNIZA];
	  String tmp;
	  int i, j, brElem;
	       
	  System.out.println("Program za sortiranje niza prirodnih brojeva.\n\n");
	  System.out.println("Unesite broj elemenata:\t"); // prihvati broj vrsta i kolona
	  brElem = TextIO.getlnInt();
	  for (i = 0; i < brElem; i++) { // prihvati elemente matrice od korisnika
	    System.out.println("Unesite element niza na koordinati [" + (i+1) + "]:\t");
	    niz[i] = TextIO.getlnString();
	  }
	  System.out.println();
	  System.out.println();
	          
	  System.out.println(" Elemenati niza pre sortiranja su:");
	  System.out.print(" { ");
	  for (i = 0; i < brElem; i++)
	    System.out.print(niz[i] +" ");
	  System.out.println(" } ");
	           
	  for (i=0; i < brElem-1; i++)
	    for (j=i+1; j < brElem; j++)
	      if (niz[i].compareTo(niz[j]) > 0) {
	        tmp = niz[i];
	        niz[i] = niz[j];
	        niz[j] = tmp;
	      }
	          
	  System.out.println();
	  System.out.println();
	          
	  System.out.println(" Elementi niza posle sortiranja su:");
	  System.out.print(" { ");
	  for (i = 0; i < brElem; i++)
	    System.out.print(niz[i] +" ");
	  System.out.println(" } ");
	}
}