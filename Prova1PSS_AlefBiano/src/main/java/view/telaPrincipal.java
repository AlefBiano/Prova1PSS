/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author biano
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
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

        labelLog = new javax.swing.JLabel();
        comboLog = new javax.swing.JComboBox<>();
        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUsuariosCadastrados = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuItemManterFuncionario = new javax.swing.JMenuItem();
        jMenuItemBuscarFuncionário = new javax.swing.JMenuItem();
        jMenuSalário = new javax.swing.JMenu();
        jMenuItemCalcularSalario = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelLog.setText("Log:");

        comboLog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XML", "TXT", "JSON" }));
        comboLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jLabel1.setText("Versão 1.0");

        jLabel2.setText("Usuários Cadastrados:");

        textUsuariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuariosCadastradosActionPerformed(evt);
            }
        });

        jMenuFuncionario.setText("Funcionário");
        jMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFuncionarioActionPerformed(evt);
            }
        });

        jMenuItemManterFuncionario.setText("Manter Funcionário");
        jMenuItemManterFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManterFuncionarioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemManterFuncionario);

        jMenuItemBuscarFuncionário.setText("Buscar Funcionário");
        jMenuItemBuscarFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarFuncionárioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemBuscarFuncionário);

        jMenuBar1.add(jMenuFuncionario);

        jMenuSalário.setText("Salário");

        jMenuItemCalcularSalario.setText("Calcular Salário");
        jMenuItemCalcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCalcularSalarioActionPerformed(evt);
            }
        });
        jMenuSalário.add(jMenuItemCalcularSalario);

        jMenuBar1.add(jMenuSalário);

        jMenuFerramentas.setText("Ferramentas");
        jMenuBar1.add(jMenuFerramentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(235, 235, 235)
                .addComponent(labelLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textUsuariosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLog)
                    .addComponent(comboLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(textUsuariosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLogActionPerformed

    private void jMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFuncionarioActionPerformed
        
    }//GEN-LAST:event_jMenuFuncionarioActionPerformed

    private void jMenuItemManterFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManterFuncionarioActionPerformed
        ManterFuncionario mF = new ManterFuncionario();
        Desktop.add(mF);
        mF.setVisible(true);
    }//GEN-LAST:event_jMenuItemManterFuncionarioActionPerformed

    private void jMenuItemBuscarFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarFuncionárioActionPerformed
        BuscarFuncionario bF = new BuscarFuncionario();
        Desktop.add(bF);
        bF.setVisible(true);
    }//GEN-LAST:event_jMenuItemBuscarFuncionárioActionPerformed

    private void jMenuItemCalcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalcularSalarioActionPerformed
        CalcularSalario cS = new CalcularSalario();
        Desktop.add(cS);
        cS.setVisible(true);
    }//GEN-LAST:event_jMenuItemCalcularSalarioActionPerformed

    private void textUsuariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuariosCadastradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuariosCadastradosActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JComboBox<String> comboLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItemBuscarFuncionário;
    private javax.swing.JMenuItem jMenuItemCalcularSalario;
    private javax.swing.JMenuItem jMenuItemManterFuncionario;
    private javax.swing.JMenu jMenuSalário;
    private javax.swing.JLabel labelLog;
    private javax.swing.JTextField textUsuariosCadastrados;
    // End of variables declaration//GEN-END:variables
}
