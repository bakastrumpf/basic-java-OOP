package zadatak1;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class UcitavanjeFajlaBAFER {
protected String ime;
protected String prezime;
protected String jmbg;
protected String tekuciRacun;
protected double koefSS;

public void unosTeksta(BufferedReader datoteka) {
	try {
		ime = datoteka.readLine();
		prezime = datoteka.readLine();
		jmbg = datoteka.readLine();
		tekuciRacun = datoteka.readLine();
		koefSS = Double.parseDouble(datoteka.readLine());
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}
}
}
