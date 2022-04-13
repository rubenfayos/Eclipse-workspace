
public class Main {

	public static void main(String[] args) {
		
		Trabajador t1 = new Trabajador("Juan", null, null, 0, null, null, "444444");
		Empleado t2 = new Empleado("Jose", null, null, 0, null, null, "555555", 25000.20, 0);
		Consultor t3 = new Consultor("Juan", null, null, 0, null, null, "666666", 3000, 0);
		
		System.out.println("Nombre: " + t1.getNombre() + " NSS: " + t1.getNSS());
		System.out.println("Empleado Nombre: " + t2.getNombre() + " NSS: " + t2.getNSS() + " Salario: " + t2.calcularPaga());
		System.out.println("Consultor Nombre: " + t3.getNombre() + " NSS: " + t3.getNSS() + " Salario: " + t3.getHoras());
		
		
	}

}
