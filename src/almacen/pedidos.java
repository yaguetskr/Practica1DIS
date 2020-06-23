package almacen;

import java.util.ArrayList;
import java.util.List;



@SuppressWarnings("unused")
public class pedidos {

	listaproductos productos;
	 int[] cantidad;
	direccion dir_entrega;
	clientes destinatario;
	String fecha_entrega;
	
	
	public void set_productos(listaproductos p) 
	{
		productos=p;
	}
	public listaproductos get_productos() 
	{
	return productos;		
	}
	
	public void set_cantidad( int[] p) 
	{
		cantidad=p;
	}
	public int[] get_cantidad() 
	{
	return cantidad;		
	}
	public void set_dir_entrega(direccion p) 
	{
		dir_entrega=p;
	}
	public direccion get_dir_entrega() 
	{
	return dir_entrega;		
	}
	public void set_destinatario(clientes p) 
	{
		destinatario = p;
	}
	public clientes get_destinatario() 
	{
	return destinatario;		
	}
	public void set_fecha_entrega(String p) 
	{
		fecha_entrega = p;
	}
	public String get_fecha_entrega() 
	{
	return fecha_entrega;		
	}
    public pedidos(listaproductos p, int[] c,direccion d,clientes dest,String fcha)
    {
        productos = p;
        cantidad = c;
        dir_entrega = d;
        destinatario = dest;
        fecha_entrega = fcha;
    }
	public pedidos() 
	{
		productos = new listaproductos();
		cantidad = new  int[20];
		dir_entrega = new direccion();
		destinatario = new clientes();
		fecha_entrega = "0";
	
	}

}

