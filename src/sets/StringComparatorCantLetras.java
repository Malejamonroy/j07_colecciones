package sets;

import java.util.Comparator;

public class StringComparatorCantLetras implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {	
		return o1.length() - o2.length(); //si o1 va antes que o2 devuelve un  umero negativo
							//si o2 tiene mas numeros de letras que el o1 , 
	}

}
