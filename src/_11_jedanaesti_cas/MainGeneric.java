package _11_jedanaesti_cas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainGeneric {

	public static void main(String[] args) {
		
//		List<GenerickaKlasa<String, String, String, String>> arrayStringList = new ArrayList<GenerickaKlasa<String, String, String, String>>();
//		
////		arrayList.add(new GenerickaKlasa<Object>(5));
////		arrayList.add(new GenerickaKlasa<Object>(2.4));
////		arrayList.add(new GenerickaKlasa<Object>('c'));
//		arrayStringList.add(new GenerickaKlasa<String>("nova"));
//		arrayStringList.add(new GenerickaKlasa<String>("nova"));
//		
		Radnik r1 = new Radnik("Marko", "zidar", 32333.00, "32222323");
//		
		Menadzer m1 = new Menadzer("Ivan", "sef", 102000, "234343434", "sef");
//		
//		stampaListe(arrayStringList);
//		
//		List<GenerickaKlasa<Integer>> arrayIntegerList = new ArrayList<GenerickaKlasa<Integer>>();
//		arrayIntegerList.add(new GenerickaKlasa<Integer>(5));
//		arrayIntegerList.add(new GenerickaKlasa<Integer>(6));
//		arrayIntegerList.add(new GenerickaKlasa<Integer>(512));
//		arrayIntegerList.add(new GenerickaKlasa<Integer>(5));
//		
//		List<GenerickaKlasa<Radnik>> arrayRadnikList = new ArrayList<GenerickaKlasa<Radnik>>();
//		
//		arrayRadnikList.add(new GenerickaKlasa<Radnik>(r1));
		
		generickaMetoda(m1, 56);
		
		
		String[] nizString = {"Jedan", "Dva", "Tri"};
		Integer[] nizInt = {1,2,3};
		
		stampaNiza(nizString);
		stampaNiza(nizInt);
		
		List<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("Prvi u listi");
		linkedList1.add("Drugi u listi");
		
		stampaListe(linkedList1);

		
	}
	
	public static <E> void stampaListe (List<E> arrayList) {
		for (E e : arrayList) {
			System.out.println(e);
		}
	}
	
	public static <E> void stampaNiza (E[] element) {
		for (E e : element) {
			System.out.println(e);
		}
	}
	
	public static <E extends Radnik, N extends Number> void generickaMetoda (E element, N number) {
		System.out.println(element + " " + number);
	}

}


/*
 * 	Tipovi generickih klasa
 * 
 * T - type
 * K - key
 * V - value
 * E - element
 * N - number
 * 
 * S, U, V - koriste se kao drugi, treci itd. tip klase
 * */
