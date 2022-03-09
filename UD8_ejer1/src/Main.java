
public class Main {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico();
		
		e1.getConsumoEnergetico();
		
		Lavadora l1 = new Lavadora();
		
		l1.getCarga();
		
		System.out.print(l1.getCarga());

	}

}
