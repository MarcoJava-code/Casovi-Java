package _10_deseti_cas_kolekcije;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DrugiMain {

	public static void main(String[] args) {
		Gradovi kragujevac = new Gradovi("Kragujevac");
		Gradovi valjevo = new Gradovi("Valjevo");
		Gradovi kraljevo = new Gradovi("Kraljevo");
		Gradovi nis = new Gradovi("Nis");
		Gradovi noviSad = new Gradovi("Novi Sad");
		Gradovi beograd = new Gradovi("Beograd");
		
		
		List<Gradovi> listaGradova = new ArrayList<Gradovi>();
		
		listaGradova.add(kragujevac);
		listaGradova.add(valjevo);
		listaGradova.add(kraljevo);
		listaGradova.add(nis);
		listaGradova.add(noviSad);
		listaGradova.add(beograd);
		listaGradova.add(kragujevac);
		
		listaGradova.sort(null);
		
//		stampa(listaGradova);
		
		listaGradova.remove(kraljevo);
		listaGradova.remove(0);
		
		
		stampa(listaGradova);
		

	}
	
	public static void stampa (List<Gradovi> lista) {
		
		ListIterator<Gradovi> listIterator = lista.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
