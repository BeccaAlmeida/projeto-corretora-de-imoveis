
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.AnuncioController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImagemDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.CadastroUsuario;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CanvasAnuncio extends javax.swing.JPanel {

    BufferedImage imageBuffer = null;
    ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
    byte[] bytesArray;
    
    public CanvasAnuncio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAddImg = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        tFDataAtual = new javax.swing.JTextField();
        jBDataAtual = new javax.swing.JButton();
        jLabelImg = new javax.swing.JLabel();
        jBSalvarAnuncio = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBAddImg = new javax.swing.JButton();
        nomeImagem = new javax.swing.JTextField();

        jLabelAddImg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelAddImg.setText("Insira Imagens do imóvel");

        jLabelData.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelData.setText("Data:*");

        tFDataAtual.setEditable(false);
        tFDataAtual.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tFDataAtual.setText("00-00-0000");
        tFDataAtual.setBorder(null);

        jBDataAtual.setBackground(new java.awt.Color(0, 204, 204));
        jBDataAtual.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBDataAtual.setText("Gerar Data Atual");
        jBDataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDataAtualActionPerformed(evt);
            }
        });

        jLabelImg.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabelImg.setText("Inserir Imagem");
        jLabelImg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImgMouseClicked(evt);
            }
        });

        jBSalvarAnuncio.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvarAnuncio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvarAnuncio.setText("Salvar Anuncio");
        jBSalvarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAnuncioActionPerformed(evt);
            }
        });

        jBContinuar.setBackground(new java.awt.Color(0, 204, 255));
        jBContinuar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBContinuar.setText("Continuar");
        jBContinuar.setEnabled(false);
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jBSalvar.setBackground(new java.awt.Color(0, 204, 255));
        jBSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBSalvar.setText("Salvar Imagem");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBAddImg.setBackground(new java.awt.Color(0, 204, 204));
        jBAddImg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBAddImg.setText("Adicionar Imagem");
        jBAddImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddImgActionPerformed(evt);
            }
        });

        nomeImagem.setEditable(false);
        nomeImagem.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        nomeImagem.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBAddImg)
                        .addGap(64, 64, 64)
                        .addComponent(jBSalvar)
                        .addGap(47, 47, 47)
                        .addComponent(jBSalvarAnuncio)
                        .addGap(29, 29, 29)
                        .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nomeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabelData)
                                    .addGap(25, 25, 25)
                                    .addComponent(tFDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jBDataAtual)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAddImg, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData)
                            .addComponent(tFDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBDataAtual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAddImg)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAddImg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void getImagem() {
        JFileChooser arquivo = new JFileChooser();
        arquivo.setFileFilter(new FileNameExtensionFilter("imagem", "bmp", "jpg", "png", "jpeg"));
        arquivo.setAcceptAllFileFilterUsed(false);
        
        arquivo.setDialogTitle("Selecione uma imagem");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        arquivo.showOpenDialog(this);

        if(arquivo.getSelectedFile() != null){
            try {
                String caminho = ""+arquivo.getSelectedFile().getAbsolutePath();
                imageBuffer = ImageIO.read(new File(caminho));
                Image diminuirImagem = imageBuffer.getScaledInstance(jLabelImg.getWidth(), jLabelImg.getHeight(), Image.SCALE_DEFAULT);
                
                
                jLabelImg.setText("");
                jLabelImg.setIcon(new ImageIcon(diminuirImagem));
                nomeImagem.setText(caminho);
                
            } catch (IOException ex) {
                Logger.getLogger(CanvasAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void gravarImagem () {
        try {
            Imagem imagem = new Imagem();
            ImageIO.write(imageBuffer, "jpg", bytesImg);
            bytesImg.flush();
            bytesArray = bytesImg.toByteArray();
            bytesImg.close();
            imagem.setImg(bytesArray);
            imagem.setNomeImagem(nomeImagem.getText());
            
            
            ImagemDAO dadosImagem = new ImagemDAO();
            try {
             dadosImagem.adicionarImagem(imagem);
               
            } catch (Exception e) {
            }
        JOptionPane.showMessageDialog(null, "Gravando....");
        JOptionPane.showMessageDialog(null, "Imagem salva com sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(CanvasAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jBAddImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddImgActionPerformed
        this.getImagem();
    }//GEN-LAST:event_jBAddImgActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

       this.gravarImagem();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        new CadastroUsuario().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBSalvarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAnuncioActionPerformed

        boolean sucesso;

        try {
            Imovel imoveis = new Imovel();
            imoveis.setCodigoImovel(2);

            Imagem imagens = new Imagem();
            imagens.setIdImagem(2);

            AnuncioController anuncioController = new AnuncioController();
            sucesso = anuncioController.adicionarAnuncio(tFDataAtual.getText(), imoveis, imagens);

            if(sucesso) {

                JOptionPane.showMessageDialog(null, "Anuncio salvo com sucesso! Clique em continuar.");
                jBContinuar.setEnabled(true);

            }else if(tFDataAtual.getText().equals("00-00-0000")){
                JOptionPane.showMessageDialog(null, "A data está inválida!\nClique no botao gerar data atual.");

            } else {
                JOptionPane.showMessageDialog(null, "Você não preencheu a data!\nClique no botão gerar data atual.");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBSalvarAnuncioActionPerformed

    private void jBDataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDataAtualActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar data = Calendar.getInstance();
        tFDataAtual.setText(sdf.format(data.getTime()));
    }//GEN-LAST:event_jBDataAtualActionPerformed

    private void jLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImgMouseClicked
       this.getImagem();
    }//GEN-LAST:event_jLabelImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddImg;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBDataAtual;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBSalvarAnuncio;
    private javax.swing.JLabel jLabelAddImg;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JTextField nomeImagem;
    private javax.swing.JTextField tFDataAtual;
    // End of variables declaration//GEN-END:variables
}
