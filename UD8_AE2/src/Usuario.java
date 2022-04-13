import java.util.Scanner;

public class Usuario {
	
	//Tipo -> 1 Admin | 2 Socio | 3 usuario
	
	private int id, tipo;
	private String nombre, nif, contraseña;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(int id, int tipo, String nombre, String nif, String contraseña) {
		this.id=id;
		this.tipo=tipo;
		this.nombre=nombre;
		this.nif=nif;
		this.contraseña=contraseña;
		
	}
	
	public Usuario creacionUsuario() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un nombre de usuario: ");
		this.nombre=teclado.nextLine();
		System.out.println("Ahora un nif: ");
		this.nif=teclado.nextLine();
		System.out.println("Ahora una contraseña: ");
		this.contraseña=teclado.nextLine();
		
		this.tipo=2;
		
		return this;
		
		
	}

}
