package Entidades;

public class Bebible extends Producto{
 double litros;
	
	public Bebible() {
	// TODO Auto-generated constructor stub
}

	public Bebible(double litros) {
		super();
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
	}
	
}
