package _12_dvanaesti_cas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainFudbaler {
	
	public static void main(String[] args) {
		
		List<Fudbaler> fudbaleri = new ArrayList<Fudbaler>();
		fudbaleri.add(new Fudbaler("Marko", "Vasic", "bek", 34));
		fudbaleri.add(new Fudbaler("Petar", "Petrovic", "centarfor", 30));
		fudbaleri.add(new Fudbaler("Mirko", "Pavic", "levi bek", 22));
		fudbaleri.add(new Fudbaler("Zeljko", "Zeljkovic", "golman", 25));
		fudbaleri.add(new Fudbaler("Mile", "Pavlovic", "napad", 29));
		
		Predicate<Fudbaler> predicate = fudbaler -> fudbaler.getIme().equals("Mile");
		
		
		ispisi(fudbaleri, predicate);
		

}
	
	public static void ispisi (List<Fudbaler> lista, Predicate<Fudbaler> predicate) {
		lista.forEach(fudbaler-> {
			if(predicate.test(fudbaler)) {
				System.out.println(fudbaler);
			}
		});
	}
	
}
