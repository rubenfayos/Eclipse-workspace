import java.sql.*;
import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre de usuario: ");
		String user=teclado.nextLine();
		
		System.out.println("Introduce tu contraseña: ");
		String password=teclado.nextLine();
		
		try {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/prueba", "root", ""
				);
		
		PreparedStatement ps = conn.prepareStatement(
				"UPDATE usuarios SET USER = ? WHERE USER= ? AND PASSWORD= ? ;"
				);
		
		ps.setString(1, user);
		ps.setString(2, user);
		ps.setString(3, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(ps.executeUpdate() == 1) {
			System.out.println("Inicio de sesion correcto");
			int esAdmin = esAdmin(conn, user, password);
			
		}
		else
			System.out.println("Inicio de sesion incorrecto");
		
		}catch (SQLException e){
			e.printStackTrace();
		}

	}
	
	public static int esAdmin(Connection conn, String user, String password) throws SQLException {
		
		Statement stmt = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement(
				"SELECT * FROM usuarios WHERE USER= ? AND PASSWORD= ?");
		
		ps.setString(1, user);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int esAdmin= rs.getInt("esAdmin");
			if(esAdmin == 1)
			System.out.println(esAdmin);
	
		}

		return 0;
		
		
		
	}

}
