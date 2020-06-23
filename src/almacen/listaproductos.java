package almacen;





public class listaproductos  {

	private producto[] productos;

	public listaproductos() {
		productos = new producto[20];
	}
	
	
	public int getsizelista() {
		return 20;
		
	}
	
	public void addproductos(producto e,int indice) {
		productos[indice]=e;
		
	}
	
	public producto get(int i) {
		return productos[i];
	}
	
}
