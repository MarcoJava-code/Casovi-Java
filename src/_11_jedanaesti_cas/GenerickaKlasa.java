package _11_jedanaesti_cas;

import java.util.List;

public class GenerickaKlasa<T, S, U, V> {
	
	private T type;
	private S[] nisS;
	private List<U> listaU;

	public GenerickaKlasa(T type) {
		super();
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "GenerickaKlasa [type=" + type + "]";
	}
	
	

}
