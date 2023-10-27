
package Vistas;

import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import Entidades.Pasaje;
import clases.PaqueteData;
import finalpaqueteturistico56.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionPaquetes extends javax.swing.JInternalFrame {
    Connection con = Conexion.getConexion();
    private DefaultTableModel modelo=new DefaultTableModel(){
        
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };

    public GestionPaquetes() {
        initComponents();
        armarCabeceraTabla();
        QuitarLaBarraTitulo();
        List <Ciudad> listaDeCiudades=listarCiudades(); 
        cargarCiudadOrigen(listaDeCiudades);
        cargarCiudadDestino(listaDeCiudades);
        jBReactivar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBGuardar.setEnabled(false);
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSalir = new javax.swing.JLabel();
        jBBorrar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBReactivar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBCiudadOrigen = new javax.swing.JComboBox<>();
        jCBCiudadDestino = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlojamiento = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jRBAlta = new javax.swing.JRadioButton();
        jRBMedia = new javax.swing.JRadioButton();
        jRBBaja = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jTFPrecioCantidadDias = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCBPasaje = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFPrecioPorPersona = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFCantidadPersonas = new javax.swing.JTextField();
        jBMultiplicarPorPersona = new javax.swing.JButton();
        jTFPrecioPorXPersonas = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTFPrecioConIncremento = new javax.swing.JTextField();
        jBCalcularPrecio = new javax.swing.JButton();
        jBPrecioConIncremento = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBLimpíar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTFIdPaquete = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jRBInactivo = new javax.swing.JRadioButton();
        jRBActivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(189, 238, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Pequeño.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel2.setText("Gestion Paquetes");

        jSalir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jSalir.setText("X");
        jSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Actualizar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBReactivar.setBackground(new java.awt.Color(255, 255, 255));
        jBReactivar.setText("Reactivar");
        jBReactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReactivarActionPerformed(evt);
            }
        });

        jLabel4.setText("Origen");

        jLabel5.setText("Destino");

        jCBCiudadOrigen.setBackground(new java.awt.Color(255, 255, 255));
        jCBCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCiudadOrigenActionPerformed(evt);
            }
        });

        jCBCiudadDestino.setBackground(new java.awt.Color(255, 255, 255));
        jCBCiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCiudadDestinoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Alojamiento");

        jTAlojamiento.setBackground(new java.awt.Color(255, 255, 255));
        jTAlojamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlojamientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAlojamiento);

        jLabel12.setText("Temporada");

        jRBAlta.setBackground(new java.awt.Color(255, 255, 255));
        jRBAlta.setText("Alta");
        jRBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAltaActionPerformed(evt);
            }
        });

        jRBMedia.setBackground(new java.awt.Color(255, 255, 255));
        jRBMedia.setText("Media");

        jRBBaja.setBackground(new java.awt.Color(255, 255, 255));
        jRBBaja.setText("Baja");
        jRBBaja.setToolTipText("");

        jLabel16.setText("Precio por cantidad de dias");

        jTFPrecioCantidadDias.setEditable(false);
        jTFPrecioCantidadDias.setBackground(new java.awt.Color(255, 255, 255));
        jTFPrecioCantidadDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrecioCantidadDiasActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Pasaje");

        jCBPasaje.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel8.setText("Precio total por persona");

        jLabel9.setText("¿Desea saber el precio para mas de una persona?");

        jTFPrecioPorPersona.setEditable(false);

        jLabel10.setText("Ingrese cantidad de personas");

        jBMultiplicarPorPersona.setBackground(new java.awt.Color(255, 255, 255));
        jBMultiplicarPorPersona.setText("Calcular");
        jBMultiplicarPorPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicarPorPersonaActionPerformed(evt);
            }
        });

        jTFPrecioPorXPersonas.setEditable(false);

        jLabel18.setText("Precio total con incremento de temporada");

        jTFPrecioConIncremento.setEditable(false);

        jBCalcularPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jBCalcularPrecio.setText("Calcular");
        jBCalcularPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularPrecioActionPerformed(evt);
            }
        });

        jBPrecioConIncremento.setBackground(new java.awt.Color(255, 255, 255));
        jBPrecioConIncremento.setText("Calcular");
        jBPrecioConIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrecioConIncrementoActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBLimpíar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpíar.setText("Limpiar");
        jBLimpíar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpíarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBCalcularPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPrecioPorPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBMultiplicarPorPersona)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPrecioPorXPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jBPrecioConIncremento)
                .addGap(18, 18, 18)
                .addComponent(jTFPrecioConIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpíar)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPrecioPorPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCalcularPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10)
                    .addComponent(jTFCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMultiplicarPorPersona)
                    .addComponent(jTFPrecioPorXPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFPrecioConIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBNuevo)
                        .addComponent(jBLimpíar))
                    .addComponent(jBPrecioConIncremento))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3.setText("Buscar paquete");

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jRBInactivo.setBackground(new java.awt.Color(255, 255, 255));
        jRBInactivo.setText("Inactivo");

        jRBActivo.setBackground(new java.awt.Color(255, 255, 255));
        jRBActivo.setText("Activo");

        jLabel6.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBCiudadDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(jCBCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalir)
                        .addGap(32, 32, 32))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPrecioCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jCBPasaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFIdPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBActivo)
                    .addComponent(jRBInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBReactivar)
                .addGap(18, 18, 18)
                .addComponent(jBBorrar)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSalir)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(19, 19, 19))
                            .addComponent(jLabel2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBAlta)
                            .addComponent(jTFPrecioCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBMedia)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBBaja)
                            .addComponent(jCBPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFIdPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBReactivar)
                    .addComponent(jBBorrar)
                    .addComponent(jBGuardar)
                    .addComponent(jLabel6)
                    .addComponent(jRBInactivo))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, Short.MAX_VALUE)
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

        Ciudad ciudadOrigen=(Ciudad) jCBCiudadOrigen.getSelectedItem();
        int idCiudadOrigen=ciudadOrigen.getIdCiudad();
        
        Ciudad ciudadDestino=(Ciudad) jCBCiudadDestino.getSelectedItem();
        int idCiudadDestino=ciudadDestino.getIdCiudad();
        
        int idAlojamiento=obtenerIdAlojamiento();
        
        int idPasaje=obtenerIdPasaje();
        
        int idPaquete=Integer.parseInt(jTFIdPaquete.getText());
        
        PaqueteData paqueteData=new PaqueteData();
        paqueteData.modificarPaquete(idPaquete, idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        Ciudad ciudadOrigen=(Ciudad) jCBCiudadOrigen.getSelectedItem();
        int idCiudadOrigen=ciudadOrigen.getIdCiudad();
        
        Ciudad ciudadDestino=(Ciudad) jCBCiudadDestino.getSelectedItem();
        int idCiudadDestino=ciudadDestino.getIdCiudad();
        
        int idAlojamiento=obtenerIdAlojamiento();
        
        int idPasaje=obtenerIdPasaje();
        
        PaqueteData paqueteData=new PaqueteData();
        paqueteData.agregarPaquete(idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje, true);
        
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jRBAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAltaActionPerformed

    }//GEN-LAST:event_jRBAltaActionPerformed

    private void jCBCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCiudadOrigenActionPerformed
        
        Ciudad ciudadOrigen=(Ciudad) jCBCiudadOrigen.getSelectedItem();
        int idCiudad=ciudadOrigen.getIdCiudad();
        List <Pasaje> listaPasajes=listarPasajes(idCiudad);
        cargarPasajes(listaPasajes);       
    }//GEN-LAST:event_jCBCiudadOrigenActionPerformed

    private void jCBCiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCiudadDestinoActionPerformed
        // TODO add your handling code here:
         
        Ciudad ciudadDestino=(Ciudad) jCBCiudadDestino.getSelectedItem();
        int idCiudad=ciudadDestino.getIdCiudad();
        System.out.println(idCiudad);
        borrarFilasTabla();
        cargarAlojamientos(idCiudad);
    }//GEN-LAST:event_jCBCiudadDestinoActionPerformed

    private void jTFPrecioCantidadDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrecioCantidadDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrecioCantidadDiasActionPerformed

    private void jTAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlojamientoMouseClicked
        // TODO add your handling code here:
        jRBAlta.setSelected(false);
        jRBMedia.setSelected(false);
        jRBBaja.setSelected(false);
        
        int filaSeleccionada = jTAlojamiento.getSelectedRow();
        if (filaSeleccionada!=-1) {
            
            int idAlojamiento=(Integer)jTAlojamiento.getValueAt(filaSeleccionada, 0);
            
            Object fechaI= jTAlojamiento.getValueAt(filaSeleccionada, 1);
            Date fechaII= (Date) fechaI;
            LocalDate fechaIngreso= fechaII.toLocalDate();
            
            Object fechaS= jTAlojamiento.getValueAt(filaSeleccionada, 2);
            Date fechaSS= (Date) fechaS;
            LocalDate fechaSalida= fechaSS.toLocalDate();
            
            double importeDiario=(double) jTAlojamiento.getValueAt(filaSeleccionada, 4);
            
            int cantidadDeDias=(int) ChronoUnit.DAYS.between(fechaIngreso, fechaSalida);
            System.out.println("Cantidad dias: "+cantidadDeDias);
            double precioXCantidadDeDias= importeDiario*cantidadDeDias;
            jTFPrecioCantidadDias.setText(String.valueOf(precioXCantidadDeDias));
           
            int mesFechaIngreso= fechaIngreso.getMonthValue();
            
            switch (mesFechaIngreso) {
                case 1:
                case 7:
                    jRBAlta.setSelected(true);
                    break;
                case 2:
                case 6:
                    jRBMedia.setSelected(true);
                    break;
                default:
                    jRBBaja.setSelected(true);
                    break;
            }
            
        }
        
        
    }//GEN-LAST:event_jTAlojamientoMouseClicked

    private void jBCalcularPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularPrecioActionPerformed
        // TODO add your handling code here:
        double precio=calcularPrecio();
        jTFPrecioPorPersona.setText(String.valueOf(precio));

    }//GEN-LAST:event_jBCalcularPrecioActionPerformed

    private void jBPrecioConIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrecioConIncrementoActionPerformed
        // TODO add your handling code here:
        
        double precioSinIncremento=Double.parseDouble(jTFPrecioPorPersona.getText());
        
        int filaSeleccionada = jTAlojamiento.getSelectedRow();
        if (filaSeleccionada!=-1) {
            
            Object fechaI= jTAlojamiento.getValueAt(filaSeleccionada, 1);
            Date fechaII= (Date) fechaI;
            LocalDate fechaIngreso= fechaII.toLocalDate();
            
            int mesFechaIngreso= fechaIngreso.getMonthValue();
            
            switch (mesFechaIngreso) {
                case 1:
                case 7:
                    double precioConIncrementoAlta=precioSinIncremento + (0.30*precioSinIncremento);
                    jTFPrecioConIncremento.setText(String.valueOf(precioConIncrementoAlta));
                    break;
                case 2:
                case 6:
                    double precioConIncrementoMedia=precioSinIncremento + (0.15*precioSinIncremento);
                    jTFPrecioConIncremento.setText(String.valueOf(precioConIncrementoMedia));
                    break;
                default:
                    jTFPrecioConIncremento.setText(String.valueOf(precioSinIncremento));
                    break;
            }
        }
    }//GEN-LAST:event_jBPrecioConIncrementoActionPerformed

    private void jBMultiplicarPorPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicarPorPersonaActionPerformed
        // TODO add your handling code here:
        double precioPorPersona=Double.parseDouble(jTFPrecioConIncremento.getText());
        int cantidadDePersonas=Integer.parseInt(jTFCantidadPersonas.getText());
        
        jTFPrecioPorXPersonas.setText(String.valueOf(precioPorPersona*cantidadDePersonas));
    }//GEN-LAST:event_jBMultiplicarPorPersonaActionPerformed

    private void jBLimpíarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpíarActionPerformed
        // TODO add your handling code here:
