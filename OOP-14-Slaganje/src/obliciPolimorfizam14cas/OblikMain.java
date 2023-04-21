package obliciPolimorfizam14cas;

public class OblikMain {

	public static void main(String[] args) {
		
	Krug kr = new Krug("Crvena",1, 2.0);
	Kvadrat kv = new Kvadrat("Bela",4, 1.5);
	
	kr.stampajPodatke();
	kv.stampajPodatke();
	}
}