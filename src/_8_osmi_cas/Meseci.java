package _8_osmi_cas;

public enum Meseci {
	Januar("Zima"), Februar("Zima"), Mart("Prolece"), April("Prolece"), Maj("Prolece"), Jun("Leto"), 
	Jul("Leto"), Avgust("Leto"), Septembar("Jesen"), Oktobar("Jesen"), Novembar("Jesen"), Decembar("Zima");
	
	public String godisnjeDoba;

	private Meseci(String godisnjeDoba) {
		this.godisnjeDoba = godisnjeDoba;
	}
	
	

}
