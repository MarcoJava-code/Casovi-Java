package _5_peti_cas;

public class Kvadrat extends Oblik {

	public Kvadrat(double stranicaA, double stranicaB) {
		super(stranicaA, stranicaB);
	}

	@Override
	double obim() {
		return (super.getStranicaA() + super.getStranicaB()*2);
	}

	@Override
	public double povrsinaKupe() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
