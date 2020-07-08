
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

public class CanvasHome extends javax.swing.JPanel {
    
    //MODELO DA TABELA INSTANCIADO
    private DefaultTableModel modeloAnunciante = new DefaultTableModel();
    
    //MODELO DE IMAGENS UTILIZADOS NESSA TELA
    BufferedImage imgCadastro;
    BufferedImage imageBuffer = null;
    ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
    byte[] bytesArray;
   
    //INSTANCIA DOS OBJETOS MOSTRADOS
    ImovelDAO listaImoveis = new ImovelDAO();
    AnuncioDAO listaAnuncios = new AnuncioDAO();
    ImagemDAO listaImagens = new ImagemDAO();
    LocationDAO listaEndereco = new LocationDAO();
    ComodoDAO listaComodos = new ComodoDAO();
    
    //INDEX CRIADO
    private int index;
    
    public CanvasHome() throws SQLException {
        try {
            initComponents();
            
            //IMAGEM ADIONADA A TELA COM JPANEL
            this.imgCadastro = ImageIO.read(new File("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\logImv.png"));
        } catch (IOException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //FORMATAÇÃO DO TAMANHO DA IMAGEM
        g.drawImage(imgCadastro.getScaledInstance(780, 550, 0), 0, 0, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogImgImoveis = new javax.swing.JDialog();
        dataAtual = new javax.swing.JTextField();
        tipoNegociacao = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        condominio = new javax.swing.JTextField();
        jLabelIPTU2 = new javax.swing.JLabel();
        IPTU = new javax.swing.JTextField();
        jLabelArea = new javax.swing.JLabel();
        jLabelQuartos1 = new javax.swing.JLabel();
        quartos = new javax.swing.JTextField();
        jLabelBanheiros1 = new javax.swing.JLabel();
        banheiros = new javax.swing.JTextField();
        suites = new javax.swing.JTextField();
        vagas = new javax.swing.JTextField();
        jLabelSuites1 = new javax.swing.JLabel();
        jLabelVagas1 = new javax.swing.JLabel();
        jLabelDiferencial1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diferencial1 = new javax.swing.JTextArea();
        jBAlugar = new javax.swing.JButton();
        tipoImovel = new javax.swing.JTextField();
        rua = new javax.swing.JTextField();
        tipoUso = new javax.swing.JTextField();
        CEP = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        imgImv = new javax.swing.JLabel();
        UF = new javax.swing.JTextField();
        jBNextTo = new javax.swing.JButton();
        jBBack = new javax.swing.JButton();
        area = new javax.swing.JTextField();
        codigoImovel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableImoveisAnunciante = new javax.swing.JTable();
        jBCarregarTabela = new javax.swing.JButton();
        jBVender = new javax.swing.JButton();
        jBNext = new javax.swing.JButton();
        jBBackTo = new javax.swing.JButton();
        jLabelCondominio2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nomeImg = new javax.swing.JTextPane();

        javax.swing.GroupLayout jDialogImgImoveisLayout = new javax.swing.GroupLayout(jDialogImgImoveis.getContentPane());
        jDialogImgImoveis.getContentPane().setLayout(jDialogImgImoveisLayout);
        jDialogImgImoveisLayout.setHorizontalGroup(
            jDialogImgImoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogImgImoveisLayout.setVerticalGroup(
            jDialogImgImoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(760, 550));

        dataAtual.setEditable(false);
        dataAtual.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        dataAtual.setBorder(null);

        tipoNegociacao.setEditable(false);
        tipoNegociacao.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoNegociacao.setBorder(null);

        preco.setEditable(false);
        preco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        preco.setToolTipText("");
        preco.setBorder(null);

        jLabelPreco.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelPreco.setText("Preço:");

        condominio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        condominio.setBorder(null);

        jLabelIPTU2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelIPTU2.setText("IPTU:");

        IPTU.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        IPTU.setBorder(null);

        jLabelArea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelArea.setText("Área");

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

        suites.setEditable(false);
        suites.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        suites.setBorder(null);

        vagas.setEditable(false);
        vagas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        vagas.setBorder(null);

        jLabelSuites1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelSuites1.setText("Suítes");

        jLabelVagas1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelVagas1.setText("Vagas");

        jLabelDiferencial1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelDiferencial1.setText("Diferencial:");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 96));

        diferencial1.setEditable(false);
        diferencial1.setColumns(20);
        diferencial1.setRows(5);
        diferencial1.setBorder(null);
        jScrollPane2.setViewportView(diferencial1);

        jBAlugar.setBackground(new java.awt.Color(0, 204, 255));
        jBAlugar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBAlugar.setText("Imóveis para alugar");

        tipoImovel.setEditable(false);
        tipoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoImovel.setBorder(null);

        rua.setEditable(false);
        rua.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        rua.setBorder(null);

        tipoUso.setEditable(false);
        tipoUso.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tipoUso.setBorder(null);

        CEP.setEditable(false);
        CEP.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        CEP.setToolTipText("");
        CEP.setBorder(null);
        CEP.setPreferredSize(new java.awt.Dimension(0, 0));

        cidade.setEditable(false);
        cidade.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cidade.setBorder(null);

        bairro.setEditable(false);
        bairro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        bairro.setBorder(null);

        imgImv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UF.setEditable(false);
        UF.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        UF.setBorder(null);

        jBNextTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconebackto.png")); // NOI18N
        jBNextTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextToActionPerformed(evt);
            }
        });

        jBBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeBack.png")); // NOI18N
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });

        area.setEditable(false);
        area.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        area.setBorder(null);

        codigoImovel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        codigoImovel.setBorder(null);

        jTableImoveisAnunciante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo_anuncio", "imovel_anunciado", "codigo_img", "data_atual", "codigo_imovel", "preco", "condominio", "IPTU", "tipo_negociacao", "tipo_uso", "tipo_imovel", "diferencial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableImoveisAnunciante);

        jBCarregarTabela.setBackground(new java.awt.Color(0, 204, 255));
        jBCarregarTabela.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBCarregarTabela.setText("+");
        jBCarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarregarTabelaActionPerformed(evt);
            }
        });

        jBVender.setBackground(new java.awt.Color(0, 204, 255));
        jBVender.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jBVender.setText("Imóveis para vender");

        jBNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconeNext.png")); // NOI18N
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });

        jBBackTo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Becca\\Documents\\NetBeansProjects\\topicosintegradores2projetouninabuco2020.1-4periodo\\src\\main\\java\\com\\mycompany\\topicosintegradores2projetouninabuco2020\\corretora\\imagens\\iconenextto.png")); // NOI18N
        jBBackTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackToActionPerformed(evt);
            }
        });

        jLabelCondominio2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabelCondominio2.setText("Condomínio: ");

        nomeImg.setBorder(null);
        jScrollPane3.setViewportView(nomeImg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(tipoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(tipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imgImv, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelPreco)
                                        .addGap(116, 116, 116)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelQuartos1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelBanheiros1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSuites1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelVagas1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(condominio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(IPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelCondominio2)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabelIPTU2)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelArea)
                                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelDiferencial1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(banheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(35, 35, 35)
                                        .addComponent(suites, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jBAlugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCarregarTabela)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jBBack)
                        .addGap(6, 6, 6)
                        .addComponent(jBBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jBNextTo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jBNext))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgImv, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCondominio2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelIPTU2)
                                        .addComponent(jLabelArea)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(condominio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelQuartos1)
                                    .addComponent(jLabelBanheiros1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSuites1)
                                        .addComponent(jLabelVagas1)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quartos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(banheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(suites, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDiferencial1)))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jBCarregarTabela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBBack))
                    .addComponent(jBBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNextTo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBNext)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //AÇÃO DO BOTÃO BACK SETAR O PRIMEIRO VALOR DE INDEX EXISTENTE
    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
        index = 0;
        
        //TRATAMENTO DE ERROS E CAMPOS SETADOS PARA SEREM ATRIBUIDOS
        try {
            
            setarCamposImovel(listaImoveis.listarPorAnunciante().get(index));
            setarCamposAnuncio(listaAnuncios.listarPorCliente().get(index));
            this.carregarImagem();
            setarCamposEndereco(listaEndereco.listarPorCliente().get(index));
            setarCamposComodos(listaComodos.listarPorCliente().get(index));
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBBackActionPerformed

    //AÇÃO DO BOTÃO NEXTTOT SETAR O PROXIMO/VALOR SEGUINTE VALOR DE INDEX EXISTENTE
    private void jBNextToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextToActionPerformed
        index++;
        
        try {
            if(index <= jTableImoveisAnunciante.getRowCount()) {
                setarCamposImovel(listaImoveis.listarPorCliente().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorCliente().get(index));
                this.carregarImagem();
                setarCamposEndereco(listaEndereco.listarPorCliente().get(index));
                setarCamposComodos(listaComodos.listarPorCliente().get(index));
            } else {
                JOptionPane.showMessageDialog(null, "voce está no ultimo registro", "ALERTA!", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBNextToActionPerformed
    //AÇÃO DO BOTÃO NEXT SETAR O ULTIMO VALOR DE INDEX EXISTENTE
    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        index = jTableImoveisAnunciante.getRowCount()-1;
        
        try {
            setarCamposImovel(listaImoveis.listarPorCliente().get(index));
           setarCamposAnuncio(listaAnuncios.listarPorCliente().get(index));
            this.carregarImagem();
            setarCamposEndereco(listaEndereco.listarPorCliente().get(index));
            setarCamposComodos(listaComodos.listarPorCliente().get(index));
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBNextActionPerformed

    //AÇÃO DO BOTÃO BACKTO SETAR O PROXIMO EM DECREMENTO 
    private void jBBackToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackToActionPerformed
        index--;
        
        try {
            if(index >= 0 ) {
                setarCamposImovel(listaImoveis.listarPorCliente().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorCliente().get(index));
                this.carregarImagem();
                setarCamposEndereco(listaEndereco.listarPorCliente().get(index));
                setarCamposComodos(listaComodos.listarPorCliente().get(index));
            } else {
                index = 0;
                JOptionPane.showMessageDialog(null, "voce está no promeiro registro", "ALERTA!", JOptionPane.WARNING_MESSAGE);
                setarCamposImovel(listaImoveis.listarPorCliente().get(index));
                setarCamposAnuncio(listaAnuncios.listarPorCliente().get(index));
                this.carregarImagem();
                setarCamposEndereco(listaEndereco.listarPorCliente().get(index));
                setarCamposComodos(listaComodos.listarPorCliente().get(index));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBBackToActionPerformed

    
    //METODO PARA CARREGAR A TABELA
    private void jBCarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCarregarTabelaActionPerformed
        index = 0;
        try {
            listaImoveis.listarPorAnunciante().get(index);
        } catch (SQLException ex) {
            Logger.getLogger(CanvasHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBCarregarTabelaActionPerformed

    //CAMPOS DO IMÓVEL SETADOSS
    public void setarCamposImovel(Imovel imv) {
    
        codigoImovel.setText(String.valueOf(imv.getCodigoImovel()));
        preco.setText(String.valueOf(imv.getPreco()));
        condominio.setText(String.valueOf(imv.getCondominio()));
        IPTU.setText(String.valueOf(imv.getIptu()));
        tipoNegociacao.setText(String.valueOf(imv.getTipoNegociacao()));
        tipoUso.setText(String.valueOf(imv.getTipoUso()));
        tipoImovel.setText(String.valueOf(imv.getTipoImovel()));
        diferencial1.setText(String.valueOf(imv.getDiferencial()));
    }
    
    //CAMPOS DE IMAGEM SETADOS E FORMATADOS
    public void carregarImagem() throws IOException, SQLException {
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
    
    //CAMPOS DE ANUNCIO SETADOS
    public void setarCamposAnuncio(Anuncio anun) {
        
        dataAtual.setText((anun.getDataAtual()));
    }
    //CAMPOS DE ENDERECO SETADOS
    public void setarCamposEndereco(Location end) {
        
        CEP.setText(String.valueOf(end.getCep()));
        rua.setText(String.valueOf(end.getRua()));
        bairro.setText(String.valueOf(end.getBairro()));
        cidade.setText(String.valueOf(end.getCidade()));
        diferencial1.setText(String.valueOf(end.getComplemento()));
        UF.setText(String.valueOf(end.getUf()));
    }
    //CAMPOS DE COMODO SETADOS
    public void setarCamposComodos (Comodo cm) {
        quartos.setText(String.valueOf(cm.getQuartos()));
        banheiros.setText(String.valueOf(cm.getBanheiros()));
        suites.setText(String.valueOf(cm.getSuites()));
        vagas.setText(String.valueOf(cm.getVagas()));
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
    private javax.swing.JButton jBCarregarTabela;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBNextTo;
    private javax.swing.JButton jBVender;
    private javax.swing.JDialog jDialogImgImoveis;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableImoveisAnunciante;
    private javax.swing.JTextPane nomeImg;
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
