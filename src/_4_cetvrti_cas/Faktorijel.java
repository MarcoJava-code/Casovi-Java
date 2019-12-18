package _4_cetvrti_cas;

public class Faktorijel {
	
	public static int prvaVelicina = 0;
	public int drugaVelicina = 0;
	
	//Pravimo rekurzivnu metodu (metoda koja u svom telu poziva samu sebe)
	
	public int faktorijel (int broj) {
		
		int rezultat = 0;
		
		if(broj==1) 
			return 1;			// ukoliko je nakon if petlje samo jedna naredba, ona ne mora da se stavi u blok if petlje {}
		
		rezultat = faktorijel(broj-1)*broj; // ukoliko zadati broj nema vrednost 1, pozivamo istu metodu u samom telu metode
		return rezultat;
	}
	
	
	public static void metodaStaticFaktorijel () {
		System.out.println("Ovo je staticka metoda u Klasi Faktorijel. Ona moze da se pozove sama samo pozivom izradjene klase (Faktorijel), tj. ne moramo da kreiramo instancu klase Faktorijel (Faktorijel faact = new Faactorijel())");
	}

}
