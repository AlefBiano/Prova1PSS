/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author biano
 */
public class manterFuncionario extends javax.swing.JInternalFrame {

    
    public JButton getButtonEditar() {
        return buttonEditar;
    }

    public void setButtonEditar(JButton buttonEditar) {
        this.buttonEditar = buttonEditar;
    }

    public JButton getButtonExcluir() {
        return buttonExcluir;
    }

    public void setButtonExcluir(JButton buttonExcluir) {
        this.buttonExcluir = buttonExcluir;
    }

    public JButton getButtonFechar() {
        return buttonFechar;
    }

    public void setButtonFechar(JButton buttonFechar) {
        this.buttonFechar = buttonFechar;
    }

    public JButton getButtonSalvar() {
        return buttonSalvar;
    }

    public void setButtonSalvar(JButton buttonSalvar) {
        this.buttonSalvar = buttonSalvar;
    }

    public JCheckBox getCheckFuncionarioDoMes() {
        return checkFuncionarioDoMes;
    }

    public void setCheckFuncionarioDoMes(JCheckBox checkFuncionarioDoMes) {
        this.checkFuncionarioDoMes = checkFuncionarioDoMes;
    }

    public JComboBox<String> getComboBonus() {
        return comboBonus;
    }

    public void setComboBonus(JComboBox<String> comboBonus) {
        this.comboBonus = comboBonus;
    }

    public JComboBox<String> getComboCargo() {
        return comboCargo;
    }

    public void setComboCargo(JComboBox<String> comboCargo) {
        this.comboCargo = comboCargo;
    }

    public JLabel getLabelAdmissao() {
        return labelAdmissao;
    }

    public void setLabelAdmissao(JLabel labelAdmissao) {
        this.labelAdmissao = labelAdmissao;
    }

    public JLabel getLabelBonus() {
        return labelBonus;
    }

    public void setLabelBonus(JLabel labelBonus) {
        this.labelBonus = labelBonus;
    }

    public JLabel getLabelCargo() {
        return labelCargo;
    }

    public void setLabelCargo(JLabel labelCargo) {
        this.labelCargo = labelCargo;
    }

    public JLabel getLabelFaltas() {
        return labelFaltas;
    }

    public void setLabelFaltas(JLabel labelFaltas) {
        this.labelFaltas = labelFaltas;
    }

    public JLabel getLabelFuncionarioDoMes() {
        return labelFuncionarioDoMes;
    }

    public void setLabelFuncionarioDoMes(JLabel labelFuncionarioDoMes) {
        this.labelFuncionarioDoMes = labelFuncionarioDoMes;
    }

    public JLabel getLabelIdade() {
        return labelIdade;
    }

    public void setLabelIdade(JLabel labelIdade) {
        this.labelIdade = labelIdade;
    }

    public JLabel getLabelNome() {
        return labelNome;
    }

    public void setLabelNome(JLabel labelNome) {
        this.labelNome = labelNome;
    }

    public JLabel getLabelSalario() {
        return labelSalario;
    }

    public void setLabelSalario(JLabel labelSalario) {
        this.labelSalario = labelSalario;
    }

    public JTextField getTexAdimissao() {
        return texAdimissao;
    }

    public void setTexAdimissao(JTextField texAdimissao) {
        this.texAdimissao = texAdimissao;
    }

    public JTextField getTexSalario() {
        return texSalario;
    }

    public void setTexSalario(JTextField texSalario) {
        this.texSalario = texSalario;
    }

    public JTextField getTextFaltas() {
        return textFaltas;
    }

    public void setTextFaltas(JTextField textFaltas) {
        this.textFaltas = textFaltas;
    }

    public JTextField getTextIdade() {
        return textIdade;
    }

    public void setTextIdade(JTextField textIdade) {
        this.textIdade = textIdade;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    /**
     * Creates new form testeInternal
     */
    public void setTextNome(JTextField textNome) {    
        this.textNome = textNome;
    }

    public manterFuncionario() {
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

        labelCargo = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        texSalario = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        comboBonus = new javax.swing.JComboBox<>();
        labelBonus = new javax.swing.JLabel();
        labelFaltas = new javax.swing.JLabel();
        textFaltas = new javax.swing.JTextField();
        labelAdmissao = new javax.swing.JLabel();
        texAdimissao = new javax.swing.JTextField();
        checkFuncionarioDoMes = new javax.swing.JCheckBox();
        labelFuncionarioDoMes = new javax.swing.JLabel();
        buttonFechar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        labelCargo.setText("Cargo");

        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelNome.setText("Nome");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        labelIdade.setText("Idade");

        textIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdadeActionPerformed(evt);
            }
        });

        texSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texSalarioActionPerformed(evt);
            }
        });

        labelSalario.setText("Salário");

        comboBonus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Generoso" }));

        labelBonus.setText("Bônus");

        labelFaltas.setText("Faltas");

        textFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFaltasActionPerformed(evt);
            }
        });

        labelAdmissao.setText("Admissão");

        texAdimissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texAdimissaoActionPerformed(evt);
            }
        });

        checkFuncionarioDoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFuncionarioDoMesActionPerformed(evt);
            }
        });

        labelFuncionarioDoMes.setText("Funcionário do Mês");

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelBonus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(10, 10, 10)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(labelIdade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(labelSalario))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFaltas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(labelAdmissao)
                                .addGap(18, 18, 18)
                                .addComponent(texAdimissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(labelFuncionarioDoMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkFuncionarioDoMes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCargo)
                    .addComponent(labelCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texAdimissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkFuncionarioDoMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFuncionarioDoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonEditar)
                    .addComponent(buttonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdadeActionPerformed

    private void texSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texSalarioActionPerformed

    private void textFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFaltasActionPerformed

    private void texAdimissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texAdimissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texAdimissaoActionPerformed

    private void checkFuncionarioDoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFuncionarioDoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFuncionarioDoMesActionPerformed

    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JCheckBox checkFuncionarioDoMes;
    private javax.swing.JComboBox<String> comboBonus;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel labelAdmissao;
    private javax.swing.JLabel labelBonus;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelFaltas;
    private javax.swing.JLabel labelFuncionarioDoMes;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JTextField texAdimissao;
    private javax.swing.JTextField texSalario;
    private javax.swing.JTextField textFaltas;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}