package _7_sedmi_cas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainZaSedmiCas {				
	public static void main(String[] args) {		// drugi nacin za obradu kreiranog izuzetka je da se pored naziva main metode ubaci throws sa imenom tog Izuzetka (Exception)

		// TODO Auto-generated method stub
		String broj = "323bbbbb";
		broj = broj.substring(0, 3);
		Integer brojString = Integer.valueOf(broj);
		
//		System.out.println(brojString);
		
//		try(FileReader fd = new FileReader("text.txt");) {
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Izuzeci izuzeci = new Izuzeci();
		try {
			izuzeci.racun(10);
		} catch (MojIzuzetak e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		
		
		
	}

}
