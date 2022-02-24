
public class Cesta {
	
	private Articulo[] lista;
	private int precioTotal;

	public Articulo[] getLista() {
		return lista;
	}

	public void setLista(Articulo[] lista) {
		this.lista = lista;
	}
	
	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public Cesta() {
		
	}
	
	public Cesta(Articulo[] lista) {
		this.lista=lista;
	}
	
	public void sumaTotal() {
		
		for(int i=0; i<lista.length; i++) {
			this.precioTotal+=lista[i].getPrecio();
		}
		
	}

	

}
