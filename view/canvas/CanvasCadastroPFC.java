
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.PFController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.HomeAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroPFC;
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

public class CanvasCadastroPFC extends javax.swing.JPanel {
    
    BufferedImage imgCadastro;
    
    public CanvasCadastroPFC() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroPFC.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

     protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(724, 529, 0), 0, 0, null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        tFName = new javax.swing.JTextField();
        jLabelSobrenome1 = new javax.swing.JLabel();
        tFSobrenome1 = new javax.swing.JTextField();
        jLabelCresci = new javax.swing.JLabel();
        jFCpf = new javax.swing.JFormattedTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jFTelefone = new javax.swing.JFormattedTextField();
        jFCelular = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSalvarDados = new javax.swing.JButton();
        jBVerAnuncio = new javax.swing.JButton();
        jFTipoAnunciante = new javax.swing.JFormattedTextField();
        jLabelCorretor = new javax.swing.JLabel();

        jLabelName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelName.setText("Nome:*");

        tFName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelSobrenome1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelSobrenome1.setText("Sobrenome:*");

        tFSobrenome1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jLabelCresci.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCresci.setText("CPF:*");

        try {
            jFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpf.setText("000.000.000-00");

        jLabelTelefone.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");

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

        jLabelCelular.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCelular.setText("Celular:*");

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.setToolTipText("");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jButtonVoltar.setBackground(new java.awt.Color(0, 204, 255));
        jButtonVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
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

        jBVerAnuncio.setBackground(new java.awt.Color(0, 204, 255));
        jBVerAnuncio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVerAnuncio.setText("ver anuncio");
        jBVerAnuncio.setEnabled(false);
        jBVerAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerAnuncioActionPerformed(evt);
            }
        });

        jFTipoAnunciante.setEditable(false);
        jFTipoAnunciante.setBorder(null);
        jFTipoAnunciante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFTipoAnunciante.setText("2");
        jFTipoAnunciante.setDisabledTextColor(new java.awt.Color(204, 204, 255));

        jLabelCorretor.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelCorretor.setText("Corretor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelCorretor)
                        .addGap(540, 540, 540)
                        .addComponent(jFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addGap(18, 18, 18)
                                .addComponent(tFName, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSobrenome1)
                                .addGap(18, 18, 18)
                                .addComponent(tFSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCresci)
                                .addGap(18, 18, 18)
                                .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelCelular)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFCelular))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelTelefone)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButtonSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBVerAnuncio)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTipoAnunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorretor))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(tFName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSobrenome1)
                    .addComponent(tFSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCresci)
                    .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBVerAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        String cpf = (jFCpf.getValue().toString());
        
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {
            
            TipoPessoa tipoPessoa = TipoPessoa.PESSOAFÍSICA;
            
            TipoAnunciante tipoAnunciante = TipoAnunciante.CORRETOR;
                  
            Usuario usuario = new Usuario();
            usuario.setLogin(1);
            
            Anuncio anuncio = new Anuncio();
            anuncio.setCodigo_anuncio(1);
            
            //OBJETO DA CLASSE PFCONTROLLER ESTANCIADO
            PFController pFController = new PFController();

            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO PFCONTROLLER E CHAMA O METÓDO CADASTRAR
            sucesso = pFController.inserirPessoaFisica(tipoPessoa, cpf, telefone, celular, tipoAnunciante, tFName.getText(), tFSobrenome1.getText(), usuario, anuncio);

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Continuar.");
                jBVerAnuncio.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
            } else if(tFName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório! Preencha o campo Nome");
                tFName.requestFocus();

            } else if(tFSobrenome1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo Sobrenome é obrigatório! Preencha o campo Sobrenome");
                tFSobrenome1.requestFocus();

            } else if(jFCpf.getValue().equals("000.000.000-00")) {
                JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório! Preencha o campo CPF.");
                jFCpf.requestFocus();
                
            } else if(jFCelular.getValue().equals("(00)00000-0000")) {
                JOptionPane.showMessageDialog(null, "O campo celular está inválido! Adicione um celular válido");
                jFCelular.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "error" + e);

        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroPFC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarDadosActionPerformed

    private void jBVerAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerAnuncioActionPerformed
        try {
            //ACTION DO BOTÃO CONTINUAR
            new HomeAnunciante().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasCadastroPFC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FECHAMENTO DA TELA ATUAL
        setVisible(false);
    }//GEN-LAST:event_jBVerAnuncioActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        //ACTION DO BOTÃO LIMPAR
        tFName.setText("");
        tFSobrenome1.setText("");
        jFTelefone.setValue("(00)0000-0000");
        jFCelular.setValue("(00)00000-0000");
        jFCpf.setValue("000.000.000-00");
    }//GEN-LAST:event_jBLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBVerAnuncio;
    private javax.swing.JButton jButtonSalvarDados;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFCelular;
    private javax.swing.JFormattedTextField jFCpf;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JFormattedTextField jFTipoAnunciante;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCorretor;
    private javax.swing.JLabel jLabelCresci;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSobrenome1;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField tFName;
    private javax.swing.JTextField tFSobrenome1;
    // End of variables declaration//GEN-END:variables
}
