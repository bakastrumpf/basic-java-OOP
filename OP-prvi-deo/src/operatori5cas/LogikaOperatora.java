package operatori5cas;

public class LogikaOperatora {

	public static void main(String[] args) { /* Deklaracija promenljivih. */
		
		boolean a = true, b = false; /* Negacija. */
		System.out.print("Negacija od true je: "); System.out.println(!a);
		System.out.print("Negacija od false je: ");	System.out.println(!b);
		System.out.println(""); 
		System.out.println("~~~I~~~"); 			/* I operacija. */
		System.out.print("true I false je: "); System.out.println(a && b);
		System.out.print("true I true je: "); System.out.println(a && a);
		System.out.print("false I false je: "); System.out.println(b && b);
		System.out.println(""); 
		System.out.println("~~~ILI~~~"); 					/* ILI operacija. */
		System.out.print("true ILI false je: "); System.out.println(a || b);
		System.out.print("true ILI true je: "); System.out.println(a || a);
		System.out.print("false ILI false je: "); System.out.println(b || b);
		System.out.println(""); 
		System.out.println("~~~Ekskluzivno ILI~~~"); 		/* Eksluzivno ILI operacija. */
		System.out.print("true EXILI false je: "); System.out.println(a ^ b);
		System.out.print("true EXILI true je: "); System.out.println(a ^ a);
		System.out.print("false EXILI false je: "); System.out.println(b ^ b);
	}
}
