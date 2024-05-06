/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projugador;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formJugador extends javax.swing.JFrame {

    // clase DefaultTableModel de la cual se instancia un objeto llamado dtm
    private final DefaultTableModel dtm;
    //arreglo para llevar datos a la Jtable
    private final Object[] o = new Object[5];
    public final ArrayList<Jugador> aljugador = new ArrayList<>();
    public final Jugador jugador = new Jugador();
    //es la variable que toma la posicion del arraylist de un jugador cuando es buscado
    //para poder editarlo.
    public int posicion = -1;

    /**
     * Creates new form formJugador
     */
    public formJugador() {
        initComponents();
        dtm = (DefaultTableModel) tabla.getModel();
        txtid.setEnabled(false);
        dtm.setRowCount(0);
        // Jugador jugador = new Jugador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnactualizar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        nivel = new javax.swing.JLabel();
        txtnivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtjuego = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtscore = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        nombre.setText("NOMBRE");

        nivel.setText("NIVEL");

        txtnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnivelActionPerformed(evt);
            }
        });

        jLabel4.setText("JUEGO FAVORITO");

        jLabel5.setText("SCORE");

        txtscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscoreActionPerformed(evt);
            }
        });

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "NIVEL", "JUEGO", "SCORE"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projugador/juego (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(nombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(id))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(nivel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(jLabel5)))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(70, 70, 70)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btneditar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnagregar)
                                .addGap(53, 53, 53)
                                .addComponent(btneliminar)))
                        .addGap(5, 5, 5)
                        .addComponent(btnbuscar)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nivel)
                            .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtjuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btneliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneditar)
                            .addComponent(btnbuscar))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // llenar los datos del objeto jugador         
        // verificar si el arraylist aljugador está vacio o no
        txtid.setEnabled(true);
        if (aljugador.size() == 0) {
            txtid.setText("1");
        } else {
            txtid.setText(String.valueOf((aljugador.size() + 1)));
        }
        // Validar los campos de entrada antes de agregar
        if (camposValidos()) {
            Jugador ojugador = new Jugador();
            // Llenar los datos del objeto jugador
            ojugador.setId(txtid.getText());
            ojugador.setNombre(txtnombre.getText());
            ojugador.setNivel(txtnivel.getText());
            ojugador.setJuego(txtjuego.getText());
            ojugador.setScore(txtscore.getText());
            // Agregar este objeto al ArrayList
            aljugador.add(ojugador);

            o[0] = txtid.getText().trim();
            o[1] = txtnombre.getText().trim();
            o[2] = txtnivel.getText().trim();
            o[3] = txtjuego.getText().trim();
            o[4] = txtscore.getText().trim();
            dtm.addRow(o);
            // Limpiar los campos de entrada después de agregar
            limpiarCampos();

            // Actualizar la interfaz de usuario (por ejemplo, mostrar una tabla actualizada)
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private boolean camposValidos() {
        //return !txtid.getText().isEmpty() && !txtnombre.getText().isEmpty() && !txtnivel.getText().isEmpty() && !txtjuego.getText().isEmpty() && !txtscore.getText().isEmpty();
        return !txtid.getText().isEmpty() && !txtnombre.getText().isEmpty() && !txtnivel.getText().isEmpty() && !txtjuego.getText().isEmpty() && !txtscore.getText().isEmpty();
    }

// Método para limpiar los campos de entrada después de agregar
    private void limpiarCampos() {
        txtid.setText("");
        txtnombre.setText("");
        txtnivel.setText("");
        txtjuego.setText("");
        txtscore.setText("");
    }

    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Elimina todas las filas del modelo de la tabla

        // y vuelve y la llena las filas actualizadas basadas en los datos de aljugador
        for (Jugador jugador : aljugador) {
            model.addRow(new Object[]{jugador.getId(), jugador.getNombre(), jugador.getNivel(), jugador.getJuego(), jugador.getScore()});
        }
    }
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        txtid.setEnabled(true);
        String id = txtid.getText().trim(); // Obtener el ID del campo de texto y eliminar los espacios en blanco
        if (id.isEmpty()) {
            // Si el campo de texto está vacío, mostrar un mensaje de error y salir del método
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID válido.");
            return;
        }

        //otra forma de iterar o recorrer el arraylist
        Iterator<Jugador> iterator = aljugador.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getId().equals(id)) {
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este jugador?",
                        "Eliminacion", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {

                    iterator.remove(); // Elimina el jugador de la lista de forma segura
                    JOptionPane.showMessageDialog(null, "Jugador " + id + " eliminado correctamente.");
                    // Actualiza la interfaz de usuario si es necesario (por ejemplo, actualiza la tabla)
                    actualizarTabla();
                    limpiarCampos();
                    //  txtid.setEnabled(false);
                    return; // Sal del método después de eliminar el jugador
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún jugador con el ID " + id);
                System.out.println("No se encontró ningún jugador con el ID " + id);
            }
        }
        // Si no se encuentra ningún jugador con el ID proporcionado

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed

    }//GEN-LAST:event_btnmostrarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnivelActionPerformed

    private void txtscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtscoreActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        txtid.setEnabled(true);
        //System.out.println("Buscando ...");
        Jugador jugadorEncontrado = null;
        int contador = 0;
        boolean sw = false;
        for (Jugador jugador : aljugador) {
            if (jugador.getId().equals(txtid.getText())) {
                jugadorEncontrado = jugador;
                posicion = contador;
                sw = true;
                txtnombre.setText(jugadorEncontrado.getNombre());
                txtnivel.setText(jugadorEncontrado.getNivel());
                txtjuego.setText(jugadorEncontrado.getJuego());
                txtscore.setText(jugadorEncontrado.getScore());
                break; // Salir del bucle una vez encontrado el jugador 
            }
            contador++;
        }
        if (!sw) {
            JOptionPane.showMessageDialog(null, "Jugador no encontrado.");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Jugador ojugadoreditar = new Jugador();
        txtid.setEnabled(true);
        for (Jugador jugador : aljugador) {
            if (jugador.getId().equals(txtid.getText())) {
                ojugadoreditar.setId(txtid.getText());
                ojugadoreditar.setNombre(txtnombre.getText());
                ojugadoreditar.setNivel(txtnivel.getText());
                ojugadoreditar.setJuego(txtjuego.getText());
                ojugadoreditar.setScore(txtscore.getText());
                aljugador.set(posicion, ojugadoreditar);
                JOptionPane.showMessageDialog(null, "Se ha actualizado el jugador con ID:" + ojugadoreditar.getId());
                actualizarTabla();
                limpiarCampos();

                break;
            }
        }

    }//GEN-LAST:event_btneditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formJugador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel id;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjuego;
    private javax.swing.JTextField txtnivel;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtscore;
    // End of variables declaration//GEN-END:variables
}
