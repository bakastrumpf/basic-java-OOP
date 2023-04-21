package testiranjeUI6cas;

//НЕЈАСНО ШТА РАДИ ОВАЈ ЗАДАТАК, једва исправих да не буде црвен (у односу на ор'гинал са 187 слајда

public class MerneJediniceSWITCH {
	public static void main(String[] args) {

	String units;
	double measurement = 10.0;
	double inches;
	units = TextIO.getlnWord(); 				/* Unos podatka */
	
	switch ( units ) {
		case "inches":
			inches = measurement;
			break;
		case "feet":
			inches = measurement * 12;
			break;
		case "yards":
			inches = measurement * 36;
			break;
		case "miles":
			inches = measurement * 12 * 5280;
			break;
		default:
			System.out.println("Wait a minute! Illegal unit of measure! I quit!");
				System.exit(1);
		}
	}
}