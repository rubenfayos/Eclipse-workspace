
public class Animal {
	
	private int id;
	private String nombre;
	private TipoAnimal tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoAnimal getTipo() {
		return tipo;
	}
	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}
	
	public Animal(int id, String nombre, TipoAnimal tipo) {
		this.id=id;
		this.nombre=nombre;
		this.tipo=tipo;
	}

}
