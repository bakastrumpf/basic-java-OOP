package oblici15cas;

public class ObliciMain {

	public static void main(String[] args) {
		//Oblik o = new Oblik("Plava", "Krug", 1);
		//greska – Cannot instantiate the type Oblik
		Krug kr = new Krug("Crveni", "krug",0, 2.0);  				//???
		Kvadrat kv = new Kvadrat("Beli","kvadrat", 4, 1.5);			//???
		kr.stampajPodatke();
		kv.stampajPodatke();
		}
}
