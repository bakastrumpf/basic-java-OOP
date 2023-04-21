package poruka;

public class Poruka2 {
	
//	klasa Poruka s pristupnim metodama
//	private String tekst;
//	public void postaviTekst(String tekst){
//	this.tekst = tekst;
//	}
//	public String pribaviTekst(){
//	return this.tekst;
//	}
//	public void prikaziPoruku(){
//	System.out.println(pribaviTekst());
//	}
	
	private String tekst;
	
	Poruka2(){}
	
	public void postaviPoruku(String poruka){
	this.tekst = poruka;
	}
	public void prikaziPoruku(){
	System.out.println(this.tekst);
	}
}
