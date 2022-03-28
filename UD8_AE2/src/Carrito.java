import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos= new ArrayList<Producto>();

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void añadirProducto(Producto producto) {
		
		productos.add(producto);
		
		System.out.println("Producto introducido correctamente\n");
	}
	
	public void eliminarProducto(Producto producto) {
		
		productos.remove(producto);
		
		System.out.println("Producto eliminado correctamente\n");
	}
	
	public void precioTotalCarrito() {
		double precioTotal=0;
		
		for(Producto producto:productos) {
			
			System.out.println("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			precioTotal+=producto.getPrecio();
			
		}
		
		System.out.println("El precio total del carrito es " + precioTotal + "€\n");
			
	}
	
	public void precioConDescuento() {
		double precioTotal=0;
		
		for(Producto producto:productos) {
			System.out.println("Categoria: " + producto.getCategoria().getNombre() + ", id: " + producto.getId() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
			precioTotal+=producto.getPrecio();
			
		}
		
		System.out.println("El precio total del carrito es " + (precioTotal*0.85) + "€");
		
	}
	

}
