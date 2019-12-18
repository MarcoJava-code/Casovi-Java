package _4_cetvrti_cas;

public class MainCetvrtiCas {

	public static void main(String[] args) {
		
//		Pas dingo = new Pas(4, "Dingo", "vucjak");
//		
//		Pas fifi = new Pas(4, "Fifi", "pudlica");
//		
//		dingo.daLiJeGladan("y");
//		
//		dingo.krik();
//		
//		dingo.daLiJeGladan(2);
//		
//		fifi.daLiJeGladan(1);
		
		Macka maca = new Macka(4, "Maca", "persijska macka");
//		
//		maca.daLiJeZedna(1);
//		maca.daLiJeZedna(2);
		
//		String[] niz = {"jedan", "dva", "tri"};
		
//		System.out.println(niz);

		System.out.println(maca);
		
		Pas ker = new Pas(4, "Vule", "domaci");
		System.out.println(ker);
		
		
		
		Faktorijel f = new Faktorijel();
		System.out.println(f.faktorijel(5));
		
		
		Faktorijel.metodaStaticFaktorijel();
		
//		MainCetvrtiCas.provera();
//		provera();
		
		System.out.println("---------------------------------------");
		
		Faktorijel c = new Faktorijel();
		
		int prvaVarijabla = f.drugaVelicina += 5;              // U zavisnosti od kreiranog objekta ova varijabla se vraca na pocetnu vrednost definisanu u klasu
		int drugaVarijabla = Faktorijel.prvaVelicina +=5;		// Staticke promenljive zadrzavaju vrednost u samoj klasi kada se pozovu 
		int trecaVarijabla = Faktorijel.prvaVelicina +=5;	
		
		System.out.println(prvaVarijabla);
		System.out.println(drugaVarijabla);
		System.out.println(trecaVarijabla);
		
//		System.out.println(f.drugaVelicina);
//		System.out.println(Faktorijel.prvaVelicina);
//		
//		c.drugaVelicina += 5;
//		Faktorijel.prvaVelicina +=5;
//		
//		System.out.println(f.drugaVelicina);
//		System.out.println(Faktorijel.prvaVelicina);
	

	}	
	
	public static void provera () {
		System.out.println("Provera");
	}
	

}
