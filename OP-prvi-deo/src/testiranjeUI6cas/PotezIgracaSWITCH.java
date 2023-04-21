package testiranjeUI6cas;

public class PotezIgracaSWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	int status;
//	String potez;
//	status = TextIO.getlnInt();
//	
//	switch (status){
//		case 0:
//				potez = "pomerio gore";
//			break;
//		case 1:
//				potez = "pomerio dole";
//			break;
//		case 2:
//				potez = "pomerio levo";
//				break;
//		case 3:
//				potez = "pomerio desno";
//		}
//		System.out.println("Igrac se "+potez); // Greska!
//	
	
	int 	status;
	String 	potez = "nije pomerio";
		System.out.println("Unesite vrednost 0-3: ");
	status = TextIO.getlnInt();
	switch 	(status){
		case 0:
			potez = "pomerio gore.";
			break;
		case 1:
			potez = "pomerio dole.";
			break;
		case 2:
			potez = "pomerio ulevo.";
			break;
		case 3:
			potez = "pomerio udesno.";
		}
		System.out.println("Igrač se "+potez);
	
	System.out.println();
		
	int 	status2;
	String 	potez2;
		System.out.println("Unesite vrednost 0-3: ");
	status2 = TextIO.getlnInt();

	switch 	(status2){
		case 0:
			potez2 = "pomerio gore.";
			break;
		case 1:
			potez2 = "pomerio dole.";
			break;
		case 2:
			potez2 = "pomerio ulevo.";
			break;
		case 3:
			potez2 = "pomerio udesno.";
			break;
		default:
			potez2 = "nije pomerio.";
		}
		System.out.println("Igrač se "+potez2);
		
	}	
}
