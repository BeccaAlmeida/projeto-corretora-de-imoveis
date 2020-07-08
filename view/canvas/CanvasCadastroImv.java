
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.ImovelController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.Home;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroEnderecoTest;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroImv;
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

public class CanvasCadastroImv extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasCadastroImv() {
        try {
            initComponents();
            
            //IMAGEICON
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasCadastroImv.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }   
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(654, 510, 0), 0, 0, null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCdImovel = new javax.swing.JLabel();
        jCBTpImovel = new javax.swing.JComboBox<>();
        jCBTpUso = new javax.swing.JComboBox<>();
        jLTpUso = new javax.swing.JLabel();
        jLTpNegociacao = new javax.swing.JLabel();
        jLTpImovel = new javax.swing.JLabel();
        jCBTpNegociacao = new javax.swing.JComboBox<>();
        jFIPTU = new javax.swing.JFormattedTextField();
        jFArea = new javax.swing.JFormattedTextField();
        jLArea = new javax.swing.JLabel();
        jLIptu = new javax.swing.JLabel();
        jLDImoveis = new javax.swing.JLabel();
        jLCondominio = new javax.swing.JLabel();
        jFCondominio = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tADiferencial = new javax.swing.JTextArea();
        jFPreco = new javax.swing.JFormattedTextField();
        jLPreco = new javax.swing.JLabel();
        jLDiferencial = new javax.swing.JLabel();
        jBContinuar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        JBSalvarDados = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCdImovel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelCdImovel.setText("Cadastre seu Imóvel");
        add(jLabelCdImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jCBTpImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jCBTpImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Apartamento", "Casa", "Studio", "Loft", "Cobertura", "Sala Comercial", "Escritório" }));
        jCBTpImovel.setToolTipText("");
        add(jCBTpImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 42));

