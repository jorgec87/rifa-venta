package cl.duoc.rifa.venta.model;

public class ItemModel {

	private String nombre;
	private String valor;
	
	public ItemModel() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ComboBoxModel [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
	
	
}
