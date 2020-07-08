
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.PJController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.HomeAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaTipoPessoa;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CanvasCadastroPJ extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasCadastroPJ() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroPJ.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(737, 546, 0), 0, 0, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabePJ = new javax.swing.JLabel();
        jLabelRazao = new javax.swing.JLabel();
        tFRazaoSocial = new javax.swing.JTextField();
        jLabelCNPJ = new javax.swing.JLabel();
        jFCNPJ = new javax.swing.JFormattedTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jFTelefone = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jFCelular = new javax.swing.JFormattedTextField();
        jBLimpar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jFTipoAnunciante = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(737, 546));

        jLabePJ.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabePJ.setText("Imobiliária");

        jLabelRazao.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelRazao.setText("Razao Social/Nome da empresa:*");

        tFRazaoSocial.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelCNPJ.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCNPJ.setText("CNPJ:*");

        try {
            jFCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCNPJ.setText("00.000.000/0000-00");
        jFCNPJ.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setText("(00)0000-0000");
        jFTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelCelular.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCelular.setText("Celular:*");

        try {
            jFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCelular.setText("(00)00000-0000");
        jFCelular.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSalvar.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBContinuar.setBackground(new java.awt.Color(0, 204, 204));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jBVoltar.setBackground(new java.awt.Color(0, 204, 204));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jFTipoAnunciante.setEditable(false);
        jFTipoAnunciante.setBorder(null);
        jFTipoAnunciante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFTipoAnunciante.setText("3");
        jFTipoAnunciante.setDisabledTextColor(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCNPJ)
                                .addGap(18, 18, 18)
                                .addComponent(jFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabelCelular)))
                        .addGap(18, 18, 18)
                        .addComponent(jFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jBContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRazao)
                                .addGap(18, 18, 18)
                                .addComponent(tFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabePJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 559, Short.MAX_VALUE)
                                .addComponent(jFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabePJ)
                    .addComponent(jFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRazao)
                    .addComponent(tFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCNPJ))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        new TelaTipoPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        tFRazaoSocial.setText("");
        jFCNPJ.setValue("00.000.000/0000-00");
        jFTelefone.setValue("(00)0000-0000");
        jFCelular.setValue("(00)00000-0000");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        String cnpj = (jFCNPJ.getValue().toString());
        String telefone = (jFTelefone.getValue().toString());
        String celular = (jFCelular.getValue().toString());

        boolean sucesso;

        try {
            
            TipoPessoa tipoPessoa = TipoPessoa.PESSOAJURÍDICA;
            
            TipoAnunciante tipoAnunciante = TipoAnunciante.IMOBILIÁRIA;
                  
            Usuario usuario = new Usuario();
            usuario.setLogin(3);
            
            Anuncio anuncio = new Anuncio();
            anuncio.setCodigo_anuncio(3);

            PJController pJController = new PJController();
            sucesso = pJController.cadastrarPessoaJuridica(tipoPessoa, tFRazaoSocial.getText(), cnpj, telefone, celular, tipoAnunciante, usuario, anuncio);

            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso! Clique em continuar.");

                }else if (tFRazaoSocial.getText().equals(ABORT)) {
                    JOptionPane.showMessageDialog(null, "O campo razao social é obrigtório! Preencha o campo corretamente.");
                    tFRazaoSocial.requestFocus();
                }else if(jFCNPJ.getValue().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo CNPJ inválido! Preencha um CNPJ válido.");
                    jFCNPJ.requestFocus();
                }else if (jFTelefone.getValue().equals("(00)00000-0000)")) {
                    JOptionPane.showMessageDialog(null, "O campo telefone é obrigtório! Preencha o campo corretamente.");
                    jFTelefone.requestFocus();
                }else if (jFCelular.getValue().equals("(00)00000-0000)")) {
                    JOptionPane.showMessageDialog(null, "O campo telefone é obrigtório! Preencha o campo corretamente.");
                    jFCelular.requestFocus();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JFormattedTextField jFCNPJ;
    private javax.swing.JFormattedTextField jFCelular;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JFormattedTextField jFTipoAnunciante;
    private javax.swing.JLabel jLabePJ;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelRazao;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField tFRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
