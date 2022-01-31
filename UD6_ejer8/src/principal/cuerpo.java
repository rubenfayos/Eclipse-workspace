package principal;

public class cuerpo {
	
	private int masa, densidad, diametro, dissol, id, numlunas;
	private String nombre;
	private String[] lunas;
	
	public void setmasa(int masa) {
		this.masa = masa;
	}
	
	public int getmasa() {
		return this.masa;
	}
	
	public void setdensidad(int densidad) {
		this.densidad = densidad;
	}
	
	public int getdensidad() {
		return this.densidad;
	}
	
	public void setdiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public int getdiametro() {
		return this.diametro;
	}
	
	public void setdissol(int dissol) {
		this.dissol = dissol;
	}
	
	public int getdissol() {
		return this.dissol;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getid() {
		return this.id;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getnombre() {
		return this.nombre;
	}
	
	public void setnumlunas(int numlunas) {
		this.numlunas = numlunas;
		this.lunas = new String[this.numlunas];
	}
	
	public int getnumlunas() {
		return this.numlunas;
	}
	
	public void lunas(int num, String luna) {
		
		this.lunas[num] = luna;
			
	}
	
	public String getluna(int num) {
		return this.lunas[num];
	}
	
	public cuerpo() {
		
	}

}
