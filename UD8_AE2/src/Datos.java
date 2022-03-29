import java.util.ArrayList;
import java.util.Scanner;

public class Datos{
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	public void datos() {
		
		//Categorias
			
		Categoria c1 = new Categoria(1, "Zapatillas");
		categorias.add(c1);
		Categoria c2 = new Categoria(2, "Sandalias");
		categorias.add(c2);
		Categoria c3 = new Categoria(3, "Botas");
		categorias.add(c3);
		Categoria c4 = new Categoria(4, "Zapatos traje");
		categorias.add(c4);
		
		//Productos
		
		productos.add( new Producto(1, "Nike Airforce", 99.99, c1, true));
		productos.add( new Producto(2, "Nike Blazer Mid", 89.99, c1, true));
		productos.add( new Producto(3, "Adidas Ozelia", 59.99, c1, false));
		productos.add( new Producto(4, "Converse All Star", 79.99, c1, true));
		productos.add( new Producto(5, "Adidas Forum Low", 99.95, c1, false));
		
		productos.add( new Producto(6, "Crocs Classic", 26.99, c2, false));
		productos.add( new Producto(7, "Quicksilver Molokai", 17.99, c2, true));
		productos.add( new Producto(8, "Crocs Classic Lined", 29.99, c2, false));
		productos.add( new Producto(9, "Nike Victori", 23.95, c2, true));
		productos.add( new Producto(10, "Jordan Break", 25.45, c2, true));
		
		productos.add( new Producto(11, "Boss Firstclass", 244.95, c3, true));
		productos.add( new Producto(12, "Pier One black", 29.99, c3, true));
		productos.add( new Producto(13, "Yourturn", 27.95, c3, false));
		productos.add( new Producto(14, "Timberland", 104.95, c3, false));
		productos.add( new Producto(15, "Dr. Martens", 145.00, c3, false));
		
		productos.add( new Producto(16, "Boss Lisbon", 269.95, c4, true));
		productos.add( new Producto(17, "Geox mocasines", 69.95, c4, false));
		productos.add( new Producto(18, "Pier One Zapatos", 34.99, c4, true));
		productos.add( new Producto(19, "Kartamo Zapatos", 29.90, c4, false));
		productos.add( new Producto(20, "Bullboxer", 59.45, c4, false));
		
		//Usuarios
		
		usuarios.add( new Usuario(0, 1, "Ruben", "20882841Z", "cont"));
		usuarios.add( new Usuario(13, 2, "Antoni Dolz", "20321312A", "1234"));
		usuarios.add( new Usuario(26, 2, "Samuel L. Jackson", "20831231T", "contraseña"));
		usuarios.add( new Usuario(78, 3, "Oscar BK", "2080909G", "Manzana"));
		usuarios.add( new Usuario(93, 3, "Miguel Angles", "20890231A", "123456"));
	
	}
	
	public void getUsuarios() {
		String tipo="";
		
		System.out.println("Lista de los usuarios: ");
		
		for(Usuario usuario:usuarios) {
			if(usuario.getTipo() == 1) {
				tipo="Admin";
			} else if(usuario.getTipo() == 2) {
				tipo="Socio";
			}else {
				tipo="usuario";
			}
			
			System.out.println("Id: " + usuario.getId() + ", tipo: " + usuario.getTipo() + ", nombre: " + usuario.getNombre() + ", nif: " + usuario.getNif() + ".");
			
		}
		
	}
	
	public Usuario comprobarUsuario(String nombre){
		Scanner teclado = new Scanner(System.in);
		int cont = 3;
		String contraseña = "";
		
		for(Usuario usuario:usuarios) {
			if(nombre.equals(usuario.getNombre())) {
				System.out.println("Muy bien " + nombre + " ahora introduce tu contraseña: ");
		
				do {
					contraseña = teclado.nextLine();
					if(contraseña.equals(usuario.getContraseña())) {
						System.out.println("Inicio de sesion correcto, iniciando sesión...\n ");
						
						cont = -1;
						return usuario;
					}else {
						cont--;
						if(cont > 0)
							System.out.println("Contraseña incorrecta te quedan " + cont + " intento(s).");
					}
					
				}while(cont > 0);
					if(cont == 0)
						System.out.println("Inicio de sesion incorrecto, cerrando sesion... ");
			}
		}
		return null;
	}
	
