package zadatak1;

public class Ispis {

	public static void main(String[] args) {
		
	int x = 1;
	int y = 2 * x + 3+(x+3);
	int k;
	for (k = x; k <= y; k++)
	{
		if (k%4 <3)continue;
		System.out.print("D");
	}
	}
}
