package modelo;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

	private int idCliente;
	private String nombreString;
	private String apellido1;
	private String apellido2;
	
	public Cliente(int idCliente, String nombreString, String apellido1, String apellido2) {
		super();
		this.idCliente = idCliente;
		this.nombreString = nombreString;
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
		return nombreString;
	}
	
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
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
		return "Cliente [idCliente=" + idCliente + ", nombreString=" + nombreString + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
