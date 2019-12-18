package _9_devet_cas_kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Kolekcije {

	
	public static void main(String[] args) {
		
		List <String> arrayList = new ArrayList();
		
		arrayList.add("Prvi element");
		arrayList.add("Drugi element");
		arrayList.add("Treci element");
		arrayList.add("Drugi element");
		arrayList.add("Drugi element");
		arrayList.add("Drugi element");
		arrayList.add("Drugi element");
		arrayList.add("Poslednji element");
		

		
		
		List <String> linkedList = new LinkedList<>();
		
		linkedList.add("Prvi element");
		linkedList.add("Drugi element");
		linkedList.add("Treci element");
		linkedList.add("Drugi element");
		linkedList.add("Drugi element");
		linkedList.add("Drugi element");
		linkedList.add("Drugi element");
		linkedList.add("Drugi element");
		
		
		Set<String> hashSet = new HashSet();
		hashSet.add("Prvi element");
		hashSet.add("Drugi element");
		hashSet.add("Treci element");
		hashSet.add("Drugi element");
		hashSet.add("Drugi element");
		hashSet.add("Drugi element");
		hashSet.add("Drugi element");
		
		
		stampa(arrayList);
		stampa(linkedList);
		
		arrayList.remove(3);
		
		stampa(arrayList);
		
		String ime = "Marko";
		StringBuilder drugoIme = new StringBuilder("Veljko");
		
		String[] niz = new String[2];
		
		
		System.out.println("-----------------------------");
		System.out.println("Stampa pomocu iteratora");
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("-----------------------------");
		System.out.println("Stampa pomocu listIteratora");
		
		ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
		int count = 0;
		while (listIterator.hasPrevious()) {
			count ++;
			System.out.println(listIterator.previous());
		}


		
 	}
	
	
	public static void stampa (Collection<String> col) {
		System.out.println("------------------------------------");
		System.out.println(col.getClass().getSimpleName());
		System.out.println("------------------------------------");
		for (String string : col) {
			System.out.println(string);
		}
	}
	
	
}


		//Iterable   (interfejs koji sluzi za prolazak kroz kolekciije)
/*		Collection 
 * 
 *	List  (ArrayList, LinkedList, Vector, Stack)
 *	Set   (HashSet, LinkedHashSet, TreeSet)
 *  Queue (Dequeue)
 *  
 *  Map, SortedMap  (HashMap,  TreeMap LinkedHashMap  (nemaju Iterable interfejs)  )
 * */


	// 	FIFO i LIFO
