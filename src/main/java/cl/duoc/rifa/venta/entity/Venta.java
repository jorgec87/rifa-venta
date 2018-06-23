package cl.duoc.rifa.venta.entity;

import java.util.Date;

public class Venta {

	private int id;
	private String rifa;
	private String comprador;
	private String numero;
	private Date fecha;
	private String vendedor;
	
	public Venta() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRifa() {
		return rifa;
	}

	public void setRifa(String rifa) {
		this.rifa = rifa;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", rifa=" + rifa + ", comprador=" + comprador + ", numero=" + numero + ", fecha="
				+ fecha + ", vendedor=" + vendedor + "]";
	}
	
	
	
}
