
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Location;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//CLASSE DE CONECÇÃO COM ENDEREÇOS
public class LocationDAO {
    
    //METODO DE INSERÇÃO DE ENDEREÇO DO IMOVEL
    public void cadastrarEndereco(Location location) throws ExceptionDAO {

        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into location (cep, numero, andar, rua, bairro, cidade, complemento, uf, imovel_referencia) value (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
                //PARAMETROS DE INSERÇÃO
                pStatement.setString(1, location.getCep());
                pStatement.setInt(2, location.getNumero());
                pStatement.setInt(3, location.getAndar());
                pStatement.setString(4, location.getRua());
                pStatement.setString(5, location.getBairro());
                pStatement.setString(6, location.getCidade());
                pStatement.setString(7, location.getComplemento());
                pStatement.setString(8, location.getUf());
                //UTILIZANDO COMPOSIÇÃO
                pStatement.setInt(9, location.getImovel().getCodigoImovel());

            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Endereço inserido com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO DE ALTERAR ENDEREÇO DO IMOVEL
    public void alterar(Location location) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        try {
            
            //INSTRUÇÃO DE UPDATE SQL
            pStatement = conn.prepareStatement("update location set cep=? where numero=? and andar=? and rua=? and bairro=? and cidade=? and complemento=? and uf=?");
            
                //PARAMETROS DE UPDATE 
                pStatement.setString(1, location.getCep());
                pStatement.setInt(2, location.getNumero());
                pStatement.setInt(3, location.getAndar());
                pStatement.setString(4, location.getRua());
                pStatement.setString(5, location.getBairro());
                pStatement.setString(6, location.getCidade());
                pStatement.setString(7, location.getComplemento());
                pStatement.setString(8, location.getUf());
            
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
    
    //METODO DE SELECT MELHORADA PARA CLIENTES 
    public List<Location> listarPorCliente() throws SQLException {
        
        //OBJETO LISTA DE COMODOS
        List<Location> enderecos = new ArrayList<>();        
        
        //OBJETO DE CONEXÃO COM O BANCO
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        //OBJETO CONJUNTO DE RESULTADOS DA TABELA IMOVEL
        ResultSet rs = null;
        
        try {
            
            //INSTRUÇÃO SQL DE LISTAR ENDEREÇO ATRAVES DE VIEW CRIADA NO JDBC
            pStatement = conn.prepareStatement("select * from dados_imovel_cliente;");
            
            //OBJETO DE RESULTADO DA INSTRUÇÃO
            rs = pStatement.executeQuery();
            
            //PERCORRER OS DADOS DA INSTRUÇÃO
            while(rs.next()) {
                
                //OBJETO UTILIZADO PARA BUSCA
                Location endereco = new Location();
                
                    //PARAMETROS DE LISTAGEM
                    endereco.setCep(rs.getString("cep"));
                    endereco.setRua(rs.getString("rua"));
                    endereco.setNumero(rs.getInt("numero"));
                    endereco.setBairro(rs.getString("bairro"));
                    endereco.setCidade(rs.getString("cidade"));
                    endereco.setUf(rs.getString("uf"));
                    endereco.setAndar(rs.getInt("andar"));
                    endereco.setComplemento(rs.getString("complemento"));
                
                //OBJETO ADICIONADO A LISTA
                enderecos.add(endereco);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return enderecos;
    }   
    
    //METODO DE SELECT MELHORADA PARA ANUNCIANTES/PESSOAS 
    public List<Location> listarPorAnunciante() throws SQLException {
        
        //OBJETO LISTA DE COMODOS
        List<Location> enderecos = new ArrayList<>();        
        
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
                Location endereco = new Location();
                
                    //PARAMETROS DE LISTAGEM
                    endereco.setCep(rs.getString("cep"));
                    endereco.setRua(rs.getString("rua"));
                    endereco.setNumero(rs.getInt("numero"));
                    endereco.setBairro(rs.getString("bairro"));
                    endereco.setCidade(rs.getString("cidade"));
                    endereco.setUf(rs.getString("uf"));

                //OBJETO ADICIONADO A LISTA
                enderecos.add(endereco);    
            }
        
        //MENSAGEM DE ERRO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar do banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);

        //FINALIZAR/FECHAR CONEXÃO
        }finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }      
        return enderecos;
    }   
}
