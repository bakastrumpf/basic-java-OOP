package student;

public class StudentMain {
	public static void main(String[] args) {

		Student prvi = new Student("Petar", "Petrović", 39.5, 53.8);
		Student drugi = new Student("Ivana", "Ivanović", 38.7, 57.5);
		prvi.racunajProsek();
		drugi.racunajProsek();
		prvi.stampajPoene();
		drugi.stampajPoene();
	}

}