        jCBTpUso.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jCBTpUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Residencial", "Comercial" }));
        add(jCBTpUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, 40));

        jLTpUso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLTpUso.setText("Qual tipo de Uso?*");
        add(jLTpUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLTpNegociacao.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLTpNegociacao.setText("O que você quer?*");
        add(jLTpNegociacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLTpImovel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLTpImovel.setText("Tipo do Imóvel*");
        add(jLTpImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 111, -1));

        jCBTpNegociacao.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jCBTpNegociacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alugar", "Vender" }));
        add(jCBTpNegociacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 115, 39));

        jFIPTU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFIPTU.setText("0,00");
        jFIPTU.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFIPTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 94, 39));

        jFArea.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFArea.setText("0");
        jFArea.setToolTipText("");
        jFArea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 59, 39));

        jLArea.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLArea.setText("Área:");
        add(jLArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLIptu.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLIptu.setText("IPTU:*");
        add(jLIptu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLDImoveis.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLDImoveis.setText("Dados do Imóvel");
        add(jLDImoveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLCondominio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLCondominio.setText("Condominío:*");
        add(jLCondominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jFCondominio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFCondominio.setText("0,00");
        jFCondominio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFCondominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 100, 39));

        tADiferencial.setColumns(20);
        tADiferencial.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tADiferencial.setRows(5);
        jScrollPane1.setViewportView(tADiferencial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 308, 82));

        jFPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFPreco.setText("0,00");
        jFPreco.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        add(jFPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 95, 39));

        jLPreco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLPreco.setText("Preço:*");
        add(jLPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLDiferencial.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLDiferencial.setText("Diferencial:");
        add(jLDiferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jBContinuar.setBackground(new java.awt.Color(0, 204, 255));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });
        add(jBContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, 42));

        jBLimpar.setBackground(new java.awt.Color(0, 204, 204));
        jBLimpar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });
        add(jBLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 98, 42));

        JBSalvarDados.setBackground(new java.awt.Color(0, 204, 255));
        JBSalvarDados.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        JBSalvarDados.setText("Salvar Dados");
        JBSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarDadosActionPerformed(evt);
            }
        });
        add(JBSalvarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, 42));

        jBVoltar.setBackground(new java.awt.Color(0, 204, 255));
        jBVoltar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 86, 42));
    }// </editor-fold>//GEN-END:initComponents
    //AÇÃO DO BOTÃO SALVAR
    private void JBSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarDadosActionPerformed
        //CONVERSÃO DOS DADOS DE CADA CAMPO PARA STRING;
        String tipoNegociacao = jCBTpNegociacao.getSelectedItem().toString();
        String tipoUso = jCBTpUso.getSelectedItem().toString();
        String tipoImovel = jCBTpImovel.getSelectedItem().toString();
        String preco = (jFPreco.getValue().toString());
        String condominio = (jFCondominio.getValue().toString());
        String iptu = (jFIPTU.getValue().toString());
        int area = Integer.parseInt(jFArea.getValue().toString());
        
        //VARIAVEL DE OCNFIRMAÇÃO
        boolean sucesso;

        //TRATAMENTO DE ERRO DE COMPILAÇÃO
        try {

            //OBJETO DA CLASSE CLIENTECONTROLLER ESTANCIADO
            ImovelController imovelController = new ImovelController();

            //VARIAVEL DE ITERAÇÃO RECEBE O OBJETO IMOVELCONTROLLER E CHAMA O METÓDO CADASTRAR TODOS OS CAMPOS CRIADOS E SETADOS
            sucesso = imovelController.cadastrarImovel(tipoUso, tipoNegociacao, tipoImovel, tADiferencial.getText(), preco, iptu, condominio, area);

            //CONDIÇÃO DE VÁLIDAÇÃO E EXIBIÇÃO DE MENSAGENS.
            if(sucesso) {
                //MENSAGEM DE SUCESSO
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso! Clique em Continuar.");

                //ATIVAÇÃO DO BOTÃO CONTINUAR SE DADOS VÁLIDOS
                jBContinuar.setEnabled(true);

                //ANINHAMENTO DE CONDIÇÕES SE CAMPOS VAZIOS E MENSAGEM AO USUÁRIO
                } else if(jCBTpNegociacao.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null, "O campo tipo de negociação é obrigatório! Selecione uma das opções");
                    jCBTpNegociacao.requestFocus();

                } else if(jCBTpUso.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo tipo de uso é obrigatório! Selecione o umas das opções");
                    jCBTpUso.requestFocus();

                } else if(jCBTpImovel.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo tipo de imóvel é obrigatório! Selecione uma das opções de imóvel");
                    jCBTpImovel.requestFocus();

                } else if(jFPreco.getValue().equals(0)) {
                    JOptionPane.showMessageDialog(null, "O campo preço é obrigatório! Preencha com um valor o campo preço.");
                    jFPreco.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Algum dado está inválido! Preencha os campos com dados válidos.");
            }

            //MENSAGEM DE ERRO DE COMPILAÇÃO
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroImv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBSalvarDadosActionPerformed
    //AÇÃO DO BOTÃO VOLTAR
    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        try {
            new Home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasCadastroImv.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    //AÇÃO DO BOTÃO CONTINUAR
    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed

        //ACTION DO BOTÃO CONTINUAR
        new TelaCadastroEnderecoTest().setVisible(true);

        //FECHAMENTO DA TELA ATUAL
        setVisible(false);
    }//GEN-LAST:event_jBContinuarActionPerformed
    
    //AÇÃO DO BOTÃO LIMPAR
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        //ACTION DO BOTÃO LIMPAR
        jFPreco.setValue(0);
        jFCondominio.setValue(0);
        jFIPTU.setValue(0);
        jFArea.setValue(0);
        jCBTpNegociacao.setSelectedItem("");
        jCBTpUso.setSelectedItem("");
        jCBTpImovel.setSelectedItem("");
    }//GEN-LAST:event_jBLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSalvarDados;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCBTpImovel;
    private javax.swing.JComboBox<String> jCBTpNegociacao;
    private javax.swing.JComboBox<String> jCBTpUso;
    private javax.swing.JFormattedTextField jFArea;
    private javax.swing.JFormattedTextField jFCondominio;
    private javax.swing.JFormattedTextField jFIPTU;
    private javax.swing.JFormattedTextField jFPreco;
    private javax.swing.JLabel jLArea;
    private javax.swing.JLabel jLCondominio;
    private javax.swing.JLabel jLDImoveis;
    private javax.swing.JLabel jLDiferencial;
    private javax.swing.JLabel jLIptu;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLTpImovel;
    private javax.swing.JLabel jLTpNegociacao;
    private javax.swing.JLabel jLTpUso;
    private javax.swing.JLabel jLabelCdImovel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tADiferencial;
    // End of variables declaration//GEN-END:variables
}
