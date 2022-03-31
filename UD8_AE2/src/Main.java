import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		
		int menu = 0;
		
		Datos datos = new Datos();

		datos.datos();
		
		Carrito c = new Carrito();
		
		Usuario usuario = new Usuario();
		
		String nombre = "";
		
		ArrayList<Producto> productosOrdenados = new ArrayList<Producto>();
		
		productosOrdenados.addAll(datos.getproductos());
		
		Collections.sort(productosOrdenados, new OrdenarPorPrecio());
		
		do {
		
			System.out.println("Bienvenido a la tienda de zapatillas, que quieres hacer: \n1)Iniciar sesion \n2)Iniciar como anonimo \n3)Crear cuenta");
			
			menu = teclado.nextInt();
		
		}while(menu <= 1 && menu >= 3);
		
		teclado.nextLine();
		
		usuario.setTipo(3);
		
		if(menu == 1) {
			
			System.out.println("Ingresa tu nombre de usuario: ");
			
			usuario = datos.comprobarUsuario(teclado.nextLine());
			
		}else if(menu == 2) {
			System.out.println("Ingresa un nombre de usuario");
			usuario.setNombre(teclado.nextLine());
			
		
		}else if(menu == 3) {
			usuario=usuario.creacionUsuario();
			
		}
		
		System.out.println("Bienvenido a la tienda " + usuario.getNombre() + "\n");
		
		
		//Menú normal
		
		if(usuario.getTipo() > 1) {
		
			do {
				
				Thread.sleep(1000);
			
				System.out.println("Selecciona la opciona que quieras: \n1)Listar productos " + "\n2)Mostrar producto más caro" + "\n3)Mostrar producto más barato" + "\n4)Añadir producto al carrito" + "\n5)Eliminar productos del carrito" + "\n6)Ver carrito" + "\n7)Ordenar por precio (Mayor a menor )" + "\n8)Ordenar por precio (Menor a mayor)" + "\n9)Ordenar por disponibilidad");
				
				menu = teclado.nextInt();
				
				switch(menu) {
				
				case 1: 
					datos.listarCategorias();
					System.out.println("Selecciona la categoría que quieras modificar (id o 0 listar todo): ");
					menu=teclado.nextInt();
					if(menu == 0) {
						datos.getProductos();
					}else if(menu > 0 && menu < 5)
						datos.getProductosCategoria(menu);
					else
						System.out.println("Esa categoría no existe: ");
				saltarMenu();
				break;
				
				case 2: datos.masCaro(productosOrdenados);
				saltarMenu();
				break;
				
				case 3: datos.masBarato(productosOrdenados);
				saltarMenu();
				break;
				
				case 4: añadirProducto(datos, c);
				saltarMenu();
				break;
				
				case 5: eliminarProducto(datos, c);
				saltarMenu();
				break;
				
				case 6: 
					if(usuario.getTipo() == 2) {
						c.precioConDescuento();
					}else
						c.precioTotalCarrito();
					
				saltarMenu();
				break;
				
				case 7: datos.precioAscendente(productosOrdenados);
				saltarMenu();
				break;
				
				case 8: datos.precioDescendente(productosOrdenados);
				saltarMenu();
				break;
				
				case 9: 
				datos.getProductosStock();
				System.out.println("");
				datos.getProductosNoStock();
				saltarMenu();
				break;
				
				default: System.out.println("Opcion incorrecta, selecciona otra opcion");
				
				}
			
			}while(menu != 10);
		
		}else if(usuario.getTipo()==1){
			
			//Menú admin
			
			do {
				
				Thread.sleep(1000);
				
				System.out.println("Selecciona la opciona que quieras: \n1)Listar productos " + "\n2)Modificar nombre producto" + "\n3)Modificar precio productos" + "\n4)Listar categorias" + "\n5)Modificar nombre categorias" + "\n6)Salir");
				
				menu = teclado.nextInt();
				
				switch(menu) {
				
				case 1:
					datos.listarCategorias();
					System.out.println("Selecciona la categoría que quieras modificar (id o 0 para salir): ");
					datos.getProductos();
				
				break;
				
				case 2: modNombreProducto(datos);
				saltarMenu();
				break;
				
				case 3: modPrecioProducto(datos);
				saltarMenu();;
				break;
				
				case 4: datos.listarCategorias();
				saltarMenu();
				break;
				
				case 5: modNombreCategoria(datos);
				saltarMenu();
				break;
				
				case 6: System.out.println("Saliendo del programa...");
				break;
				
				default: System.out.println("Opcion incorrecta, selecciona otra opcion");
				
				
				}
			
			}while(menu != 6);
				
		}
		
	}
	
	
	public static void añadirProducto(Datos datos, Carrito c) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		
		datos.getProductosStock();
		
		System.out.println("Selecciona el producto que quieras añadir a la cesta (id o 0 para salir): ");
		
		do {
			
			id = teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
				if(producto.isEnStock() || id == 0) {
			
					c.añadirProducto(producto);
					comp = true;
		
				}else
			
					System.out.println("Ese producto no está disponible, seleccione otro: ");
		
		}while(comp == false);
		
	}
	
	public static void eliminarProducto(Datos datos, Carrito c) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		
		System.out.println("A continuación se van a listar los productos su carrito: ");
		
		c.precioTotalCarrito();
		
		System.out.println("Selecciona el producto que quieras eliminar (id o 0 para salir) : ");
		
		do {
			
			id= teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
			if(c.getProductos().contains(producto) || id == 0) {
				
				c.eliminarProducto(producto);;
				comp = true;
				
				}else
				
					System.out.println("Ese producto no está en la cesta, seleccione otro: ");
			
		}while(comp == false);
		
	}

	public static void modNombreProducto(Datos datos) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		String nombre = "";
		
		datos.getProductos();
		
		System.out.println("Selecciona el producto que quieras modificar (id o 0 para salir): ");
		
		do {
			
			id = teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
				if(producto.getId() > 0) {
					
					System.out.println("Introduce el nuevo nombre: ");
					
					teclado.nextLine();
					
					producto.setNombre(teclado.nextLine());
					
					System.out.println("Nombre introducido correctamente ");
			
					comp = true;
		
				}else
			
					System.out.println("Ese producto no está disponible, seleccione otro: ");
		
		}while(comp == false);
		
	}
	
	public static void modPrecioProducto(Datos datos) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		
		datos.getProductos();
		
		System.out.println("Selecciona el producto que quieras modificar (id o 0 para salir): ");
		
		do {
			
			id = teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
				if(producto.getId() > 0) {
					
					System.out.println("Introduce el nuevo precio: ");
					
					producto.setPrecio(teclado.nextDouble());
					
					System.out.println("Precio introducido correctamente ");
			
					comp = true;
		
				}else
			
					System.out.println("Ese producto no está disponible, seleccione otro: ");
		
		}while(comp == false);
		
	}

	public static void modNombreCategoria(Datos datos) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		String nombre = "";
		
		datos.listarCategorias();
		
		System.out.println("Selecciona la categoría que quieras modificar (id o 0 para salir): ");
		
		do {
			
			id = teclado.nextInt();
			
			Categoria categoria = datos.getCategoria(id);
		
				if(categoria.getId() > 0) {
					
					System.out.println("Introduce el nuevo nombre: ");
					
					teclado.nextLine();
					
					categoria.setNombre(teclado.nextLine());
					
					System.out.println("Nombre introducido correctamente ");
			
					comp = true;
		
				}else
			
					System.out.println("Esa categoria no está disponible, selecciona otra: ");
		
		}while(comp == false);
		
	}

	public static void saltarMenu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa para salir ");
		teclado.nextLine();
	}
}
