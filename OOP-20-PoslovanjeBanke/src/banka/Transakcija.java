package banka;

public class Transakcija {
	private Klijent primalac;
	private Klijent posiljalac;
	private float iznos;
	private boolean interna;

	public Transakcija(Klijent primalac, Klijent posiljalac, float iznos, boolean interna) {
		super();
		this.primalac = primalac;
		this.posiljalac = posiljalac;
		this.iznos = iznos;
		this.interna = interna;
	}

	public Klijent getPrimalac() {
		return primalac;
	}

	// public void setPrimalac(Klijent primalac) {
	// this.primalac = primalac;
	// }

	public Klijent getPosiljalac() {
		return posiljalac;
	}

	// public void setPosiljalac(Klijent posiljalac) {
	// this.posiljalac = posiljalac;
	// }

	public float getIznos() {
		return iznos;
	}

	// public void setIznos(float iznos) {
	// this.iznos = iznos;
	// }

	public boolean isInterna() {
		return interna;
	}

	// public void setInterna(boolean interna) {
	// this.interna = interna;
	// }

	// @Override toString
	// public void stampajTransakciju() {
	// System.out.println();
	// }
}
