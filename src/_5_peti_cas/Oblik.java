package _5_peti_cas;

abstract class Oblik implements TrecaMetodaOblika{
	
	private double stranicaA;
	private double stranicaB;
	
	
	public Oblik(double stranicaA, double stranicaB) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	
	abstract double obim();
	
	public double povrsina() {
		return this.stranicaA * this.stranicaB;
	}
	
	
	public double getStranicaA() {
		return stranicaA;
	}
	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}
	public double getStranicaB() {
		return stranicaB;
	}
	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}
	
	

}
