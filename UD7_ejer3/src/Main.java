
public class Main {

	public static void main(String[] args) {

		Profesor p1 = new Profesor("Juan", 25, "Informatica 2");
		ProfesorEnfermo pe1 = new ProfesorEnfermo("Salva", 31, "Informatica 2");
		
		p1.getConsultas();
		
		pe1.getConsultas();

	}

}
