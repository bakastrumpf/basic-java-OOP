package operatori5cas;

public class PritisakMolaGasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int V = 900;
	int T = 22;
	int n = 20;
	final float R=8.314472f;
	float p;
	
	p = n*R*T/V;
	
	System.out.println("Pritisak mola idealnog gasa količine n="+n
			+"cm kubnih (?)"+", zapremine V="+V+"cm kubnih, "
			+"i na temperaturi T="+T+" stepena Celzijusova iznosi "+p+" J/(mol*K).");

	}

}
