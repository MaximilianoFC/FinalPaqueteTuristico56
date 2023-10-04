package clases;

import finalpaqueteturistico56.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mario
 */
public class CiudadData {
    Connection con = Conexion.getConexion();
     
    public void agregarCiudad(String nombre, String pais, String provincia) {
        String sql = "INSERT INTO ciudad (nombre, pais, estado, provincia) VALUES (?, ?, 1, ?)";
        try (Connection connection = Conexion.getConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, pais);
            statement.setString(3, provincia);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCiudad(int idCiudad) {
        String sql = "UPDATE ciudad SET estado = 0 WHERE idCiudad = ?";
        try (Connection connection = Conexion.getConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idCiudad);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarCiudad(int idCiudad, String nombre, String pais, String provincia) {
        String sql = "UPDATE ciudad SET nombre = ?, pais = ?, provincia = ? WHERE idCiudad = ?";
        try (Connection connection = Conexion.getConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, pais);
            statement.setString(3, provincia);
            statement.setInt(4, idCiudad);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
