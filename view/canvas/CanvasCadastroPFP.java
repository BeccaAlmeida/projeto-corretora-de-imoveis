
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.PFController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.HomeAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroPFP;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaTipoPessoa;
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

public class CanvasCadastroPFP extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasCadastroPFP() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroPFP.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(742, 517, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProprietario = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        tFName = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        tFSobrenome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFCPF = new javax.swing.JFormattedTextField();
        jFTelefone = new javax.swing.JFormattedTextField();
        jFCelular = new javax.swing.JFormattedTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jButtonSalvarDados = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();
        tFTipoAnunciante = new javax.swing.JTextField();

        jLabelProprietario.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelProprietario.setText("Proprietário");

        jLabelName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelName.setText("Nome:*");

        tFName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelSobrenome.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelSobrenome.setText("Sobrenome:*");

        tFSobrenome.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelCPF.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCPF.setText("CPF:*");

        try {
            jFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCPF.setText("000.000.000-00");

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setText("(00)0000-0000");

        try {
            jFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCelular.setText("(00)00000-0000");

        jLabelTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jLabelCelular.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCelular.setText("Celular:*");

        jButtonVoltar.setBackground(new java.awt.Color(0, 204, 255));
        jButtonVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.setToolTipText("");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jButtonSalvarDados.setBackground(new java.awt.Color(0, 204, 255));
        jButtonSalvarDados.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonSalvarDados.setText("Salvar Dados");
        jButtonSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarDadosActionPerformed(evt);
            }
        });

        jButtonContinuar.setBackground(new java.awt.Color(0, 204, 255));
        jButtonContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonContinuar.setText("Ver Anuncio");
        jButtonContinuar.setEnabled(false);
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        tFTipoAnunciante.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        tFTipoAnunciante.setText("1");
        tFTipoAnunciante.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabelName)
                        .addGap(18, 18, 18)
                        .addComponent(tFName, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelSobrenome)
                        .addGap(18, 18, 18)
                        .addComponent(tFSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCelular)
                                    .addComponent(jLabelTelefone))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFTelefone)
                                    .addComponent(jFCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))))
                .addGap(160, 160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelProprietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButtonSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonContinuar)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelProprietario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelName))
                    .addComponent(tFName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelSobrenome))
                    .addComponent(tFSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCPF))
                    .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCelular)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed

        //ACTION DO BOTÃO VOLTAR
        new TelaTipoPessoa().setVisible(true);

        //FECHAMENTO DA TELA ATUAL
        setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarDadosActionPerformed

        //AÇÃO DO BOTAO SALVAR DADOS;
        //CONVERSÃO DE CAMPOS FORMATADOS PARA STRING;
        String telefone = (jFTelefone.getValue().toString());
        String celular = (jFCelular.getValue().toString());
        String cpf = (jFCPF.getValue().toString());
        
        
        //VARIAVEL PARA ITERAÇÃO COM O USUÁRIO.
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {
            TipoPessoa tipoPessoa = TipoPessoa.PESSOAFÍSICA;
            
            TipoAnunciante tipoAnunciante = TipoAnunciante.PROPRIETÁRIO;
                  
            Usuario usuario = new Usuario();
            usuario.setLogin(2);
            
            Anuncio anuncio = new Anuncio();
            anuncio.setCodigo_anuncio(2);
            
            //OBJETO DA CLASSE PFCONTROLLER ESTANCIADO
            PFController pFController = new PFController();

            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO PFCONTROLLER E CHAMA O METÓDO CADASTRAR
            sucesso = pFController.inserirPessoaFisica(tipoPessoa, cpf, telefone, celular, tipoAnunciante, tFName.getText(), tFSobrenome.getText(), usuario, anuncio);

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGEM
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Continuar.");
                jButtonContinuar.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
                } else if(tFName.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório! Preencha o campo Nome");
                    tFName.requestFocus();
                    
                 } else if(tFSobrenome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo Sobrenome é obrigatório! Preencha o campo sobrenome");
                    tFName.requestFocus();

                } else if(jFCPF.getValue().equals("000.000.000-00")) {
                    JOptionPane.showMessageDialog(null, "O campo CPF está inválido! Preencha o campo com um CPF válido.");
                    jFCPF.requestFocus();

                } else if(jFCelular.getValue().equals("(00)00000-0000")) {
                    JOptionPane.showMessageDialog(null, "O campo celular está inválido! Adicione um celular válido");
                    jFCelular.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "error" + e);

        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroPFP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarDadosActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        try {
            //ACTION DO BOTÃO CONTINUAR
            new HomeAnunciante().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasCadastroPFP.class.getName()).log(Level.SEVERE, null, ex);
        }

        //FECHAMENTO DA TELA ATUAL
        setVisible(false);
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        //ACTION DO BOTÃO LIMPAR
        tFName.setText("");
        tFSobrenome.setText("");
        jFTelefone.setValue("(00)0000-0000");
        jFCelular.setValue("(00)00000-0000");
        jFCPF.setValue("000.000.000-00");
    }//GEN-LAST:event_jBLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonSalvarDados;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFCPF;
    private javax.swing.JFormattedTextField jFCelular;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelProprietario;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField tFName;
    private javax.swing.JTextField tFSobrenome;
    private javax.swing.JTextField tFTipoAnunciante;
    // End of variables declaration//GEN-END:variables
}
