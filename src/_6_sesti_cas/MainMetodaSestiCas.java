package _6_sesti_cas;


public class MainMetodaSestiCas {
	
	public static void main(String[] args) {
		Automobil skodaFabia = new Automobil("Skoda", "Fabia", "BG-011-CP");
		Automobil skodaFabia1 = new Automobil("Skoda", "Fabia", "BG-022-CK");
		Automobil skodaFabia2 = new Automobil("Skoda", "Fabia", "BG-025-CK");
		Vozac peraPeric = new Vozac("Pera Peric", "321345");
		Vozac markoMarkovic = new Vozac("Marko Markovic", "456321");
		Vozac markoJankovic = new Vozac("Marko Jankovic", "432675");
		TaksiUdruzenje naxi = new TaksiUdruzenje("Naxi");
		
		TaksiKompanija tk = new TaksiKompanija(naxi, skodaFabia, peraPeric);
		TaksiKompanija tk1 = new TaksiKompanija(naxi, skodaFabia1, markoMarkovic);
		TaksiKompanija tk2 = new TaksiKompanija(naxi, skodaFabia1, markoMarkovic);
		
//		System.out.println(tk);
//		System.out.println(tk1);
		
		TaksiKompanija [] nizTK = {tk, tk1, tk2, new TaksiKompanija(new TaksiUdruzenje("Maxi"), skodaFabia, new Vozac("Janko Petrovic", "453899"))};
		
		
		

		
		tk.getVozac().setImeIPrezime("Petar Peric");
		tk1.getAutomobil().setTipAutomobila("octavia");
		System.out.println(tk1);
		
		for (TaksiKompanija taksiKompanija : nizTK) {
			System.out.println(taksiKompanija.getVozac().getImeIPrezime());
		}
		
	}
	

	
	
	
}
