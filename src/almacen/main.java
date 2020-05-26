package almacen;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;



import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static localizacion generarlocalizacion() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pasillo:");
	       
		
		String pasillo =reader.readLine();
		
		System.out.println("Estanteria:");
	       
		String estanteria =reader.readLine();
		System.out.println("Estante:");
	       
		String estante =reader.readLine();
		localizacion loc=new localizacion(pasillo,estanteria,estante);
		return loc;
	}
	
	


	public static producto generarproducto() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Codigo:");
	       
		
		int cod = Integer.parseInt(reader.readLine());
		
		System.out.println("Nombre:");
	       
		String nombre =reader.readLine();
		System.out.println("Descripcion:");
	       
		String descripcion =reader.readLine();
		
		
		System.out.println("Stock:");
	       
		
		int stock = Integer.parseInt(reader.readLine());
		
		
		localizacion loc=new localizacion();
		loc=generarlocalizacion();
		
		System.out.println("Pendiente:");
	       
		
		boolean pendiente = Boolean.parseBoolean(reader.readLine());
		
		producto product=new producto(cod,nombre,descripcion,stock,loc,pendiente);
		return product;
	}

	
	
	
	public static direccion generardireccion() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Calle:");
	       
		
		String calle =reader.readLine();
		
		System.out.println("Numero:");
	       
		int num = Integer.parseInt(reader.readLine());
		System.out.println("Codigo postal:");
	       
		int codp = Integer.parseInt(reader.readLine());
		System.out.println("Poblacion:");
	       
		String pobl =reader.readLine();
		System.out.println("Pais:");
	       
		String pais =reader.readLine();
		direccion dir=new direccion(calle,num,codp,pobl,pais);
		return dir;
	}
	
	
	public static clientes generarcliente() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre:");
	       
		String nombre =reader.readLine();
		System.out.println("Apellidos");
	       
		String apellidos =reader.readLine();
		System.out.println("Email:");
	       
		String email=reader.readLine();
		System.out.println("Telefono:");
	       
		String tlf =reader.readLine();
		direccion dir =new direccion();
		dir=generardireccion();
		clientes client=new clientes(nombre,apellidos,email,tlf,dir);
	    return client;   
		
	}
	
	
	public static void main(String[] parametro) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opcion1=1;
		listapedidos pedidoslist=new listapedidos();
		listaproductos productoslist=new listaproductos();
		listaclientes clienteslist=new listaclientes();
		
		
		do {	
			System.out.println("1-Añadir pedido");
			System.out.println("2-Añadir cliente");
			System.out.println("3.-Añadir producto");
			System.out.println("4.-Salir");
       
			int opcion = Integer.parseInt(reader.readLine());
			opcion1=opcion;
			switch(opcion1) {
				case  1:
					clientes cl=new clientes();
					System.out.println("Introduzca el email del cliente:");
					String email=reader.readLine();
					for(int i=0;i<clienteslist.getsizelista();i++) {
						if(clienteslist.get(i).get_email()==email) {
							
							cl=clienteslist.get(i);
							i=clienteslist.getsizelista()+2;
						}
						if(i==clienteslist.getsizelista()) {
							System.out.println("No se encontro el cliente");
							break;
						}
					}
					List<Integer> cant=new ArrayList<Integer>();
					int mas;
					listaproductos pr=new listaproductos();
					do {
						System.out.println("Introduzca el codigo del producto");
						int codigo=Integer.parseInt(reader.readLine());
						for(int i=0;i<productoslist.getsizelista();i++) {
							if(productoslist.get(i).get_Codigo()==codigo) {
								System.out.println("Cuantas unidades quiere del producto?");
								cant.add(Integer.parseInt(reader.readLine()));
								pr.addproducto(productoslist.get(i));
								i=productoslist.getsizelista()+2;
							}
							if(i==productoslist.getsizelista()) {
								System.out.println("No se encontro el producto");
							}
						}
						System.out.println("Añadir mas productos? (1.-SI)");
						mas=Integer.parseInt(reader.readLine());
						
					}while(mas==1);
					
					direccion destino =new direccion();
					destino=generardireccion();
					
					System.out.println("Fecha de entrega:");
					String fecha=reader.readLine();
					pedidos pedido=new pedidos(pr,cant,destino,cl,fecha);
					pedidoslist.add(pedido);
					break;
				case 2:
					clientes clien=new clientes();
					clien=generarcliente();
					clienteslist.add(clien);
					break;
				case 3:
					producto product=new producto();
					product=generarproducto();
					productoslist.add(product);
					break;
				case 4:
					break;

				default:
					
					System.out.println("No se ha reconocido la opción, por favor vuelva a introducirla");
					break;
				
				
			}
			
		}while(opcion1!=4);
		System.out.println("Hasta luego!");
        
        
    }

}
