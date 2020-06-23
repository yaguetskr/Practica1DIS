package almacen;


import almacen.direccion;


@SuppressWarnings("unused")
public class clientes {
    //declaracion de variables
	String Nombre;
	String apellidos;
	String email;
	String telefono;
	direccion dir;
	
	
	@Override
	public String toString() {
		return "\n\t\t<cliente>\n\t\t\t< Nombre>" +Nombre +"</ Nombre>\n\t\t\t<apellidos>"+apellidos+"</apellidos>\n\t\t\t<email>"+ email+"</email>\n\t\t\t<telefono>"+ telefono+"</ telefono>\n\t\t\t<direccion>"+dir+"</direccion>\n\t\t</cliente>\n";
	}
	// getters y setters
	public void set_Nombre(String p) 
	{
		Nombre=p;
	}
	public String get_Nombre() 
	{
	return Nombre;	
	}
	public void set_apellidos(String p) 
	{
		apellidos = p;
	}
	public String get_apellidos() 
	{
	return apellidos;	
	}
	public void set_email(String p) 
	{
		email=p;
	}
	public String get_email() 
	{
	return email;	
	}
	public void set_telefono(String p) 
	{
		telefono=p;
	}
	public String get_telefono() 
	{
	return telefono;	
	}
	public void set_dir(direccion p) 
	{
		dir=p;
	}
	public direccion get_dir() 
	{
	return dir;	
	}
    //constructor por parametros
    public clientes(String nom,String apell,String mail,String tlf,direccion direcc)
    {
        Nombre=nom;
        apellidos=apell;
        email=mail;
        telefono=tlf;
        dir =direcc;
    }
    //constructor por defecto
	public clientes()
	{
		Nombre="0";
		apellidos="0";
		email="0";
		telefono="0";
		dir = new direccion();
	}
	
}
