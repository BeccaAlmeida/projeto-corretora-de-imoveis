
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//CLASSE DE CONECÇÃO DE IMOVEIS
public class ImovelDAO {
    
    //METODO DE INSERÇÃO DE DADOS DO IMOVEL
    public void cadastrarImovel(Imovel imovel) throws ExceptionDAO {

        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into imovel (preco, condominio, IPTU, area, tipo_negociacao, tipo_uso, tipo_imovel, diferencial) value (?, ?, ?, ?, ?, ?, ?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
            //PARAMETROS DE INSERÇÃO
            pStatement.setString(1, imovel.getPreco());
            pStatement.setString(2, imovel.getCondominio());
            pStatement.setString(3, imovel.getIptu());
            pStatement.setInt(4, imovel.getArea());
            pStatement.setString(5, imovel.getTipoNegociacao());
            pStatement.setString(6, imovel.getTipoUso());
            pStatement.setString(7, imovel.getTipoImovel());
            pStatement.setString(8, imovel.getDiferencial());
            
            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Imóvel inserido com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO DE ALTERAR DADOS DO IMÓVEL
    public void alterar(Imovel imovel) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        try {
            
            //INSTRUÇÃO DE UPDATE SQL
            pStatement = conn.prepareStatement("update imovel set preco=? where condominio=? and iptu=? and area=? and tipoNegociacao=? and tipoUso=? and tipoImovel=? and diferencial=?");
            
            //PARAMETROS DE UPDATE 
            pStatement.setString(1, imovel.getPreco());
            pStatement.setString(2, imovel.getCondominio());
            pStatement.setString(3, imovel.getIptu());
            pStatement.setInt(4, imovel.getArea());
            pStatement.setString(8, imovel.getDiferencial());
            
            //EXECUTAR UPDATE
            pStatement.executeUpdate();
            System.out.println("Imóvel atualizado com sucesso!");
        
        //MENSAGEM DE ERRO NA ATUALIZAÇÃO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao update no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE); 
            
        //FINALIZANDO/FECHANDO CONEXÃO    
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement);
        }
    }
    
    //METODO DE REMOVER IMÓVEIS POR ID
    public void remove(Imovel imovel) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement;
        
        try {
            
            //INSTRUÇÃO DELETE DO SQL DE DELETAR IMÓVEIS
             pStatement = conn.prepareStatement("delete from imovel where codigo_imovel=?");
             
             //PARAMETROS DE DELETE 
             pStatement.setInt(1, imovel.getCodigoImovel());
             
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
    
    //METODO DE LISTAR IMÓVEIS PARA CLIENTES
    public List<Imovel> listarPorCliente() throws SQLException { 
        
        //OBJETO LISTA DE IMÓVEIS
        List<Imovel> imoveis = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMÓVEIS
            pStatement = conn.prepareStatement("select *from dados_imovel_cliente;");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Imovel imovel = new Imovel();
                
                //PARAMETROS DE LISTAGEM
                imovel.setCodigoImovel(rs.getInt("codigo_imovel"));
                imovel.setPreco(rs.getString("preco"));
                imovel.setCondominio(rs.getString("condominio"));
                imovel.setIptu(rs.getString("IPTU"));
                imovel.setArea(rs.getInt("area"));
                imovel.setTipoNegociacao(rs.getString("tipo_negociacao"));
                imovel.setTipoUso(rs.getString("tipo_uso"));
                imovel.setTipoImovel(rs.getString("tipo_imovel"));
                imovel.setDiferencial(rs.getString("diferencial"));
                
                //OBJETO ADICIONADO A LISTA
                imoveis.add(imovel);    
                    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return imoveis; 
    }
    
    //METODO DE LISTAR IMÓVEIS PARA ANUCIANTES
    public List<Imovel> listarPorAnunciante() throws SQLException {
        
        //OBJETO LISTA DE IMÓVEIS
        List<Imovel> imoveis = new ArrayList<>();        
        
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
                
                //OBJETO UTILIZADO PARA BUSCA
                Imovel imovel = new Imovel();
                //PARAMETROS DE LISTAGEM DO IMOVEL
                imovel.setCodigoImovel(rs.getInt("codigo_imovel"));
                imovel.setPreco(rs.getString("preco"));
                imovel.setCondominio(rs.getString("condominio"));
                imovel.setIptu(rs.getString("iptu"));
                imovel.setArea(rs.getInt("area"));
                imovel.setTipoNegociacao(rs.getString("tipo_negociacao"));
                imovel.setTipoUso(rs.getString("tipo_uso"));
                imovel.setTipoImovel(rs.getString("tipo_imovel"));
                imovel.setDiferencial(rs.getString("diferencial"));
                
                //OBJETO ADICIONADO A LISTA
                imoveis.add(imovel);  
                
                
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return imoveis;     
    }
    
    //METODO PARA EXIBIÇÃO NA TABELA
    public List<Imovel> listar() {
       
        //OBJETO LISTA DE IMÓVEIS
        List<Imovel> imoveis = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMÓVEIS
            pStatement = conn.prepareStatement("SELECT codigo_imovel, preco, condominio, iptu from imovel");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Imovel imovel = new Imovel();
                
                //PARAMETROS DE LISTAGEM
                imovel.setCodigoImovel(rs.getInt("codigo_imovel"));
                imovel.setPreco(rs.getString("preco"));
                imovel.setCondominio(rs.getString("condominio"));
                imovel.setIptu(rs.getString("iptu"));
                
                //OBJETO ADICIONADO A LISTA
                imoveis.add(imovel);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return imoveis;
    }
}

