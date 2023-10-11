/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Entidades.Paquete;
import finalpaqueteturistico56.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicole
 */
public class PaqueteData {
         private Connection con=null;
     
     public PaqueteData(){
         this.con=Conexion.getConexion();
     }
    
    public void agregarPaquete(Paquete paquete) {
        /*recibe un paquete compuesto por dos ciudades, un alojamiento, 
        un pasaje y un estado*/
                
        String sql= "INSERT INTO paquete (idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje, estado) VALUES (?, ?, ?, ?, ?)";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             /*extraemos los datos que necesitamos de los objetos que componen 
            el paquete y reemplazamos las variables dinamicas con estos datos*/
            ps.setInt(1,2); 
             ps.setInt(2,3);
             ps.setInt(3,1);
             ps.setInt(4,1);
             ps.setBoolean(5,true);
             
             ps.executeUpdate();
             ResultSet rs=ps.getGeneratedKeys();
             if (rs.next()) {
                 paquete.setIdPaquete(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Paquete cargado correctamente");
             }
             
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete"+ex.getMessage());
         }
        
        
    }
    
    public void modificarPaquete (Paquete paquete){
        /*recibe un paquete y le cambia los id de sus componentes*/
        String sql= "UPDATE paquete set idCiudadOrigen=?, idCiudadDestino=?, idAlojamiento=?, idPasaje=? WHERE idPaquete=?";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             
             ps.setInt(1, paquete.getOrigen().getIdCiudad());
             ps.setInt(2, paquete.getDestino().getIdCiudad());
             ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
             ps.setInt(4, paquete.getPasaje().getIdPasaje());
             ps.setInt(5, paquete.getIdPaquete());
             
             int exito=ps.executeUpdate();
             
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Paquete modificado");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al modificar el paquete"+ex.getMessage());
         }
        
    
    }
    
    public void bajaPaquete (int id){
        /*recibe el id del paquete que queremos dar de baja (le cambia el estado a 0)*/
        String sql="UPDATE paquete SET estado = 0 WHERE idPaquete = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja el paquete");
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete"+ex.getMessage());
        }
    }
    
    public void darAltaPaquete (int id){
        /*recibe el id del paquete que queremos REACTIVAR (le cambia el estado a 1)*/
        String sql="UPDATE paquete SET estado = 1 WHERE idPaquete = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Se ha activado el paquete");
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete"+ex.getMessage());
        }
    }
}
