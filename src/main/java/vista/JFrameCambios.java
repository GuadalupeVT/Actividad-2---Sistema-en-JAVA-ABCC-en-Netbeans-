/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AlumnoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Alumno;

/**
 *
 * @author guvad
 */
public class JFrameCambios extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCambios
     */
    public JFrameCambios(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        cambiosBtnBorrar = new javax.swing.JButton();
        cambiosBtnBuscar = new javax.swing.JButton();
        cambiosCajaNumControl = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cambiosCajaNombres = new javax.swing.JTextField();
        cambiosBtnGuardarCambios = new javax.swing.JButton();
        cambiosCajaApPaterno = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cambiosBtnCancelar = new javax.swing.JButton();
        cambiosCajaApMaterno = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cambiosSpinnerEdad = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        cambiosSpinnerSemestre = new javax.swing.JSpinner();
        cambiosComboCarrera = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cambiosTabla = new javax.swing.JTable();
        mensaje = new javax.swing.JLabel();

        setTitle("CAMBIOS ALUMNOS");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MODIFICACIONES ALUMNOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cambiosBtnBorrar.setText("BORRAR");
        cambiosBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosBtnBorrarActionPerformed(evt);
            }
        });

        cambiosBtnBuscar.setText("BUSCAR");
        cambiosBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosBtnBuscarActionPerformed(evt);
            }
        });

        jLabel27.setText("NOMBRES:");

        jLabel26.setText("NUMERO DE CONTROL:");

        cambiosBtnGuardarCambios.setText("GUARDAR\nCAMBIOS");
        cambiosBtnGuardarCambios.setActionCommand("GUARDAR CAMBIOS");
        cambiosBtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosBtnGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel28.setText("APELLIDO PATERNO:");

        cambiosBtnCancelar.setText("CANCELAR");
        cambiosBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosBtnCancelarActionPerformed(evt);
            }
        });

        jLabel29.setText("APELLIDO MATERNO:");

        jLabel30.setText("EDAD:");

        jLabel31.setText("SEMESTRE:");

        cambiosComboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel32.setText("CARRERA:");

        cambiosTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        cambiosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cambiosTablaMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(cambiosTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cambiosCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cambiosCajaNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cambiosBtnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cambiosCajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cambiosCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cambiosSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cambiosComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cambiosSpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cambiosBtnGuardarCambios)
                            .addComponent(cambiosBtnCancelar)
                            .addComponent(cambiosBtnBorrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(mensaje)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cambiosCajaNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiosBtnBorrar)
                    .addComponent(cambiosBtnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensaje)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cambiosCajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cambiosCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cambiosBtnGuardarCambios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cambiosCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiosBtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cambiosSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cambiosSpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(cambiosComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiosBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosBtnBorrarActionPerformed
        cambiosCajaNumControl.setText("");
        cambiosCajaNombres.setText("");
        cambiosCajaApPaterno.setText("");
        cambiosCajaApMaterno.setText("");
        cambiosSpinnerEdad.setValue(0);
        cambiosSpinnerSemestre.setValue(0);
        cambiosComboCarrera.setSelectedIndex(0);        
    }//GEN-LAST:event_cambiosBtnBorrarActionPerformed

    
    private void cambiosBtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosBtnGuardarCambiosActionPerformed
        modificarAlumno();
        try {
            actualizarTabla(cambiosTabla);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameCambios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cambiosBtnGuardarCambiosActionPerformed

    private void cambiosBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosBtnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cambiosBtnCancelarActionPerformed

    private void cambiosTablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiosTablaMouseReleased
        cambiosCajaNumControl.setText((String) cambiosTabla.getValueAt(cambiosTabla.getSelectedRow(),0));
                
    }//GEN-LAST:event_cambiosTablaMouseReleased

    private void cambiosBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosBtnBuscarActionPerformed
         buscarAlumno(mensaje,cambiosCajaNumControl,cambiosCajaNombres,cambiosCajaApPaterno,cambiosCajaApMaterno,cambiosSpinnerEdad,cambiosSpinnerSemestre,cambiosComboCarrera);
    }//GEN-LAST:event_cambiosBtnBuscarActionPerformed

    public static void actualizarTabla(JTable tabla) throws SQLException {
    	String controlador="com.mysql.cj.jdbc.Driver";
    	String url="jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
    	String consulta="SELECT * FROM alumnos";
    	ResultSetTableModel modeloDatos=null;
		 try {
			modeloDatos= new ResultSetTableModel(controlador, url, consulta);
		 } catch (ClassNotFoundException e) {
			  e.printStackTrace();
		    } catch (SQLException e) {
		    	e.printStackTrace();
		     }
		 tabla.setModel(modeloDatos);
	  }
    public void buscarAlumno(JLabel mensaje,JTextField cajaNumControl,JTextField cajaNombres,JTextField cajaApPaterno, JTextField cajaApMaterno,JSpinner spinnerEdad, JSpinner spinnerSemestre, JComboBox comboCarrera) {
		AlumnoDAO aDAO=new AlumnoDAO();
		Alumno alumno= aDAO.buscarAlumno(cajaNumControl.getText());
		if(alumno!=null) {
			mensaje.setText("");
			cajaNombres.setText(alumno.getNombre());
			cajaApPaterno.setText(alumno.getPrimerAp());
			cajaApMaterno.setText(alumno.getSegundoAp());
                        spinnerEdad.setValue(alumno.getEdad());
			spinnerSemestre.setValue(alumno.getSemetre());
			comboCarrera.setSelectedItem(alumno.getCarrera());
			
			
		}else{
                    mensaje.setText("<html> <p style=\"color:red;\">ESE ALUMNO NO EXISTE</p></html>");
                }
	}
