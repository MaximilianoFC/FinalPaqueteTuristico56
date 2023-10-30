package Vistas;

import java.sql.Connection;
import Entidades.Ciudad;
import java.awt.Dimension;
import javax.swing.JComponent;
import finalpaqueteturistico56.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.mariadb.jdbc.Statement;



public class GestionCiudades extends javax.swing.JInternalFrame {
    Connection con = Conexion.getConexion();

    /**
     * Creates new form MenuCiudades
     */
    public GestionCiudades() {
        initComponents();
//        cargarDatosEnComboBox();
//        QuitarLaBarraTitulo();
       
    }
    
    public void guardarCiudad (Ciudad ciudad) {
//        
//        String sql="INSERT INTO ciudad (nombre, pais, provincia, estado)"
//                + "VALUES(?,?,?,?)" ;
//        
//        try {
//            PreparedStatement preparedStatement = con.prepareStatement(sql);
//            preparedStatement.setString(1, ciudad.getNombre());
//            preparedStatement.setString(2, ciudad.getPais());
//            preparedStatement.setString(3, ciudad.getProvincia());
//            preparedStatement.setBoolean(4, ciudad.isActivo());
//            preparedStatement.executeUpdate();
//            jCBCiudad.removeAllItems();
//            
//            
//            ResultSet rs = preparedStatement.getGeneratedKeys();
//            if(rs.next()){
//                ciudad.setidCiudad(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Ciudad guardada");
//            
//            }
//            
//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "Error al acceder a Cuidades");
//           
//        }
//    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSalir = new javax.swing.JLabel();
        jBBorrar = new javax.swing.JButton();
        jBLimpíar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTIdCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTPais = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTProvincia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTCiudad = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(189, 238, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Pequeño.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setText("Gestion Ciudades");

        jSalir.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jSalir.setText("X");
        jSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });

        jBBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBLimpíar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpíar.setText("Limpiar");
        jBLimpíar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpíarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("ID Ciudad");
        jLabel3.setMaximumSize(new java.awt.Dimension(25, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(25, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 16));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("Pais");
        jLabel4.setMaximumSize(new java.awt.Dimension(138, 24));
        jLabel4.setMinimumSize(new java.awt.Dimension(138, 24));
        jLabel4.setPreferredSize(new java.awt.Dimension(138, 24));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 63, 65));
        jLabel5.setText("Provincia / Estado ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 63, 65));
        jLabel6.setText("Estado");

        jRadioButton1.setText(" Activo");

        jRadioButton2.setText(" Inactivo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdCiudad", "Pais", "Provincia/ Estado", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPaisActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProvinciaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 63, 65));
        jLabel8.setText("Ciudad");
        jLabel8.setMaximumSize(new java.awt.Dimension(25, 16));
        jLabel8.setMinimumSize(new java.awt.Dimension(25, 16));
        jLabel8.setPreferredSize(new java.awt.Dimension(25, 16));

        jTCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)))
                                .addComponent(jRadioButton1)
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBBorrar)
                                    .addComponent(jRadioButton2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jBLimpíar)
                                .addGap(18, 18, 18)
                                .addComponent(jBNuevo)
                                .addGap(31, 31, 31)
                                .addComponent(jBGuardar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTIdCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jBBuscar))
                                        .addComponent(jTPais)
                                        .addComponent(jTCiudad, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(172, 172, 172)))
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSalir)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTIdCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpíar)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBBorrar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        // Abrir menu salida
         MenuSalida MS = new MenuSalida(); 
         //con getDesktopPane tengo acceso al desktopPane desde el jinternalFrame
        getDesktopPane().add(MS);
        MS.setVisible(true);    
    }//GEN-LAST:event_jSalirMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
          // TODO add your handling code here:
//         int idCiudad = obtenerIdCiudad();
//       
//
//        String sql = "UPDATE ciudad SET id = ? WHERE idCiudad = ?";
//                    PreparedStatement ps = null;
//        
//        try {
//             ps = con.prepareStatement(sql);
//            ps.setInt(1, idCiudad);
//            int filasAfectadas = ps.executeUpdate();
//              if (filasAfectadas > 0) {
//                    JFrame parent = new JFrame();
//                    JOptionPane.showMessageDialog(null, "Ciudad ingresada a la base de datos.");
//                } else if(filasAfectadas <= 0) {
//                    JFrame parent = new JFrame();
//                    JOptionPane.showMessageDialog(null, "No se pudo ingresar la ciudad a la base de datos.");
//                } else{
//                JOptionPane.showMessageDialog(null, "Ciudad no encontrada");
//                        }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, "Error al ingresar datos de la ciudad");
//        }
//                                         
//        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPaisActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
//        updateCiudad();
//        limpiarTabla();
//        cargarCiudadTabla();
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBLimpíarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpíarActionPerformed
        // TODO add your handling code here:
//        jTIdCiudad.setText(null);
//        jCBCiudad.setSelectedItem(null);
//        jCPaises.setSelectedItem(null);
//        jCProvincias.setSelectedItem(null);
//        jRadioInactivo.setSelected(false);
    }//GEN-LAST:event_jBLimpíarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
//         insertarCiudad();
//          limpiarTabla();
//          cargarjTCiudad();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProvinciaActionPerformed

    private void jTCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCiudadActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int jBBuscar; 
        jBBuscar = Integer.parseInt(jTIdCiudad.getText());
//        
//        try {
//            String sql = "SELECT* FROM Ciudad WHERE IdCiudad = ?";
//        
//            PreparedStatement statement = con.prepareStatement(sql);
//            statement.setInt(1,jBBuscar);
//    
//        
//            ResultSet resultado = statement.executeQuery();
//
//            while(resultado.next()){
//                //coloco los datos en los campos de texto
//                jTCiudad.setText(resultado.getString("Ciudad"));
//                jTPais.setText(resultado.getString("Pais"));
//                jTProvincia.setText(resultado.getString("Provincia");
//                
//                for (int i = 0; i < model.getSize(); i++);
//        }  catch (SQLException ex) {
//            Logger.getLogger(GestionCiudad.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpíar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTIdCiudad;
    private javax.swing.JTextField jTPais;
    private javax.swing.JTextField jTProvincia;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
//quitar barra superior
// private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
//private Dimension DimensionBarra = null;
//
//public final void QuitarLaBarraTitulo()
//{
//Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
//DimensionBarra = Barra.getPreferredSize();
//Barra.setSize(0,0);
//Barra.setPreferredSize(new Dimension(0,0));
//repaint();
//}
//
//    private void cargarDatosEnComboBox() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}
}