package kompleksniZadaci10cas;

public class BankaDomaci3 {

	static final int POSLOVNICA = 10;
	static final int MESEC = 12;

	public static void main(String[] args) {

		double[][] evidencijaBanke = new double[MESEC][POSLOVNICA];
		int izbor;

		do {
			prikazMenija();

			izbor = preuzmiIntVrednost("", "Морате одабрати вредност у опсегу 0-7", 0, 7);
			System.out.printf("Изабрали сте опцију %d \n\n", izbor);

			switch (izbor) {
			case 1:
				System.out.println(" 1. Унос оствареног прихода за задату пословницу и месец.");
				unesiPrihod(evidencijaBanke);
				break;
			case 2:
				System.out.println(" 2. Измена оствареног прихода за задату пословницу и месец.");
				izmeniPrihod(evidencijaBanke);
				break;
			case 3:
				System.out.println(" 3. Приказ месечних прихода за изабрану пословницу.");
				mesecniPrihodOdabranePoslovnice(evidencijaBanke);
				break;
			case 4:
				System.out.println(" 4. Приказ прихода појединачних пословница за изабрани месец.");
				prihodPojedinacnePoslovniceMesec(evidencijaBanke);
				break;
			case 5:
				System.out.println(" 5. Израчунавање и приказ месеца у којем је укупни приход највећи, и његов износ.");
				prikazNajvecegPrihoda(evidencijaBanke);
				break;
			case 6:
				System.out.println(" 6. Израчунавање и приказ укупног годишњег прихода.");
				ukupanGodisnjiPrihod(evidencijaBanke);
				break;
			case 7:
				System.out.println(" 7. Израчунавање и приказ просечног прихода за сваку пословницу.");
				prosecniPrihodPoslovnice(evidencijaBanke);
				break;
			case 0:
				System.out.println("Излаз из програма.");
				break;
			default:
				System.out.println("Одабрали сте излаз из програма. Пријатан дан!");
				break;
			}

		} while (izbor != 0);
	}

	static void prikazMenija() {
		System.out.println("\t ~| ЕВИДЕНЦИЈА ПРИХОДА БАНКЕ | СТРОГО ПОВЕРЉИВО | ~");
		System.out.println("\t ~| САМО ЗА ИНТЕРНУ УПОТРЕБУ | СТРОГО ПОВЕРЉИВО | ~ \n");
		System.out.println("\t Добродошли у програм за вођење месечне евиденције рада 10 пословница банке у вашем граду!\n");
		System.out.println("\t За почетак рада, одаберите једну од опција корисничког менија притискањем одговарајућег броја:");
		System.out.println();
		System.out.println("\t\t~~~~~~~~~~| КОРИСНИЧКИ МЕНИ |~~~~~~~~~~\n");
		System.out.println("	1) Унос оствареног прихода за задату пословницу и месец. ");
		System.out.println("	2) Измена oствареног прихода за задату пословницу и месец.");
		System.out.println("	3) Приказ месечних прихода за изабрану пословницу.");
		System.out.println("	4) Приказ прихода појединачних пословница за изабрани месец.");
		System.out.println("	5) Израчунавање и приказ месеца у којем је укупни приход највећи и његов износ.");
		System.out.println("	6) Израчунавање и приказ укупног годишњег прихода.");
		System.out.println("	7) Израчунавање и приказ просечног прихода за сваку пословницу.");
		System.out.println("	0) Излазак из програма.");
		System.out.println();
	}

	static int preuzmiIntVrednost(String poruka, String greska, int donja, int gornja) {
		int vrednost = 0;
		do {
			System.out.print(poruka);
			vrednost = TextIO.getlnInt();
			if ((vrednost < donja) || (vrednost > gornja))
				System.out.println(greska);
		} while ((vrednost < donja) || (vrednost > gornja));

		return vrednost;
	}

	static void unesiPrihod(double[][] ob) {
		int mesec, poslovnica;
		char odgovor;

		do {

			mesec = preuzmiIntVrednost("Унесите месец за који уносите приход:\t", "Месец мора бити у опсегу 1-" + MESEC,
					1, MESEC);
			poslovnica = preuzmiIntVrednost("Унесите пословницу за коју уносите приход:\t",
					"Пословница мора бити у опсегу 1-" + POSLOVNICA, 1, POSLOVNICA);

			System.out.println("Унесите износ прихода: ");
			ob[mesec - 1][poslovnica - 1] = TextIO.getlnDouble();

			izlistajMatricu(ob);

			System.out.println("За унос још једног прихода притисните тастер Д: ");
			odgovor = TextIO.getlnChar();
		} while (odgovor == 'd');
	}

