
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas.CanvasAnuncio;


public class AdicionarImagens extends javax.swing.JFrame {

    public AdicionarImagens() {
        initComponents();
        
        this.setIconImage(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logIMV.PNG").getImage());
        
        CanvasAnuncio canvasAnuncio = new CanvasAnuncio();
        this.jPanelAddImg.add(canvasAnuncio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogPicture = new javax.swing.JDialog();
        jPanelAddImg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialogPictureLayout = new javax.swing.GroupLayout(jDialogPicture.getContentPane());
        jDialogPicture.getContentPane().setLayout(jDialogPictureLayout);
        jDialogPictureLayout.setHorizontalGroup(
            jDialogPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogPictureLayout.setVerticalGroup(
            jDialogPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelAddImg.setPreferredSize(new java.awt.Dimension(754, 540));
        jPanelAddImg.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelAddImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 27, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\imgFundoM.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarImagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialogPicture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAddImg;
    // End of variables declaration//GEN-END:variables
}
