package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.Conexion;

public class AdministradorDao {

	boolean si = false;

	public boolean isSi() {
		return si;
	}

	public void setSi(boolean si) {
		this.si = si;
	} 
	
	public String ValidarUsuario(String documento, String contrase�a) {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement statement = null;
		ResultSet result = null;
		String inicio = "";

		connection = miConexion.getConnection();

		String consulta = "select * from admin where Usuario='" + documento + "' and contrase�a='" + contrase�a + "'";
		;

		try {
			if (connection != null) {
				statement = connection.prepareStatement(consulta);
				result = statement.executeQuery();

				if (result.next() == true) {
					inicio = "Bienvenido Administrador";
					si = true;
					System.out.print(" 2.2 encontro algo");

				} else {
					inicio = "El usuario y contrase�a no son validos";
					si = false;
					System.out.print(" 2.3 no encontro nada");
				}
			}

		} catch (SQLException e) {
			System.out.println("Error en la consulta del usuario" + e.getMessage());
			inicio = "Error" + e.getMessage();
			si = false;
		} finally {
			miConexion.desconectar();
		}
		System.out.print(" 3 retorna");
		return inicio;
	}
}
