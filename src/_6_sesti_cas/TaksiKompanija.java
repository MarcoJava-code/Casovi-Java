package _6_sesti_cas;

public class TaksiKompanija {
	
	private TaksiUdruzenje taksiUdruzenje;
	private Automobil automobil;
	private Vozac vozac;
	
	
	
	
	public TaksiKompanija(TaksiUdruzenje taksiUdruzenje, Automobil automobil, Vozac vozac) {
		super();
		this.taksiUdruzenje = taksiUdruzenje;
		this.automobil = automobil;
		this.vozac = vozac;
	}
	
	
	public TaksiUdruzenje getTaksiUdruzenje() {
		return taksiUdruzenje;
	}
	public void setTaksiUdruzenje(TaksiUdruzenje taksiUdruzenje) {
		this.taksiUdruzenje = taksiUdruzenje;
	}
	public Automobil getAutomobil() {
		return automobil;
	}
	public void setAutomobil(Automobil automobil) {
		this.automobil = automobil;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}


	@Override
	public String toString() {
		return "Naziv taksi kompanije" + taksiUdruzenje + ", automobil: " + automobil + ", Vozac: " + vozac;
	}
	
	
	

}
