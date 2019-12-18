package _11_jedanaesti_cas;

import java.util.Comparator;

public class RadnikPlataSort implements Comparator<Radnik> {

	@Override
	public int compare(Radnik r1, Radnik r2) {
		if (r1.plata < r2.plata) {
			return 1;
		} else if (r1.plata > r2.plata) {
			return -1;
		} else
			return 0;
	}

}