	static void izmeniPrihod(double[][] ob) {
		int mesec, poslovnica;
		char odgovor;
		do {
			mesec = preuzmiIntVrednost("Одаберите месец за који уносите приход:\t",
					"Месец мора бити у опсегу 1-" + MESEC, 1, MESEC);
			poslovnica = preuzmiIntVrednost("Одаберите пословницу за коју уносите приход:\t",
					"Пословница мора бити у опсегу 1-" + POSLOVNICA, 1, POSLOVNICA);

			System.out.println("Унесите вредност измењеног прихода");
			ob[mesec - 1][poslovnica - 1] = TextIO.getlnDouble();

			izlistajMatricu(ob);

			System.out.println("За измену још једног прихода притисните тастер Д: ");
			odgovor = TextIO.getlnChar();
		} while (odgovor == 'd');
	}

	static void mesecniPrihodOdabranePoslovnice(double[][] ob) {
		int poslovnica;
		char odgovor;
		do {
			poslovnica = preuzmiIntVrednost("Унесите пословницу за коју желите да видите приход:\t",
					"Пословница мора бити у опсегу 1-" + POSLOVNICA, 1, POSLOVNICA);

			System.out.printf("\nПриходи пословнице %d. на месечном нивоу износе: \n", poslovnica);
			for (int i = 0; i < MESEC; i++) {
				System.out.printf("  %.2f  ", ob[i][poslovnica]);
			}

			System.out.println("\nЗа приказ још једног прихода притисните тастер Д: ");
			odgovor = TextIO.getlnChar();
		} while (odgovor == 'd');
	}

	static void prihodPojedinacnePoslovniceMesec(double[][] ob) {
		int mesec;
		char odgovor;
		do {
			mesec = preuzmiIntVrednost("Унесите месец за који желите да видите приход:\t",
					"месец мора бити у опсегу 1-" + MESEC, 1, MESEC);

			System.out.printf("\nПриходи %d. месеца износе: \n", mesec);
			for (int i = 0; i < POSLOVNICA; i++) {
				System.out.printf("  %.2f  ", ob[mesec][i]);
			}

			System.out.println("\nЗа приказ још једног месеца притисните тастер Д: ");
			odgovor = TextIO.getlnChar();
		} while (odgovor == 'd');
	}

	static void prikazNajvecegPrihoda(double[][] ob) {

		double maks_prihod = 0, ukupni_prihod = 0;
		int mesec = 0;

		for (int i = 0; i < MESEC; i++) {
			for (int j = 0; j < POSLOVNICA; j++) {
				ukupni_prihod += ob[i][j];
			}
			if (ukupni_prihod > maks_prihod) {
				mesec = i + 1;
				maks_prihod = ukupni_prihod;
			}
			ukupni_prihod = 0;
		}

		System.out.printf("Највећи приход остварен је у %d. месецу и износи %.2f", mesec, maks_prihod);
		System.out.println(" динара.");
	}

	static void ukupanGodisnjiPrihod(double[][] ob) {

		double ukupni_prihod = 0;

		for (int i = 0; i < MESEC; i++) {
			for (int j = 0; j < POSLOVNICA; j++) {
				ukupni_prihod += ob[i][j];
			}
		}

		System.out.printf("Укупни приход износи %.2f\n\n", ukupni_prihod);

	}

	static void prosecniPrihodPoslovnice(double[][] ob) {

		double prosek = 0, ukupno = 0;
		int j = 0;

		for (int g = 0; g < POSLOVNICA; g++) {

			while (j < MESEC) {
				ukupno += ob[j][g];
				j++;
			}
			prosek = ukupno / (j - 1);
			System.out.printf("\nПросечан приход %d. пословнице је %.2f", g + 1, prosek);

			j = 0;
			prosek = 0;
			ukupno = 0;
		}
		System.out.println();
	}

	static void izlistajMatricu(double[][] ob) {
		System.out.println("Покрећем опцију \"Излистај матрицу\" ");

		for (int i = 0; i < MESEC; i++) {
			for (int j = 0; j < POSLOVNICA; j++) {
				System.out.printf("  %.2f  ", ob[i][j]);
			}
			System.out.printf("\n");
		}
	}
}