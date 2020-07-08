
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas.CanvasCadastroUsuario;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
        
        this.setIconImage(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logIMV.PNG").getImage());
        
        CanvasCadastroUsuario canvasUsuario = new CanvasCadastroUsuario();
        this.jPanelCadastrarLogin.add(canvasUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastrarLogin = new javax.swing.JPanel();
        imgFundoCdUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCadastrarLogin.setPreferredSize(new java.awt.Dimension(460, 504));
        jPanelCadastrarLogin.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelCadastrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 43, -1, -1));

        imgFundoCdUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\imgFundo.png")); // NOI18N
        getContentPane().add(imgFundoCdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgFundoCdUsuario;
    private javax.swing.JPanel jPanelCadastrarLogin;
    // End of variables declaration//GEN-END:variables
}
