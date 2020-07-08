
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.PJController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.HomeAnunciante;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CanvasEditarAnunciantePJ extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasEditarAnunciantePJ() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroImv.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(744, 530, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRazao = new javax.swing.JLabel();
        tFEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jFCNPJ = new javax.swing.JFormattedTextField();
        jLabelSenha = new javax.swing.JLabel();
        jFTelefone = new javax.swing.JFormattedTextField();
        jFCelular = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        tFRazaoSocial1 = new javax.swing.JTextField();
        jLabelCNPJ1 = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRazao.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelRazao.setText("Razao Social/Nome da empresa:*");
        add(jLabelRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tFEmail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 405, 36));

        jLabelEmail.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelEmail.setText("Email:*");
        add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        try {
            jFCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCNPJ.setText("00.000.000/0000-00");
        jFCNPJ.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 331, 40));

        jLabelSenha.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:");
        add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setText("(00)0000-0000");
        jFTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 184, 42));

        try {
            jFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCelular.setText("(00)00000-0000");
        jFCelular.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 190, 42));

        jLabelCelular.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCelular.setText("Celular:*");
        add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });
        add(jBLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 104, 48));

        jBContinuar.setBackground(new java.awt.Color(0, 204, 204));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });
        add(jBContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 466, 100, 50));

        jBSalvar.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 109, 49));

        jBVoltar.setBackground(new java.awt.Color(0, 204, 204));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 108, 48));

        tFRazaoSocial1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFRazaoSocial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 405, 36));

        jLabelCNPJ1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCNPJ1.setText("CNPJ:*");
        add(jLabelCNPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabelTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");
        add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPasswordSenha.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        tFEmail.setText("");
        jFCNPJ.setValue("00.000.000/0000-00");
        jFTelefone.setValue("(00)0000-0000");
        jFCelular.setValue("(00)00000-0000");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        String cnpj = (jFCNPJ.getValue().toString());
        String telefone = (jFTelefone.getValue().toString());
        String celular = (jFCelular.getValue().toString());
        String senha = new String(jPasswordSenha.getPassword());

        boolean sucesso;

        try {

            PJController pJController = new PJController();
            sucesso = pJController.alterar(tFRazaoSocial1.getText(), cnpj, telefone, celular, tFEmail.getText(), senha);

            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso! Clique em continuar.");

                }else if (tFEmail.getText().equals(ABORT)) {
                    JOptionPane.showMessageDialog(null, "O campo razao social é obrigtório! Preencha o campo corretamente.");
                    tFEmail.requestFocus();
                }else if(jFCNPJ.getValue().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo CNPJ inválido! Preencha um CNPJ válido.");
                    jFCNPJ.requestFocus();
                }else if (jFTelefone.getValue().equals("(00)00000-0000)")) {
                    JOptionPane.showMessageDialog(null, "O campo telefone é obrigtório! Preencha o campo corretamente.");
                    jFTelefone.requestFocus();
                }else if (jFCelular.getValue().equals("(00)00000-0000)")) {
                    JOptionPane.showMessageDialog(null, "O campo telefone é obrigtório! Preencha o campo corretamente.");
                    jFCelular.requestFocus();
                 } else if(tFEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O campo Email é obrigatório! Preencha o campo Email.");
                tFEmail.requestFocus();

                } else if(jPasswordSenha.getPassword().length <= 0) {
                    JOptionPane.showMessageDialog(null, "O campo Senha é obrigatório! Preencha o campo Senha.");
                    jPasswordSenha.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Algum campo está inválido! Preencha os campos corretamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        try {
            new HomeAnunciante().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasCadastroPJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        try {
            new HomeAnunciante().setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasEditarAnunciantePJ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JFormattedTextField jFCNPJ;
    private javax.swing.JFormattedTextField jFCelular;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JLabel jLabelCNPJ1;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelRazao;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField tFEmail;
    private javax.swing.JTextField tFRazaoSocial1;
    // End of variables declaration//GEN-END:variables
}
