package _4_cetvrti_cas;

public class Zivotinje {
	
	private int brojNogu;
	
	
	public Zivotinje(int brojNogu) {
		super();
		this.brojNogu = brojNogu;
	}

	public void krik() {
		System.out.println("Roar");
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}
	
	

}
