package _2_drugi_cas;

public class Kutija {
	
	public Kutija() {

	}
	
	
	public Kutija(double sirina, double visina, double dubina) {
		super();
		this.sirina = sirina;
		this.visina = visina;
		this.dubina = dubina;
	}


	private double sirina;
	private double visina;
	private double dubina;
	
	
	public double zapremina (double sirina, double visina, double dubina) {
		return sirina * visina * dubina;
	}


	public double getSirina() {
		return sirina;
	}


	public void setSirina(double sirina) {
		this.sirina = sirina;
	}


	public double getVisina() {
		return visina;
	}


	public void setVisina(double visina) {
		this.visina = visina;
	}


	public double getDubina() {
		return dubina;
	}


	public void setDubina(double dubina) {
		this.dubina = dubina;
	}
	
	

}
