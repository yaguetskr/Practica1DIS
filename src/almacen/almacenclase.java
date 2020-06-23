package almacen;

import java.util.ArrayList;

public class almacenclase {
	ArrayList<clientes> c;
	ArrayList<pedidos> p;
	ArrayList<producto>  prod;
	
	@Override
	public String toString() {
		return "\n\t<Lista clientes>"+c+"\n\t</Lista clientes>\n\n\t<Lista Pedidos>"+p+"\n\t</Lista Pedidos>\n\n\t<Lista Productos>"+prod+"\n\t</Lista Productos>\n";
	}
	
	
	public ArrayList<clientes> getC() {
		return c;
	}
	public void setC(ArrayList<clientes> c) {
		this.c = c;
	}
	public ArrayList<pedidos> getP() {
		return p;
	}
	public void setP(ArrayList<pedidos> p) {
		this.p = p;
	}
	public ArrayList<producto> getProd() {
		return prod;
	}
	public void setProd(ArrayList<producto> prod) {
		this.prod = prod;
	}
	public almacenclase(ArrayList<clientes> c, ArrayList<pedidos> p, ArrayList<producto> prod) {
		super();
		this.c = c;
		this.p = p;
		this.prod = prod;
	}
	
	
	
}