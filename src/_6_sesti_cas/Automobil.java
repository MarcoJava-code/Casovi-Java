package _6_sesti_cas;

public class Automobil {
	
	public Automobil(String markaAutomobila, String tipAutomobila, String registarskaOznaka) {
		super();
		this.markaAutomobila = markaAutomobila;
		this.tipAutomobila = tipAutomobila;
		this.registarskaOznaka = registarskaOznaka;
//		this.motor = motor;
	}

	private String markaAutomobila;
	private String tipAutomobila;
	private String registarskaOznaka;
//	private Motor motor;
	
	
	
	public class Motor {
		
		public Motor(String snagaMotora, String vrstaGoriva, String kubikaza) {
			super();
			this.snagaMotora = snagaMotora;
			this.vrstaGoriva = vrstaGoriva;
			this.kubikaza = kubikaza;
		}
		private String snagaMotora;
		private String vrstaGoriva;
		private String kubikaza;
		public String getSnagaMotora() {
			return snagaMotora;
		}
		public void setSnagaMotora(String snagaMotora) {
			this.snagaMotora = snagaMotora;
		}
		public String getVrstaGoriva() {
			return vrstaGoriva;
		}
		public void setVrstaGoriva(String vrstaGoriva) {
			this.vrstaGoriva = vrstaGoriva;
		}
		public String getKubikaza() {
			return kubikaza;
		}
		public void setKubikaza(String kubikaza) {
			this.kubikaza = kubikaza;
		}
		
		
	}

	public String getMarkaAutomobila() {
		return markaAutomobila;
	}

	public void setMarkaAutomobila(String markaAutomobila) {
		this.markaAutomobila = markaAutomobila;
	}

	public String getTipAutomobila() {
		return tipAutomobila;
	}

	public void setTipAutomobila(String tipAutomobila) {
		this.tipAutomobila = tipAutomobila;
	}

	public String getRegistarskaOznaka() {
		return registarskaOznaka;
	}

	public void setRegistarskaOznaka(String registarskaOznaka) {
		this.registarskaOznaka = registarskaOznaka;
	}

	@Override
	public String toString() {
		return "Marka automobila: " + markaAutomobila + ", Tip automobila: " + tipAutomobila
				+ ", Registarska oznaka" + registarskaOznaka;
	}
	
	
	

}
