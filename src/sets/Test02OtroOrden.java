package sets;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {
	
	
//ESTE MECANISMO NO SE UTILIZA
	public static void main(String[] args) {
	Set<String> set = new TreeSet<String>(new StringComparatorCantLetras());//comparacion de letras
			
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
			
			//0rdenar por largo de la palabra de mayor a menor 
		Set<String> set02 = new TreeSet<String>(new Comparator<String>() {   //creamos un objeto nuevo de una clase anonima que hereda de una interface (new Comparator<String>()
			@Override
			public int compare(String o1, String o2) {	
				return o1.length() - o2.length();
			}
			});
		
		//cargar el set02 con los valores que tiene cargado set
			set02.addAll(set);
			for (String s : set02) {
				System.out.println(s);
			}
		
	}

}
