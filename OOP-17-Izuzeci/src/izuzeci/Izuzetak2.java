package izuzeci;

public class Izuzetak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 23.3, b = 32. , c = 100, d;
		
		try {
			d = koren (a, b, c);
			System.out.println("Koren je: " + d);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Živ sam!");
	}
	
		static public double koren(double A, double B, double C) 
				throws IllegalArgumentException {
			if (A == 0) {
				throw new IllegalArgumentException("A ne može biti nula!");
			} else {
				double disk = B * B - 4 * A * C;
				if (disk < 0)
					throw new IllegalArgumentException("Diskriminanta manja od nule!");
				return (-B + Math.sqrt(disk)) / (2 * A);
			}
		}
		
	}
