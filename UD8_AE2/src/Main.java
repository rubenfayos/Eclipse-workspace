import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int menu = 0;
		
		Datos datos = new Datos();
		datos.datos();
		
		Carrito c = new Carrito();
		
		System.out.println("Bienvenido a la tienda de zapatillas");
		
		do {
		
		System.out.println("Selecciona la opciona que quieras: \n1)Listar productos " + "\n2)Mostrar producto m�s caro" + "\n3)Mostrar producto m�s barato" + "\n4)A�adir producto al carrito" + "\n5)Eliminar productos del carrito" + "\n6)Ver carrito" + "\n7)Salir");
		
		menu = teclado.nextInt();
		
		switch(menu) {
		
		case 1: datos.getProductos();
		break;
		
		case 2: 
		break;
		
		case 3:
		break;
		
		case 4: a�adirProducto(datos, c);
		break;
		
		case 5: eliminarProducto(datos, c);
		break;
		
		case 6: c.precioTotalCarrito();
		break;
		
		case 7: System.out.println("Saliendo del programa...");
		break;
		
		default: System.out.println("Opcion incorrecta, selecciona otra opcion");
		
		}
		
		

		
		}while(menu != 7);

	}
	
	public static void a�adirProducto(Datos datos, Carrito c) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		
		datos.getProductosStock();
		
		System.out.println("Selecciona el producto que quieras a�adir a la cesta (id o 0 para salir): ");
		
		do {
			
			id = teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
				if(producto.isEnStock() || id == 0) {
			
					c.a�adirProducto(producto);
					comp = true;
		
				}else
			
					System.out.println("Ese producto no est� disponible, seleccione otro: ");
		
		}while(comp == false);
		
	}
	
	public static void eliminarProducto(Datos datos, Carrito c) {
		Scanner teclado = new Scanner(System.in);
		int id = 0;
		boolean comp = false;
		
		System.out.println("A continuaci�n se van a listar los productos su carrito: ");
		
		c.precioTotalCarrito();
		
		System.out.println("Selecciona el producto que quieras eliminar (id o 0 para salir) : ");
		
		do {
			
			id= teclado.nextInt();
			
			Producto producto = datos.getProducto(id);
		
			if(c.getProductos().contains(producto) || id == 0) {
				
				c.eliminarProducto(producto);;
				comp = true;
				
				}else
				
					System.out.println("Ese producto no est� en la cesta, seleccione otro: ");
			
		}while(comp == false);
		
	}

}
