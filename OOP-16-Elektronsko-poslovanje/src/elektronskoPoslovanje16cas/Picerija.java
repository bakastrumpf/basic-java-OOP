package elektronskoPoslovanje16cas;

public class Picerija extends Prodavnica implements Imenovanje {
	
	private String imeProdavnice;
	
	private String[] ponudaHrane = {
			"pica",
			"pasta",
			"salata",
			"kalcona",
			"sok",
			"pivo"
	};
	
	public Picerija(){ }
	
	public Picerija(String imeProdavnice, int maxBrojKlijenata){
		super(maxBrojKlijenata);
		this.postaviImeProdavnice(this.imeProdavnice);
	}
	
	public String[] uzmiIzInventara() {
		return ponudaHrane;
	}
	
	public void nabaviInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal "+ artikal);
	}
	
	public String pribaviImeProdavnice() {
		return this.imeProdavnice;
	}
	
	public void postaviImeProdavnice(String ime) {
		this.imeProdavnice = ime;
	}
}
