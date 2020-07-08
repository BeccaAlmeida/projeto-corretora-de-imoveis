
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.PessoaFisica;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import javax.swing.JOptionPane;

//CLASSE DE CONECÇÃO PESSOA FISICA
public class PFDAO {
    
    //METODO INSERT
    public void inserirPessoaFisica(PessoaFisica pessoaF, Pessoa pessoa, TipoAnunciante tipoAnunciante, TipoPessoa tipoPessoa) throws ExceptionDAO {
    
        Connection conn = ConnectionMVC.getConnection();
        PreparedStatement pStatement= null;
        
        //BLOCO DE TRATAMENTO DE EXCEÇÕES
        try {
            
            //INSTRUÇÃO SQL DE INSERÇÃO
            String sql = "insert into pessoa (tipo_pessoa, nome, sobrenome, cpf, tipo_anunciante, telefone, celular, login_pessoa, anuncio_pessoa) value (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            //INSERINDO NO BANCO
            pStatement = conn.prepareStatement(sql);
            
                //PARAMETROS DE INSERÇÃO
                pStatement.setObject(1, tipoPessoa.getValor());
                pStatement.setString(2, pessoaF.getNome());
                pStatement.setString(3, pessoaF.getSobrenome());
                pStatement.setString(4, pessoaF.getCpf());
                pStatement.setObject(5, tipoAnunciante.getValor());
                pStatement.setString(6, pessoa.getTelefone());
                pStatement.setString(7, pessoa.getCelular());
                pStatement.setInt(8, pessoaF.getUsuario().getLogin());
                pStatement.setInt(9, pessoaF.getAnuncio().getCodigo_anuncio());
                
            
            //EXECUTANDO INSTRUÇÃO
            pStatement.execute();
                System.out.println("Pessoa Física inseridos com sucesso!");
        
        //ERRO DE INSERÇÃO
        } catch (SQLException ErrorSql) {
             JOptionPane.showMessageDialog(null, "Erro ao adicionar no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE);       
        }      
    }
    
    //METODO UPDATE 
    public void alterar(PessoaFisica pessoaF, Pessoa pessoa, Usuario usuario) {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement = null;
        
        try {
            
            //INSTRUÇÃO DE UPDATE SQL
            pStatement = conn.prepareStatement("update pessoa set nome=? where sobrenome=? and cpf=? and telefone=? and celular=? and email=? and senha=?");
            
            //NECESSARIO CRIAR OUTRA INSTRUÇÃO SQL PARA EXECUTAR ESSE UPDATE
            //PARAMETROS DE UPDATE 
            pStatement.setString(1, pessoaF.getNome());
            pStatement.setString(2, pessoaF.getSobrenome());
            pStatement.setString(3, pessoaF.getCpf());
            pStatement.setString(4, pessoa.getTelefone());
            pStatement.setString(5, pessoa.getCelular());
            pStatement.setString(6, usuario.getEmail());
            pStatement.setString(7, usuario.getSenha());
            //EXECUTAR UPDATE
            pStatement.executeUpdate();
            System.out.println("Pessoa Física atualizados com sucesso!");
        
        //MENSAGEM DE ERRO NA ATUALIZAÇÃO
        } catch (SQLException ErrorSql) {
            JOptionPane.showMessageDialog(null, "Erro ao update no banco: " +ErrorSql,"erro", JOptionPane.ERROR_MESSAGE); 
            
        //FINALIZANDO/FECHANDO CONEXÃO    
        } finally {
            ConnectionMVC.closeConnection(conn, pStatement);
        }
    }
    
    //METODO DELETE POR ID
    public void remove(Pessoa pessoa) throws SQLException {
    
        //OBJETO DE CONEXÃO COM O BANCO MYSQL;
        Connection conn = ConnectionMVC.getConnection();
        
        //OBJETO DE INSTRUÇÃO SQL
        PreparedStatement pStatement;
        
        try {
            
            //INSTRUÇÃO DELETE DO SQL DE DELETAR IMÓVEIS
             pStatement = conn.prepareStatement("delete from pessoa where id_pessoa=?");
             
             //PARAMETROS DE DELETE 
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
