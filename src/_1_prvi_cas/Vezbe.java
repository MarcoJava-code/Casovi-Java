package _1_prvi_cas;

public class Vezbe {

	public static void main(String[] args) {
		
		
//		Vezbe
		
		int nekiIntBroj = 123456789;
		byte nekiByteBroj = (byte) nekiIntBroj;
		
		
		int primer1 = 3;
		int primer2 = 3;
		int primer3 = primer1 - primer2;
		if (primer1 == primer2) {
			System.out.println("Jednaki primeri.");
		}
		if (primer3 > primer2) {
			System.out.println("Netacni primeri");
		}
		
		int[] godine = {2018,2019,2020,2021,2022};
		System.out.println("Prethodna godina je " + godine[0] + ", a trenutna je " + godine[1]); {
		System.out.println("--------------------------------------------");
		}
		for(int i : godine) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------");
		
		for(int i=godine.length-1;i>2;i--) {
			System.out.println(godine[i]);
		}
		System.out.println("--------------------------------------------");
		
		for(int i=godine.length-4;i>=0;i--) {
			System.out.println(godine[i]);
		}
		System.out.println("--------------------------------------------");
		
		
		for (int i = 0; i < 2; i++) {
			System.out.println(godine[i]);
		}
		
	}
	
}
		
		
		
	
	

