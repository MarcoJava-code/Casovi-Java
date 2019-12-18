package _6_sesti_cas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainZaVezbu {

	public static void main(String[] args) {
		
		pozdrav();
		broj();
		
		System.out.println("Ovaj je program je dosao do kraja bez kresovanja");
		
	}
	
	public static void pozdrav () {
		
		System.out.println("Unesi svoje ime: ");
		
		Scanner sc = new Scanner(System.in);
		
		String ime = sc.nextLine();
		
		System.out.println("Zdravo " + ime);
		
	}
	
	public static void broj () {
		
		System.out.println("Unesi jedan broj: ");
		
		Scanner sc = new Scanner(System.in);

		
		try {
			double broj = sc.nextDouble();
			System.out.println("Ukucao si broj " + broj);
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
	
		}
		
	}
	
	
	public static void kolikoImaSlova (char karakter, String rec) {
//		a   Anagram
//		
//		u reci pesma ima 21 slovo 
//		u reci anagram ima 32 slova
	}
	
	
	
}
