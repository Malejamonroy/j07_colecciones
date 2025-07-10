package maps;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import modelo.Cliente;

public class TestHashMap {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(5, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(123, "Juan", "Perez", "Lopez");
		Cliente c3 = new Cliente(16, "Pedro", "Vacis", "Miranda");
		Cliente c4 = new Cliente(7116, "Pablo", "Garcia", "Pinto");
		Cliente c5 = new Cliente(81, "Jacinto", "Mendez", "Urrea");
		Cliente c6 = new Cliente(44, "Adriana", "Jimenez", "Perez");

		
		//Map<Integer,Cliente>cliente = new HashMap<Integer, Cliente>();
		Map<Integer,Cliente>cliente = new LinkedHashMap<Integer, Cliente>();
		cliente.put(c1.getIdCliente(), c1); //el c1.getIdCliente() es la clave
		cliente.put(c2.getIdCliente(), c2);
		cliente.put(c3.getIdCliente(), c3);
		cliente.put(c4.getIdCliente(), c4);
		cliente.put(c5.getIdCliente(), c5);
		cliente.put(c6.getIdCliente(), c6);
		
		System.out.println(cliente.get(44));
		System.out.println(cliente.get(168)); //un cliente que no tenemos null
		
		//los maps no son iterables
		//puedo obtener una colección de los valores o un set de las claves
		Collection<Cliente> valores = cliente.values();
		Set<Integer> claves = cliente.keySet();
		
		//mostrar todo los valores
		valores.forEach(System.out::println);
		claves.forEach(System.out::println);
		
		//recorre los valores
		for (Integer clave : cliente.keySet()) {
			System.out.println(clave);	
		}
		
		for (Cliente cli : cliente.values()) {
			System.out.println(cli);	
		}
		
		//con entrySet() podemos obtener un set de objetos Entry.
		// un Entry representa un par de objetos, en este caso Integer, c
		Set<Entry<Integer,Cliente>> entries = cliente.entrySet();
		
		for (Entry<Integer, Cliente> entrada : entries) {
			System.out.println(entrada.getKey()+ ": " + entrada.getValue());
			
		}
		
		// Map ha incorporado el metodo forEach
		cliente.forEach((id,cli) -> System.out.println(id + ": " + cli));
	}

}
