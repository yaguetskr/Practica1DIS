package almacen;

import java.util.ArrayList;



public class listaclientes {

	
	private ArrayList<clientes> clientes;

	public listaclientes() {
		clientes = new ArrayList<clientes>();
	}
	
	public int getsizelista() {
		return clientes.size();
	}
	
	public void addclientes(clientes e) {
		clientes.add(e);
	}
	
	
}
