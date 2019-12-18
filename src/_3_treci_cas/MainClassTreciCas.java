package _3_treci_cas;

import _2_drugi_cas.Kutija;

public class MainClassTreciCas {
	
	
	public static void main(String[] args) {
		
		MainClassTreciCas ms = new MainClassTreciCas();   // kreirali smo objekat (instancu) klase MainClassTreciCas da bismo pristupili metodama koje se nalaze unutar ove klase, a nisu static 
		
//		MainClassTreciCas mainClass = new MainClassTreciCas();
//		mainClass.sabiranje(a, b);		 // kada metoda nije static, moramo da kreiramo objekat (instancu) te klase, pa da sa tackom pozovemo napravljenu metudu u klasi.
		
		System.out.println(sabiranje(4, 5));
		System.out.println(sabiranje(12, 11));
		System.out.println(sabiranje(6,2));
		System.out.println("---------------------------------");
		System.out.println(deljenje(5, 3));
		System.out.println(deljenje(2, 6));
		System.out.println("---------------------------------");
		System.out.println(mnozenje(4, 5));
		
		
		System.out.println(ms.oduzimanje(3, 3));  // Pristupili smo metodi oduzimanje pomocu kreiranog objekta ms!
		
		Kutija drugaKutija = new Kutija(2.0, 1.0, 1.0);
		
		System.out.println("---------------------------------");
		System.out.println(sabiranje((int) drugaKutija.getSirina(), (int)drugaKutija.getVisina()));

	}
	
	
	public static int sabiranje (int a, int b) {
		int z;
		z = a + b;	
		
		return z;
		
		// Sve sto dodamo posle return nece biti obradjeno
		
	}
	
	public static double deljenje (int a, int b) {
		return  (double) a / (double) b;
	}
	
	public static int mnozenje (int a, int b) {
		int z = sabiranje(a, b)*10;
		return z;
	}
	
	public int oduzimanje (int a, int b) {
		int z = a - b;
		return z;
	}

	
}