//        jCBCiudadOrigen.setSelectedItem(null);
//        jCBCiudadDestino.setSelectedItem(null);
//        jCBPasaje.setSelectedItem(null);
        borrarFilasTabla();
        jRBAlta.setSelected(false);
        jRBMedia.setSelected(false);
        jRBBaja.setSelected(false);
        jTFPrecioCantidadDias.setText("");
        jTFCantidadPersonas.setText("");
        jTFPrecioConIncremento.setText("");
        jTFPrecioPorPersona.setText("");
        jTFPrecioPorXPersonas.setText("");
        jRBActivo.setSelected(false);
        jRBInactivo.setSelected(false);
        jTFIdPaquete.setText("");
        jBNuevo.setEnabled(true);
        jBReactivar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBGuardar.setEnabled(false);
        
    }//GEN-LAST:event_jBLimpíarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        int idPaquete=Integer.parseInt(jTFIdPaquete.getText());
        
        jRBActivo.setSelected(false);
        jRBInactivo.setSelected(false);
        jBNuevo.setEnabled(false);
        jBReactivar.setEnabled(true);
        jBBorrar.setEnabled(true);
        jBGuardar.setEnabled(true);
        
        
        String sql= "SELECT estado, idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje FROM paquete WHERE idPaquete=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
                
                boolean estado=rs.getBoolean("estado");
                if (estado) {
                    jRBActivo.setSelected(true);
                }else{
                    jRBInactivo.setSelected(true);
                }
                
                String idCiudadOrigen=String.valueOf(rs.getInt("idCiudadOrigen"));
                for (int i = 0; i < jCBCiudadOrigen.getItemCount(); i++) {
                String item=String.valueOf(jCBCiudadOrigen.getItemAt(i));
                

                if (item.startsWith(idCiudadOrigen)) {
                    jCBCiudadOrigen.setSelectedIndex(i); 
                    break;
                    }
                }
                String idCiudadDestino=String.valueOf(rs.getInt("idCiudadDestino"));
                for (int i = 0; i < jCBCiudadDestino.getItemCount(); i++) {
                String item=String.valueOf(jCBCiudadDestino.getItemAt(i));
                    
                if (item.startsWith(idCiudadDestino)) {
                    jCBCiudadDestino.setSelectedIndex(i);
                    break;
                    }
                }
                
                String idAlojamiento = String.valueOf(rs.getInt("idAlojamiento")); // La condición que deseas aplicar

                for (int i = 1; i < modelo.getRowCount(); i++) {
                    Object valor = modelo.getValueAt(i, 0); // Reemplaza 'columnaDeseada' con el índice de la columna que desees verificar

                    // Aplicar la condición (por ejemplo, igualdad)
                    if (valor.equals(idAlojamiento)) {
                        jTAlojamiento.setRowSelectionInterval(i, i); 
                        break;
                    }
                }
                
                String idPasaje=String.valueOf(rs.getInt("idPasaje"));
                for (int i = 0; i < jCBPasaje.getItemCount(); i++) {
                    String item=String.valueOf(jCBPasaje.getItemAt(i));
                    
                    if (item.startsWith(idPasaje)) {
                        jCBPasaje.setSelectedIndex(i);
                        break;
                    }
                }
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla paquete"+ex.getMessage());
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        int idPaquete= Integer.parseInt(jTFIdPaquete.getText());
        PaqueteData paqueteData=new PaqueteData();
        paqueteData.bajaPaquete(idPaquete);
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReactivarActionPerformed
        // TODO add your handling code here
        int idPaquete= Integer.parseInt(jTFIdPaquete.getText());
        PaqueteData paqueteData=new PaqueteData();
        paqueteData.darAltaPaquete(idPaquete);
    }//GEN-LAST:event_jBReactivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCalcularPrecio;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpíar;
    private javax.swing.JButton jBMultiplicarPorPersona;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBPrecioConIncremento;
    private javax.swing.JButton jBReactivar;
    private javax.swing.JComboBox<Ciudad> jCBCiudadDestino;
    private javax.swing.JComboBox<Ciudad> jCBCiudadOrigen;
    private javax.swing.JComboBox<Pasaje> jCBPasaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JRadioButton jRBAlta;
    private javax.swing.JRadioButton jRBBaja;
    private javax.swing.JRadioButton jRBInactivo;
    private javax.swing.JRadioButton jRBMedia;
    private javax.swing.JLabel jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlojamiento;
    private javax.swing.JTextField jTFCantidadPersonas;
    private javax.swing.JTextField jTFIdPaquete;
    private javax.swing.JTextField jTFPrecioCantidadDias;
    private javax.swing.JTextField jTFPrecioConIncremento;
    private javax.swing.JTextField jTFPrecioPorPersona;
    private javax.swing.JTextField jTFPrecioPorXPersonas;
    // End of variables declaration//GEN-END:variables
