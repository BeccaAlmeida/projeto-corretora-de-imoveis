
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.PessoaJuridica;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import javax.swing.JOptionPane;

//CLASSE DE CONEXÃO PESSOA JURIDICA
public class PJDAO {
    
    //METODO CRUD INSERT
    public void inserirPessoaJuridica(PessoaJuridica pessoaJ, Pessoa pessoa, TipoAnunciante tipoAnunciante, TipoPessoa tipoPessoa) throws ExceptionDAO {
    
        
        //CONECÇÃO
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into pessoa (tipo_pessoa, razao_social, cnpj, telefone, celular, login_pessoa, anuncio_pessoa, tipo_anunciante) value (?, ?, ?, ?, ?, ?, ?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
                //PARAMETROS DE INSERÇÃO SETADOS
                pStatement.setObject(1, pessoa.getTipoPessoa());
                pStatement.setString(2, pessoaJ.getRazaoSocial());
                pStatement.setString(3, pessoaJ.getCnpj());
                pStatement.setString(4, pessoaJ.getTelefone());
                pStatement.setString(5, pessoaJ.getCelular());
                pStatement.setInt(6, pessoaJ.getUsuario().getLogin());
                pStatement.setInt(7, pessoaJ.getAnuncio().getCodigo_anuncio());
                pStatement.setObject(8, pessoa.getTipoAnunciante());
            
   
            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Pessoa Jurídic inserida com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO UPDATE DA CLASSE PRINCIPAL E SUAS COMPOSIÇÕES E HERANÇAS
    public void alterarPJ (PessoaJuridica pessoaJuridica, Pessoa pessoa, Usuario usuario) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement1 = null,  pStatement2 = null;
        
        try {
            
            //INSTRUÇÃO DE UPDATE SQL
            pStatement1 = conn.prepareStatement("update pessoa set razaoSocial=? where cnpj=? and telefone=? and celular=?");
            
                //PARAMETROS DE UPDATE  DE PESSOA JURIDICA E PESSOA
                pStatement1.setString(1, pessoaJuridica.getRazaoSocial());
                pStatement1.setString(2,pessoaJuridica.getCnpj());
                pStatement1.setString(3, pessoa.getTelefone());
                pStatement1.setString(4, pessoa.getCelular());
            
            //PARAMETROS DE UPDATE DE USUARIO
            pStatement2 = conn.prepareStatement("upadate usuario set email=? and senha=?");
                pStatement2.setString(1, usuario.getEmail());
                pStatement2.setString(2, usuario.getSenha());
                
            //EXECUTAR UPDATE
            pStatement1.executeUpdate();
            pStatement2.executeQuery();
                System.out.println("Pessoa Jurídica atualizada com sucesso!");
        
        //MENSAGEM DE ERRO NA ATUALIZAÇÃO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao update no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE); 
            
        //FINALIZANDO/FECHANDO CONEXÃO    
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement1);
            pStatement2.close();
        }
    }
    
    //METODO DELETE ATRAVES DA CLASSE PESSOA
    public void remove(Pessoa pessoa) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement;
        
        try {
            
            //INSTRUÇÃO DELETE DO SQL DE DELETAR IMÓVEIS
             pStatement = conn.prepareStatement("delete from pessoa where id_pessoa=?");
             
            //PARAMETROS DE DELETE POR ID
            pStatement.setInt(1, pessoa.getId_pessoa());

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
}
