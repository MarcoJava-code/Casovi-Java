package _5_peti_cas;

public class MainPetiCas{
	
	public static void main(String[] args) {
//			DedaKlasa dk = new DedaKlasa();
		SinKlasa sk = new SinKlasa();
		
		System.out.println(sk.name);
		
		SinKlasa sinKlasa = sk;
		
		System.out.println(new SinKlasa().name);
		
//		System.out.println();
	}
	
	
}
