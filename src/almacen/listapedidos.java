package almacen;

import java.util.ArrayList;



public class listapedidos {
	
	private ArrayList<pedidos> pedidos;

	public listapedidos() {
		pedidos = new ArrayList<pedidos>();
	}
	
	public int getsizelista() {
		return pedidos.size();
	}
	
	public void addpedidos(pedidos e) {
		pedidos.add(e);
	}
	
}
