package _12_dvanaesti_cas;

import _3_treci_cas.Kvadrat;

interface InterfejsLambda {
	public void prikazi();
}


interface NoviInterface {
	public void stampaj(String ime, String prezime);
}

interface KvadartBroja {
	public int stepenuj(int a);
}

public class Lambda {

	public static void main(String[] args) {
		
		
//		InterfejsLambda  iLambda= new InterfejsLambda() {
//			@Override
//			public void prikazi() {
//				System.out.println("Prikazana vrednosti iz lambde");
//				
//			}
//			
//		};
//		iLambda.prikazi();
		
		InterfejsLambda drugaLambda = ()->{
			int x = 35;
			System.out.println("Ovo je vrednost koja treba da se prikaze");
			System.out.println(x);
		};
		drugaLambda.prikazi();
		
		
		NoviInterface noviInterface = (String i, String p)->System.out.println("Zdravo " + i + " " + p);
		noviInterface.stampaj("Marko", "Vasic");
		
		KvadartBroja kvadrat = (int broj)->broj*broj;
		
		int stepen = kvadrat.stepenuj(5);
		System.out.println(stepen);
	}

}
