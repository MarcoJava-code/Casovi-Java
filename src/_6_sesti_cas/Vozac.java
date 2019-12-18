package _6_sesti_cas;

public class Vozac {
	
	
	
	
	public Vozac(String imeIPrezime, String brojLicence) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.brojLicence = brojLicence;
	}
	
	
	private String imeIPrezime;
	private String brojLicence;
	
	
	
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getBrojLicence() {
		return brojLicence;
	}
	public void setBrojLicence(String brojLicence) {
		this.brojLicence = brojLicence;
	}
	
	
	@Override
	public String toString() {
		return "Ime i Pezime: " + imeIPrezime + ", brojLicence: " + brojLicence;
	}
	
	

}
