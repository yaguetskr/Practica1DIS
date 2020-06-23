package almacen;

import java.util.ArrayList;




public class listapedidos   {

	
	private pedidos[] pedidos;

	public listapedidos() {
		pedidos = new pedidos[10];
	}
	
	public int getsizelista() {
		return 10;
	}
	
	public void addpedidos(pedidos e,int indice) {
		pedidos[indice]=e;
	}
	
	
	
}
