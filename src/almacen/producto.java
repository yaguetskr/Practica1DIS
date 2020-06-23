package almacen;



public class producto {
    
    int Codigo;
    String Nombre;
    String descripcion;
    int stock;
    localizacion Localiza;
    boolean pendientes;


	@Override
	public String toString() {
		return "\n\t\t<producto>\n\t\t\t<codigo>"+Codigo +"</codigo>\n\t\t\t<nombre>"+Nombre+"</nombre>\n\t\t\t<descripcion>"+descripcion+"</descripcion>\n\t\t\t<stock>"+stock+"</stock>\n\t\t\t<localizacion>"+Localiza+"\t\t\t</localizacion>\n\t\t\t<pendientes>"+pendientes+"</pendientes>\n\t\t</prodcuto>";
	}

    
    public void set_Codigo(int p)
    {
        Codigo=p;
    }
    public int get_Codigo()
    {
        return Codigo;
        
    }
    public void set_Nombre(String p)
    {
        Nombre=p;
    }
    public String get_Nombre()
    {
        return Nombre;
        
    }
    public void set_descripcion(String p)
    {
        descripcion=p;
    }
    public String get_descripcion()
    {
        return descripcion;
        
    }
    public void set_stock(int p)
    {
        stock=p;
    }
    public int get_stock()
    {
        return stock;
        
    }
    public void set_Localiza(localizacion p)
    {
        Localiza = p;
    }
    public localizacion get_Localiza()
    {
        return Localiza;
        
    }
    public void set_pendientes(boolean p)
    {
        pendientes = p;
    }
    public boolean get_pendientes()
    {
        return pendientes;
        
    }
    public producto(int cod, String nom,String desc,int stk,localizacion loc,boolean pend)
    {
        Codigo=cod;
        Nombre =nom;
        descripcion=desc;
        stock = stk;
        Localiza = loc;
        pendientes=pend;
    }
    public producto()
    {
        Codigo=0;
        Nombre ="a";
        descripcion="a";
        stock = 0;
        Localiza = new localizacion();
        pendientes=false;
    }
    
}
