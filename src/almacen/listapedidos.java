package almacen;




public class listapedidos   {

	
	
	private pedidos[] pedidos;

	@Override
	public String toString() {
		return "\n\t"+pedidos +"\n";
	}
	
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
