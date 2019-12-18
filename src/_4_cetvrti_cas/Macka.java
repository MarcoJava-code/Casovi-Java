package _4_cetvrti_cas;

public class Macka extends Zivotinje{
	
	private String imeMacke;
	private String rasa;
	
	
	
	public Macka(int brojNogu, String imeMacke, String rasa) {
		super(brojNogu);
		this.imeMacke = imeMacke;
		this.rasa = rasa;
	}
	
	


	@Override
	public void krik() {
		System.out.println("Mijau");
	}



	public void daLiJeZedna(int broj) {
		if(broj==1) {
			System.out.println(imeMacke + " je zedna");
			super.krik();
		} else if (broj==2) {
			System.out.println(imeMacke + " nije zedna");
			krik();
		} else {
			System.out.println("Ne znamo da li je " + imeMacke +" zedna");
		}
	}


	public String getImeMacke() {
		return imeMacke;
	}

	public void setImeMacke(String imeMacke) {
		this.imeMacke = imeMacke;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	@Override
	public String toString() {
		return "Macka: imeMacke: " + imeMacke + ", rasa: " + rasa;
	}


}
