/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_richardpadgett;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jd_crearuniverso = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_crearuniverso = new javax.swing.JTextField();
        jb_guardaruniverso = new javax.swing.JButton();
        jd_crearser = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_raza = new javax.swing.JTextField();
        tf_planeta = new javax.swing.JTextField();
        jb_crearser = new javax.swing.JButton();
        jsp_ki = new javax.swing.JSpinner();
        jsp_edad = new javax.swing.JSpinner();
        jd_eliminarseres = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_seres = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_crearUniverso = new javax.swing.JMenuItem();
        jmi_crearseresi = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmi_Eliminarseres = new javax.swing.JMenuItem();

        jLabel3.setText("CREAR UNIVERSO");

        jLabel4.setText("Nombre del universo");

        jb_guardaruniverso.setText("Guardar");
        jb_guardaruniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardaruniversoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearuniversoLayout = new javax.swing.GroupLayout(jd_crearuniverso.getContentPane());
        jd_crearuniverso.getContentPane().setLayout(jd_crearuniversoLayout);
        jd_crearuniversoLayout.setHorizontalGroup(
            jd_crearuniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearuniversoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154))
            .addGroup(jd_crearuniversoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearuniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_guardaruniverso)
                    .addComponent(tf_crearuniverso, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jd_crearuniversoLayout.setVerticalGroup(
            jd_crearuniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearuniversoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addGroup(jd_crearuniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_crearuniverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jb_guardaruniverso)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel6.setText("Raza");

        jLabel7.setText("Ki");

        jLabel8.setText("Edad");

        jLabel9.setText("Planeta");

        jb_crearser.setText("Crear");
        jb_crearser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearserLayout = new javax.swing.GroupLayout(jd_crearser.getContentPane());
        jd_crearser.getContentPane().setLayout(jd_crearserLayout);
        jd_crearserLayout.setHorizontalGroup(
            jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearserLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearserLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearserLayout.createSequentialGroup()
                        .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsp_ki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crearser)
                .addGap(51, 51, 51))
        );
        jd_crearserLayout.setVerticalGroup(
            jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearserLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jsp_ki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_crearser)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jl_seres.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_seres);

        jButton1.setText("Modificar");

        jButton3.setText("Eliminar");

        jLabel5.setText("Lista de Seres");

        javax.swing.GroupLayout jd_eliminarseresLayout = new javax.swing.GroupLayout(jd_eliminarseres.getContentPane());
        jd_eliminarseres.getContentPane().setLayout(jd_eliminarseresLayout);
        jd_eliminarseresLayout.setHorizontalGroup(
            jd_eliminarseresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarseresLayout.createSequentialGroup()
                .addGroup(jd_eliminarseresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliminarseresLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarseresLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton3)
                        .addGap(46, 46, 46)
                        .addComponent(jButton1))
                    .addGroup(jd_eliminarseresLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel5)))
                .addGap(72, 114, Short.MAX_VALUE))
        );
        jd_eliminarseresLayout.setVerticalGroup(
            jd_eliminarseresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarseresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_eliminarseresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UNIVERSO");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\richa\\Downloads\\New_Goku.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jButton2.setText("Guardar Universo");

        jMenu1.setText("inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmi_crearUniverso.setText("Crear Universo");
        jmi_crearUniverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearUniversoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_crearUniverso);

        jmi_crearseresi.setText("Crear Seres Vivos");
        jmi_crearseresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearseresiActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_crearseresi);

        jMenuItem3.setText("Guardar Universo");
        jMenu1.add(jMenuItem3);

        jmi_Eliminarseres.setText("Eliminar Seres");
        jmi_Eliminarseres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarseresActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Eliminarseres);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(164, 164, 164)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardaruniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardaruniversoMouseClicked

        String Nombrearchivo = tf_crearuniverso.getText();
        U.setNombre(Nombrearchivo);
        JOptionPane.showMessageDialog(this, "Universo Creado Exitosamente");
        jd_crearuniverso.dispose();
        jmi_crearUniverso.setEnabled(false);
        

    }//GEN-LAST:event_jb_guardaruniversoMouseClicked

    private void jmi_crearUniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearUniversoActionPerformed
        jd_crearuniverso.setModal(true);
        jd_crearuniverso.pack();
        jd_crearuniverso.setLocationRelativeTo(this);
        jd_crearuniverso.setVisible(true);

    }//GEN-LAST:event_jmi_crearUniversoActionPerformed

    private void jmi_crearseresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearseresiActionPerformed
        jd_crearser.setModal(true);
        jd_crearser.pack();
        jd_crearser.setLocationRelativeTo(this);
        jd_crearser.setVisible(true);

    }//GEN-LAST:event_jmi_crearseresiActionPerformed

    private void jb_crearserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearserMouseClicked
        U.getSv().add(new Seres_vivos(tf_raza.getText(), (Integer)jsp_ki.getValue(),(Integer) jsp_edad.getValue(), tf_planeta.getText()));
        JOptionPane.showMessageDialog(this, "Ser Creado Exitosamente");
        tf_raza.setText("");
        jsp_edad.setValue(0);
        jsp_ki.setValue(0);
        tf_planeta.setText("");


    }//GEN-LAST:event_jb_crearserMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmi_EliminarseresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarseresActionPerformed
      
        
        
        
        
        
        
    }//GEN-LAST:event_jmi_EliminarseresActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_crearser;
    private javax.swing.JButton jb_guardaruniverso;
    private javax.swing.JDialog jd_crearser;
    private javax.swing.JDialog jd_crearuniverso;
    private javax.swing.JDialog jd_eliminarseres;
    private javax.swing.JList<String> jl_seres;
    private javax.swing.JMenuItem jmi_Eliminarseres;
    private javax.swing.JMenuItem jmi_crearUniverso;
    private javax.swing.JMenuItem jmi_crearseresi;
    private javax.swing.JSpinner jsp_edad;
    private javax.swing.JSpinner jsp_ki;
    private javax.swing.JTextField tf_crearuniverso;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_raza;
    // End of variables declaration//GEN-END:variables
    Universo U = new Universo();

}
