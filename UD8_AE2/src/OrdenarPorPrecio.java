import java.util.ArrayList;
import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Producto>{
	
	@Override
	public int compare(Producto o1, Producto o2) {
		if(o1.getPrecio() > o2.getPrecio()) {
		return -1;
		}else if(o1.getPrecio() < o2.getPrecio()) {
		return 1;	
		}else return 0;
	}

}
