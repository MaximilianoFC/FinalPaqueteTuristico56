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
    Connection con = Conexion.getConexion();
    
    public GestionPasaje() {
        initComponents();
        cargarDatosEnComboBox();
        QuitarLaBarraTitulo();
        
                 // Consulta para obtener los tipos de transporte según el estado
        String sql3 = "SELECT tipoTransporte FROM pasaje WHERE estado = ?";
        boolean estado2 = false;
        try (PreparedStatement statement = con.prepareStatement(sql3)) {
            // Establecer el estado en la consulta
            statement.setBoolean(1, estado2);
            
            // Ejecutar la consulta y obtener los resultados
            try (ResultSet resultSet = statement.executeQuery()) {
                // Limpiar la JComboBox antes de añadir nuevos elementos
                jComboBoxTD.removeAllItems();
                
                // Añadir tipos de transporte a la JComboBox
                while (resultSet.next()) {
                    String tipoTransporte = resultSet.getString("tipoTransporte");
                    jComboBoxTD.addItem(tipoTransporte);
                }
            }
        } catch (SQLException e) {
            // Manejar las excepciones (por ejemplo, imprimir errores o lanzar una excepción personalizada)
            e.printStackTrace();
        }
        
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
        jTextTipoTransporte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboCiudad = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTD = new javax.swing.JComboBox<>();
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
        jBGuardar.setText("Cambiar");
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
        jLabel6.setText("Añadir/Editar transporte");

        jTextTipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTipoTransporteActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de transporte");

        jLabel7.setText("Precio");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
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

        jComboBoxTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTDActionPerformed(evt);
            }
        });

        jButton4.setText("Reactivar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel7)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton1)
                                        .addGap(28, 28, 28)
                                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBLimpíar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))
                                .addGap(18, 18, 18)
                                .addComponent(jComboCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(200, 200, 200)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jButton4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxTD, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(230, 230, 230))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCTipoTransporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jTextTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jBGuardar)
                    .addComponent(jButton4))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
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
        jCTipoTransporte.addItem("Dont Touch <3. (ID: -1)");
    }

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        // Abrir menu salida
        MenuSalida MS = new MenuSalida();
        //con getDesktopPane tengo acceso al desktopPane desde el jinternalFrame
        getDesktopPane().add(MS);
        MS.setVisible(true);  
    }//GEN-LAST:event_jSalirMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String nombreCiudad = jComboCiudad.getSelectedItem().toString();
        String tipoTransporte = jCTipoTransporte.getSelectedItem().toString();
        int indiceParentesis = tipoTransporte.indexOf("(");

        if (indiceParentesis != -1) {
            tipoTransporte = tipoTransporte.substring(0, indiceParentesis).trim();
            System.out.println(tipoTransporte);
        }
        double precio = Double.parseDouble(jTextPrecio.getText());
        int idCiudad = -1; 
        int pasajeID = obtenerPasajeIDPorTipoTransporte();
        if (pasajeID != -1) {
                String consultaCiudad = "SELECT idCiudad FROM ciudad WHERE nombre = ?";
                try (PreparedStatement statementCiudad = con.prepareStatement(consultaCiudad)) {
                    statementCiudad.setString(1, nombreCiudad);
                    try (ResultSet resultSet = statementCiudad.executeQuery()) {
                        if (resultSet.next()) {
                            idCiudad = resultSet.getInt("idCiudad");
                        } else {
                            JFrame parent = new JFrame();
                            JOptionPane.showMessageDialog(parent, "La ciudad seleccionada no se encuentra en la base de datos.");
                            return;
                        }
                    }
                }  catch (SQLException ex) {
                    Logger.getLogger(GestionPasaje.class.getName()).log(Level.SEVERE, null, ex);
                }

        String sql = "UPDATE pasaje SET importe = ? WHERE tipoTransporte = ? AND idCiudad = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setDouble(1, precio);
            statement.setString(2, tipoTransporte);
            statement.setInt(3, idCiudad);
            statement.setString(4, tipoTransporte);
            statement.setInt(5, idCiudad);
            int filasActualizadas = statement.executeUpdate();

            if (filasActualizadas > 0) {
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "Datos actualizados correctamente.");
                
            } else {
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "No se encontraron registros para actualizar.");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
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
            String sql = "SELECT idPasaje, tipoTransporte, importe, estado, idCiudad FROM pasaje WHERE tipoTransporte = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, tipoTransporte);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                boolean estado = resultSet.getBoolean("estado");

                if (estado) {
                    String precio = resultSet.getString("importe");
                    int idCiudad = resultSet.getInt("idCiudad");

                    // Obtener el nombre de la ciudad
                    String nombreCiudad = obtenerNombreCiudad(idCiudad);

                    // Actualiza los JTextField con los datos obtenidos
                    jTextTotal.setText(String.valueOf(precio));
                    jTextTipoTransporte.setEditable(false);
                    jTextTipoTransporte.setText(tipoTransporte);
                    jTextPrecio.setText(precio);
                    jComboCiudad.setSelectedItem(nombreCiudad);
                    jComboCiudad.setEnabled(false);
                } else {
                    jTextTotal.setText("NaN Boolean");
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

    private String obtenerNombreCiudad(int idCiudad) throws SQLException {
    String nombreCiudad = "No encontrado";

    String consulta = "SELECT nombre FROM ciudad WHERE idCiudad = ?";
    try (PreparedStatement statement = con.prepareStatement(consulta)) {
        statement.setInt(1, idCiudad);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                nombreCiudad = resultSet.getString("nombre");
            }
        }
    }

    return nombreCiudad;
}
    
    private void jBLimpíarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpíarActionPerformed
            if (working2 == 1){
                working = 0;
            try {
                String sql = "SELECT p.tipoTransporte,p.estado,p.importe, c.nombre FROM pasaje p JOIN ciudad c ON p.idCiudad = c.idCiudad";

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
                    jTextTipoTransporte.setEditable(false);
                    jComboCiudad.setEnabled(false);
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
             String sql3 = "SELECT tipoTransporte FROM pasaje WHERE estado = ?";
        boolean estado2 = false;
        try (PreparedStatement statement = con.prepareStatement(sql3)) {
            // Establecer el estado en la consulta
            statement.setBoolean(1, estado2);
            
            // Ejecutar la consulta y obtener los resultados
            try (ResultSet resultSet = statement.executeQuery()) {
                // Limpiar la JComboBox antes de añadir nuevos elementos
                jComboBoxTD.removeAllItems();
                
                // Añadir tipos de transporte a la JComboBox
                while (resultSet.next()) {
                    String tipoTransporte = resultSet.getString("tipoTransporte");
                    jComboBoxTD.addItem(tipoTransporte);
                }
            }
        } catch (SQLException e) {
            // Manejar las excepciones (por ejemplo, imprimir errores o lanzar una excepción personalizada)
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jBLimpíarActionPerformed

    private void jComboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCiudadActionPerformed

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

    private void jTextTipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTipoTransporteActionPerformed
   
    }//GEN-LAST:event_jTextTipoTransporteActionPerformed

    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextTipoTransporte.setEditable(true);
        jTextTipoTransporte.setText("");
        jTextPrecio.setText("");
        jTextPrecio.setEditable(true);
        jComboCiudad.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              try {
            // Obtener el tipo de transporte del JComboBox
            String tipoTransporte = jTextTipoTransporte.getText();
            int indiceParentesis = tipoTransporte.indexOf("(");
            if (indiceParentesis != -1) {
                tipoTransporte = tipoTransporte.substring(0, indiceParentesis).trim();
            }

            // Obtener el importe del JTextField
            double importe = Double.parseDouble(jTextPrecio.getText());

            // Obtener el nombre de la ciudad del JComboBox
            String nombreCiudad = (String) jComboCiudad.getSelectedItem();

            // Obtener el ID de la ciudad usando el nombre proporcionado
            int idCiudad = obtenerIdCiudad(con, nombreCiudad);

            // Consulta para insertar un nuevo registro en la tabla pasaje
            String sql = "INSERT INTO pasaje (tipoTransporte , importe , estado, idCiudad) VALUES (?, ?, ?, ?)";
            
            boolean estado = true;
            
            // Crear un PreparedStatement para ejecutar la consulta
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                // Establecer los valores en la consulta
                statement.setString(1, tipoTransporte);
                statement.setDouble(2, importe);
                statement.setBoolean(3, estado);
                statement.setInt(4, idCiudad);
                
                // Ejecutar la consulta para insertar el nuevo pasaje
                statement.executeUpdate();
                System.out.println("Nuevo pasaje insertado correctamente.");
            }
        } catch (SQLException | NumberFormatException e) {
            // Manejar las excepciones (por ejemplo, imprimir errores o lanzar una excepción personalizada)
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTDActionPerformed
    
    }//GEN-LAST:event_jComboBoxTDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           String tipoTransporte = (String) jComboBoxTD.getSelectedItem();
        
        // Consulta para actualizar el estado del tipo de transporte a true
        String sql = "UPDATE pasaje SET estado = true WHERE tipoTransporte = ?";
        
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            // Establecer el tipo de transporte en la consulta
            statement.setString(1, tipoTransporte);
            
            // Ejecutar la consulta para actualizar el estado del tipo de transporte a true
            statement.executeUpdate();
            System.out.println("Estado de '" + tipoTransporte + "' actualizado a true correctamente.");
        } catch (SQLException e) {
            // Manejar las excepciones (por ejemplo, imprimir errores o lanzar una excepción personalizada)
            e.printStackTrace();
        }
        
         String sql3 = "SELECT tipoTransporte FROM pasaje WHERE estado = ?";
        boolean estado2 = false;
        try (PreparedStatement statement = con.prepareStatement(sql3)) {
            // Establecer el estado en la consulta
            statement.setBoolean(1, estado2);
            
            // Ejecutar la consulta y obtener los resultados
            try (ResultSet resultSet = statement.executeQuery()) {
                // Limpiar la JComboBox antes de añadir nuevos elementos
                jComboBoxTD.removeAllItems();
                
                // Añadir tipos de transporte a la JComboBox
                while (resultSet.next()) {
                    
                    jComboBoxTD.addItem(tipoTransporte);
                }
            }
        } catch (SQLException e) {
            // Manejar las excepciones (por ejemplo, imprimir errores o lanzar una excepción personalizada)
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed
      private static int obtenerIdCiudad(Connection con, String nombreCiudad) throws SQLException {
        // Consulta para obtener el ID de la ciudad usando el nombre
        String sql = "SELECT idCiudad FROM ciudad WHERE nombre = ?";
        
        // Crear un PreparedStatement para ejecutar la consulta
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            // Establecer el nombre de la ciudad en la consulta
            statement.setString(1, nombreCiudad);

            // Ejecutar la consulta y obtener el ID de la ciudad
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("idCiudad");
                }
            }
        }
        
        // Si no se encuentra la ciudad, retornar -1 o lanzar una excepción según sea necesario
        return -1;
    }

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
    private javax.swing.JComboBox<String> jComboBoxTD;
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
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextTipoTransporte;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables
//quitar barra superior
}
