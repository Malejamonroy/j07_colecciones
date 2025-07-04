package sets;

import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {

	public static void main(String[] args) {
	Set<String> set = new TreeSet<String>(new StringComparatorCantLetras());
			
			set.add("uno");
			set.add("dos");
			set.add("tres");
			set.add("cuatro");
			set.add("cinco");
			set.add("seis");
			set.add("siete");
			set.add("AS");
			set.add("Zapato");
			set.add("ZAPATO");
			set.add("Ávila");
			set.add("ágil");
			
			for(String s: set) {
				System.out.println(s);
			}
		
	}

}
