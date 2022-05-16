import java.util.HashMap;
import java.util.Scanner;

public class DGTI {
	
	private HashMap<String, Usuario> usuariosEspa�a;
	private HashMap<String, Usuario> usuariosAlemania;
	private HashMap<String, Usuario> usuariosFrancia;

	
	public DGTI() {
		
	}
	
	public DGTI(HashMap<String, Usuario> usuariosEspa�a, HashMap<String, Usuario> usuariosAlemania, HashMap<String, Usuario> usuariosFrancia) {
		this.usuariosEspa�a= usuariosEspa�a;
		this.usuariosAlemania= usuariosAlemania;
		this.usuariosFrancia= usuariosFrancia;
	}
	
	public HashMap<String, Usuario> getUsuariosEspa�a() {
		return usuariosEspa�a;
	}

	public void setUsuariosEspa�a(HashMap<String, Usuario> usuariosEspa�a) {
		this.usuariosEspa�a = usuariosEspa�a;
	}

	public HashMap<String, Usuario> getUsuariosAlemania() {
		return usuariosAlemania;
	}

	public void setUsuariosAlemania(HashMap<String, Usuario> usuariosAlemania) {
		this.usuariosAlemania = usuariosAlemania;
	}

	public HashMap<String, Usuario> getUsuariosFrancia() {
		return usuariosFrancia;
	}

	public void setUsuariosFrancia(HashMap<String, Usuario> usuariosFrancia) {
		this.usuariosFrancia = usuariosFrancia;
	}
	
	public void usuarios() {
		
		usuariosEspa�a= new HashMap<String, Usuario>();
		
		usuariosEspa�a.put("111", new Usuario("Rub�n", "111", 18, 10, 'A'));
		usuariosEspa�a.put("112", new Usuario("Carles", "112", 17, 8, 'C'));
		usuariosEspa�a.put("113", new Usuario("Jordi", "113", 21, 15, 'B'));
		
		usuariosAlemania= new HashMap<String, Usuario>();
		
		usuariosAlemania.put("211", new Usuario("Pau", "211", 32, 11, 'A'));
		usuariosAlemania.put("212", new Usuario("Antonio", "212", 31, 9, 'D'));
		usuariosAlemania.put("213", new Usuario("Pablo", "213", 98, 5, 'D'));
		
		usuariosFrancia= new HashMap<String, Usuario>();
		
		usuariosFrancia.put("311", new Usuario("Alex", "311", 25, 12, 'C'));
		usuariosFrancia.put("312", new Usuario("Miguel", "312", 28, 8, 'C'));
		usuariosFrancia.put("313", new Usuario("Samuel", "313", 54, 13, 'B'));
		
	}
	
	public void a�adirUsuario(HashMap<String, Usuario> usuarios, Usuario u) {
		
		usuarios.put(u.getNif(), u);
		
	}
	
	public void eliminarUsuario(int pais, String nif) {
		
		switch(pais) {
		
		case 1: usuariosEspa�a.remove(nif);
		break;
		case 2: usuariosAlemania.remove(nif);
		break;
		case 3: usuariosFrancia.remove(nif);
		break;
		
		
		}
		
	}
	
	public void modificarUsuario(HashMap<String, Usuario> usuarios) {
		
		System.out.println("Elige el usuario que quieras modificar: ");
		
		listarUsuarios(usuarios);
		
		
		
	}
	
	public HashMap<String, Usuario> elegirPais() {
		Scanner teclado= new Scanner(System.in);
		int pais = 0;
		
		System.out.println("Introduce el pa�s que quieres: \n1)Espa�a \n2)Alemania \n3)Francia");
		pais = teclado.nextInt();
		
		
		switch(pais) {
		
		case 1: return this.usuariosEspa�a;
		
		case 2: return this.usuariosAlemania;
		
		case 3: return this.usuariosFrancia;
		
		
		
		}
		
		return null;
		
	}
	
	public void listarUsuarios(HashMap<String, Usuario> usuarios) {
		
		for(Usuario u : usuarios.values()) {
			
			System.out.println("NIF: " + u.getNif() + ", Nombre: " + u.getNombre() + ", edad: " + u.getEdad() + ", tipo carnet: " + u.getTipoCarnet() + ", puntos: " + u.getPuntos());
			
		}
		
	}
	
	public void a�adirPuntos(HashMap<String, Usuario> usuarios) {
		Scanner teclado= new Scanner(System.in);
		int puntos = 0;
		
		System.out.println("Elige el usuario que quieras modificar: ");
		
		listarUsuarios(usuarios);
		
		System.out.println("Introduce el NIF: ");
		
		Usuario u = usuarios.get(teclado.nextLine());
		
		System.out.println("Introduce los puntos que quieras a�adir: ");
		
		u.setPuntos(u.getPuntos() + teclado.nextInt());
		
		if(u.getPuntos() > 15) {
			System.out.print("Los puntos no pueden ser mayor a 15");
			u.setPuntos(15);
		}
		
		usuarios.put(u.getNif(), u);
		
		
	}
	
	public void restarPuntos(HashMap<String, Usuario> usuarios) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Elige el usuario que quieras modificar: ");
		
		listarUsuarios(usuarios);
		
		System.out.println("Introduce el NIF: ");
		
		Usuario u = usuarios.get(teclado.nextLine());
		
		System.out.println("Introduce los puntos que quieras restar: ");
		
		u.setPuntos(u.getPuntos() - teclado.nextInt());
		
		if(u.getPuntos() < 0) {
			System.out.print("Los puntos no pueden ser menores a 0");
			u.setPuntos(0);
		}
		
		usuarios.put(u.getNif(), u);
		
		
	}

	

}
