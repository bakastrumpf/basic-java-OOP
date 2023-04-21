package elektronskoPoslovanje16cas;

public class SpisakZaposlenih {
	
	private Zaposleni[] nazivZaposlenog;
	private int trenutniBrojZaposlenih;
	private int maxBrojZaposlenih;
	
	SpisakZaposlenih() {}
	
	SpisakZaposlenih(int maxBrojZaposlenih) {
		this.trenutniBrojZaposlenih = 0;
		this.maxBrojZaposlenih = maxBrojZaposlenih;
		this.nazivZaposlenog = new Zaposleni[maxBrojZaposlenih];
	}
	
	public Zaposleni nadjiZaposlenog(Zaposleni imeZaposlenog) {
		int i;
		for (i = 0; i < this.trenutniBrojZaposlenih; i++) {
			if (this.nazivZaposlenog[i] == imeZaposlenog) {
				return this.nazivZaposlenog[i];
			}
		}
		return null;
	}
	
	public void dodajZaposlenog(Zaposleni imeZaposlenog) {
		if (trenutniBrojZaposlenih < maxBrojZaposlenih) {
			this.nazivZaposlenog[this.trenutniBrojZaposlenih] = imeZaposlenog;
			this.trenutniBrojZaposlenih++;
			System.out.println("Uspesno dodat zaposleni " + imeZaposlenog +"!");
		}
		else{
			System.out.println("Nema vise mesta u spisku zaposlenih!");
		}
	}
	
	public void sortirajZaposlene() {
		for (int i = 0; i < maxBrojZaposlenih - 1; i++) {
			for (int j = i + 1; j < maxBrojZaposlenih; j++) {
				if (nazivZaposlenog[i].pribaviIme().compareToIgnoreCase(nazivZaposlenog[j].pribaviIme()) < 0) {
					Zaposleni temp = nazivZaposlenog[i];
					nazivZaposlenog[i] = nazivZaposlenog[j];
					nazivZaposlenog[j] = temp;
				}				
			}
		}
	}
	
	public void izbrisiZaposlenog(Zaposleni nazivZaposlenog) {
		int i, otpusteni = -1;
		for (i = 0; i < this.trenutniBrojZaposlenih; i++) {
			if (this.nazivZaposlenog[i] == nazivZaposlenog) 
				otpusteni = i;
		}
		if (otpusteni >= 0) {
			for (i = otpusteni; i < this.trenutniBrojZaposlenih-1; i++) {
			this.nazivZaposlenog[i] = this.nazivZaposlenog[i + 1];
			}
			trenutniBrojZaposlenih = trenutniBrojZaposlenih - 1;
		} else System.out.println("Zaposleni "+ nazivZaposlenog.pribaviIme() + " " + nazivZaposlenog.pribaviPrezime() + "nije pronadjen");
	}


}
