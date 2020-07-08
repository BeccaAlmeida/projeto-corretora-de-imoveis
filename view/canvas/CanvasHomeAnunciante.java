
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller.ImovelController;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.AnuncioDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ComodoDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImagemDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImovelDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.LocationDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Comodo;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Location;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class CanvasHomeAnunciante extends javax.swing.JPanel {

    BufferedImage imgCadastro;
    BufferedImage imageBuffer = null;
    ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
    byte[] bytesArray;
    
    ImovelDAO listaImoveis = new ImovelDAO();
    AnuncioDAO listaAnuncios = new AnuncioDAO();
    Imagem listaImagens = new Imagem();
    LocationDAO listaEndereco = new LocationDAO();
    ComodoDAO listaComodos = new ComodoDAO();
    
    private int index;
    
    public CanvasHomeAnunciante() throws SQLException {
     
        try {
            initComponents();
            
            DefaultTableModel modelo = new DefaultTableModel();    
            jTImoveisAnunciante.setRowSorter(new TableRowSorter(modelo));
            
            
            //EVITANDO DUPLICÃO NA TABELA
            modelo.setNumRows(0);
            
            this.carregarTableImovel();
            
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(imgCadastro.getScaledInstance(780, 510, 0), 0, 0, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCarregarTabela = new javax.swing.JButton();
        tFcodigoImovel = new javax.swing.JTextField();
        tipoNegociacao = new javax.swing.JTextField();
        dataAtual = new javax.swing.JTextField();
        imgImv = new javax.swing.JLabel();
        nomeImg = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        jLabelCondominio2 = new javax.swing.JLabel();
        condominio = new javax.swing.JTextField();
        jLabelIPTU2 = new javax.swing.JLabel();
        IPTU = new javax.swing.JTextField();
        jLabelArea = new javax.swing.JLabel();
        jFarea = new javax.swing.JTextField();
        jLabelQuartos1 = new javax.swing.JLabel();
        quartos = new javax.swing.JTextField();
        jLabelBanheiros1 = new javax.swing.JLabel();
        banheiros = new javax.swing.JTextField();
        jLabelSuites1 = new javax.swing.JLabel();
        suites = new javax.swing.JTextField();
        jLabelVagas1 = new javax.swing.JLabel();
        vagas = new javax.swing.JTextField();
        jLabelDiferencial1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diferencial = new javax.swing.JTextArea();
        tipoImovel = new javax.swing.JTextField();
        tipoUso = new javax.swing.JTextField();
        jBBackTo = new javax.swing.JButton();
        jBNextTo = new javax.swing.JButton();
        jBNext = new javax.swing.JButton();
        jBBack = new javax.swing.JButton();
        rua = new javax.swing.JTextField();
        CEP = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        UF = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        jBEditar = new javax.swing.JButton();
        jBUpdate = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTImoveisAnunciante = new javax.swing.JTable();

        jBCarregarTabela.setBackground(new java.awt.Color(0, 204, 255));
        jBCarregarTabela.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBCarregarTabela.setText("+");
        jBCarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarregarTabelaActionPerformed(evt);
            }
        });

        setMinimumSize(new java.awt.Dimension(4, 4));
        setPreferredSize(new java.awt.Dimension(710, 432));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tFcodigoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        tFcodigoImovel.setBorder(null);
        add(tFcodigoImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 33));

        tipoNegociacao.setEditable(false);
        tipoNegociacao.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoNegociacao.setBorder(null);
        add(tipoNegociacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 121, 28));

        dataAtual.setEditable(false);
        dataAtual.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        dataAtual.setBorder(null);
        add(dataAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 113, 30));

        imgImv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(imgImv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 220));

        nomeImg.setEditable(false);
        nomeImg.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        nomeImg.setBorder(null);
        add(nomeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 30));

        jLabelPreco.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelPreco.setText("Preço:");
        add(jLabelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        preco.setEditable(false);
        preco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        preco.setToolTipText("");
        preco.setBorder(null);
        add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 146, 32));

        jLabelCondominio2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelCondominio2.setText("Condomínio: ");
        add(jLabelCondominio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        condominio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        condominio.setBorder(null);
        add(condominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 110, 54, 22));

        jLabelIPTU2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelIPTU2.setText("IPTU:");
        add(jLabelIPTU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        IPTU.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        IPTU.setBorder(null);
        add(IPTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 110, 54, 22));

        jLabelArea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelArea.setText("Área");
        add(jLabelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jFarea.setEditable(false);
        jFarea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jFarea.setBorder(null);
        add(jFarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 110, 30, 24));

        jLabelQuartos1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelQuartos1.setText("Quartos:");
        add(jLabelQuartos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 140, -1, -1));

        quartos.setEditable(false);
        quartos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        quartos.setBorder(null);
        add(quartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 24, 30));

        jLabelBanheiros1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelBanheiros1.setText("Banheiros");
        add(jLabelBanheiros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 140, -1, -1));

        banheiros.setEditable(false);
        banheiros.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        banheiros.setBorder(null);
        add(banheiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 24, 30));

        jLabelSuites1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelSuites1.setText("Suítes");
        add(jLabelSuites1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 140, -1, -1));

        suites.setEditable(false);
        suites.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        suites.setBorder(null);
        add(suites, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 24, 30));

        jLabelVagas1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelVagas1.setText("Vagas");
        add(jLabelVagas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 140, -1, -1));

        vagas.setEditable(false);
        vagas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        vagas.setBorder(null);
        add(vagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 25, 30));

        jLabelDiferencial1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelDiferencial1.setText("Diferencial:");
        add(jLabelDiferencial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 50, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 96));

        diferencial.setEditable(false);
        diferencial.setColumns(20);
        diferencial.setRows(5);
        diferencial.setBorder(null);
        jScrollPane2.setViewportView(diferencial);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 220, 220, 90));

        tipoImovel.setEditable(false);
        tipoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoImovel.setBorder(null);
        add(tipoImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, 28));

        tipoUso.setEditable(false);
        tipoUso.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoUso.setBorder(null);
        add(tipoUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 28));

        jBBackTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconenextto.png")); // NOI18N
        jBBackTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackToActionPerformed(evt);
            }
        });
        add(jBBackTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 77, 47));

        jBNextTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconebackto.png")); // NOI18N
        jBNextTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextToActionPerformed(evt);
            }
        });
        add(jBNextTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 77, 47));

        jBNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeNext.png")); // NOI18N
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        add(jBNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 80, -1));

        jBBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeBack.png")); // NOI18N
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });
        add(jBBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        rua.setEditable(false);
        rua.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        rua.setBorder(null);
        add(rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, 28));

        CEP.setEditable(false);
        CEP.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        CEP.setToolTipText("");
        CEP.setBorder(null);
        CEP.setPreferredSize(new java.awt.Dimension(0, 0));
        add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 28));

        cidade.setEditable(false);
        cidade.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cidade.setBorder(null);
        add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 162, 31));

        UF.setEditable(false);
        UF.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        UF.setBorder(null);
        add(UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 30, 30));

        bairro.setEditable(false);
        bairro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        bairro.setBorder(null);
        add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 127, 31));

        jBEditar.setBackground(new java.awt.Color(0, 204, 255));
        jBEditar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 94, 47));

        jBUpdate.setBackground(new java.awt.Color(0, 204, 255));
        jBUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBUpdate.setText("Salvar");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });
        add(jBUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 103, 94, 47));

        jBExcluir.setBackground(new java.awt.Color(0, 204, 255));
        jBExcluir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBExcluir.setText("Remover");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });
        add(jBExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 160, 94, 47));

        jTImoveisAnunciante.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jTImoveisAnunciante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codgio_imovel", "Preco", "Condominio", "IPTU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTImoveisAnunciante.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTImoveisAnunciante.setPreferredSize(new java.awt.Dimension(780, 64));
        jScrollPane1.setViewportView(jTImoveisAnunciante);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 409, 776, 101));
    }// </editor-fold>//GEN-END:initComponents

    private void jBNextToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextToActionPerformed
        index++;
        if(index <= jTImoveisAnunciante.getRowCount()) {
            try {
                this.carregarImagem();
                setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
                setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
                setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
            } catch (SQLException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
                JOptionPane.showMessageDialog(null, "voce está no ultimo registro", "ALERTA!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jBNextToActionPerformed

    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
        try {
            index = 0;
            
            this.carregarImagem();
            setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
            setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
            setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
            setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }//GEN-LAST:event_jBBackActionPerformed

    private void jBCarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCarregarTabelaActionPerformed
        try {
            index = 0;
            
            this.carregarImagem();
            setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
            setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
            setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
            setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBCarregarTabelaActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        try {
            index = jTImoveisAnunciante.getRowCount()-1;
            
            this.carregarImagem();
            setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
            setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
            setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
            setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jBNextActionPerformed

    private void jBBackToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackToActionPerformed
        index--;

        if(index >= 0 ) {
            try {
                this.carregarImagem();
                setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
                setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
                setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
            } catch (SQLException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                index = 0;
                JOptionPane.showMessageDialog(null, "voce está no promeiro registro", "ALERTA!", JOptionPane.WARNING_MESSAGE);
                this.carregarImagem();
                setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorAnunciante().get(index));
                setarCamposEndereco(listaEndereco.listarPorAnunciante().get(index));
                setarCamposComodos(listaComodos.listarPorAnunciante().get(index));
            } catch (SQLException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CanvasHomeAnunciante.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jBBackToActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        preco.setEditable(true);
        condominio.setEditable(true);
        IPTU.setEditable(true);
        jFarea.setEditable(true);
        diferencial.setEditable(true);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed
        Integer area = Integer.parseInt(jFarea.getText());
        
        boolean sucesso;
        
        try {
            ImovelController imovelController = new ImovelController();
            sucesso = imovelController.alterar(preco.getText(), condominio.getText(), IPTU.getText(), area, diferencial.getText());
            
            if(sucesso) {
                JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso!");
            
            } else {
                JOptionPane.showMessageDialog(null, "Algum Campo está inválido!\nVerifique se os campos PREÇO, CONDOMINIO E IPTU são digitos.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }
    }//GEN-LAST:event_jBUpdateActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int codigoImovel = Integer.parseInt(tFcodigoImovel.getText());
        boolean sucesso;
        
        try {
            ImovelController imovelController = new ImovelController();
            sucesso = imovelController.remove(codigoImovel);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    public void setarCamposImovel(Imovel imv) { 
           
        tFcodigoImovel.setText(String.valueOf(imv.getCodigoImovel()));
        preco.setText(String.valueOf(imv.getPreco()));
        condominio.setText(String.valueOf(imv.getCondominio()));
        IPTU.setText(String.valueOf(imv.getIptu()));
        jFarea.setText(String.valueOf(imv.getArea()));
        tipoNegociacao.setText(String.valueOf(imv.getTipoNegociacao()));
        tipoUso.setText(String.valueOf(imv.getTipoUso()));
        tipoImovel.setText(String.valueOf(imv.getTipoImovel()));
        diferencial.setText(String.valueOf(imv.getDiferencial()));
    }
    
    public void setarCamposAnuncio(Anuncio anun){
        dataAtual.setText(String.valueOf(anun.getDataAtual()));
    
    }
    
    public void carregarImagem() throws SQLException, IOException {
        imageBuffer = null; 
        
        ImagemDAO listaImage = new ImagemDAO();
        
        for(Imagem imagem: listaImage.listarPorAnunciante(nomeImg.getText())) {
            if(imagem!=null) {
                
                nomeImg.setText(String.valueOf(imagem.getNomeImagem()));
                
                imageBuffer = ImageIO.read(new ByteArrayInputStream(imagem.getImg()));
                Image diminuirImagem = imageBuffer.getScaledInstance(imgImv.getWidth(), imgImv.getHeight(), Image.SCALE_DEFAULT);
                imgImv.setIcon(new ImageIcon(diminuirImagem));
                
            } else {
                System.out.println("Não existe Cadastro");
            }
        }
    }
    
    public void setarCamposEndereco(Location ende) {
        CEP.setText(String.valueOf(ende.getCep()));
        rua.setText(String.valueOf(ende.getRua()));
        bairro.setText(String.valueOf(ende.getBairro()));
        cidade.setText(String.valueOf(ende.getUf()));
        UF.setText(String.valueOf(ende.getUf()));
     
     }
    
    public void setarCamposComodos(Comodo cm) {
        quartos.setText(String.valueOf(cm.getQuartos()));
        banheiros.setText(String.valueOf(cm.getBanheiros()));
        suites.setText(String.valueOf(cm.getSuites()));
        vagas.setText(String.valueOf(cm.getVagas()));
    }
    
    public void carregarTableImovel() throws SQLException, SQLException {
        DefaultTableModel modelo = new DefaultTableModel();    
        
        ImovelDAO imoveis = new ImovelDAO();
        
        for(Imovel imv: imoveis.listar()){

            modelo.addRow(new Object[]{
                
                imv.getCodigoImovel(),
                imv.getPreco(),
                imv.getCondominio(),
                imv.getIptu(),
                imv.getImagem().getImg(),
                imv.getAnuncio().getDataAtual(),
                imv.getEndereco().getCep(),
                imv.getEndereco().getRua(),
                imv.getEndereco().getBairro(),
                imv.getEndereco().getUf(),
                imv.getComodo().getQuartos(),
                imv.getComodo().getBanheiros(),
                imv.getComodo().getSuites(),
                imv.getComodo().getVagas(),
            });   
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField IPTU;
    private javax.swing.JTextField UF;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField banheiros;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField condominio;
    private javax.swing.JTextField dataAtual;
    private javax.swing.JTextArea diferencial;
    private javax.swing.JLabel imgImv;
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBBackTo;
    private javax.swing.JButton jBCarregarTabela;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBNextTo;
    private javax.swing.JButton jBUpdate;
    private javax.swing.JTextField jFarea;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelBanheiros1;
    private javax.swing.JLabel jLabelCondominio2;
    private javax.swing.JLabel jLabelDiferencial1;
    private javax.swing.JLabel jLabelIPTU2;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQuartos1;
    private javax.swing.JLabel jLabelSuites1;
    private javax.swing.JLabel jLabelVagas1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTImoveisAnunciante;
    private javax.swing.JTextField nomeImg;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quartos;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField suites;
    private javax.swing.JTextField tFcodigoImovel;
    private javax.swing.JTextField tipoImovel;
    private javax.swing.JTextField tipoNegociacao;
    private javax.swing.JTextField tipoUso;
    private javax.swing.JTextField vagas;
    // End of variables declaration//GEN-END:variables
}
