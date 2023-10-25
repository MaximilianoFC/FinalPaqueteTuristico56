/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import finalpaqueteturistico56.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GestionPasaje extends javax.swing.JInternalFrame {
    private int working = 0;
    private int working2 = 0;
    private int city = 0;
    Connection con = Conexion.getConexion();
    
    public GestionPasaje() {
        initComponents();
        cargarDatosEnComboBox();
        QuitarLaBarraTitulo();
        
     try {
        String sql = "SELECT p.tipoTransporte,p.estado, c.nombre FROM pasaje p JOIN ciudad c ON p.idCiudad = c.idCiudad";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        jCTipoTransporte.removeAllItems();

        while (resultSet.next()) {
            String tipoTransporte = resultSet.getString("tipoTransporte");
            String nombreCiudad = resultSet.getString("nombre");
            String item = tipoTransporte + " (Ciudad: " + nombreCiudad + ")";
            boolean estado = resultSet.getBoolean("estado");
            if (estado == true){
            jCTipoTransporte.addItem(item);
            }           
            working = 1;
        }

        } catch (SQLException ex) {
            Logger.getLogger(GestionPasaje.class.getName()).log(Level.SEVERE, null, ex);
        }
      String sql = "SELECT nombre FROM ciudad";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            jComboCiudad.removeAllItems(); // Limpia el JComboBox antes de cargar nuevos datos

            while (resultSet.next()) {
                String nombreCiudad = resultSet.getString("nombre");
                jComboCiudad.addItem(nombreCiudad); // Agrega cada ciudad al JComboBox
            }
        } catch (SQLException ex) {
            // Manejar excepciones SQL, por ejemplo, mostrando un mensaje de error
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBLimpíar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCTipoTransporte = new javax.swing.JComboBox<>();
        jTextTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboCiudad = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(189, 238, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Pequeño.jpg"))); // NOI18N

        jSalir.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jSalir.setText("X");
        jSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Gestion Pasaje");

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpíar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpíar.setText("Actualizar");
        jBLimpíar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpíarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ver transportes");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total");

        jCTipoTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCTipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoTransporteActionPerformed(evt);
            }
        });

        jTextTotal.setEditable(false);
        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Añadir transporte");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");

        jButton2.setText("Limpiar");

        jLabel2.setText("Tipo de transporte");

        jLabel7.setText("Precio");

        jLabel8.setText("Ciudad");

        jComboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCiudadActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Reactivar transporte");

        jLabel10.setText("Transportes desactivados");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton4.setText("Reactivar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBLimpíar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1)
                                .addGap(37, 37, 37)
                                .addComponent(jBGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jButton4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(230, 230, 230))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSalir)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpíar)
                    .addComponent(jButton3))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jBGuardar)
                    .addComponent(jButton4))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;

    public void QuitarLaBarraTitulo(){
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
    private void cargarDatosEnComboBox() {
        jCTipoTransporte.addItem("Unviewed (ID: -1)");
    }

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        // Abrir menu salida
        MenuSalida MS = new MenuSalida();
        //con getDesktopPane tengo acceso al desktopPane desde el jinternalFrame
        getDesktopPane().add(MS);
        MS.setVisible(true);  
    }//GEN-LAST:event_jSalirMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
   
        int pasajeID = obtenerPasajeIDPorTipoTransporte();
        if (pasajeID != -1) {
            try {
                int importe = Integer.parseInt(jTextTotal.getText()); // Obtener el importe del JTextField

                String sql = "UPDATE pasaje SET importe = ? WHERE idPasaje = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.setInt(1, importe);
                preparedStatement.setInt(2, pasajeID);

                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    JFrame parent = new JFrame();
                    JOptionPane.showMessageDialog(parent, "Importe actualizado correctamente en la base de datos.");
                } else {
                    JFrame parent = new JFrame();
                    JOptionPane.showMessageDialog(parent, "No se pudo actualizar el importe en la base de datos.");
                }
            } catch (NumberFormatException | SQLException ex) {
                JFrame parent = new JFrame();
                String error = ex.getMessage();
                JOptionPane.showMessageDialog(parent, "Error SQL : \n"+error);
            }
            } else {
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "Como llegamos aca? Pasaje no encontrado");
            }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private int obtenerPasajeIDPorTipoTransporte() {
        int pasajeID = -1;
        String seleccion = (String) jCTipoTransporte.getSelectedItem();
        String tipoTransporte = (String) jCTipoTransporte.getSelectedItem();
        int indiceParentesis = seleccion.indexOf("(");
            if (indiceParentesis != -1) {
                tipoTransporte = seleccion.substring(0, indiceParentesis).trim();
            }
        
        try {
            String sql = "SELECT idPasaje FROM pasaje WHERE tipoTransporte = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, tipoTransporte);

            ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            pasajeID = resultSet.getInt("idPasaje");
        }
        } catch (SQLException ex) {
            // Manejar excepciones SQL, por ejemplo, mostrando un mensaje de error
            ex.printStackTrace();
        }
        System.out.println("Tipo de transporte seleccionado: " + seleccion);
        return pasajeID;
    
    }
    
    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jCTipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoTransporteActionPerformed
        
    if (working == 1){
        String tipoTransporte = (String) jCTipoTransporte.getSelectedItem();
        int indiceParentesis = tipoTransporte.indexOf("(");

        if (indiceParentesis != -1) {
            tipoTransporte = tipoTransporte.substring(0, indiceParentesis).trim();
        }
    
        try {
            String sql = "SELECT idPasaje, importe, estado FROM pasaje WHERE tipoTransporte = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, tipoTransporte);

            ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            boolean estado = resultSet.getBoolean("estado");

            if (estado) {
                double precio = resultSet.getDouble("importe");
                // Actualiza el JTextField con el precio del tipoTransporte seleccionado
                jTextTotal.setText(String.valueOf(precio));
                // Puedes usar pasajeID si es necesario para otras operaciones
            } else {
                jTextTotal.setText("Como llegamos aca? err boolean");
            }
        } else {
            // Manejar el caso donde no se encuentra el pasaje con el tipoTransporte seleccionado
            jTextTotal.setText("Precio no encontrado"); 
        }
        } catch (SQLException ex) {
        // Manejar excepciones SQL, por ejemplo, mostrando un mensaje de error
            ex.printStackTrace();
        }
      
        }
    working2 = 1;
    }//GEN-LAST:event_jCTipoTransporteActionPerformed

    private void jBLimpíarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpíarActionPerformed
            if (working2 == 1){
                working = 0;
            try {
                String sql = "SELECT p.tipoTransporte,p.estado, c.nombre FROM pasaje p JOIN ciudad c ON p.idCiudad = c.idCiudad";

                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                jCTipoTransporte.removeAllItems();

            while (resultSet.next()) {
                String tipoTransporte = resultSet.getString("tipoTransporte");
                String nombreCiudad = resultSet.getString("nombre");
                String item = tipoTransporte + " (Ciudad: " + nombreCiudad + ")";
                boolean estado = resultSet.getBoolean("estado");
                if (estado == true){
                    jCTipoTransporte.addItem(item);
                }           
           
            }

            } catch (SQLException ex) {
                Logger.getLogger(GestionPasaje.class.getName()).log(Level.SEVERE, null, ex);
            }
            String tipoTransporte = (String) jCTipoTransporte.getSelectedItem();
            int indiceParentesis = tipoTransporte.indexOf("(");
            if (indiceParentesis != -1) {
            tipoTransporte = tipoTransporte.substring(0, indiceParentesis).trim();
            }
            try {
        
                String sql = "SELECT idPasaje, importe FROM pasaje WHERE tipoTransporte = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.setString(1, tipoTransporte);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    double precio = resultSet.getDouble("importe");
                    jTextTotal.setText(String.valueOf(precio));
                } else {
                    jTextTotal.setText("Precio no encontrado"); 
                }
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
            working = 1;
    }//GEN-LAST:event_jBLimpíarActionPerformed

    private void jComboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCiudadActionPerformed
      if (city == 1){
        String sql = "SELECT nombre FROM ciudad";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            jComboCiudad.removeAllItems(); // Limpia el JComboBox antes de cargar nuevos datos

            while (resultSet.next()) {
                String nombreCiudad = resultSet.getString("nombre");
                jComboCiudad.addItem(nombreCiudad); // Agrega cada ciudad al JComboBox
            }
        } catch (SQLException ex) {
            // Manejar excepciones SQL, por ejemplo, mostrando un mensaje de error
            ex.printStackTrace();
        }
      }
      city = 1;
    }//GEN-LAST:event_jComboCiudadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        String tipoTransporte = (String) jCTipoTransporte.getSelectedItem();
        int indiceParentesis = tipoTransporte.indexOf("(");

        if (indiceParentesis != -1) {
            tipoTransporte = tipoTransporte.substring(0, indiceParentesis).trim();

            try {
                String sql = "UPDATE pasaje SET estado = ? WHERE tipoTransporte = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);

                preparedStatement.setBoolean(1, false);
                preparedStatement.setString(2, tipoTransporte);

                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Borrado lógico realizado correctamente.");
                } else {
                    System.out.println("No se encontró el pasaje con el tipo de transporte especificado.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Tipo de transporte no válido.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
            try {
                String sql = "SELECT p.tipoTransporte,p.estado, c.nombre FROM pasaje p JOIN ciudad c ON p.idCiudad = c.idCiudad";

                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                jCTipoTransporte.removeAllItems();

            while (resultSet.next()) {
                String tipoTransporte = resultSet.getString("tipoTransporte");
                String nombreCiudad = resultSet.getString("nombre");
                String item = tipoTransporte + " (Ciudad: " + nombreCiudad + ")";
                boolean estado = resultSet.getBoolean("estado");
                if (estado == true){
                    jCTipoTransporte.addItem(item);
                }           
           
            }

            } catch (SQLException ex) {
                Logger.getLogger(GestionPasaje.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpíar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCTipoTransporte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSalir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables
//quitar barra superior
}
