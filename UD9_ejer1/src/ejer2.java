import java.sql.*;

public class ejer2 {

	public static void main(String[] args) {

try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prueba", "root", ""
					);
			
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO numeros(numero, esPar) VALUES(?,?) ;"
					);
			
			String esPar = "";
			
			for(int i = 0; i <100; i++) {
				int rand = (int)(Math.random()*(100-0+1)+0);
				ps.setInt(1, rand);
				
				if(rand % 2 == 0)
					esPar = "S";
				else
					esPar = "N";
				
				ps.setString(2, esPar);
				
				ps.execute();
				
			}
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM numeros");
			
			while(rs.next()) {
				int numero = rs.getInt("numero");
				esPar = rs.getString("esPar");
				System.out.println("Número " + numero + ", es par: " + esPar);
		
			}
			
				conn.close();
					
				
		}catch (SQLException e){
			e.printStackTrace();
		}

	}

}
