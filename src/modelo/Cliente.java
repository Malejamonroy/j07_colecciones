package modelo;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

	private int idCliente;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public Cliente(int idCliente, String nombreString, String apellido1, String apellido2) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombreString;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNombreString() {
		return nombre;
	}
	
	public void setNombreString(String nombreString) {
		this.nombre = nombreString;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public int hashCode() {
		return idCliente;
		//return Objects.hash(idCliente); //este es lo mismo que lo de arriba 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return idCliente == other.idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombreString=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		return this.idCliente - o.idCliente; 
		// <0 this va antes que o
		// =0 this iguales
		// <0 this va despues que o
	}
	
	//crear un metodo que retorne un comparator por apelllido y nombre
	 public static Comparator<Cliente> getComparatorApellidos(){
		 return new Comparator<Cliente>() {//hacemos una clase anonima 

			@Override
			public int compare(Cliente o1, Cliente o2) {
				String nom1 = o1.apellido1 + o1.apellido2 + o1.nombre + o1.idCliente;
				String nom2 = o2.apellido1 + o2.apellido2 + o2.nombre + o2.idCliente;
				//hay que definirlo al lenguaje español
				Collator col= Collator.getInstance(new Locale("es"));
				return col.compare(nom1, nom2); //un colector tiene un metodo llamado compare y el compara lo que queremos que en este caso es nombre 
				
			
			}};
	 }
	 
	
	
	
	

}