//quitar barra superior
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;

    public void QuitarLaBarraTitulo(){
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
    
    
    private List<Ciudad> listarCiudades(){
        ArrayList<Ciudad> listaDeCiudades=new ArrayList<>();
        String sql= "SELECT idCiudad, nombre, provincia, pais FROM ciudad WHERE estado=1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Ciudad ciudad=new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(true);
                listaDeCiudades.add(ciudad);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad"+ex.getMessage());
        }
        return listaDeCiudades;
    }
    
    private void cargarCiudadDestino(List <Ciudad> listaDeCiudades){
        jCBCiudadDestino.removeAllItems();
        for (Ciudad item:listaDeCiudades) {
            jCBCiudadDestino.addItem(item);
        }
    }
    
    private void cargarCiudadOrigen(List <Ciudad> listaDeCiudades){
        jCBCiudadOrigen.removeAllItems();
        for (Ciudad item:listaDeCiudades) {
            jCBCiudadOrigen.addItem(item);
        }
    }
    
//    private int obtenerIdCiudadOrigen(){
//        Ciudad ciudadOrigen=(Ciudad) jCBCiudadOrigen.getSelectedItem();
//        int idCiudad=ciudadOrigen.getIdCiudad();
//        return idCiudad;
//    }
//    
//    
//    private int obtenerIdCiudadDestino(){
//        Ciudad ciudadDestino=(Ciudad) jCBCiudadDestino.getSelectedItem();
//        int idCiudad=ciudadDestino.getIdCiudad();
//        return idCiudad;
//    }
    
    private void armarCabeceraTabla(){
        modelo.addColumn("id");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha salida");
        modelo.addColumn("Servicio");
        modelo.addColumn("Importe diario");
        modelo.addColumn("Tipo");
        jTAlojamiento.setModel(modelo);
    }
    
        private void borrarFilasTabla(){
        int indice = modelo.getRowCount()-1;
        
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    
    private void cargarAlojamientos(int idCiudadDestino){
        String sql= "SELECT idAlojamiento, fechaIn, fechaOn, servicio, importeDiario, tipo FROM alojamiento WHERE estado=1 AND idCiudadDestino=?";
        
            try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idCiudadDestino);
            ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 modelo.addRow(new Object[]{resultado.getInt("idAlojamiento"), resultado.getDate("fechaIn"), resultado.getDate("fechaOn"), resultado.getString("servicio"), resultado.getDouble("importeDiario"), resultado.getString("tipo")});
             }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla alojamiento"+ ex.getMessage());
            }    
    }

    
    private int obtenerIdAlojamiento(){
        int idAlojamiento=0;
        int filaSeleccionada = jTAlojamiento.getSelectedRow();
        if (filaSeleccionada!=-1) {
            
            idAlojamiento=(Integer)jTAlojamiento.getValueAt(filaSeleccionada, 0);
    }
        return idAlojamiento;
    }
    
    private List<Pasaje> listarPasajes(int idCiudadOrigen){
        ArrayList<Pasaje> listaDePasajes=new ArrayList<>();
        String sql= "SELECT idPasaje, tipoTransporte, importe FROM pasaje WHERE estado=1 AND idCiudad=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idCiudadOrigen);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Pasaje pasaje=new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setEstado(true);
                listaDePasajes.add(pasaje);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje"+ex.getMessage());
        }
        return listaDePasajes;
    }
    
    private void cargarPasajes(List <Pasaje> listaDePasajes){
        jCBPasaje.removeAllItems();
        for (Pasaje item:listaDePasajes) {
            jCBPasaje.addItem(item);
        }
    }
    
    private int obtenerIdPasaje(){
        Pasaje pasaje=(Pasaje) jCBPasaje.getSelectedItem();
        int idPasaje=pasaje.getIdPasaje();
        return idPasaje;
    }
    
    private double calcularPrecio(){
        double precioPorCantidadDias= Double.parseDouble(jTFPrecioCantidadDias.getText());
        Pasaje pasaje=(Pasaje) jCBPasaje.getSelectedItem();
        double importePasaje=pasaje.getImporte();
        
        double precio=precioPorCantidadDias+importePasaje;
        return precio;
    }
}