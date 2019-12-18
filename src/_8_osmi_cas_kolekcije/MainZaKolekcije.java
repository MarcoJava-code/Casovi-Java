package _8_osmi_cas_kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import _5_peti_cas.Kvadrat;

public class MainZaKolekcije {
	
	 
	
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
		
//	for (String element : list) {
//		System.out.println(element);
//	}
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection<String> collection1 = new ArrayList<>();
		Collection<String> collection2 = new LinkedList<>();
		Collection<String> collection3 = new HashSet<>();
		
		arrayList.remove(2);
		
		System.out.println("------------------------------------------");
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		String[] niz = (String[]) arrayList.toArray();
		
	
		
 	}
	
}


		//Itarable   (interfejs koji sluzi za prolazak kroz kolekciije)
/*		Collection 
 * 
 *	List  (ArrayList, LinkedList, Vector, Stack)
 *	Set   (HashSet, LinkedHashSet)
 *  Queue (Deque)
 *  
 *  Map  (HashMap, SortedMap,  TreeMap LinkedHashMap  (nemaju Iterable interfejs)
 * */


	// 	FIFO i LIFO








