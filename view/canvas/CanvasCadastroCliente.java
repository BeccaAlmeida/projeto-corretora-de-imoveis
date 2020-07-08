
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.ClienteController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.Home;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroCliente;
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

public class CanvasCadastroCliente extends javax.swing.JPanel {
    
    BufferedImage imgCadastro;
    
    public CanvasCadastroCliente() {
        initComponents();
        
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(731, 547, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        tFName = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        tFSobrenome = new javax.swing.JTextField();
        jFTelefone = new javax.swing.JFormattedTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvarDados = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(754, 547));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelNome.setText("Nome:*");
        add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 86, -1, -1));

        tFName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 85, 461, 35));

        jLabelSobrenome.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelSobrenome.setText("Sobrenome:*");
        add(jLabelSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 203, -1, -1));

        tFSobrenome.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 414, 36));

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setText("(00)00000-0000");
        jFTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 287, 188, 40));

        jLabelTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelTelefone.setText("Telefone:*");
        add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 286, -1, 36));

        jButtonBack.setBackground(new java.awt.Color(0, 204, 255));
        jButtonBack.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonBack.setText("Voltar");
        jButtonBack.setMaximumSize(new java.awt.Dimension(141, 29));
        jButtonBack.setMinimumSize(new java.awt.Dimension(141, 29));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 109, 41));

        jButtonLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jButtonLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(141, 29));
        jButtonLimpar.setMinimumSize(new java.awt.Dimension(141, 29));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 441, 120, 41));

        jButtonSalvarDados.setBackground(new java.awt.Color(0, 204, 255));
        jButtonSalvarDados.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonSalvarDados.setText("Salvar Dados");
        jButtonSalvarDados.setMaximumSize(new java.awt.Dimension(141, 29));
        jButtonSalvarDados.setMinimumSize(new java.awt.Dimension(141, 29));
        jButtonSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarDadosActionPerformed(evt);
            }
        });
        add(jButtonSalvarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 440, 140, 43));

        jBLogin.setBackground(new java.awt.Color(0, 204, 255));
        jBLogin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLogin.setText("Entrar");
        jBLogin.setEnabled(false);
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 440, 105, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        try {
            // TODO add your handling code here:
            
            //BOTÃO VOLTAR E ABERTURA DA TELA ANTERIOR;
            new Home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //FECHAMENTO DA TELA ATUAL;
        setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //ACTION DO BOTÃO LIMPAR
        tFName.setText("");
        tFSobrenome.setText("");
        jFTelefone.setValue("(00)00000-0000");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarDadosActionPerformed
        //AÇÃO DO BOTAO SALVAR DADOS;
        //CONVERSÃO DE CAMPO FORMATADO PARA STRING;
        String telefone = (jFTelefone.getValue().toString());

        //VARIAVEL PARA ITERAÇÃO COM O USUÁRIO.
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {

            Usuario usuario = new Usuario();
            usuario.setLogin(4);
            //OBJETO DA CLASSE CLIENTECONTROLLER ESTANCIADO
            ClienteController clienteController = new ClienteController();
            sucesso = clienteController.cadastrarCliente(tFName.getText(), tFSobrenome.getText(), telefone, usuario);
            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO CLIENTECONTROLLER E CHAMA O METÓDO CADASTRAR

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Login.");

                //ATIVAÇÃO DO BOTÃO LOGIN SE DADOS VÁLIDOS
                jBLogin.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
                } else if(tFName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "O campo nome é obrigatório! Preencha o campo nome.");
                    tFName.requestFocus();

                } else if(tFSobrenome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo sobrenome é obrigatório! Preencha o campo sobrenome.");
                    tFSobrenome.requestFocus();

                } else if(jFTelefone.getValue().equals("(00)00000-0000")) {
                    JOptionPane.showMessageDialog(null, "O campo Telefone está inválido! Preencha o campo Telefone com um telefone válido.");
                    jFTelefone.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
                }

            //MENSAGEM DE ERRO DE COMPILAÇÃO
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarDadosActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvarDados;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField tFName;
    private javax.swing.JTextField tFSobrenome;
    // End of variables declaration//GEN-END:variables

}
