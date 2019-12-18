package _3_treci_cas;

public class Trougao extends Oblik{
	
	private double stranicaC;
	private double visina;

	public Trougao(double stranicaA, double stranicaB, double stranicaC, double visina) {
		super(stranicaA, stranicaB);
		this.stranicaC = stranicaC;
		this.visina = visina;
	}
	
	@Override														// Override method 
	public double obim() {											// Kada metoda sa istim nazivom postoji u nadklasi (superklasi)
		return getStranicaA() + getStranicaB()+ this.stranicaC;
	}
	
	@Override
	public double povrsina() {
		double p = (getStranicaA()* this.visina) /2;
		return p;
	}

	public double getStranicaC() {
		return stranicaC;
	}

	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}
	
	JednakostranicniTrougao jt = new JednakostranicniTrougao();			// Instanca interne klase
	
	private class JednakostranicniTrougao {								//Interna klasa koja moze da se pozove samo unutar napravljene klase
		private double ugao;
	}
	
	

}
