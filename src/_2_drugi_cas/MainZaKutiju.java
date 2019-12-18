package _2_drugi_cas;

import _3_treci_cas.MainClassTreciCas;

public class MainZaKutiju {

	public static void main(String[] args) {

		Kutija prvaKutija = new Kutija(2.0, 3.0, 1.5);
//		prvaKutija.setDubina(1.5);
//		prvaKutija.setSirina(2.0);
//		prvaKutija.setVisina(3.0);
		
//		prvaKutija.getDubina();
		
		Kutija drugaKutija = new Kutija();
		
		System.out.println(prvaKutija.getDubina());
		
		double noviDouble = prvaKutija.getDubina();
		
		System.out.println(noviDouble);
		
		System.out.println("-------------------------------------");
		System.out.println("Zapremina prve Kutije je: ");
		double rezultatZapremine = prvaKutija.zapremina(prvaKutija.getDubina(), prvaKutija.getSirina(), prvaKutija.getVisina());
		
		System.out.println(rezultatZapremine);
		
		
		MainClassTreciCas ms = new MainClassTreciCas();
		

		int rezultat = ms.sabiranje(5, 7);
		System.out.println(rezultat);
		
	}

}
