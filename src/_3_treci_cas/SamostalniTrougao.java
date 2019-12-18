package _3_treci_cas;

public class SamostalniTrougao {
	
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;
	private double visina;
	
	
	public SamostalniTrougao() {
		super();
	}

	public SamostalniTrougao(double stranicaA, double stranicaB, double stranicaC, double visina) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;
		this.visina = visina;
	}
	
	public double obim() {
		return this.stranicaA + this.stranicaB + this.stranicaC;
	}
	
	public double obim(double stranicaA) {								//Overload method
		return stranicaA + this.stranicaB + this.stranicaC;				//Metoda koja se zove isto kao i postojeca u klasi, ali se razlikuje u broju ili vrsti parametara
	}
	
	public double obim(int stranicaA) {									//Overload method
		return stranicaA + this.stranicaB + this.stranicaC;				//Metoda koja se zove isto kao i postojeca u klasi, ali se razlikuje u broju ili vrsti parametara
	}
	
	public double povrsina() {
		double p = (this.stranicaA * this.visina) /2;
		return p;
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
	
	
	
	

}
