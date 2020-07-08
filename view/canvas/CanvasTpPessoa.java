
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.CadastroUsuario;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroPFC;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroPFP;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.TelaCadastroPJ;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CanvasTpPessoa extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    
    public CanvasTpPessoa() {
        try {
            initComponents();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasTpPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(755, 460, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTpPessoa = new javax.swing.JLabel();
        jButtonEmpresa = new javax.swing.JButton();
        jButtonPFC = new javax.swing.JButton();
        jButtonPFP = new javax.swing.JButton();
        jButtonVoltar1 = new javax.swing.JButton();

        jLabelTpPessoa.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelTpPessoa.setText("Você é?");

        jButtonEmpresa.setBackground(new java.awt.Color(0, 204, 255));
        jButtonEmpresa.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonEmpresa.setText("Imobiliária");
        jButtonEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpresaActionPerformed(evt);
            }
        });

        jButtonPFC.setBackground(new java.awt.Color(0, 204, 255));
        jButtonPFC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonPFC.setText("Corretor");
        jButtonPFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPFCActionPerformed(evt);
            }
        });

        jButtonPFP.setBackground(new java.awt.Color(0, 204, 255));
        jButtonPFP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonPFP.setText("Proprietário");
        jButtonPFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPFPActionPerformed(evt);
            }
        });

        jButtonVoltar1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVoltar1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonVoltar1.setText("Voltar");
        jButtonVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButtonPFP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jButtonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(jButtonPFC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabelTpPessoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTpPessoa)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPFP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPFC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jButtonVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPFPActionPerformed
        new TelaCadastroPFP().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonPFPActionPerformed

    private void jButtonEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpresaActionPerformed
        new TelaCadastroPJ().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonEmpresaActionPerformed

    private void jButtonPFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPFCActionPerformed
        new TelaCadastroPFC().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonPFCActionPerformed

    private void jButtonVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar1ActionPerformed
        new CadastroUsuario().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonVoltar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmpresa;
    private javax.swing.JButton jButtonPFC;
    private javax.swing.JButton jButtonPFP;
    private javax.swing.JButton jButtonVoltar1;
    private javax.swing.JLabel jLabelTpPessoa;
    // End of variables declaration//GEN-END:variables
}
