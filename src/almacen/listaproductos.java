package almacen;

import java.util.ArrayList;



public class listaproductos {
	
	private ArrayList<producto> productos;

	public listaproductos() {
		productos = new ArrayList<producto>();
	}
	
	
	public int getsizelista() {
		return productos.size();
	}
	
	public void addproductos(producto e) {
		productos.add(e);
	}
}
