import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {

			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prueba", "root", ""
					);
			
			ArrayList<TipoAnimal> tipos = tipos(conn);
			
			int opcion = 0;
			
			do {
			
				System.out.println("Que quieres hacer? \n1)Ver animales \n2)Añadir animales \n3)Salir");
				
				opcion = teclado.nextInt();
				
				if(opcion == 1)
				mostrar(conn, tipos);
				
				if(opcion == 2)
				insertar(conn);
			
			}while(opcion != 3);
			
			
			}catch (SQLException e){
				e.printStackTrace();
			}
		
	}
			
			
			
		public static void mostrar(Connection conn, ArrayList<TipoAnimal> tipo) throws SQLException {
			ArrayList<Animal> animales = new ArrayList<Animal>();
				
			PreparedStatement ps = conn.prepareStatement(
					"SELECT * FROM animales"
					);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				TipoAnimal t = new TipoAnimal();
				t.setId(rs.getInt("tipo"));
				animales.add(new Animal(id, nombre, t));
			}
			
			for(Animal a : animales) {
				TipoAnimal t = a.getTipo();
				System.out.println("ID: " + a.getId() + ", nombre: " + a.getNombre() + ", tipo: " + a.getTipo().getNombreTipo());
			}
			}
		
		public static void insertar(Connection conn) throws SQLException {
			Scanner teclado = new Scanner(System.in);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					"SELECT MAX(id) FROM animales");
			
			int id=rs.getInt(1) + 1;
			
			
					
			System.out.println("Introduce el nombre del perro: ");
			String nombre = teclado.nextLine();
			
			System.out.println("Introduce el tipo, estos son los tipo disponibles: ");
			int tipo = teclado.nextInt();
			
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO animales(id, nombre, tipo) VALUES(?,?,?);"
					);
			
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setInt(3, tipo);
		}
		
		public static ArrayList<TipoAnimal> tipos(Connection conn) throws SQLException {
			
			ArrayList<TipoAnimal> tipos = new ArrayList<TipoAnimal>();
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM tipoAnimal");
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("nombreTipo");
				TipoAnimal tipo = new TipoAnimal(id, nombre);
				tipos.add(tipo);
			}
			return tipos;
		}
				
	}


