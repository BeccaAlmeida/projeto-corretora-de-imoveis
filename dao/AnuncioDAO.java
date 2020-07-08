
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Comodo;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//CLASSE ANUNCIODAO QUE EFETUA OS SCRIPTS DO BANCO
public class AnuncioDAO {
    
    //METODO DE ADICIONAR ANUNCIO 
    public void adicionarAnuncio(Anuncio anuncio) throws ExceptionDAO{
    
        //CONECÇÃO COM MEU BANCO INSTANCIADA
        Connection conn = ConnectionMVC.getConnection();
        
        //PREPAREDSTATEMENT INICIADO
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into anuncio (data_atual, imovel_anunciado, codigo_img) value (?, ?, ?)";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
            //PARAMETROS DE INSERÇÃO
            pStatement.setString(1, anuncio.getDataAtual());
            
            //OBJETO IMOVEL ISNTANCIADO E PARAMENTROS DEFINIDOS DE INSEÇÃO
            Imovel imoveis = new Imovel();
            imoveis.setCodigoImovel(1);
            pStatement.setInt(2, anuncio.getImoveis().getCodigoImovel());
            
            //OBJETO IMAGEM INSTANCIADO 
            Imagem imagens = new Imagem();
            imagens.setIdImagem(3);
            
            //COMPOSIÃO 
            pStatement.setInt(3, anuncio.getImagens().getIdImagem());
            
            //EXECUTANDO INSTRUÇÃO
            pStatement.executeUpdate();
                //MENSAGEM DE CONFIRMAÇÃO
                System.out.println("Anuncio salvo com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO DELETE NO JDBC MYSQL
    public void remove(Anuncio anuncio) {
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement;
        
        try {
            
            //INSTRUÇÃO DELETE DO SQL DE DELETAR IMÓVEIS
             pStatement = conn.prepareStatement("delete from comodo where codigo_qtdComodo=?;");
             
             //PARAMETROS DE DELETE 
             
             //INSTANCIA DE OBJETO A SER DELETADO
             Comodo comodos = new Comodo();
             comodos.setCodigo_comodo(1);
             pStatement.setInt(1, anuncio.getImoveis().getComodo().getCodigo_comodo());
             
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
    
    //METODO DE BUSCA DE ANUNCIO UTILIZANDO A CLASSE LIST E ARRAYLISTA MELHORADO PARA SELECIONAR IMOVEIS PARA ANUNCIANTES
    public List<Anuncio> listarPorAnunciante() throws SQLException {
        
        //OBJETO LISTA DE COMODOS INSTANCIADO
        List<Anuncio> anuncios = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA ANUNCIO
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR ANUNCIOS JUNTO COM TODOS OS OBJETOS DE COMPOSIÇÃO
            pStatement = conn.prepareStatement("select * from pessoa inner join anuncio inner join imagem inner join imovel inner join location inner join comodo");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Anuncio anuncio = new Anuncio();
                
                //PARAMETROS DE LISTAGEM
                anuncio.setDataAtual(rs.getString("data_atual"));
               
                //OBJETO ADICIONADO A LISTA
                anuncios.add(anuncio);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

         //METODOS CRIADOS PARA   
        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return anuncios;
    }   
    //METODO DE BUSCA DE ANUNCIO UTILIZANDO A CLASSE LIST E ARRAYLISTA MELHORADO PARA SELECIONAR IMOVEIS PARA CLIENTES
    public List<Anuncio> listarPorCliente() throws SQLException {
        
        //OBJETO LISTA DE COMODOS
        List<Anuncio> anuncios = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMÓVEIS FOI CRIADA UMA VIEW PARA DIMINUIR A JUNÃO DAS TABLEAS COM O NOME DADOS_IMOVEL_CLIENTE
            pStatement = conn.prepareStatement("select * from dados_imovel_cliente;");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Anuncio anuncio = new Anuncio();
                
                //PARAMETROS DE LISTAGEM
                anuncio.setDataAtual(rs.getString("data_atual"));
               
                //OBJETO ADICIONADO A LISTA
                anuncios.add(anuncio);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return anuncios;
    }   
}
