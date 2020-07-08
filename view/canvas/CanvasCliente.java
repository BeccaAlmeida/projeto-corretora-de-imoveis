
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.view.canvas;

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

public class CanvasCliente extends javax.swing.JPanel {

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
    
    public CanvasCliente() throws SQLException {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigoImovel = new javax.swing.JTextField();
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
        area = new javax.swing.JTextField();
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
        diferencial1 = new javax.swing.JTextArea();
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
        jBVender = new javax.swing.JButton();
        jBAlugar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTImoveisAnunciante = new javax.swing.JTable();

        jPanel1.setMinimumSize(new java.awt.Dimension(4, 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 432));

        codigoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        codigoImovel.setBorder(null);

        tipoNegociacao.setEditable(false);
        tipoNegociacao.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoNegociacao.setBorder(null);

        dataAtual.setEditable(false);
        dataAtual.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        dataAtual.setBorder(null);

        imgImv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nomeImg.setEditable(false);
        nomeImg.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        nomeImg.setBorder(null);

        jLabelPreco.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelPreco.setText("Preço:");

        preco.setEditable(false);
        preco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        preco.setToolTipText("");
        preco.setBorder(null);

        jLabelCondominio2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelCondominio2.setText("Condomínio: ");

        condominio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        condominio.setBorder(null);

        jLabelIPTU2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelIPTU2.setText("IPTU:");

        IPTU.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        IPTU.setBorder(null);

        jLabelArea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelArea.setText("Área");

        area.setEditable(false);
        area.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        area.setBorder(null);

        jLabelQuartos1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelQuartos1.setText("Quartos:");

        quartos.setEditable(false);
        quartos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        quartos.setBorder(null);

        jLabelBanheiros1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelBanheiros1.setText("Banheiros");

        banheiros.setEditable(false);
        banheiros.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        banheiros.setBorder(null);

        jLabelSuites1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelSuites1.setText("Suítes");

        suites.setEditable(false);
        suites.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        suites.setBorder(null);

        jLabelVagas1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelVagas1.setText("Vagas");

        vagas.setEditable(false);
        vagas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        vagas.setBorder(null);

        jLabelDiferencial1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelDiferencial1.setText("Diferencial:");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 96));

        diferencial1.setEditable(false);
        diferencial1.setColumns(20);
        diferencial1.setRows(5);
        diferencial1.setBorder(null);
        jScrollPane2.setViewportView(diferencial1);

        tipoImovel.setEditable(false);
        tipoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoImovel.setBorder(null);

        tipoUso.setEditable(false);
        tipoUso.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoUso.setBorder(null);

        jBBackTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconenextto.png")); // NOI18N
        jBBackTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackToActionPerformed(evt);
            }
        });

        jBNextTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconebackto.png")); // NOI18N
        jBNextTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextToActionPerformed(evt);
            }
        });

        jBNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeNext.png")); // NOI18N
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });

        jBBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeBack.png")); // NOI18N
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });

        rua.setEditable(false);
        rua.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        rua.setBorder(null);

        CEP.setEditable(false);
        CEP.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        CEP.setToolTipText("");
        CEP.setBorder(null);
        CEP.setPreferredSize(new java.awt.Dimension(0, 0));

        cidade.setEditable(false);
        cidade.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cidade.setBorder(null);

        UF.setEditable(false);
        UF.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        UF.setBorder(null);

        bairro.setEditable(false);
        bairro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        bairro.setBorder(null);

        jBVender.setBackground(new java.awt.Color(0, 204, 255));
        jBVender.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVender.setText("Vender");

        jBAlugar.setBackground(new java.awt.Color(0, 204, 255));
        jBAlugar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBAlugar.setText("Alugar");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nomeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tipoNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jLabelPreco)
                .addGap(94, 94, 94)
                .addComponent(codigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgImv, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(tipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCondominio2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabelIPTU2)
                                .addGap(38, 38, 38)
                                .addComponent(jLabelArea))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(condominio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(IPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelQuartos1)
                                .addGap(15, 15, 15)
                                .addComponent(jLabelBanheiros1)
                                .addGap(9, 9, 9)
                                .addComponent(jLabelSuites1)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelVagas1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(banheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(suites, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelDiferencial1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jBBack)
                .addGap(2, 2, 2)
                .addComponent(jBBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jBNextTo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jBNext, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nomeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tipoNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelPreco))
                    .addComponent(codigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(imgImv, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCondominio2)
                            .addComponent(jLabelIPTU2)
                            .addComponent(jLabelArea))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(condominio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelQuartos1)
                                    .addComponent(jLabelBanheiros1)
                                    .addComponent(jLabelSuites1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabelVagas1)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(banheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suites, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabelDiferencial1))
                            .addComponent(vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBBack))
                    .addComponent(jBBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNextTo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBNext)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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

     public void setarCamposImovel(Imovel imv) { 
           
        codigoImovel.setText(String.valueOf(imv.getCodigoImovel()));
        preco.setText(String.valueOf(imv.getPreco()));
        condominio.setText(String.valueOf(imv.getCondominio()));
        IPTU.setText(String.valueOf(imv.getIptu()));
        area.setText(String.valueOf(imv.getArea()));
        tipoNegociacao.setText(String.valueOf(imv.getTipoNegociacao()));
        tipoUso.setText(String.valueOf(imv.getTipoUso()));
        tipoImovel.setText(String.valueOf(imv.getTipoImovel()));
        diferencial1.setText(String.valueOf(imv.getDiferencial()));
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
        cidade.setText(String.valueOf(ende.getCidade()));
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
            });   
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField IPTU;
    private javax.swing.JTextField UF;
    private javax.swing.JTextField area;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField banheiros;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField codigoImovel;
    private javax.swing.JTextField condominio;
    private javax.swing.JTextField dataAtual;
    private javax.swing.JTextArea diferencial1;
    private javax.swing.JLabel imgImv;
    private javax.swing.JButton jBAlugar;
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBBackTo;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBNextTo;
    private javax.swing.JButton jBVender;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelBanheiros1;
    private javax.swing.JLabel jLabelCondominio2;
    private javax.swing.JLabel jLabelDiferencial1;
    private javax.swing.JLabel jLabelIPTU2;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQuartos1;
    private javax.swing.JLabel jLabelSuites1;
    private javax.swing.JLabel jLabelVagas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTImoveisAnunciante;
    private javax.swing.JTextField nomeImg;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quartos;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField suites;
    private javax.swing.JTextField tipoImovel;
    private javax.swing.JTextField tipoNegociacao;
    private javax.swing.JTextField tipoUso;
    private javax.swing.JTextField vagas;
    // End of variables declaration//GEN-END:variables
}
