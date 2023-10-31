package clases;

import Entidades.Ciudad;
import finalpaqueteturistico56.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        Connection connection = Conexion.getConexion();
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public void modificarCiudad(int idCiudad, String nombre, String pais, String provincia, boolean estado) {
        String sql = "UPDATE ciudad SET nombre = ?, pais = ?, provincia = ?, estado =? WHERE idCiudad = ?";
        Connection connection = Conexion.getConexion();
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, pais);
            ps.setString(3, provincia);
            ps.setInt(4, idCiudad);
            ps.setBoolean(5, estado);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Ciudad buscarCiudad(int id) {
        Ciudad ciudad = null;
        String sql = "SELECT * FROM ciudad WHERE idCiudad = ?";
        Connection connection = Conexion.getConexion();
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(id);
                ciudad.setEstado(rs.getBoolean("estado"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
            } else {
                JOptionPane.showMessageDialog(null, "Ciudad no encontrada");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ciudad;
    }

    public ArrayList<Ciudad> ListarCiudadesNEW() {
//        Ciudad ciudad = null;
        ArrayList<Ciudad> cities = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad";
            Connection connection = Conexion.getConexion();
            PreparedStatement ps;

            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ciudad citiesX = new Ciudad();
                citiesX.setIdCiudad(rs.getInt("idCiudad"));
                citiesX.setEstado(rs.getBoolean("estado"));
                citiesX.setNombre(rs.getString("nombre"));
                citiesX.setPais(rs.getString("pais"));
                citiesX.setProvincia(rs.getString("provincia"));

                cities.add(citiesX);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cities;
    }

    public ArrayList<Ciudad> ListarCiudades() {
        String sql = "SELECT * FROM ciudad";
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Connection connection = Conexion.getConexion();
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setEstado(true);
                ciudades.add(ciudad);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
            JOptionPane.showMessageDialog(null, " Error al acceder a lista de Ciudades ");
        }
        return ciudades;
    }

}
