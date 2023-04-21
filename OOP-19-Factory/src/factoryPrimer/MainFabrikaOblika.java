package factoryPrimer;

public class MainFabrikaOblika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FabrikaOblika fabrikaOblika = new FabrikaOblika();
		// pribavi oblik Krug i pozovi njegov metod crtaj
		Figura oblik1 = fabrikaOblika.pribaviOblik("KRUG");
		// pozovi metod crtaj za krug
		oblik1.crtaj();
		// pribavi oblik Pravougaonik i pozovi njegov metod crtaj
		Figura oblik2 = fabrikaOblika.pribaviOblik("PRAVOUGAONIK");
		// pozovi metod crtaj za pravougaonik
		oblik2.crtaj();
		// pribavi oblik Kvadrat i pozovi njegov metod crtaj
		Figura oblik3 = fabrikaOblika.pribaviOblik("KVADRAT");
		// pozovi metod crtaj za kvadrat
		oblik3.crtaj();
	}

}
