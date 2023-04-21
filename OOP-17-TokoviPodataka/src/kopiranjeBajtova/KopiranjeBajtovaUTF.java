package kopiranjeBajtova;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KopiranjeBajtovaUTF {
	public static void main(String[] args) throws IOException {
		FileReader ulaz = null;
		FileWriter izlaz = null;
		try {
			ulaz = new FileReader("unicodeProba.txt");
			izlaz = new FileWriter("unicodeProba.txt");
			int c;
			while ((c = ulaz.read()) != -1) {
				izlaz.write(c);
				System.out.println(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (ulaz != null) {
				ulaz.close();
			}
			if (izlaz != null) {
				izlaz.close();
			}
		}
	}
}