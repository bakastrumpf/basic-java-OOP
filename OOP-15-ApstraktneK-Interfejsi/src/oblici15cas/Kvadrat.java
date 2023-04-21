package oblici15cas;

public class Kvadrat extends Oblik {

	private double stranica;
	
	public Kvadrat(String boja,String tip,int brojStrana,double stranica) {
		super(boja,tip,brojStrana);
		this.stranica = stranica;
	}
	
	public double racunajPovrsinu() {
		return this.stranica*this.stranica;
	}
	
	public double racunajObim() {
		return 4*this.stranica;
	}
}
