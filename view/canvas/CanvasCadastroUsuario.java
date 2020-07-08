
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.UsuarioController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.AdicionarImagens;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.CadastroUsuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaTipoPessoa;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CanvasCadastroUsuario extends javax.swing.JPanel {
    
    BufferedImage imgLogo;
    
    public CanvasCadastroUsuario() {
        try {
            initComponents();
            
            this.imgLogo = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logIMV.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgLogo.getScaledInstance(460, 504, 0), 0, 0, null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCdUser = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        tFEmail = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jFSenha = new javax.swing.JPasswordField();
        jBSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();
        jLabelSenhaDg = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();

        jLabelCdUser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelCdUser.setText("Cadastre seu usuário");

        jLabelEmail.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelEmail.setText("E-mail:*");

        tFEmail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelSenha.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:*");
        jLabelSenha.setToolTipText("");

        jFSenha.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jBSalvar.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBContinuar.setBackground(new java.awt.Color(0, 204, 255));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setToolTipText("");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jLabelSenhaDg.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelSenhaDg.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSenhaDg.setText("A senha deve conter 8 digitos");

        jBVoltar.setBackground(new java.awt.Color(0, 204, 255));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(tFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelSenhaDg)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCdUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBContinuar)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCdUser)
                .addGap(122, 122, 122)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenhaDg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        String senha = new String(jFSenha.getPassword());
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {

            //OBJETO DA CLASSE LOGINUSUARIOCONTROLLER ESTANCIADO
            UsuarioController usuarioController = new UsuarioController();

            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO CLIENTECONTROLLER E CHAMA O METÓDO CADASTRAR
            sucesso = usuarioController.cadastrarUsuario(tFEmail.getText(), senha);

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso! Clique em Continuar.");

                //ATIVAÇÃO DO BOTÃO LOGIN SE DADOS VÁLIDOS
                jBContinuar.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
            } else if(tFEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O campo Email é obrigatório! Preencha o campo Email.");
                tFEmail.requestFocus();

            } else if(jFSenha.getPassword().length <= 0) {
                JOptionPane.showMessageDialog(null, "O campo Senha é obrigatório! Preencha o campo Senha.");
                jFSenha.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
        } catch (Exception ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        new AdicionarImagens().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        tFEmail.setText("");
        jFSenha.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        new TelaTipoPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JPasswordField jFSenha;
    private javax.swing.JLabel jLabelCdUser;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenhaDg;
    private javax.swing.JTextField tFEmail;
    // End of variables declaration//GEN-END:variables
}
