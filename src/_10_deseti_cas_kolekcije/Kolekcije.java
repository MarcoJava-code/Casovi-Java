package _10_deseti_cas_kolekcije;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;




public class Kolekcije {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Kragujevac");
		arrayList.add("Valjevo");
		arrayList.add("Beograd");
		arrayList.add("Kosjeric");
		arrayList.add("Nis");
		arrayList.add("Novi Sad");
		arrayList.add("Sarajevo");
		
//		Iterator<String> iterator = arrayList.iterator();
		
		System.out.println("**********************");
		System.out.println("Stampa ARRAY LISTE pre sortiranja");
		System.out.println("**********************");
		
		print(arrayList);
		
		arrayList.sort(null);
		
		System.out.println("**********************");
		System.out.println("Stampa ARRAY LISTE posle sortiranja");
		System.out.println("**********************");

		print(arrayList);
		
		Collections.reverse(arrayList);
		
		System.out.println("**********************");
		System.out.println("Stampa ARRAY LISTE unazad");
		System.out.println("**********************");

		print(arrayList);
		
		String a,b,c;
		a = "a";
		b = "b";
		c = "a";
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(c));


	}
	
	public static void print (List<String> arrayList) {
		ListIterator<String> listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
