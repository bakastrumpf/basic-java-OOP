package domaciRacunarSort;

public class RacunarSortMain {

	static final int BROJRACUNARA = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racunar[] r = new Racunar[BROJRACUNARA];

		r[0] = new Racunar("Intel Core i5", 3.2, 16);
		r[1] = new Racunar("Intel Core i3", 2.2, 8);
		r[2] = new Racunar("Intel Core i5", 2.3, 16);
		r[3] = new Racunar("Intel Core i7", 3.3, 6);
		r[4] = new Racunar("Intel Core i7", 3.6, 8);
		r[5] = new Racunar("Intel Core i5", 3.6, 16);
		r[6] = new Racunar("Intel Core i3", 3.3, 32);

		r[0].izracunajIndexPerformansi();
		r[1].izracunajIndexPerformansi();
		r[2].izracunajIndexPerformansi();
		r[3].izracunajIndexPerformansi();
		r[4].izracunajIndexPerformansi();
		r[5].izracunajIndexPerformansi();
		r[6].izracunajIndexPerformansi();

		for (int i = 0; i < BROJRACUNARA - 1; i++) {
			for (int j = i + 1; j < BROJRACUNARA; j++) {
				if (r[i].indexPerformansi() > r[j].indexPerformansi()) {
					Racunar t = r[i];
					r[i] = r[j];
					r[j] = t;
				}
			}
		}

		for (int i = 0; i < BROJRACUNARA; i++) {
			r[i].stampanjePodataka();

		}

	}
}
