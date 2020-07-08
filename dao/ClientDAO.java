
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Cliente;

//CLASSE DE CONEXÃO CLIENTEDAO
public class ClientDAO {
    
    //METODO CRUD INSERT
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO {
    
        //INSTRUÇÃO SQL
        String sql = "insert into cliente (nome, sobrenome, telefone, login_cliente) value (?, ?, ?, ?);";
        
        //PREPARANDO INSTRUÇAO INICIALIZADO
        PreparedStatement pStatement= null;
        Connection connection = null;
        
        //TRATAMENTO DE ERRO
        try {
            //CONECÇÃO
            connection = new ConnectionMVC().getConnection();
            
            //PARAMETROS SETADOS
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getSobrenome());
            pStatement.setString(3, cliente.getTelefone());
            pStatement.setInt(4, cliente.getUsuario().getLogin());

            pStatement.execute();
                System.out.println("Cliente inserido com sucesso!");
            
        } catch (SQLException e) {
             throw new ExceptionDAO("erro ao cadastrar o cliente: " + e);
        
        }finally {
            
            //CONDIÇAO PARA FINALIZAR A CONEXÃO
            try {
                if(pStatement != null) {pStatement.close();} 
                                
            } catch (SQLException e) {
                throw new ExceptionDAO("erro ao fechar o Statement: " + e);
                
            } try {
                
                if(connection != null) {connection.close();}
                
            } catch (SQLException e) {
                throw new ExceptionDAO("erro ao fechar a conexão: " + e);
            }
        
        }
        
    }
}
