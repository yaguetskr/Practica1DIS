package almacen;



import java.util.ArrayList;

public class listaclientes  {

	
	private clientes[] clientes ;

	public String toString() {
		return "\n\t"+clientes+"\n";
	}
	
	
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
