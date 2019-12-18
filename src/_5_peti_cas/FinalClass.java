package _5_peti_cas;

public final class FinalClass {						// final klasa ne moze da se nasledjuje
	
	

	private final String PROMENLJIVA = "Ovo je konstanta";		//final field(polje) je konstanta u javi i ne moze da dobije drugu vrednost
	
	private FinalClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	private final double PI = 3.14;
	
	public final void metoda () {			 // final metode ne mogu da se override-ju						
		System.out.println("Ovo je final metoda");
	}
	
}
