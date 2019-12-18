package _7_sedmi_cas;

import java.io.FileReader;
import java.util.Scanner;

public class Izuzeci {

	public String unosStringa() {
		String rezultat = "";
		try (Scanner sc = new Scanner(System.in);) { // try with resource omogucava automatski poziv metode close()

			String unos = sc.nextLine();
			double unosDouble = sc.nextDouble();
			rezultat = unos;
			String broj = "323";
			Integer brojString = Integer.getInteger(broj);

		} catch (Exception e) {

		} finally {

		}
		return rezultat;
	}
	
	public void racun (int broj) throws MojIzuzetak {
		if (broj>10) {
			throw new MojIzuzetak("Broj je veci od 10, unesite manji broj");
		}
		System.out.println(broj);
	}

}
