package almacen;



public class listaclientes  {

	
	private clientes[] clientes ;

	public listaclientes() {
		clientes = new clientes[10];
	}
	
	public int getsizelista() {
		return 10;
	}
	
	public void addclientes(clientes e, int indice) {
		clientes[indice]=e;

	}

	public clientes get(int i) {
		return clientes[i];
	}

	
	
	
}
