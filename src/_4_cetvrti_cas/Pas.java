package _4_cetvrti_cas;

public class Pas extends Zivotinje {
	
	private  String imePsa;
	private String rasa;

	public Pas(int brojNogu, String imePsa, String rasa) {
		super(brojNogu);
		this.imePsa = imePsa;
		this.rasa = rasa;
	}
	
	public void daLiJeGladan(int broj) {
		if(broj==1) {
			System.out.println(imePsa + " je gladan");
		} else if (broj==2) {
			System.out.println(imePsa + " nije gladan");
		} else {
			System.out.println("Ne znamo da li je " + imePsa +" gladan");
		}
	}
	

	
	public void daLiJeGladan(String pitanje) {
		
		if(pitanje.equals("y")) {
			System.out.println(imePsa + " je gladan");
		} else if (pitanje.equals("n")) {
			System.out.println(imePsa + " nije gladan");
		} else {
			System.out.println("Ne znamo da li je " + imePsa +" gladan");
		}
	}
	


	@Override
	public void krik() {
		System.out.println("Vau vau");
	}


	public String getImePsa() {
		return imePsa;
	}

	public void setImePsa(String imePsa) {
		this.imePsa = imePsa;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	@Override
	public String toString() {
		return "Pas: imePsa " + imePsa + ", rasa: " + rasa;
	}
	
	

}
