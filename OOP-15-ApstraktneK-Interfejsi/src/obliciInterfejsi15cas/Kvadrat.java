package obliciInterfejsi15cas;

public class Kvadrat implements Figura {
	
private double stranica;
	
	public Kvadrat(double stranica) {
		super();
		this.stranica = stranica;
	}
	
	public double racunajPovrsinu() {
		return this.stranica*this.stranica;
	}
	
	public double racunajObim() {
		return 4*this.stranica;
	}
}