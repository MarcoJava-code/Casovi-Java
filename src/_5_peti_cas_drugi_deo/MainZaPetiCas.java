package _5_peti_cas_drugi_deo;

import java.math.BigDecimal;

public class MainZaPetiCas {

	public static void main(String[] args) {
	     int a = 50;
	     int b = 0;
	     
	     String broj = "obc";
	     
	     try {
		     BigDecimal drugiBroj = new BigDecimal(broj);
	    	 double c = a/b;
		 	    System.out.println(c);
		 	   System.out.println(drugiBroj);
	     }
		 

		catch (NumberFormatException nfe) {
		System.out.println("BigDecimal mora da dobije vrednost broja.");
		} catch (ArithmeticException ae) {
			System.out.println("Deljenik ne moze biti broj 0!");
		} catch (Exception e) {
			System.out.println("Postoji greska u kodu.");
		} finally {
			System.out.println("Ovaj kod je izvrsen nakon greske");
		}

	}

}
