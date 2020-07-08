
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//CLASSE DE CONECÃO COM IMAGENS NO BANCO
public class ImagemDAO {
    
    //METODO DE ADICIONAR IMAGENS
    public void adicionarImagem(Imagem imagem) throws ExceptionDAO {
    
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into imagem(img, nome_imagem) value (?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
            //PARAMETROS DE INSERÇÃO
            pStatement.setBytes(1, imagem.getImg());
            pStatement.setString(2, imagem.getNomeImagem());
            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Imagem inserida com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
     //METODO DE REMOVER IMAGENS POR ID
    public void remove(Imagem imagem) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement;
        
        try {
            
            //INSTRUÇÃO DELETE DO SQL DE DELETAR IMÓVEIS
             pStatement = conn.prepareStatement("delete from imagem where codigo_img=? and img=? ");
             
             //PARAMETROS DE DELETE 
             pStatement.setBytes(1, imagem.getImg());

             //EXECUTAR UPDATE
             pStatement.executeUpdate();
             System.out.println("Removido com sucesso!");
        
        //MENSAGEM DE ERRO NA ATUALIZAÇÃO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao REMOVER do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);
        
        //FINALIZANDO/FECHANDO CONEXÃO   
        }finally {
            ConnectionMVC.closeConnection(conn);
        }
    
    }
    
    //METODO DE LISTAR IMAGENS PARA ANUNCIANTES
    public List<Imagem> listarPorAnunciante(String nomeImg) throws SQLException {
        
        //OBJETO LISTA DE IMÓVEIS
        List<Imagem> imagens = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMÓVEIS
            pStatement = conn.prepareStatement("select * from pessoa inner join anuncio inner join imagem inner join imovel inner join location inner join comodo");
            
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                Imagem imagem = new Imagem();
                
                imagem.setNomeImagem(rs.getString("nome_imagem"));
                imagem.setImg(rs.getBytes("img"));
                
                imagens.add(imagem);   
            }
            //MENSAGEM DE ERRO"
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return imagens;     
    }
    
    
    //METODOS DE LISTAR IMAGENS PARA CLIENTES
    public Imagem listarPorCliente(Integer idImagem) { 
        
         Imagem imagens = null;
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMAGENS
            pStatement = conn.prepareStatement("SELECT * from dados_imovel_cliente;");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            pStatement.setInt(1, idImagem);
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Imagem imagem = new Imagem();
                
                //PARAMETROS DE LISTAGEM
                imagem.setIdImagem(rs.getInt("id_imagem"));
                imagem.setImg((rs.getBytes("img")));
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);
            imagens = null;
        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return imagens;
    }
}


