import java.sql.*;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prueba", "root", ""
					);
			
			int opcion = 0;
			int registrosAfectados=0;
			
			do {
			
			System.out.println("Que quieres hacer? \n1)Insertar datos \n2)Ver datos \n3)Actualizar fila \n4)Borrar fila \n5)Salir");
			
			opcion = teclado.nextInt();
			
			if(opcion == 1)
			registrosAfectados+=insertar(conn);
			
			if(opcion == 2)
			mostrar(conn);
			
			if(opcion == 3)
			registrosAfectados+=update(conn);
			
			if(opcion == 4)
			registrosAfectados+=delete(conn);
			
			}while(opcion != 5);
			
			System.out.println("Total registros afectados: " + registrosAfectados);
			
			conn.close();
				
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int insertar(Connection conn) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el id de la persona: ");
		int id= teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce el nombre de la persona: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce la edad de la persona: ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO alumnos (id, nombre, edad) VALUES (?, ?, ?)"
				);
		
		ps.setInt(1, id);
		ps.setString(2, nombre);
		ps.setInt(3, edad);

		int registrosAfectados = ps.executeUpdate();
		
		return registrosAfectados;
	}
	
	public static void mostrar(Connection conn) throws SQLException {
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(
				"SELECT * FROM alumnos");
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			int edad = rs.getInt("edad");
			System.out.println("ID: " + id + ", nombre: " + nombre + ", edad: " + edad);
	
		}
		
	}
	
	public static int update(Connection conn) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		mostrar(conn);
		
		System.out.println("Introduce el id de la persona que quieras actualizar: ");
		int id= teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce el nuevo nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce la nueva edad de la persona: ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		PreparedStatement ps = conn.prepareStatement(
				"UPDATE alumnos SET nombre = ?, edad = ? WHERE id = ? "
				);
		
		ps.setString(1, nombre);
		ps.setInt(2, edad);
		ps.setInt(3, id);
		
		int registrosAfectados = ps.executeUpdate();
		
		return registrosAfectados;
	}
	
	public static int delete(Connection conn) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		mostrar(conn);
		
		System.out.println("Introduce el id de la persona que quieras actualizar: ");
		int id= teclado.nextInt();
		teclado.nextLine();
		
		PreparedStatement ps = conn.prepareStatement(
				"DELETE FROM alumnos WHERE id = ? "
				);
	
		ps.setInt(1, id);
		
		int registrosAfectados = ps.executeUpdate();
		
		return registrosAfectados;
		
	}

}
