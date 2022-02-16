
public class Programador extends Empleado{
	
	private int lineasCodigoPorHora;
	private String lenguajeDominante;
	
	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}
	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public void nivelProgramacion() {
		if(this.lineasCodigoPorHora < 200) {
			System.out.println("Level 1");
			}else if(this.lineasCodigoPorHora >= 200 && this.lineasCodigoPorHora <= 500) {
				System.out.println("Level 2");
			}else {
				System.out.println("Level 3");
			}
	}
	
	public Programador() {
		
	}
	
	public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasCodigoPorHora, String lenguajeDominante) {
		super(nombre, dni, edad, casado, salario);
		this.lineasCodigoPorHora = lineasCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
		
	}

}

