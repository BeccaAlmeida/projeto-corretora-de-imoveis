
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.UsuarioController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.Home;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.HomeAnunciante;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CanvasLoginAnunciante extends javax.swing.JPanel {

    BufferedImage imgLogin;
    
    public CanvasLoginAnunciante() {
        try {
            initComponents();
            
            this.imgLogin = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\imgLogin.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasLoginCliente.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgLogin.getScaledInstance(460, 504, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAcessar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        tFEmail = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelAnunciante = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(472, 504));

        jBAcessar.setBackground(new java.awt.Color(0, 204, 255));
        jBAcessar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBAcessar.setText("Acessar");
        jBAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessarActionPerformed(evt);
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

        jBVoltar.setBackground(new java.awt.Color(0, 204, 255));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBEntrar.setBackground(new java.awt.Color(0, 204, 255));
        jBEntrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.setEnabled(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelEmail.setText("E-mail:*");

        tFEmail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jPFSenha.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelSenha.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:*");
        jLabelSenha.setToolTipText("");

        jLabelAnunciante.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabelAnunciante.setText("Anunciante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBEntrar)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAcessar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabelEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabelAnunciante)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAnunciante)
                .addGap(23, 23, 23)
                .addComponent(jLabelEmail)
                .addGap(18, 18, 18)
                .addComponent(tFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jBAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEntrar)
                        .addComponent(jBLimpar))
                    .addComponent(jBVoltar))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessarActionPerformed

        String senha = new String(jPFSenha.getPassword());
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {

            //OBJETO DA CLASSE LOGINUSUARIOCONTROLLER ESTANCIADO
            UsuarioController loginController = new UsuarioController();

            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO CLIENTECONTROLLER E CHAMA O METÓDO CADASTRAR
            sucesso = loginController.validarUsuarioAnunciante(senha, senha);

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados corretos! Clique em Entrar.");

                //ATIVAÇÃO DO BOTÃO LOGIN SE DADOS VÁLIDOS
                jBEntrar.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
            } else if(tFEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O campo Email é obrigatório! Preencha o campo Email.");
                tFEmail.requestFocus();

            } else if(jPFSenha.getPassword().length <= 0) {
                JOptionPane.showMessageDialog(null, "O campo Senha é obrigatório! Preencha o campo Senha.");
                jPFSenha.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Usuário inválido! Insira um usuário válido");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);

        }
    }//GEN-LAST:event_jBAcessarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        try {
            new Home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasLoginAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        try {
            new HomeAnunciante().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasLoginAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        tFEmail.setText("");
        jPFSenha.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcessar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLabelAnunciante;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField tFEmail;
    // End of variables declaration//GEN-END:variables
}
