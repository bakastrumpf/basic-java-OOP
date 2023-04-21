package oblici15cas;

public abstract class Oblik {
	public String boja;
	public String tip;
	public int brojStrana;
	public double povrsina;
	public double obim;
	
	Oblik (){}
	Oblik(String boja,String tip,int brojStrana){
		this.boja=boja;
		this.tip=tip;
		this.brojStrana=brojStrana;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public double getObim() {
		return obim;
	}

	public void setObim(double obim) {
		this.obim = obim;
	}

	public abstract double racunajObim();

	public abstract double racunajPovrsinu();

	public void stampajPodatke() {
		System.out.println(getBoja() + " " + getTip() + " " + getBrojStrana() + " " 
	+ racunajPovrsinu()	+ " " + racunajObim());
	}
}