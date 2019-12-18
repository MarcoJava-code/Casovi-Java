package _10_deseti_cas_kolekcije;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mape {
	
	
	public static void main(String[] args) {
		Map <Integer,Gradovi> hashMap = new HashMap<Integer, Gradovi>();
		hashMap.put(1, new Gradovi("Kragujevac"));
		hashMap.put(5, new Gradovi("Beograd"));
		hashMap.put(2, new Gradovi("Novi Sad"));
		
		stampaMape(hashMap);
		
		Map <Integer,Gradovi> linkedHashMap = new LinkedHashMap<Integer, Gradovi>();
		linkedHashMap.put(1, new Gradovi("Kragujevac"));
		linkedHashMap.put(5, new Gradovi("Beograd"));
		linkedHashMap.put(2, new Gradovi("Novi Sad"));
		
		stampaMape(linkedHashMap);
		
		Map <Integer,Gradovi> treeMap = new TreeMap<Integer, Gradovi>();
		treeMap.put(1, new Gradovi("Kragujevac"));
		treeMap.put(5, new Gradovi("Beograd"));
		treeMap.put(2, new Gradovi("Novi Sad"));
		
		mapToSetPrint(treeMap);
		
		// Hashtable klasa je sinhronizovana za razliku od mapa
		
		Hashtable<Integer, Gradovi> hashtable = new Hashtable<Integer, Gradovi>();
		hashtable.put(1, new Gradovi("Kragujevac"));
		hashtable.put(5, new Gradovi("Beograd"));
		hashtable.put(2, new Gradovi("Novi Sad"));
		
	}
	
	public static void stampaMape (Map<Integer, Gradovi> mapa) {
		System.out.println("********************************");
		System.out.println(mapa.getClass().getSimpleName());
		System.out.println("********************************");
		for(Map.Entry<Integer, Gradovi> entry : mapa.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}
	
	public static void mapToSetPrint (Map<Integer, Gradovi> mapa) {
		System.out.println("********************************");
		System.out.println(mapa.getClass().getSimpleName());
		System.out.println("********************************");
		Set<Map.Entry<Integer, Gradovi>> setMap = new HashSet<>(mapa.entrySet());
		for (Entry<Integer, Gradovi> entry : setMap) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

	
	
	// Genericki tipovi
	// T -type
	// K -key
	// V -value
	// E -element
	// N -number
	
	// jedan key-value pair se naziva entry


}
