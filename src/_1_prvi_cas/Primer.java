package _1_prvi_cas;

public class Primer {

	public static void main(String[] args) {
		
		
		//Deklarisanje promenljive
		String deklaracija; 			//Ovoj promenljivoj nismo dali nikakvu vrednost, vec smo je samo definisali da je tipa String i da se zove deklaracija
		
		
		//Inicijalizacija promenljive
		deklaracija = "Inicijalizovana vrednost"; 		//Ovoj promenljivoj dali smo vrednosti u navodnicima		
		
		//Tipovi podataka
		
		//Celobrojne vrednosti
		
		byte bajt = (byte) -128;  		//8 bit  	Od -128 do 127
		short sort = 15000;				//16bit		Od -32.768 do 32.767
		int broj = 2355566;				//32bit		.....
		long velikiBroj = 323333344444L; //64bit	Na kraju long vrednosti pisemo slovo L
		
		//Brojevi sa decimalama
		float jednostrukaTacnost = 456.6F; //32bit	Na kraju float vrednosti pisemo slovo F
		double dvostrukaTacnost = 543.32D;  //64bit Na kraju double vrednosti pisemo slovo D
		
		//Znakovi
		
		char karakter = '%';
		String tekst = "Ovo je tekst u promenljivoj tipa string";
		
		//Logicka vrednosti
		boolean bool = true;				//Ova promenljiva moze biti samo true ili false
		
		
		// Operatori u Javi			
		
		int a = 12;
		int c = 12;
		int b = a + 3;
		
		if(a>b) {
			System.out.println("a je vece od b");
		} 

		if(a == b) {
			System.out.println("a je jednako b");
		}
		if(a<b) {
			System.out.println("a je manje od b");
		}
		
		
		//Inkrementacija
		
		int inkremetiraniBroj = 5;
		System.out.print("Vrednost broja pre inkrementacije je: ");
		System.out.println(inkremetiraniBroj);
		inkremetiraniBroj++;
		System.out.print("Vrednost broja posle inkrementacije je: ");
		System.out.println(inkremetiraniBroj);
		
		//Dekrementacija
		
		int dekrementiraniBroj = 5;
		dekrementiraniBroj--;
		
		
		//Kastovanje - konverzija vrednosti
		
		//Od manjih ka vecim tipovima dolazi do automatskog kastovanja (ne mora se eksplicitno navoditi)
		
		int noviBroj = 32770;
		long noviLong = noviBroj;
		
		System.out.println(noviLong);
		
		
		//Od vecih tipova ka manjim moramo eksplicitno navesti u koji tip podatka kastujemo
		
		short noviShort = (short) noviLong;
		
		System.out.println(noviShort);
		
		
		int noviInteger = 15;
		float noviFloat = noviInteger;
		double noviDouble = noviInteger;
		
		System.out.println(noviFloat);
		System.out.println(noviDouble);
		
		
		double noviDoubleZaKastovanje = 12.47;
		int noviIntOdDouble = (int) noviDoubleZaKastovanje;
		
		System.out.println(noviIntOdDouble);
		
		
		//Nizovi - Array
		
		int[] dani_u_mesecu = {1, 2, 3};
		System.out.println(dani_u_mesecu[0]);
		
		String[] meseci = {"januar","februar","mart", "april"};
		System.out.println("--------------------------------------------");
		System.out.println(meseci[2]);
		
		System.out.println("--------------------------------------------");
		System.out.println("Duzina niza meseci je " + meseci.length);
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<meseci.length; i++) {
			System.out.println(meseci[i]);
		}

		System.out.println("--------------------------------------------");
		for(int x=meseci.length-1; x>=0; x--) {
			System.out.println(meseci[x]);
		}
				
		
		String[] dani = {"ponedeljak", "utorak", "sreda"};
		
		System.out.println("--------------------------------------------");
		for (String jedanDan : dani) {
			System.out.println(jedanDan);
		}
		
		
		String[] godisnjaDoba = new String[4];			//Deklarisan je array tipa string sa duzinom od 4 elementa
		godisnjaDoba[0] = "prolece";					//Inicijalizovan je prvi element u array-u godisnja doba
		godisnjaDoba[1] = "leto";
		godisnjaDoba[2] = "jesen";
		godisnjaDoba[3] = "novo godisnje doba";
		
		System.out.println("--------------------------------------------");
		System.out.println(godisnjaDoba[3]);			//Promenili smo vrednost elementa sa indeksom [3]
		godisnjaDoba[3] = "zima";
		
		System.out.println("--------------------------------------------");
		System.out.println(godisnjaDoba[3]);
		
		System.out.println("--------------------------------------------");
		
		String[] grckiAlfabet = {"alfa","beta","gama","delta"};
		for (String abeceda : grckiAlfabet){
			System.out.println(abeceda);
		}
		
		int varijabla = grckiAlfabet.length-1;   // Varijabla je 3		//Izvucena je varijabla koja ce se upotrebiti u for petlji da bi bila vidljiva u ostalom delu koda van bloka for petlje
		
		System.out.println("--------------------------------------------");
		for( ; varijabla>=2; ) {							//U prvoj iteraciji varijabla je 3		- U drugoj varijabla je 2  //U trecoj iteraciji uslov nije zadovoljen (1 nije vece ili jednako 2 i izlazi iz petlje)
			System.out.println(grckiAlfabet[varijabla]);
			varijabla--; 									//Varijabla se smanjila za jedan (vrednost je 2)  	- Vrednost se smanjila za 1 (vrendost je 1)
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Vrednost varijable nakon izvrsene for petlje unazad je: " + varijabla);
		
		
		System.out.println("--------------------------------------------");	
			
			

		
		}
		
	

}













