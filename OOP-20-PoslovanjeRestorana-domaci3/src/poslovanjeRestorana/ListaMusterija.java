package poslovanjeRestorana;

import java.io.*;
import java.util.*;

public class ListaMusterija implements RadSaFajlovima, RadsaMusterijama {

	private ArrayList<Musterija> musterije;
	
	public ListaMusterija(){
		this.musterije = new ArrayList<Musterija>();
	}
	
	@Override
	public void dodajMusteriju (Musterija m) {
		musterije.add(m);
		System.out.println(m.toString() + "је успешно уписан у Списак муштерија.");
	}
	
	@Override
	public void obrisiMusteriju (Musterija m) {
		boolean postoji = false;
		for(int i=0; i<musterije.size(); i++);
		if pronadjiMusteriju(m.get(i).getBrojMobTel().equals(m.getBrojMobTel()));
		postoji = true;
		if(postoji) {
			musterije.remove(m);
		System.out.println(m.toString() + "је успешно избрисан из Списка муштерија.");
		}
	System.out.println("Клијент с бројем телефона" + getBrojMobTel + "већ постоји у Листи муштерија.");
	}
	
	@Override
	public Musterija pronadjiMusteriju(String brojMobTel) {
		if(musterije.contains(brojMobTel)) {
			System.out.println(musterije.toString()+ "већ постоји у Списку муштерија.");
		}
		System.out.println("Муштерија с бројем телефона: " + brojMobTel + "није у Списку муштерија.");
	}
	
	@Override
	public void ucitajIzDatoteke throws IOException (String nazivDatoteke) {
		Scanner scan = null;
		try {
			scan = new Scanner (new File(nazivDatoteke));
			while (scan.hasNext()) {
				String ime = scan.next();
				String prezime = scan.next();
				String adresa = scan.next();
				String brojMobTel = scan.next();
				Musterija m = new Musterija (ime, prezime, adresa, brojMobTel);
				musterije.add(m);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} finally {
			if (scan != null)
				scan.close();
		}
	}
	
	@Override
	public void upisiUDatoteku (String nazivDatoteke) {
		PrintWriter prwr = null;
		try {
			prwr = new PrintWriter (new FileOutputStream(nazivDatoteke));
			for (Musterija m : musterije) {
				prwr.println(m.toString());
			}
		} catch (FileNotFoundException fnfe) {
			Logger.getLogger(ListaMusterija.class.getName()).log(Level.SEVERE.null, fnfe);
		} finally {
			if (prwr != null) {
				prwr.close();
			}
		}
	}
	
	public void stampajListu() {
		System.out.println();
	}
}
