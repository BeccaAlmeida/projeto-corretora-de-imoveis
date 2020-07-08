
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CONNECÇÃO COM MEU BANCO
public class ConnectionMVC {
    
    //VARIAVEIS DE CONEXÃO COM O BANCO
    private static final String DRIVE = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/corretora_imoveis?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    //METODO DE CONEXÃO COM O BANCO
    public static Connection getConnection() {

        try {
            
            //CHAMANDO CONEXÃO COM O BANCO
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
         //MENSAGEM DE ERRO DE CONEXÃO   
        } catch (ClassNotFoundException | SQLException ErrorSql) {
            throw new RuntimeException("error:  Não foi possivel fazer a conexão" + ErrorSql);
        }
    }
    
    //METODO DE FECHAMENTO/ENCERRAMENTO DE CONEXÃO COM O BANCO
    public static void closeConnection(Connection conn) {
    
        try {
            if(conn != null)
                conn.close();
            
        } catch (SQLException ErrorSql) {
            throw new RuntimeException("Error: Não foi possivel fechar a conexão." + ErrorSql);
        }
    }
    
    //METODO DE FECHAMENTO/ENCERRAMENTO DA PREPAREDSTATEMENT
    public static void closeConnection(Connection conn, PreparedStatement pStatement) {
        closeConnection(conn);
        try {
            if(pStatement != null)
                pStatement.close();
                
            
        } catch (SQLException ErrorSql) {
            throw new RuntimeException("Error: Não foi possivel fechar o preparedStatement.." + ErrorSql);
        }
    }
    
    //METODO DE FECHAMENTO/ENCERRAMENTO RESULTSET
    public static void closeConnection(Connection conn, PreparedStatement pStatement, ResultSet rs ) {
        closeConnection(conn, pStatement);
    
        try {
            if(rs != null)
                rs.close();
                
        } catch (SQLException ErrorSql) {
            throw new RuntimeException("Error: Não foi possivel fechar o ResultSet" + ErrorSql);
        }
    }
}

