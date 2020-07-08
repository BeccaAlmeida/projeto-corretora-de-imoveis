
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas.CanvasEditarAnunciantePJ;

public class EditarPJ extends javax.swing.JFrame {

    public EditarPJ() {
        initComponents();
        
        CanvasEditarAnunciantePJ canvasEditar = new CanvasEditarAnunciantePJ();
        this.jPanelEditarPJ.add(canvasEditar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEditar = new javax.swing.JLabel();
        jPanelEditarPJ = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEditar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabelEditar.setText("Editar Perfil");
        getContentPane().add(jLabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 18, -1, -1));

        jPanelEditarPJ.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelEditarPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 46, 744, 530));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\imgFundoM.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEditar;
    private javax.swing.JPanel jPanelEditarPJ;
    // End of variables declaration//GEN-END:variables
}
