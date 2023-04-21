package domaciRacunarSort;

public class Racunar {
	String oznakaProcesora;
	double radniTakt, indexPerformansi;
	int kapacitetMemorije;

	Racunar() {
	}

	Racunar(String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;

	}

	public String pribaviOznakuProcesora() {
		return oznakaProcesora;
	}

	public void postaviOznakuProcesora() {
		this.oznakaProcesora = oznakaProcesora;
	}

	public double pribaviRadniTakt() {
		return radniTakt;
	}

	public void postaviRadniTakt() {
		this.radniTakt = radniTakt;
	}

	public int pribaviKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void postaviKapacitetMemorije() {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double indexPerformansi() {
		return indexPerformansi;
	}

	public void postaviIndexPerformansi(double indexPerformansi) {
		this.indexPerformansi = indexPerformansi;
	}

	double izracunajIndexPerformansi() {
		indexPerformansi = 100 * radniTakt + kapacitetMemorije;
		return indexPerformansi;
	}

	void stampanjePodataka() {
		System.out.printf("Рачунар с процесором " + oznakaProcesora + ", радним тактом " + radniTakt
				+ " гигахерца и капацитетом меморије " + kapacitetMemorije + " гигабајта има индекс перформанси ");
		System.out.printf("%.2f \n", indexPerformansi);
	}

	int uporediSa(Racunar r) {
		if (this.indexPerformansi() > r.indexPerformansi()) {
			return 1;
		} else {
			return -1;
		}
	}
}
