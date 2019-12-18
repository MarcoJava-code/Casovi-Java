package _8_osmi_cas;

public enum Jabuka {
	Crvena("Crvena jabuka", 1), 
	GreenApple("Green Apple", 2), 
	Ajdared("Ajdared", 3), 
	ZlatniDelises("Zlatni delises", 4);
	
	public String opis;
	public String siriOpis;
	int redniBroj;
	

	
	private Jabuka(String opis, int redniBroj) {
		this.opis = opis;
		this.redniBroj = redniBroj;
	}



	public String getDescription() {
		return "Ova sorta je dobijena od najboljih zelenih jabuka.";
	}
	
}
