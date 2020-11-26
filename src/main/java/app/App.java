package app;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import Entidades.Bebible;
import Entidades.Cosmetico;
import Entidades.Fruta;
import Entidades.Producto;

public class App {
	public static void main(String[] args) {
		List<Producto>listado = new ArrayList<>();
	
	Bebible b1 = new Bebible(1.5);
		b1.setNombre("Coca-cola Zero");
		b1.setPrecio(20);
		listado.add(b1);
		
	Bebible b2 = new Bebible(1.5);
		b2.setNombre("Coca-cola");
		b2.setPrecio(18);
		listado.add(b2);
		
	Cosmetico c1 = new Cosmetico(500);
		c1.setNombre("Shampoo Sedal");
		c1.setPrecio(19);
		listado.add(c1);
		
	Fruta f1 = new Fruta("kilo");
		f1.setNombre("Frutillas");
		f1.setPrecio(64);
		listado.add(f1);
		
		System.out.println("for each");
		for (Producto producto : listado) {
			System.out.println(producto.toString());
		}
	
			System.out.println("iterator");
		ListIterator<Producto> iterador	= listado.listIterator();
			while(iterador.hasNext()) {
					System.out.println(iterador.next());
			}
		
		System.out.println("=======================");
					Producto caro = new Producto("", 0);
					Producto barato = new Producto("", 0);
			for (Producto producto : listado) {
					if(producto.compareTo(caro)>0);
						caro = producto;
				}
				
			for (Producto producto : listado) {
				if (barato.getPrecio()== 0) {
					barato=producto;
				}if (producto.compareTo(barato)<0) {
					barato = producto;
				}
			}
		System.out.println("Producto más caro: "+caro.getNombre());
		System.out.println("Producto más barato: " + barato.getNombre());
		
		
	}
}
