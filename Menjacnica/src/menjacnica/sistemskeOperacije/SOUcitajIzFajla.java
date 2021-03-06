package menjacnica.sistemskeOperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOUcitajIzFajla {
	
	public static void ucitajIzFajla(String putanja, LinkedList<Valuta> kursnaLista) {
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(putanja)));
			
			kursnaLista = (LinkedList<Valuta>) (in.readObject());
			
			in.close();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
