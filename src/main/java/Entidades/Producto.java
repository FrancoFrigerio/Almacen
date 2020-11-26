package Entidades;

public class Producto implements Comparable<Producto>{
String nombre;
int precio;

public Producto() {
	// TODO Auto-generated constructor stub
}

public Producto(String nombre, int precio) {
	
	this.nombre = nombre;
	this.precio = precio;
}

@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

@Override
public int compareTo(Producto p1) {
	// TODO Auto-generated method stub
	return this.getPrecio()-p1.getPrecio();
}


}
