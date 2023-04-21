package operatori5cas;

/****************************************************
* Program koji demonstrira operacije sa stringovima.
*****************************************************/

public class StringPrimer {

public static void main(String[] args) {
	
	String s1 = "Program";
	String s2 = "iranje";
	String s3 = " i programski jezici";
	System.out.println("String s1: " + s1);
	s1 = s1 + s2;
	System.out.println("String s1 nakon prve konkatenacije: " + s1);
	s1 = s1 + s3;
	System.out.println("String s1 nakon prve konkatenacije: " + s1);
	System.out.println("String s1 konvertovan u mala slova: " + s1.toLowerCase());
	System.out.println("String s1 konvertovan u velika slova: " + s1.toUpperCase());
	System.out.println("Karakter na 3. poziciji u stringu s1: " + s1.charAt(2));
	System.out.println("Rezultat poređenja stringova s1 i s3: " + s1.compareTo(s3));
	System.out.println("Rezultat poređenja da li su stringovi s2 i s3 jednaki: " +
	s2.equals(s3));
	System.out.println("Podstring stringa s1 između 4. i 10. karaktera je: " +
	s1.substring(3, 9));
	}
}