package _10_deseti_cas_kolekcije;

public class Gradovi implements Comparable<Gradovi> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gradovi(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public int compareTo(Gradovi drugiGrad) {
		if (name.length() > drugiGrad.getName().length())
			return -1;
		else if (name.length() < drugiGrad.getName().length())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
