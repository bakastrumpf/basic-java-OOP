package pozdrav3cas;

public class CiklicnaZamenaMesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("\n\tПочетна вредност а = " + a);
		System.out.println("Почетна вредност b = " + b);
		System.out.println("Почетна вредност c = " + c);
		int p;
		p = a;
		a = b;
		b = c;
		c = p;
		System.out.println("~~~");
		System.out.println("Нова вредност а = " + a);
		System.out.println("Нова вредност b = " + b);
		System.out.println("Нова вредност c = " + c);
		
	}

}
