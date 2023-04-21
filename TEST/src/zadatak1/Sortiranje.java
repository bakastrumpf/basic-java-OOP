package zadatak1;

public class Sortiranje {

	public static void main(String[] args) {
	
		for (i=0; i < brElem-1; i++)
		    for (j=i+1; j < brElem; j++)
		      if (niz[i].compareTo(niz[j]) > 0) {
		        tmp = niz[i];
		        niz[i] = niz[j];
		        niz[j] = tmp;
		      }
	}

}
