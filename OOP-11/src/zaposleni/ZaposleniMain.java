package zaposleni;

public class ZaposleniMain {
	public static void main(String[] args) {

		Zaposleni prvi 			= new Zaposleni();
		Zaposleni drugi 		= new Zaposleni();
		Zaposleni treci			= new Zaposleni();
		
		prvi.postaviIme			("Ђорђе");
		prvi.postaviPrezime		("Милетић");
		drugi.postaviIme		("Драгана");
		drugi.postaviPrezime	("Ђукић");
		treci.postaviIme		("Миладин");
		treci.postaviPrezime	("Бајшев");
		
		prvi.koeficijentRadnogMesta		(17.4);
		drugi.koeficijentRadnogMesta	(20.5);
		treci.koeficijentRadnogMesta	(22.5);
		
		prvi.racunajPlatu();
		drugi.racunajPlatu();
		treci.racunajPlatu();
		prvi.stampajPlatu();
		drugi.stampajPlatu();
		treci.stampajPlatu();
		
	}

}
