package Entidades;

public class Cosmetico extends Producto{
 int contenido;
 
 public Cosmetico() {
	// TODO Auto-generated constructor stub
}

public Cosmetico(int contenido) {
	super();
	this.contenido = contenido;
}

public int getContenido() {
	return contenido;
}

public void setContenido(int contenido) {
	this.contenido = contenido;
}

@Override
public String toString() {
	return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
}

 
}

