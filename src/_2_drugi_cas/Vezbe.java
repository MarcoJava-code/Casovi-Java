package _2_drugi_cas;

import sun.security.action.GetBooleanAction;

class Person {
	
	private String ime;
	private String prezime;
	private int age;
	
	
	
	public Person() {
		
		System.out.println("Constructor running!");
	}
	
	boolean provera = true;
	
	
	public Person (String ime) {
		System.out.println("Ovo je konstruktor koji prima jedan parametar tipa string. On se razlikuje od prvog konstruktora");
	}
	
	
	
    public Person(String ime, String prezime, int age) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.age = age;
	}



	public boolean Person2() {
    	
    	return provera;

    
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
    

}

public class Vezbe {

	public static void main(String[] args) {
		
		Person osoba = new Person();
		Person osoba2 = new Person("ime"); 
		System.out.println("Hello world");
		
		Person marko = new Person("Marko", "Vasic", 34);
		Person veljko = new Person ("Veljko", "Potparic", 39);
		
		System.out.println(marko.getIme() + " " + marko.getPrezime() + " ima " + 34);
		System.out.println(veljko.getIme()+ " "  + veljko.getPrezime() + " ima " + 39);
		
	}

}
