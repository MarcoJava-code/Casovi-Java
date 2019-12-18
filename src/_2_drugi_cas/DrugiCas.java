package _2_drugi_cas;

public class DrugiCas {

	public static void main(String[] args) {
		
		// Visedimenzionalni nizovi
		
		String[] obicanNiz = {"januar", "februar", "mart"};
		
		String[][] dvodimenzionalniNiz = { {"januar", "februar", "mart"}, {"april"}, {"maj", "jun"}};
		
		System.out.println(dvodimenzionalniNiz[0][1]);
		
		System.out.println("Duzina ovog niza je: " + dvodimenzionalniNiz.length);
		
		System.out.println("Duzina prvog elementa dvodimenzionalnog niza je: " + dvodimenzionalniNiz[0].length);
		
		
		System.out.println("--------------------------------------------");

		
		for (int i = 0; i < dvodimenzionalniNiz.length; i++) {
			
			//Prva iteracija
			// i=0 i ulazi u ugnjezdenu petlju
			// kad j ne ispuni uslov program se vraca  u prvu petlju
			// i=1
			
			for (int j = 0; j < dvodimenzionalniNiz[i].length; j++) {
				
				// i=0 , j=0
				// i=0, j=1
				// i=0, j=2
				
				//Kada i postane 1 
				// j=0 
				// kad j ne ispuni uslov program se vraca  u prvu petlju
				// i=1   ................
				
				System.out.println(dvodimenzionalniNiz[i][j]);
			}
		}
		
		
		System.out.println("--------------------------------------------");
		System.out.println("KAKO RADI NESTED FOR LOOP");
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print("Vrednost i (prve petlje) je: " + i + "   ");
				System.out.println("Vrednost j (druge petlje) je: " + j);
			}
		}
		
		// Dva nacina pravljenja visedimenzionalnih nizova
		
		System.out.println("--------------------------------------------");
		
		String[][] noviNiz = new String[2][1];
		noviNiz[0][0] = "prvi clan u prvom elementu";
		noviNiz[1][0] = "prvi clan u drugom elementu";
		
		
		String[][] josJedanNiz = { {"prvi clan"}, {"drugi clan"}};

		
		/* ARITMETICKI OPERATORI
		
		+, -, / i *
		=
		%
		++, +=, --, -=, /=, *=, %=
		
		 */

		System.out.println("--------------------------------------------");
		int a = 5;
		a += 1;
		System.out.println(a);
		
		String tekst = "Ovo je tekst";
		tekst += ", a ovo je dodatak";
		
		System.out.println(tekst);
		
		int b= 2;
		int c = b++;  			//Vrednost c nece biti uvecana za 1, vec ce b naknadno biti povecana
		// b=b+1
		
		int d = 2;
		// d=d+1;
		int e = ++d;  			// Vrednost e bice uvecana za 1, kao i vrednost d
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Vrednost b je: " + b + ", a vrednost c je: " + c);
		System.out.println("Vrednost d je: " + d + ", a vrednost e je: " + e);
		
		
		/* OPERATORI ZA POREDJENJE

		==. !=, >, <, >=, <=
		 
		 */
		
		/* OPERATORI ZA LOGICKE VREDNOSTI

		==. !=, &&, ||
		 
		 */
		
		System.out.println("--------------------------------------------");
		
		int prviBroj = 2;
		int drugiBroj = 2;
		
		if(prviBroj<5 && drugiBroj<5) {
			System.out.println("Oba broja moraju da zadovolje uslov");
		}
		
		if(prviBroj<3 || drugiBroj<3) {
			System.out.println("Jedan od ova dva broja mora da zadovolji uslov");
		}
		
		
		System.out.println("--------------------------------------------");
		
		
		//NAREDBE
		
		//IF ELSE PETLJA
		
		String naslov = "Naslov";
		String drugiNaslov = "Naslov";
		
		if(naslov.equals(drugiNaslov)) {
			System.out.println("Ova dva stringa imaju iste vrednosti.");
		} else if (naslov.equals("Naslov")) {
			System.out.println("Ovaj string ima vrednost Naslov.");
		} else {
			System.out.println("Vrednost nije navedena datim primerima");
		}
		
		
		System.out.println("--------------------------------------------");
		
		//SWITCH PETLJA
		
		String klub = "Crvena Zvezda";
		
		switch (klub) {
		case "Partizan":
			System.out.println("Ovaj klub se zove Partizan");
			break;						// Ukoliko nema rezervisane reci break, program ce da odstampa i ono sto je ispod navedenog case
		case "Crvena Zvezda":
			System.out.println("Ovaj klub se zove Crvena Zvezda");
			break;
		case "Vojvodina":
			System.out.println("Ovaj klub se zove Vojvodina");
			break;
		default:
			System.out.println("Ovaj klub nije iz Srbije.");
			break;
		}
		
		
		System.out.println("--------------------------------------------");
		
		int mesec = 4;
		
		switch (mesec) {
		case 1:
		case 2:
		case 3:
			System.out.println("Prolecni mesec");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Letnji mesec");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Jesenji mesec");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Zimski mesec");
			break;
		default:
			System.out.println("Godina nema " + mesec + " meseci");
			break;
		}

		String teniser = "Novak";
		switch (teniser) {
		case "Novak":
			System.out.println("Djokovic");
			break;
		case "Rafa":
			System.out.println("Nadal");
			break;
		default:
			System.out.println("Nijedan");
			break;
		}
		
		
		//WHILE PETLJA
		
		System.out.println("---------------------------------------------");
		int uslovniBroj = 2;
		
		while (uslovniBroj>0) {
			System.out.println(uslovniBroj);
			uslovniBroj--;
		}
		
		System.out.println("---------------------------------------------");
		
		
		//DO WHILE PETLJA
		// do while petlja ce da izvrsi program prvi put bez obzira na to da li je ispunjen uslov
		do {
			System.out.println(uslovniBroj);
			uslovniBroj--;	
			
		} while (uslovniBroj>5);
		
		//FOR PETLJA
		for (int i=0;i<6;i++) {
			
			if(i==3) 
				break;
			
			System.out.println("Broj: " + i);
		}
		
		
		System.out.println("---------------------------------------------");
		
		for (int i=0;i<6;i++) {
			
			if(i==3) 
				continue;
			
			System.out.println("Broj: " + i);
		}
	}
	
	
	

		
}
