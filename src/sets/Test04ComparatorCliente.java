package sets;

import java.util.Set;
import java.util.TreeSet;

import modelo.Cliente;

public class Test04ComparatorCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(5, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(123, "Juan", "Perez", "Lopez");
		Cliente c3 = new Cliente(16, "Pedro", "Vacis", "Miranda");
		Cliente c4 = new Cliente(7116, "Pablo", "Garcia", "Pinto");
		Cliente c5 = new Cliente(81, "Jacinto", "Mendez", "Urrea");
		Cliente c6 = new Cliente(44, "Adriana", "Jimenez", "Perez");
		
		

		Set<Cliente> setClis = new TreeSet<Cliente>();
		
		setClis.add(c1);
		setClis.add(c2);
		setClis.add(c3);
		setClis.add(c4);
		setClis.add(c5);
		setClis.add(c6);
		
		for(Cliente cli:setClis) {
			System.out.println(cli);
		}
		System.out.println();
		
		Set<Cliente> set02 = new TreeSet<Cliente>(Cliente.getComparatorApellidos());
			set02.addAll(setClis);
			
		for (Cliente cliente : set02) {
			System.out.println(cliente);
		}
		System.out.println();
	}


}
