package _5_peti_cas_drugi_deo;

public class Izuzeci {

	static int[] niz = { 7, 18, 15 };

	public static void main(String[] args) {
		
		
		
		try {
			System.out.println(niz[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Nema toliko karaktera");
		}finally {
			System.out.println("Ovaj kod...");
		}

	}

}
