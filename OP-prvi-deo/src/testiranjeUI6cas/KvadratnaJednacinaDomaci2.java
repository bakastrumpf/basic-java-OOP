package testiranjeUI6cas;

public class KvadratnaJednacinaDomaci2 {
	public static void main(String[] args) {
		
	double 		a, b, c, diskriminanta, x1, x2, y1, y2;
	int 		potvrda=0;
	
	do {
		do {
			System.out.println		("Unesite a različito od nule (i zatim ENTER):");
			a = TextIO.getlnDouble();
		}while(a==0);
	
	System.out.println				("Unesite b (i zatim ENTER):");
	b = TextIO.getlnDouble();
	System.out.println				("Unesite c (i zatim ENTER):");
	c = TextIO.getlnDouble();
	
	diskriminanta = b*b - 4*a*c;
	if(b==0) {
		x1= (-4*a*c)/2*a;
			System.out.println		("b = 0!\n X="+x1);
	}else if(diskriminanta==0) {
		x1= -b/2*a;
			System.out.println		("Diskriminanta = 0\nX="+x1);
	}else if(diskriminanta>0) {
		x1= (-b+Math.sqrt(diskriminanta))/2*a;
		x2= (-b-Math.sqrt(diskriminanta))/2*a;
			System.out.println		("Dva moguća rešenja za ovu kombinaciju unetih brojeva su:");
			System.out.printf		("X1: %.2f \n", x1);
			System.out.printf		("X2: %.2f \n", x2);
	}else if(diskriminanta<0) {
		y1= (-b+Math.sqrt(diskriminanta))/2*a;
		y2= (-b-Math.sqrt(diskriminanta))/2*a;
			System.out.println		("Rešenja su u ovom slučaju imaginarni brojevi, i to: ");;
			System.out.println		("Y1: " + y1);
			System.out.println		("Y2: " + y2);				
	}
			System.out.println		("");
			System.out.println		("Da li želite da unesete novu jednačinu?");
			System.out.println		("Unesite 1 za POTVRDU, ili bilo koji drugi broj za KRAJ.");
	potvrda=TextIO.getlnInt();
	}
	while(potvrda==1);
	
			System.out.println		("Uneli ste kod za završetak programa. Vidimo se u sledećem domaćem zadatku. Hvala na saradnji. Doviđenja!");
	}
}