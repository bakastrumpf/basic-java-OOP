package kvadratnaFunkcija;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// 2. Klasa LinearnaFunkcija predstavlja funkcije oblika y=a*x+b) 
// koja implementira interfejs Funkcija.

public class LinearnaFunkcija implements Funkcija {
	double a;
	double b;
	double x;
	double y;
	double nule[] = new double[2];

	LinearnaFunkcija() {
	}

	LinearnaFunkcija(String nazivDatoteke) throws FileNotFoundException {
		this.a = 0;
		this.b = 0;

		ucitajParametre(nazivDatoteke);
		izracunajVrednost(x);
		proveriRealneNule();
		izracunajNule();
		upisiVrednost(nazivDatoteke);
	}

	@Override
	public void ucitajParametre(String nazivDatoteke) {
		Scanner s = null;
		try {
			s = new Scanner(new File(nazivDatoteke));
			a = s.nextDouble();
			b = s.nextDouble();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public double izracunajVrednost(double x) {
		y = a * x + b;
		System.out.println("funkcija f(" + x + ")=" + y);
		return y;
	}

	@Override
	public boolean proveriRealneNule() {
		if (a != 0) {
			System.out.println("Linearna funkcija uvek ima realne nule");
			return true;
		} else
			return false;
	}

	public double[] izracunajNule() {
		double x = (-a) / b;
		nule[0] = x;
		System.out.println("funkcija f(0)=" + nule[0]);
		return nule;
	}

	@Override
	public void upisiVrednost(String nazivDatoteke) {
		PrintWriter pw = null;
		try {
			if (proveriRealneNule() == true) {
				pw = new PrintWriter(new FileOutputStream(nazivDatoteke));
				for (double nule : this.izracunajNule())
					pw.println(nule + " su nule funkcije");
			} else {
				System.out.println("Imaginarne nule.");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
