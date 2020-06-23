package almacen;

import java.util.ArrayList;
import java.util.List;


public class pedidos {

	listaproductos productos;
	List<Integer> cantidad;
	direccion dir_entrega;
	String destinatario;
	String fecha_entrega;
	
	
	public void set_productos(listaproductos p) 
	{
		productos=p;
	}
	public listaproductos get_productos() 
	{
	return productos;		
	}
	
	public void set_cantidad(List<Integer> p) 
	{
		cantidad=p;
	}
	public List<Integer> get_cantidad() 
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
	public void set_destinatario(String p) 
	{
		destinatario = p;
	}
	public String get_destinatario() 
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
    public pedidos(listaproductos p,List<Integer> c,direccion d,String dest,String fcha)
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
		cantidad = new ArrayList<Integer>();
		dir_entrega = new direccion();
		destinatario = "0";
		fecha_entrega = "0";
	}
}

