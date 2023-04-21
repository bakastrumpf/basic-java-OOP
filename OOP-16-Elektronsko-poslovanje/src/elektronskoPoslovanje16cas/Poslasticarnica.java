package elektronskoPoslovanje16cas;

public class Poslasticarnica extends Prodavnica implements Imenovanje{
	
	private String imeProdavnice;
	
	private String[] stavkaMenija = {
			"sladoled",
			"torta",
			"krofna",
			"kafa",
			"caj",
			"limunada"
	};
	
	public String[] uzmiIzInventara() {
		return stavkaMenija;
	}
	
	public void nabaviInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal: "+ artikal);
	}
	
	public String pribaviImeProdavnice() {
		return this.imeProdavnice;
	}
	
	public void postaviImeProdavnice(String imeProdavnice) {
		this.imeProdavnice = imeProdavnice;
	}

}
