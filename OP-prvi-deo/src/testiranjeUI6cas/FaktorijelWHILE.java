package testiranjeUI6cas;

/*****************************************************************************
* Primer programa za računanje faktorijela celog broja koji definiše korisnik.
*******************************************************************************/

public class FaktorijelWHILE {
	public static void main(String[] args) {
	
	int broj = 1, i = 1, fakt = 1;
				System.out.println		("Program za računanje faktorijela unetog broja.");
				System.out.println		("Unesite broj: ");
	do{
		broj= TextIO.getlnInt();
		if (broj < 0)
			System.out.println("Broj mora biti veći ili jednak 0. Ponovo unesite broj: ");
	} while (broj < 0);
		while (i <= broj){
			fakt *= i;
			i++;						//uzrokuje da (i <= broj) konvergira nuli
		}
		System.out.println("Faktorijel broja " + broj + " je: " + fakt + ".");
		}
	}