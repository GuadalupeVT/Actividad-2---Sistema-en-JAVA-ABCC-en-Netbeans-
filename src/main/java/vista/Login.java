package vista;


import controlador.UsuarioDAO;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guvad
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon i =new ImageIcon("C:/Users/guvad/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/src/main/java/vista/iconos/icono_ usuario.png");
        Image i2=i.getImage();
        this.setIconImage(i2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaUsuario_Iniciar1 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cajaContraseña_Usuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guvad\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\main\\java\\vista\\iconos\\icono_principal.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        cajaUsuario_Iniciar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaUsuario_Iniciar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaUsuario_Iniciar1.setText("usuario");
        cajaUsuario_Iniciar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaUsuario_Iniciar1MouseClicked(evt);
            }
        });
        cajaUsuario_Iniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuario_Iniciar1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\guvad\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\main\\java\\vista\\iconos\\icono_ usuario.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\guvad\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\main\\java\\vista\\iconos\\icono_ candado.png")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guvad\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinal\\src\\main\\java\\vista\\iconos\\icono_seguir.png")); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cajaContraseña_Usuario.setText("jPasswordField1");
        cajaContraseña_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaContraseña_UsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaUsuario_Iniciar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaContraseña_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cajaUsuario_Iniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cajaContraseña_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String usuario=cajaUsuario_Iniciar1.getText();
       String contraseña = new String(cajaContraseña_Usuario.getPassword());
       
       System.out.println(usuario+", "+contraseña);
       UsuarioDAO user=new UsuarioDAO();
       Usuario usuario1 = user.buscarUsuario(usuario, contraseña);
       
       
       
       if(usuario1!=null){
        VentanaInicio iniciar = new  VentanaInicio();
        iniciar.setExtendedState(iniciar.MAXIMIZED_BOTH);
        this.setVisible(false);
        iniciar.setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos!!");
       }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cajaUsuario_Iniciar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaUsuario_Iniciar1MouseClicked
        cajaUsuario_Iniciar1.setText("");
    }//GEN-LAST:event_cajaUsuario_Iniciar1MouseClicked

    private void cajaContraseña_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaContraseña_UsuarioMouseClicked
        cajaContraseña_Usuario.setText("");
    }//GEN-LAST:event_cajaContraseña_UsuarioMouseClicked

    private void cajaUsuario_Iniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuario_Iniciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuario_Iniciar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cajaContraseña_Usuario;
    private java.awt.TextField cajaUsuario_Iniciar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
