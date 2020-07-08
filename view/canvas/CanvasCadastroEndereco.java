
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.ComodoController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.LocationController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.AdicionarImagens;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroEnderecoTest;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroImv;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CanvasCadastroEndereco extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasCadastroEndereco() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(755, 550, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLQuartos = new javax.swing.JLabel();
        jSQuartos = new javax.swing.JSpinner();
        jLBanheiros = new javax.swing.JLabel();
        jSBanheiros = new javax.swing.JSpinner();
        jLSuites = new javax.swing.JLabel();
        jSSuites = new javax.swing.JSpinner();
        jLVagas = new javax.swing.JLabel();
        jSVagas = new javax.swing.JSpinner();
        jBSalvarComodos = new javax.swing.JButton();
        jLCdEndereco = new javax.swing.JLabel();
        jLCep = new javax.swing.JLabel();
        jFCep = new javax.swing.JFormattedTextField();
        jLRua = new javax.swing.JLabel();
        tFRua = new javax.swing.JTextField();
        jFNumero = new javax.swing.JFormattedTextField();
        jLNumero = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        tFBairro = new javax.swing.JTextField();
        jSAndar = new javax.swing.JSpinner();
        jLAndar = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        tFCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAComplemento = new javax.swing.JTextArea();
        jLComplemento = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox<>();
        jLUf = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jBSalvarDados = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLQuartos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLQuartos.setText("Quartos:*");
        add(jLQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 57, -1, -1));

        jSQuartos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jSQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 80, 45, 36));

        jLBanheiros.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLBanheiros.setText("Banheiros:*");
        add(jLBanheiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 57, -1, -1));

        jSBanheiros.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jSBanheiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 43, 36));

        jLSuites.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLSuites.setText("Suítes:");
        add(jLSuites, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 57, -1, -1));

        jSSuites.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jSSuites, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 81, 42, 38));

        jLVagas.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLVagas.setText("Vagas:");
        add(jLVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 57, -1, -1));

        jSVagas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jSVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 80, 49, 39));

        jBSalvarComodos.setBackground(new java.awt.Color(0, 204, 204));
        jBSalvarComodos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvarComodos.setText("Salvar Comodos");
        jBSalvarComodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarComodosActionPerformed(evt);
            }
        });
        add(jBSalvarComodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 80, 154, 38));

        jLCdEndereco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLCdEndereco.setText("Endereço");
        add(jLCdEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 148, -1, -1));

        jLCep.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLCep.setText("CEP:*");
        add(jLCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 192, -1, -1));

        jFCep.setEditable(false);
        try {
            jFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCep.setText("00000-000");
        jFCep.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 230, 156, 39));

        jLRua.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLRua.setText("Rua:*");
        add(jLRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 192, -1, -1));

        tFRua.setEditable(false);
        tFRua.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 230, 328, 39));

        jFNumero.setEditable(false);
        jFNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFNumero.setText("0");
        jFNumero.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 56, 39));

        jLNumero.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLNumero.setText("N°:*");
        add(jLNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 186, -1, -1));

        jLBairro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:*");
        add(jLBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 275, -1, -1));

        tFBairro.setEditable(false);
        tFBairro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 301, 192, 39));

        jSAndar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jSAndar.setEnabled(false);
        add(jSAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 378, 48, 30));

        jLAndar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLAndar.setText("Andar:");
        add(jLAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 352, -1, -1));

        jLCidade.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:*");
        jLCidade.setToolTipText("");
        add(jLCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 275, -1, -1));

        tFCidade.setEditable(false);
        tFCidade.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(tFCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 301, 231, 39));

        tAComplemento.setEditable(false);
        tAComplemento.setColumns(20);
        tAComplemento.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tAComplemento.setRows(5);
        jScrollPane1.setViewportView(tAComplemento);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 378, 304, 85));

        jLComplemento.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");
        add(jLComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 352, -1, -1));

        jCBEstado.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 301, 56, 39));

        jLUf.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLUf.setText("UF:*");
        add(jLUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 275, -1, -1));

        jBVoltar.setBackground(new java.awt.Color(51, 204, 255));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 467, 92, 49));

        jBSalvarDados.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvarDados.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvarDados.setText("Salvar Endereço");
        jBSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarDadosActionPerformed(evt);
            }
        });
        add(jBSalvarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 467, -1, 49));

        jBLimpar.setBackground(new java.awt.Color(0, 204, 255));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });
        add(jBLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 467, 94, 49));

        jBContinuar.setBackground(new java.awt.Color(0, 204, 255));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });
        add(jBContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 469, -1, 49));
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarDadosActionPerformed
        //AÇÃO DO BOTAO SALVAR DADOS;
        //CONVERSÃO DE CAMPOS FORMATADOS PARA STRING;
        String cep = (jFCep.getValue().toString());
        int numero = Integer.parseInt(jFNumero.getValue().toString());
        int andar = Integer.parseInt(jSAndar.getValue().toString());
        String uf = jCBEstado.getSelectedItem().toString();

        //VARIAVEL PARA ITERAÇÃO COM O USUÁRIO.
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {

            Imovel imovel =  new Imovel();
            imovel.setCodigoImovel(2);
            
            //OBJETO DA CLASSE LOCATIONCONTROLLER ESTANCIADO
            LocationController locationController = new LocationController();
            
            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO LOCATIONCONTROLLER E CHAMA O METÓDO CADASTRAR
            sucesso = locationController.cadastrarEndereco(cep, numero, andar, tFRua.getText(), tFBairro.getText(),
                tFCidade.getText(), tAComplemento.getText(), uf, imovel);
            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Continuar.");

                //ATIVAÇÃO DO BOTÃO CONTINUAR SE DADOS VÁLIDOSJOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Continuar.");
                jBContinuar.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
                }else if(jFCep.getValue().equals("     -   ")) {
                    JOptionPane.showMessageDialog(null, "O campo cep é obrigatório! Preencha o campo cep.");
                    jFCep.requestFocus();

                }else if(tFRua.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo rua é obrigatório! Preencha o campo rua.");
                    tFRua.requestFocus();
                    
                }else if(jFNumero.getValue().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo número é obrigatório! Preencha o campo número.");
                    jFNumero.requestFocus();

                }else if(tFBairro.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo bairro é obrigatório! Preencha o campo bairro.");
                    tFBairro.requestFocus();

                }else if(tFCidade.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo cidade é obrigatório! Preencha o campo cidade.");
                    tFCidade.requestFocus();

                }else if(jCBEstado.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo uf é obrigatório! Preencha o campo uf.");
                    jCBEstado.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroEnderecoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalvarDadosActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        new AdicionarImagens().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        new TelaCadastroImv().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        //ACTION DO BOTÃO LIMPAR
        jSQuartos.setValue(0);
        jSBanheiros.setValue(0);
        jSSuites.setValue(0);
        jSVagas.setValue(0);
        jFCep.setValue("00000-000");
        jFNumero.setValue(0);
        tFRua.setText("");
        tFBairro.setText("");
        tFCidade.setText("");
        jCBEstado.setSelectedItem("");
        tAComplemento.setText("");
        jSAndar.setValue(0);
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSalvarComodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarComodosActionPerformed
        int quartos = Integer.parseInt(jSQuartos.getValue().toString());
        int banheiros = Integer.parseInt(jSBanheiros.getValue().toString());
        int suites = Integer.parseInt(jSSuites.getValue().toString());
        int vagas = Integer.parseInt(jSVagas.getValue().toString());

        boolean sucesso;

        try {
            
            Imovel imovel =  new Imovel();
            imovel.setCodigoImovel(1);
            
            ComodoController comodoController = new ComodoController();
            sucesso = comodoController.adicionarComodo(quartos, banheiros, suites, vagas, imovel);

            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Agora, Adicione o endereço.");

                jFCep.setEditable(true);
                jFNumero.setEditable(true);
                tFRua.setEditable(true);
                tFBairro.setEditable(true);
                tFCidade.setEditable(true);
                jCBEstado.setEditable(true);
                jSAndar.setEnabled(true);
                tAComplemento.setEditable(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
                } else if(jSQuartos.getValue().equals(0)) {
                    JOptionPane.showMessageDialog(null, "O campo quartos é obrigatório! adicione pelo menos um quarto");
                    jSQuartos.requestFocus();

                } else if(jSBanheiros.getValue().equals(0)) {
                    JOptionPane.showMessageDialog(null, "O campo bannheiros é obrigatório! adicione pelo menos um banheiro");
                    jSBanheiros.requestFocus();
            }else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jBSalvarComodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvarComodos;
    private javax.swing.JButton jBSalvarDados;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JFormattedTextField jFCep;
    private javax.swing.JFormattedTextField jFNumero;
    private javax.swing.JLabel jLAndar;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLBanheiros;
    private javax.swing.JLabel jLCdEndereco;
    private javax.swing.JLabel jLCep;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLQuartos;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLSuites;
    private javax.swing.JLabel jLUf;
    private javax.swing.JLabel jLVagas;
    private javax.swing.JSpinner jSAndar;
    private javax.swing.JSpinner jSBanheiros;
    private javax.swing.JSpinner jSQuartos;
    private javax.swing.JSpinner jSSuites;
    private javax.swing.JSpinner jSVagas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tAComplemento;
    private javax.swing.JTextField tFBairro;
    private javax.swing.JTextField tFCidade;
    private javax.swing.JTextField tFRua;
    // End of variables declaration//GEN-END:variables
}
