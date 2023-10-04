/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import finalpaqueteturistico56.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Maxo Marto
 */
public class CiudadData {
    Connection con = Conexion.getConexion();
     // Método para Alta (A)
    public void agregarCiudad(String nombre, String pais, String provincia) {
        String sql = "INSERT INTO CiudadData (nombre, pais, estado, provincia) VALUES (?, ?, 1, ?)";
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

    // Método para Baja (B) - Modificación lógica de estado
    public void eliminarCiudad(int idCiudad) {
        String sql = "UPDATE CiudadData SET estado = 0 WHERE idCiudad = ?";
        try (Connection connection = Conexion.getConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idCiudad);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para Modificación (M)
    public void modificarCiudad(int idCiudad, String nombre, String pais, String provincia) {
        String sql = "UPDATE CiudadData SET nombre = ?, pais = ?, provincia = ? WHERE idCiudad = ?";
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
