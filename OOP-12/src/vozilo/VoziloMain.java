package vozilo;

public class VoziloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vozilo prvi = new Vozilo();
		Vozilo drugi = new Vozilo();
		Vozilo treci = new Vozilo();
		
		prvi.postaviMarku("Pežo");
		prvi.postaviTip("307, hečbek");
		prvi.postaviRegistraciju("2020");
		prvi.postaviGodiste(2004);
		prvi.postaviMaksBrzinu(220);
		prvi.postaviSnagu(66);
		prvi.racunajVrednost();
		prvi.stampajVrednost();
		
		drugi.postaviMarku("Reno");
		drugi.postaviTip("Klio, hečbek");
		drugi.postaviRegistraciju("2021");
		drugi.postaviGodiste(2009);
		drugi.postaviMaksBrzinu(210);
		drugi.postaviSnagu(90);
		drugi.racunajVrednost();
		drugi.stampajVrednost();
		
		treci.postaviMarku("Golf");
		treci.postaviTip("Variant, karavan");
		treci.postaviRegistraciju("2020");
		treci.postaviGodiste(2010);
		treci.postaviMaksBrzinu(230);
		treci.postaviSnagu(135);
		treci.racunajVrednost();
		treci.stampajVrednost();
		
		prvi.uporediVrednost(drugi);
		prvi.uporediVrednost(treci);
		drugi.uporediVrednost(prvi);
		drugi.uporediVrednost(treci);
		treci.uporediVrednost(prvi);
		treci.uporediVrednost(drugi);
	}
}