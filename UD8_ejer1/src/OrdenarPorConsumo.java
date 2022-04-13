import java.util.Comparator;

public class OrdenarPorConsumo implements Comparator<Electrodomestico>{

	@Override
	public int compare(Electrodomestico e1, Electrodomestico e2) {
		String o1=Character.toString(e1.getConsumoEnergetico());
		String o2=String.valueOf(e2.getConsumoEnergetico());
		return o1.compareTo(o2);
	}

}