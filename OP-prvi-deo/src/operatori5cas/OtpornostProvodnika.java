package operatori5cas;

public class OtpornostProvodnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int l=25;
	int d=4;
	final float PI=3.14f;
	double O=1.588*Math.pow(10, -6);
	double R=0;
	R=R*O*4*l/(d*d*PI);
	System.out.println("Specifična otpornost bakarnog provodnika dužine l=" + l + "cm i poluprečnika d=" + d + "cm iznosi O=" + O +".");
	}
}

//ne znam da ispravim jer ne znam formule za koješta iz hemije/fizike
//poenta zadatka je svakako bila konverzija...
