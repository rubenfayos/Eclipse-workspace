
public class TipoAnimal {
	
	private int id;
	private String nombreTipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	public TipoAnimal() {
		
	}
	
	public TipoAnimal(int id, String nombreTipo) {	
		this.id=id;
		this.nombreTipo=nombreTipo;	
	}

}
