package _3_treci_cas;

public class MainZaOblike {

	public static void main(String[] args) {
		
		SamostalniTrougao st1 = new SamostalniTrougao(1.5, 2.1, 3.2, 1.2);
		st1.setStranicaA(0.2);
		double obimST1 = st1.obim();
		double povrsinaST1 = st1.povrsina();
		
		SamostalniTrougao t2 = new SamostalniTrougao (2.5, 1.5, 1.3, 2.1);
		double obimT2 = t2.obim();
		double povrsinaT2 = t2.povrsina();
		
		SamostalniTrougao t3 = new SamostalniTrougao();
		t3.setStranicaA(1.0);
		t3.setStranicaB(1.2);
		t3.setStranicaC(1.3);
		t3.setVisina(1.5);
		
		double obimT3 = t3.obim();
		
		double povrsinaT3 = t3.povrsina();
		
		System.out.println("Obim trougla t1 je: ");
		System.out.println(obimST1);
		System.out.println(obimT2);
		System.out.println(obimT3);
		
		System.out.println("Povrsina trougla t1 je: ");
		System.out.println(povrsinaST1);
		System.out.println(povrsinaT2);
		System.out.println(povrsinaT3);
		
//		System.out.println(t1.getStranicaA());
		
		System.out.println("-----------------------");
		
		//Kreiramo objekat(instancu) kvadrata
		
		Kvadrat k1 = new Kvadrat(2.0, 2.5);
		double obimK1 = k1.obim();
		double povrsinaK1 = k1.povrsina();
		
		System.out.println(obimK1);
		System.out.println(povrsinaK1);
		
		System.out.println("-----------------------------------------");
		Trougao t1 = new Trougao(1.5, 2.1, 3.2, 1.2);
		t1.setStranicaA(0.2);
		double obimT1 = t1.obim();
		double povrsinaT1 = t1.povrsina();
		
		System.out.println("Obim trougla t1 je: ");
		System.out.println(obimT1);
		
		System.out.println("Povrsina trougla t1 je: ");
		System.out.println(povrsinaT1);
		

	}

}
