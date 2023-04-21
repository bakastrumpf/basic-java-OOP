package obliciPolimorfizam14cas;

public class Oblik {
	private String boja;
	private String tip;
	private int brojStrana;

	Oblik() {}

	Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}
	
	public void postaviBoju(String novaBoja) {
		this.boja = novaBoja;
	}
	
	public String pribaviBoju() {
		return this.boja;
	}
	
	public String pribaviTip() {
		return this.tip;
	}
		
	public int pribaviBrojStrana() {
		return this.brojStrana;
		}
			//public double racunajObim() { }
			//public double racunajPovrsinu() { }
	
	public void stampajPodatke() {
		System.out.println(pribaviBoju() +" "+pribaviTip() +" "+pribaviBrojStrana());
	}
}
