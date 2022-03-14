import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Electrodomestico>{

	@Override
	public int compare(Electrodomestico e1, Electrodomestico e2) {
		if(e1.precioFinal() > e2.precioFinal()) {
		return 1;
		}else if(e1.precioFinal() < e2.precioFinal()) {
		return -1;	
		}else return 0;
	}

}
