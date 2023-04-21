package student;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student prvi = new Student();
	Student drugi = new Student();
	
	prvi.postaviImePrezime("Petar", "Petrović");
	drugi.postaviImePrezime("Ivana", "Ivanović");
	
	prvi.postaviKoeficijent(39.5,53.8);
	drugi.postaviKoeficijent(38.7, 57.5);
	
	prvi.racunajProsek();
	drugi.racunajProsek();
	
	prvi.stampajPoene();
	drugi.stampajPoene();
	}
}