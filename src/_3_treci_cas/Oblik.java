package _3_treci_cas;

public class Oblik {
	
	private double stranicaA;
	private double stranicaB;
	
	
	public Oblik(double stranicaA, double stranicaB) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	
	public double obim() {
		return (this.stranicaA + this.stranicaB)*2;
	}
	
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
