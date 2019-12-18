package _12_dvanaesti_cas;

public class Fudbaler {
	
	private String ime;
	private String prezime;
	private String pozicija;
	private Integer godine;
	
	
	
	public Fudbaler(String ime, String prezime, String pozicija, Integer godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.godine = godine;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public Integer getGodine() {
		return godine;
	}
	public void setGodine(Integer godine) {
		this.godine = godine;
	}

	@Override
	public String toString() {
		return "Fudbaler [ime= " + ime + ", prezime= " + prezime + ", pozicija= " + pozicija + ", godine= " + godine + "]";
	}
	
	
	
}
