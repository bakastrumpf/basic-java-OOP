package kvadratnaFunkcija;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// 3. Klasa KvadratnaFunkcija predstavlja funkcije oblika y=a*x^2+b*x+c 
// i implementira interfejs Funkcija.

public class KvadratnaFunkcija implements Funkcija {
	double a;
	double b;
	double c;
	double x;
	double y;
	double diskriminanta;

	double[] nule = new double[2];

	KvadratnaFunkcija() {
	}

	KvadratnaFunkcija(String nazivDatoteke) {
		this.a = 0;
		this.b = 0;
		this.c = 0;
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
			c = s.nextDouble();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public double izracunajVrednost(double x) {
		y = a * (x * x) + b * x + c;
		System.out.println("funkcija f(" + x + ")=" + y);
		return y;
	}

	@Override
	public boolean proveriRealneNule() {
		diskriminanta = b * b - 4 * a * c;
		if (this.diskriminanta >= 0)
			return true;
		else
			return false;
	}

	@Override
	public double[] izracunajNule() {
		if (this.diskriminanta >= 0) {
			double x1 = Math.round((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			double x2 = Math.round((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			nule[0] = x1;
			nule[1] = x2;
			System.out.println("x1=" + nule[0] + " " + "x2=" + nule[1]);
			return nule;
		} else {
			return new double[] {};
		}
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