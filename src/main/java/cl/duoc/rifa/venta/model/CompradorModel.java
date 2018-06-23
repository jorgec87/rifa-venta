package cl.duoc.rifa.venta.model;

public class CompradorModel {

	private String rut;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	
	public CompradorModel() {}


	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CompradorModel [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}

	
}
