package singlton;

public class SingltonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Singlton s1 = new Singlton();
		// s1.str;
		Singlton s1 = Singlton.pribaviInstancu();
		//Singlton s3 = Singlton.pribaviInstancu();
		Singlton s2 = Singlton.pribaviInstancu();
		
		s2.str = "Pozdrav, dragi moji polaznici";
		
		System.out.println(s1.str); //štampa s1 - pristupa istoj promenljivoj, jer je statička - ista
	} 

}
