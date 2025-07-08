package arrays;

import java.util.Arrays;

import modelo.Cliente;

public class TestArrayOrdenado {

	public static void main(String[] args) {
		String[] ss = {"uno","dos","tres","cuatro","cinco"};
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println();
		
		Arrays.sort(ss); //con este los ordeno
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println();

		
		Cliente c1 = new Cliente(715, "Adriana", "Jimenez", "Perez");
		Cliente c2 = new Cliente(23, "Juan", "Jimenez", "Perez");
		Cliente c3 = new Cliente(18, "Pedro", "Jimenez", "Perez");
		Cliente c4 = new Cliente(516, "Pablo", "Jimenez", "Perez");
		Cliente c5 = new Cliente(5, "Jacinto", "Jimenez", "Perez");
		
		Cliente[] clis = {c1,c2,c3,c4,c5};
		
		Arrays.sort(clis);
		
		for (int i = 0; i < clis.length; i++) {
			System.out.println(clis[i]);
		}
		
	}

}
