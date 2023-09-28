package utility;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apllido;
	public Persona(String nombre, String apllido) {
		super();
		this.nombre = nombre;
		this.apllido = apllido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApllido() {
		return apllido;
	}
	public void setApllido(String apllido) {
		this.apllido = apllido;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apllido, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apllido, other.apllido) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apllido=" + apllido + "]";
	}
	
	
}
