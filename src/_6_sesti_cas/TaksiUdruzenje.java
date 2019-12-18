package _6_sesti_cas;

public class TaksiUdruzenje {
	
	private String imeUdruzenja;
	
	
	
	public TaksiUdruzenje(String imeUdruzenja) {
		super();
		this.imeUdruzenja = imeUdruzenja;
	}
	
	
	public String getImeUdruzenja() {
		return imeUdruzenja;
	}
	public void setImeUdruzenja(String imeUdruzenja) {
		this.imeUdruzenja = imeUdruzenja;
	}

	@Override
	public String toString() {
		return "TaksiUdruzenje: " + imeUdruzenja;
	}
	
	
	
	

}
