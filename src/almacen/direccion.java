package almacen;

public class direccion {

    //declaracion de variables
    
	String calle ;
	int Numero;
	int Codigo_Postal;
	String Poblacion ;
	String pais;
	
	
	@Override
	public String toString() {
		return "\n\t\t\t\t<calle>"+calle +"</calle>\n\t\t\t\t<Numero>"+Numero+"</Numero>\n\t\t\t\t< Codigo Postal>"+ Codigo_Postal+"</ Codigo Postal>\n\t\t\t\t<Poblacion>"+Poblacion+"</Poblacion>\n\t\t\t\t<pais>"+pais+"</pais>\n\t\t\t";
	}
    //getters y setters
	public void set_calle(String p) 
	{
		calle=p;
	}
	public String get_calle() 
	{
	return calle;	
	}
	public void set_Numero(int p) 
	{
		Numero = p;
	}
	public int get_Numero() 
	{
	return Numero;	
	}
	public void set_Codigo_Postal(int p) 
	{
		Codigo_Postal=p;
	}
	public int get_Codigo_Postal() 
	{
	return Codigo_Postal;	
	}
	public void set_Poblacion(String p) 
	{
		Poblacion=p;
	}
	public String get_Poblacion() 
	{
	return Poblacion;	
	}
	public void set_pais(String p) 
	{
		pais=p;
	}
	public String get_pais() 
	{
	return pais;	
	}
    
    //constructor parametrizado
    public direccion(String call,int num,int codp,String pobl,String cntry)
    {
        calle=call ;
        Numero=num;
        Codigo_Postal=codp;
        Poblacion=pobl ;
        pais=cntry;
    }
    //constructor por defecto
	public direccion() 
	{
		
	}
}
