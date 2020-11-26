package Entidades;

public class Fruta extends Producto{

	String unidadDeVenta;
	
	public Fruta() {
		// TODO Auto-generated constructor stub
	}

	public Fruta(String unidadDeVenta) {
		super();
		this.unidadDeVenta = unidadDeVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadDeVenta;
	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	
	
}
