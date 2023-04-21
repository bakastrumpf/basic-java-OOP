package potprogrami9cas;

public class SimulatorKalkulatora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double operand1 = 0, operand2 = 0;
		double zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
		System.out.println("--Program za simuliranje kalkulatora--");
		operand1 = unosOperanda("Unesite prvi operand:");
		operand2 = unosOperanda("Unesite drugi operand:");
		System.out.println("--------------------------------------");
		zbir = sabiranje(operand1, operand2);
		razlika = oduzimanje(operand1, operand2);
		proizvod = mnozenje(operand1,operand2);
		kolicnik = deljenje(operand1, operand2);
		prikaziRezultate(operand1, operand2, zbir, razlika, proizvod, kolicnik);
		}
		static double unosOperanda(String poruka){
		double operand = 0.0;
		System.out.println(poruka);
		operand = TextIO.getlnDouble();
		return operand;
		}
		static double sabiranje(double op1, double op2){
		return op1 + op2;
		}
		static double oduzimanje(double op1, double op2){
		return op1 - op2;
		}
		static double mnozenje(double op1, double op2){
		return op1 * op2;
		}
		static double deljenje(double op1, double op2){
		return op1 / op2;
		}
		static void prikaziRezultate(double op1, double op2, double zb, double rz, double pr,
		double kl){
		System.out.println("\n---Rezultati osnovnih operacija su:---");
		System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, zb);
		System.out.printf("\n%8.2f - %8.2f = %8.2f\n", op1, op2, rz);
		System.out.printf("\n%8.2f * %8.2f = %8.2f\n", op1, op2, pr);
		System.out.printf("\n%8.2f / %8.2f = %8.2f\n\n", op1, op2, kl);
		System.out.println("--------------------------------------");
		
	}

}
