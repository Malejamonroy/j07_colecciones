package sets;

import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Test01TreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
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
		
		Set<Integer> setNum = new TreeSet<Integer>();
		setNum.add(123);
		setNum.add(688);
		setNum.add(1);
		setNum.add(44);
		setNum.add(1235);
		setNum.add(89);
		
		for(Integer num:setNum) {
			System.out.println(num);
		}
		
		Cliente c1 = new Cliente(15, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(123, "Juan", "Jimenez", "Perez");
		Cliente c3 = new Cliente(168, "Pedro", "Jimenez", "Perez");
		Cliente c4 = new Cliente(516, "Pablo", "Jimenez", "Perez");
		Cliente c5 = new Cliente(815, "Jacinto", "Jimenez", "Perez");
		
		
		Set<Cliente> setClis = new TreeSet<Cliente>();
		
		setClis.add(c1);
		setClis.add(c2);
		setClis.add(c3);
		setClis.add(c4);
		setClis.add(c5);	
		
		for(Cliente cli:setClis) {
			System.out.println(cli);
		}
	}
	
}
