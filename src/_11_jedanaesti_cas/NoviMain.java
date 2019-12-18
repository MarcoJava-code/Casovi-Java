package _11_jedanaesti_cas;

public class NoviMain {

	public static void main(String[] args) {
		
		String a = "Ime";
		String b = new String("Ime");
		String c = a;
		
		StringBuilder d = new StringBuilder("Ime");
		StringBuilder e = d;
		StringBuilder f = new StringBuilder("Ime");
		f = e;
		
//		System.out.println(a==b);		//true
//		System.out.println(a==c);		//true
//		System.out.println(b==c);		//true
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());

	}

}
