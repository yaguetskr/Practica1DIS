package almacen;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.io.BufferedReader;
import java.io.BufferedWriter;
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
	public static void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
	public static void main(String[] parametro) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opcion1=1;
		//vectores del programa
		listapedidos pedidoslist=new listapedidos();
		listaproductos productoslist=new listaproductos();
		listaclientes clienteslist=new listaclientes();
		//array list del xml
		ArrayList<almacenclase> Almacen = new ArrayList<almacenclase>();
		ArrayList<producto> lpro = new ArrayList<producto>();
		ArrayList<clientes> lcli = new ArrayList<clientes>();
		ArrayList<pedidos> lpedi = new ArrayList<pedidos>();
		
		
		
		
		almacenclase a;
		int indice_clientes=0;
		int indice_productos=0;
		int indice_pedidos=0;
		
		
		
		
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
					int salir=0;
					int indice=-1;
					String aux="";
					System.out.println("Introduzca el email del cliente:");
					String email=reader.readLine();
					for(int i=0;i<clienteslist.getsizelista()&&salir==0;i++) {
						aux=clienteslist.get(i).email;
						if(aux.equals(email)) {
							
							cl=clienteslist.get(i);
							salir=1;
							indice=i;
						
						}
						
					}
					if(salir==0) {
						System.out.println("No se encontro el cliente");
						System.out.println("registre el cliente antes de añadir pedido\n");
						break;
					}
					
					int[] cant=new int[20];
					int indice_cant=0;
					int mas;
					listaproductos pr=new listaproductos();
					int indice_pr=0;
					do {
						System.out.println("Introduzca el codigo del producto");
						int codigo=Integer.parseInt(reader.readLine());
						for(int i=0;i<productoslist.getsizelista();i++) {
							if(productoslist.get(i).get_Codigo()==codigo) {
								System.out.println("Cuantas unidades quiere del producto?");
								cant[indice_cant]=(Integer.parseInt(reader.readLine()));
								indice_cant++;
								pr.addproductos(productoslist.get(i),indice_pr);
								indice_pr++;
								i=productoslist.getsizelista()+2;
							}
							if(i==productoslist.getsizelista()) {
								System.out.println("No se encontro el producto");
							}
						}
						System.out.println("Añadir mas productos? (1.-SI  	Cualquier tecla.-NO)");
						mas=Integer.parseInt(reader.readLine());
						
					}while(mas==1);
					
					
					if(salir==1) {
				
						String calle =clienteslist.get(indice).get_dir().get_calle();  
						
						int num =clienteslist.get(indice).get_dir().get_Numero();  
					       
						int codp = clienteslist.get(indice).get_dir().get_Codigo_Postal();  
					       
						String pobl =clienteslist.get(indice).get_dir().get_Poblacion();  
    
						String pais =clienteslist.get(indice).get_dir().get_pais();  
						direccion destin=new direccion(calle,num,codp,pobl,pais);

						System.out.println("Fecha de entrega:");
						String fecha=reader.readLine();
					
					pedidos pedido=new pedidos(pr,cant,destin,cl,fecha);
						pedidoslist.addpedidos(pedido,indice_pedidos);
						indice_pedidos++;
						lpedi.add(pedido);
					}
				
					
					
					break;
				case 2:
					clientes clien=new clientes();
					clien=generarcliente();
					clienteslist.addclientes(clien,indice_clientes);
					indice_clientes++;
					lcli.add(clien);
					
					break;
				case 3:
					producto product=new producto();
					product=generarproducto();
					productoslist.addproductos(product, indice_productos);
					indice_productos++;
					lpro.add(product);
					break;
				case 4:
					
					a=new almacenclase(lcli,lpedi,lpro);
					Almacen.add(a);
				
					String header = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n";
					String root = "<Almacen>\n";
					String xml = "";
					xml += header + root;
					for (almacenclase p: Almacen) {
						xml += a;
						System.out.println(xml);
					}
					String close_root = "\n</Almacen>";
					System.out.println(xml);
					xml += close_root;
					writeToFile(xml, "xmlFile.xml");

					
				
					
					
					break;

				default:
					
					System.out.println("No se ha reconocido la opción, por favor vuelva a introducirla");
					break;
				
				
			}
			
		}while(opcion1!=4);
		System.out.println("Hasta luego!");
        
        
    }

}