public void modificarAlumno() {
		AlumnoDAO alumnoDAO=new AlumnoDAO();
		Alumno alumno=new Alumno();
	         alumno.setNumControl(cambiosCajaNumControl.getText());
		alumno.setNombre(cambiosCajaNombres.getText());
		alumno.setPrimerAp(cambiosCajaApPaterno.getText());
		alumno.setSegundoAp(cambiosCajaApMaterno.getText());
                alumno.setEdad((byte)Integer.parseInt(cambiosSpinnerEdad.getValue().toString()));
	        alumno.setSemetre((byte)Integer.parseInt(cambiosSpinnerSemestre.getValue().toString()));
		alumno.setCarrera(cambiosComboCarrera.getSelectedItem().toString());
	   if (alumnoDAO.modificarAlumno(alumno))
	       mensaje.setText("<html> <p style=\"color:blue;\">SE MODIFICO ALUMNO CORRECTAMENTE</p></html>");
		else
			mensaje.setText("<html> <p style=\"color:red;\">NO SE PUDO MODIFICAR ALUMNO</p></html>");
	}
	
    
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
            java.util.logging.Logger.getLogger(JFrameCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCambios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCambios().setVisible(true);
                try {
                    actualizarTabla(cambiosTabla);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameCambios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiosBtnBorrar;
    private javax.swing.JButton cambiosBtnBuscar;
    private javax.swing.JButton cambiosBtnCancelar;
    private javax.swing.JButton cambiosBtnGuardarCambios;
    private javax.swing.JTextField cambiosCajaApMaterno;
    private javax.swing.JTextField cambiosCajaApPaterno;
    private javax.swing.JTextField cambiosCajaNombres;
    private javax.swing.JTextField cambiosCajaNumControl;
    private javax.swing.JComboBox<String> cambiosComboCarrera;
    private javax.swing.JSpinner cambiosSpinnerEdad;
    private javax.swing.JSpinner cambiosSpinnerSemestre;
    public static javax.swing.JTable cambiosTabla;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
