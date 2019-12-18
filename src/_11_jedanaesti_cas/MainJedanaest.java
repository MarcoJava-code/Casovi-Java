package _11_jedanaesti_cas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainJedanaest {

	public static void main(String[] args) {
		
		
		List<Radnik> arrayList = new ArrayList<>();
		
		arrayList.add(new Radnik("Marko Vasic", "zidar", 76000.00, "123454323"));
		arrayList.add(new Radnik("Veljko Potparic", "vozac", 54000.00, "4345663343"));
		arrayList.add(new Radnik("Petar Jankovic", "limar", 59000.00, "63434343522"));
		arrayList.add(new Radnik("Davor Manojlovic", "zidar", 63000.00, "54543435554"));
		
		arrayList.sort(new RadnikPlataSort());
		
		stampaListe(arrayList);
		
		
		List<Radnik> linkedList = new LinkedList<>();
		linkedList.add(new Radnik("Marko Vasic", "zidar", 76000.00, "123454323"));
		linkedList.add(new Radnik("Veljko Potparic", "vozac", 54000.00, "4345663343"));
		linkedList.add(new Radnik("Petar Jankovic", "limar", 59000.00, "63434343522"));
		linkedList.add(new Radnik("Davor Manojlovic", "zidar", 63000.00, "54543435554"));
		
		
//		linkedList.sort(null);		
//		Collections.sort(linkedList);    sortiranje po vec definisanoj compareTo metodi u klasi Radnik
		
//		Collections.sort(linkedList, new RadnikPlataSort());
//		
//		stampaListe(linkedList);
		
	}
	
	public static void stampaListe (List<Radnik> list) {
		for (Radnik radnik : list) {
			System.out.println(radnik);
		}
	}

}
