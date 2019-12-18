package _8_osmi_cas;

public class MainZaOsmiCas {

	public static void main(String[] args) {
		
//		metodaEnum();
//		
//		metodaMeseci(Meseci.April);
		
		metodaJabuke(Jabuka.GreenApple);
		
		Jabuka jabuka = Jabuka.Ajdared;
		
		String nazivJaubuke = jabuka.opis;
		
		System.out.println(nazivJaubuke);
		
		

	}
	
	
	private static void metodaMeseci(Meseci meseci) {
		switch(meseci) {
		case April:
			System.out.println(Meseci.April);
			break;
	///.............
		}
	}
	
	public static void metodaJabuke (Jabuka jabuka) {
		switch(jabuka) {
		case Ajdared:
			System.out.println(Jabuka.Ajdared.redniBroj);
			break;
		case Crvena:
			System.out.println(Jabuka.Crvena);
			break;
		case GreenApple:
			System.out.println(Jabuka.GreenApple.opis);
			break;
		case ZlatniDelises:
			System.out.println(Jabuka.ZlatniDelises);
			break;
		default:
			break;
		
		}
	}


	final static String PONEDELJAK = "PONEDELJAK";
	final static String UTORAK = "UTORAK";
	final static String SREDA = "SREDA";
	final static String CETVRTAK = "CETVRTAK";
	final static String PETAK = "PETAK";
	final static String SUBOTA = "SUBOTA";
	final static String NEDELJA = "NEDELJA";
	
	String[] nizDana = {PONEDELJAK, UTORAK, SREDA, CETVRTAK};

	
	

	public static void metodaEnum () {
		
		DaniUNedelji dani = DaniUNedelji.Cetvrtak;

		switch(dani) {
		case Cetvrtak:
			System.out.println(DaniUNedelji.Cetvrtak);
			break;
		case Nedelja:
			break;
		case Petak:
			break;
		case Ponedeljak:
			break;
		case Sreda:
			break;
		case Subota:
			break;
		case Utorak:
			break;
		default:
			break;
		
		}
	}

}
