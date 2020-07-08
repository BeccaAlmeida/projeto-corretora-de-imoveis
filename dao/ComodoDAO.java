
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Comodo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//CLASSE DE CONECÇÃO COM OS COMODOS
public class ComodoDAO {
    
    //METODO DE INSERÇÃO DE COMODOS AO IMÓVEL
    public void adicionarComodo(Comodo comodo) throws ExceptionDAO {
    
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into comodo (quartos, banheiros, suites, vagas, imovel) value (?, ?, ?, ?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
            //PARAMETROS DE INSERÇÃO
            pStatement.setInt(1, comodo.getQuartos());
            pStatement.setInt(2, comodo.getBanheiros());
            pStatement.setInt(3, comodo.getSuites());
            pStatement.setInt(4, comodo.getVagas());
            pStatement.setInt(5, comodo.getImovel().getCodigoImovel());

            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
            System.out.println("comodos inseridos com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO DE ALTERAR COMODOS DO IMÓVEL
    public void alterar(Comodo comodo) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        try {
            
            //INSTRUÇÃO DE UPDATE SQL
            pStatement = conn.prepareStatement("update comodo set quartos=? where banheiros=? and suites=? and vagas=?");
            
            //PARAMETROS DE UPDATE 
            pStatement.setInt(1, comodo.getQuartos());
            pStatement.setInt(2, comodo.getBanheiros());
            pStatement.setInt(3, comodo.getSuites());
            pStatement.setInt(4, comodo.getVagas());

            //EXECUTAR UPDATE
            pStatement.executeUpdate();
            System.out.println("comodos atualizados com sucesso!");
        
        //MENSAGEM DE ERRO NA ATUALIZAÇÃO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao update no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE); 
            
        //FINALIZANDO/FECHANDO CONEXÃO    
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement);
        }
    }
    
    //METODO DE LISTAR POR ANUNCIANTE
    public List<Comodo>  listarPorAnunciante() throws SQLException {
        
        //OBJETO LISTA DE COMODOS
        List<Comodo> comodos = new ArrayList<>();        
        
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
                Comodo comodo = new Comodo();
                
                //PARAMETROS DE LISTAGEM
                comodo.setQuartos(rs.getInt("quartos"));
                comodo.setBanheiros(rs.getInt("banheiros"));
                comodo.setSuites(rs.getInt("suites"));
                comodo.setVagas(rs.getInt("vagas"));

                //OBJETO ADICIONADO A LISTA
                comodos.add(comodo);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return comodos;
    }
    
    //METODO DE LISTAR POR CLIENTE
    public List<Comodo>  listarPorCliente() throws SQLException {
        
        //OBJETO LISTA DE COMODOS
        List<Comodo> comodos = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR IMÓVEIS
            pStatement = conn.prepareStatement("select * from dados_imovel_cliente");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Comodo comodo = new Comodo();
                
                //PARAMETROS DE LISTAGEM
                comodo.setQuartos(rs.getInt("quartos"));
                comodo.setBanheiros(rs.getInt("banheiros"));
                comodo.setSuites(rs.getInt("suites"));
                comodo.setVagas(rs.getInt("vagas"));

                //OBJETO ADICIONADO A LISTA
                comodos.add(comodo);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return comodos;
    }
}    