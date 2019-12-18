package _7_sedmi_cas;

public class MojIzuzetak extends Exception{
	
	private String podatak;
	
	public MojIzuzetak(String error) {
		super();
		this.podatak = error;
	}

	@Override
	public String toString() {
		return "MojIzuzetak: " + podatak;
	}
	

}