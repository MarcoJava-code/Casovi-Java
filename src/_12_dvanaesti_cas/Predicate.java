package _12_dvanaesti_cas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class Predicate {
	
	public static void main(String[] args) {
		List<Integer> listaBrojeva = new ArrayList<Integer>();
		listaBrojeva.add(5);
		listaBrojeva.add(21);
		listaBrojeva.add(54);
		listaBrojeva.add(18);
		listaBrojeva.add(22);
		listaBrojeva.add(122);
		listaBrojeva.add(14);
		listaBrojeva.add(466);
		listaBrojeva.add(98);
		
		Collections.sort(listaBrojeva, (i1, i2) -> {
			if(i1 < i2) {
				return 1;
			} else if (i1>i2) {
				return -1;
			} return 0;
		});
		
		
		listaBrojeva.forEach(broj->System.out.println(broj));
		
//		vratiBrojeveManjeOd20(listaBrojeva, manjeOd20, veceOd5);
	}
	
	static IntPredicate manjeOd20 = new IntPredicate() {
		
		@Override
		public boolean test(int vrednost) {
			if(vrednost<20)
			return true;
			return false;
		} 
	};
	
	
	static IntPredicate veceOd5 = vrednost->vrednost>5;
	
	public static void vratiBrojeveManjeOd20 (List<Integer> lista, IntPredicate manjeDvadeset, IntPredicate vecePet ) {
	
		for (Integer integer : lista) {
		if(manjeDvadeset.and(vecePet).test(integer)) {
			System.out.println(integer);
		}
	}
	}

}
