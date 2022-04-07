import java.sql.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prueba", "root", ""
					);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM alumnos");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				System.out.println("ID: " + id + ", nombre: " + nombre + ", edad: " + edad);
		
			}
			
				conn.close();
					
				
		}catch (SQLException e){
			e.printStackTrace();
		}

	}

}