	public Datos() {
		
	}
	
	public void getProductos() {
		
		System.out.println("Lista de todos los productos: ");
		
		for(Producto producto:this.productos) {
			
			System.out.print("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			
			if(producto.isEnStock()) {
				System.out.println(", en stock: Si.");
			}else {
				System.out.println(", en stock: No.");
			}
			
		}
		
	}
	
	public void getProductosStock() {
		
		System.out.println("Lista de los productos en stock: ");
		
		for(Producto producto:this.productos) {
			
			if(producto.isEnStock())
			
			System.out.println("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			
		}
		
	}
	
	public void getProductosNoStock() {
		
		System.out.println("Lista de los productos sin stock: ");
		
		for(Producto producto:this.productos) {
			
			if(producto.isEnStock()) {
				
			}else
			
			System.out.println("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			
		}
		
	}
	
	
	public Producto getProducto(int id) {
		Producto producto = new Producto();
		
		for(Producto productos:this.productos) {
			
			if(productos.getId() == id) {
				producto = productos;
			}
			
		}
		
		return producto;
	}
	
	public void masCaro(ArrayList<Producto> productos) {
		
		System.out.println("El producto más caro es: ");
		System.out.print("Categoria: " + productos.get(0).getCategoria().getNombre() + ", nombre: " + productos.get(0).getNombre() + ", id: " + productos.get(0).getId() + ", precio: " + productos.get(0).getPrecio() + "€");
		if(productos.get(0).isEnStock()) {
			System.out.println(", en stock: Si.");
		}else {
			System.out.println(", en stock: No.");
		}
	}
	
	public void masBarato(ArrayList<Producto> productos) {
		
		System.out.println("El producto más barato es: ");
		System.out.print("Categoria: " + productos.get(productos.size()-1).getCategoria().getNombre() + ", nombre: " + productos.get(productos.size()-1).getNombre() + ", id: " + productos.get(productos.size()-1).getId() + ", precio: " + productos.get(productos.size()-1).getPrecio() + "€");
		if(productos.get(productos.size()-1).isEnStock()) {
			System.out.println(", en stock: Si.");
		}else {
			System.out.println(", en stock: No.");
		}
	}
	
	public void precioAscendente(ArrayList<Producto> productos) {
		
		System.out.println("Productos ordenados por precio de mayor a menor ");
		
		for(Producto producto:productos) {
			
			System.out.print("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			
			if(producto.isEnStock()) {
				System.out.println(", en stock: Si.");
			}else {
				System.out.println(", en stock: No.");
			}
			
		}
		
	}
	
	public void precioDescendente(ArrayList<Producto> productos) {
		
		System.out.println("Productos ordenados por precio de menor a mayor: ");
		
		for(int i = productos.size()-1; i>0; i--) {
			
			System.out.print("Categoria: " + productos.get(i).getCategoria().getNombre() + ", id: " + productos.get(i).getId() + ", nombre: " + productos.get(i).getNombre() + ", precio: " + productos.get(i).getPrecio());
			
			if(productos.get(i).isEnStock()) {
				System.out.println(", en stock: Si.");
			}else {
				System.out.println(", en stock: No.");
			}
			
		}
		
	}	
	
	public void listarCategorias() {
		
		System.out.println("Lista categorias: ");
		
		for(Categoria categoria: categorias) {
			System.out.println("Nombre: " + categoria.getNombre() + ", id: " + categoria.getId() + ".");
		}
		
	}
	
	public Categoria getCategoria(int id) {
		Categoria categoria = new Categoria();
		
		for(Categoria categorias:this.categorias) {
			
			if(categorias.getId() == id) {
				categoria = categorias;
			}
			
		}
		
		return categoria;
		
	}
	
	// Setters|Getters
	
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public ArrayList<Producto> getproductos(){
		return this.productos;
	}
	
}