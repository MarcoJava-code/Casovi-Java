package _11_jedanaesti_cas;

public class Menadzer extends Radnik{
	
	private String pozicija;

	public Menadzer(String imeIPrezime, String zanimanje, double plata, String brojRacuna, String pozicija) {
		super(imeIPrezime, zanimanje, plata, brojRacuna);
		this.pozicija = pozicija;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	@Override
	public String toString() {
		return "Menadzer [pozicija=" + pozicija + ", imeIPrezime=" + imeIPrezime + ", zanimanje=" + zanimanje
				+ ", plata=" + plata + ", brojRacuna=" + brojRacuna + "]";
	}


	

}
