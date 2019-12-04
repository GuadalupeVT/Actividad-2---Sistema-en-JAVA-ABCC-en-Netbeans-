/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author guvad
 */
public class JFrameConsultas extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConsultas
     */
    public JFrameConsultas() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        radioTodos = new javax.swing.JRadioButton();
        radioNombre = new javax.swing.JRadioButton();
        consultasCajaNombres = new javax.swing.JTextField();
        consultasBtnBuscar = new javax.swing.JButton();
        radioApPaterno = new javax.swing.JRadioButton();
        consultasCajaApPaterno = new javax.swing.JTextField();
        consultasCajaApMaterno = new javax.swing.JTextField();
        radioApMaterno = new javax.swing.JRadioButton();
        radioEdad = new javax.swing.JRadioButton();
        consultasSpinnerEdad = new javax.swing.JSpinner();
        radioSemestre = new javax.swing.JRadioButton();
        consultasSpinnerSemestre = new javax.swing.JSpinner();
        consultasBtnBorrar = new javax.swing.JButton();
        consultasBtnCancelar = new javax.swing.JButton();
        consultasComboCarrera = new javax.swing.JComboBox<>();
        radioCarrera = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        consultasTabla = new javax.swing.JTable();
        mensaje = new javax.swing.JLabel();

        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("CONSULTAS ALUMNOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setText("Selecciona Criterio de Busqueda:");

        buttonGroup1.add(radioTodos);
        radioTodos.setText("Todos");
        radioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNombre);
        radioNombre.setText("Nombre");

        consultasCajaNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consultasCajaNombresKeyTyped(evt);
            }
        });

        consultasBtnBuscar.setText("BUSCAR");
        consultasBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasBtnBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioApPaterno);
        radioApPaterno.setText("Apellido Paterno");
        radioApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioApPaternoActionPerformed(evt);
            }
        });

        consultasCajaApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consultasCajaApPaternoKeyTyped(evt);
            }
        });

        consultasCajaApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consultasCajaApMaternoKeyTyped(evt);
            }
        });

        buttonGroup1.add(radioApMaterno);
        radioApMaterno.setText("Apellido Materno");

        buttonGroup1.add(radioEdad);
        radioEdad.setText("Edad");

        buttonGroup1.add(radioSemestre);
        radioSemestre.setText("Semestre");

        consultasBtnBorrar.setText("BORRAR");
        consultasBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasBtnBorrarActionPerformed(evt);
            }
        });

        consultasBtnCancelar.setText("CANCELAR");
        consultasBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasBtnCancelarActionPerformed(evt);
            }
        });

        consultasComboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion...", "ISC", "IM", "IIA", "LC", "LA" }));

        buttonGroup1.add(radioCarrera);
        radioCarrera.setText("Carrera");

        consultasTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(consultasTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioTodos)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioApMaterno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(consultasCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioSemestre)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(consultasSpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioCarrera)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(consultasComboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(consultasBtnCancelar)
                                            .addComponent(consultasBtnBorrar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioEdad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(consultasSpinnerEdad)
                                                .addGap(91, 91, 91))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(radioApPaterno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(consultasCajaApPaterno))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(radioNombre)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(consultasCajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(consultasBtnBuscar)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTodos)
                    .addComponent(radioNombre)
                    .addComponent(consultasCajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultasBtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioApPaterno)
                    .addComponent(consultasCajaApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioApMaterno)
                    .addComponent(consultasBtnBorrar)
                    .addComponent(consultasCajaApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEdad)
                    .addComponent(consultasSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSemestre)
                            .addComponent(consultasSpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioCarrera)
                            .addComponent(consultasComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(consultasBtnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTodosActionPerformed

    private void radioApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioApPaternoActionPerformed

    private void consultasBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasBtnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_consultasBtnCancelarActionPerformed

    private void consultasBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasBtnBorrarActionPerformed
       mensaje.setText("");
        consultasCajaNombres.setText("");
        consultasCajaApPaterno.setText("");
        consultasCajaApMaterno.setText("");
        consultasSpinnerEdad.setValue(0);
        consultasSpinnerSemestre.setValue(0);
        consultasComboCarrera.setSelectedIndex(0);
        actualizarTabla(consultasTabla, "SELECT * FROM Alumnos");
    }//GEN-LAST:event_consultasBtnBorrarActionPerformed

    private void consultasBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasBtnBuscarActionPerformed
       if(radioNombre.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE Nombre='"+consultasCajaNombres.getText()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioApPaterno.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE primerAp='"+consultasCajaApPaterno.getText()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioApMaterno.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE segundoAp='"+consultasCajaApMaterno.getText()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioEdad.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE edad='"+consultasSpinnerEdad.getValue()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioSemestre.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE semestre='"+consultasSpinnerSemestre.getValue()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioCarrera.isSelected()) {
           String sql= "SELECT * FROM Alumnos WHERE carrera='"+consultasComboCarrera.getSelectedItem()+"'";
           actualizarTabla(consultasTabla,sql);
       }else if(radioTodos.isSelected()) {
	   String sql="SELECT * FROM Alumnos WHERE " +
	    "Nombre='"+consultasCajaNombres.getText()
	+"' AND PrimerAp='"+consultasCajaApPaterno.getText()
	+"' AND SegundoAp='"+consultasCajaApMaterno.getText()
        +"' AND edad="+Integer.parseInt(consultasSpinnerEdad.getValue().toString())
        +" AND semestre="+Integer.parseInt(consultasSpinnerSemestre.getValue().toString())
        +" AND Carrera='"+consultasComboCarrera.getSelectedItem().toString()
							+"'";
 
           actualizarTabla(consultasTabla,sql);
			
	}else{
          JOptionPane.showMessageDialog(getContentPane(), "No se selecciono opcion de busqueda!","Atención", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_consultasBtnBuscarActionPerformed

    private void consultasCajaNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultasCajaNombresKeyTyped
         char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car) || car==' '){
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_consultasCajaNombresKeyTyped

    private void consultasCajaApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultasCajaApPaternoKeyTyped
         char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car) || car==' '){
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_consultasCajaApPaternoKeyTyped

    private void consultasCajaApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultasCajaApMaternoKeyTyped
         char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car) || car==' '){
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_consultasCajaApMaternoKeyTyped

    public void actualizarTabla(JTable tabla,String consulta) {
		    	String controlador="com.mysql.cj.jdbc.Driver";
    	                String url="jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
		    	ResultSetTableModel modeloDatos=null;
				 try {
					modeloDatos= new ResultSetTableModel(controlador, url, consulta);
				 } catch (ClassNotFoundException e) {
					  e.printStackTrace();
				    } catch (SQLException e) {
				    	e.printStackTrace();
				     }
				 tabla.setModel(modeloDatos);
				 if (modeloDatos.getRowCount()==0) {
					 mensaje.setText("<html> <p style=\"color:red;\">NO SE ENCONTRARON REGISTROS</p></html>");
					 //actualizarTabla(consultaTabla);
				 }else {
					 mensaje.setText("");
				 }
				 
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
            java.util.logging.Logger.getLogger(JFrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton consultasBtnBorrar;
    private javax.swing.JButton consultasBtnBuscar;
    private javax.swing.JButton consultasBtnCancelar;
    private javax.swing.JTextField consultasCajaApMaterno;
    private javax.swing.JTextField consultasCajaApPaterno;
    private javax.swing.JTextField consultasCajaNombres;
    private javax.swing.JComboBox<String> consultasComboCarrera;
    private javax.swing.JSpinner consultasSpinnerEdad;
    private javax.swing.JSpinner consultasSpinnerSemestre;
    public javax.swing.JTable consultasTabla;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel mensaje;
    private javax.swing.JRadioButton radioApMaterno;
    private javax.swing.JRadioButton radioApPaterno;
    private javax.swing.JRadioButton radioCarrera;
    private javax.swing.JRadioButton radioEdad;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JRadioButton radioSemestre;
    private javax.swing.JRadioButton radioTodos;
    // End of variables declaration//GEN-END:variables
}
