import java.util.ArrayList;

public class Datos {
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public void datos() {
			
		Categoria c1 = new Categoria(1, "Zapatillas");
		Categoria c2 = new Categoria(2, "Sandalias");
		Categoria c3 = new Categoria(3, "Botas");
		Categoria c4 = new Categoria(4, "Zapatos traje");
		
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
		
		usuarios.add( new Usuario(0, 1, "Ruben Fayos", "20882841Z"));
		usuarios.add( new Usuario(13, 2, "Antoni Dolz", "20321312A"));
		usuarios.add( new Usuario(26, 2, "Samuel L. Jackson", "20831231T"));
		usuarios.add( new Usuario(78, 3, "Oscar BK", "2080909G"));
		usuarios.add( new Usuario(93, 3, "Miguel Angles", "20890231A"));
	
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

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void Datos() {
		
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

}
