
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//CLASSE DE CONECÇÃO COM USUARIO
public class LoginDAO {
    
    //METODO INSERT
    public void cadastrarUsuario(Usuario usuario) {
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        
        try {
            
            //PARAMTROS SETADOS
            pStatement = conn.prepareStatement("insert into usuario(email, senha) value(?, ?)");
            pStatement.setString(1, usuario.getEmail());
            pStatement.setString(2, usuario.getSenha());
            
            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Usuário inserido com sucesso!");
            
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao acesso ao banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);
        
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }
    }   
    
    //METODO DE VALIDAÇÃO DE USUARIO CLIENTE
    public void validarUsuarioCliente(Usuario loginUsuario) {
 
        //CONECÇÃO
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        
        try {
            //INSTRUÇÃO
            String sql = "SELECT * FROM cliente c INNER JOIN usuario user ON user.login = c.login WHERE email=? AND senha=?;";
            
            //PARAMENTROS
            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, loginUsuario.getEmail());
            pStatement.setString(2, loginUsuario.getSenha());
            
            //EXECUÇAO
            rs = pStatement.executeQuery();
            
            //CONDIÇÃO DE PECORRER LISTA DE USUARIO
            if(rs.next()){
                System.out.println("Usuário existente.");
            
            }else {
                 System.out.println("Usuário não existe! Cadastre-se.");
            }
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao acesso ao banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);
        
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }
    }   
    
    
    //CLASSE DE CONECÇÃO DO USUARIO ANUNCIANTE/PESSOA
    public void validarUsuarioAnunciante(Usuario loginUsuario) {
        
        //CONECÇÃO
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        
        try {
            //INSTRUÇÃO
            String sql = "SELECT * FROM PESSOA c INNER JOIN usuario user ON user.login = c.login WHERE email=? and senha=?;";
            
            //PARAMETROS SETADOS
            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, loginUsuario.getEmail());
            pStatement.setString(2, loginUsuario.getSenha());
            
            //EXECUÇÃO
            rs = pStatement.executeQuery();
            
            if(rs.next()){
                System.out.println("Usuário existente.");
            
            }else {
                 System.out.println("Usuário não existe! Cadastre-se.");
            }
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao acesso ao banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);
        
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement, rs);
        }
    }
}
