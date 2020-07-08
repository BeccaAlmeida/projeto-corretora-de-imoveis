
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.PFDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.PJDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//CLASSE PESSOA JURIDICA QUE HERDA ATRIBUTOS DE PESSOA
public class PessoaJuridica extends Pessoa{
    
    //ATRIBUTOS DEFINIDOS
    private String razaoSocial, cnpj;
    
    //COMPOSIÇAO 
    private Usuario usuario;
    private Anuncio anuncio;
    
    public PessoaJuridica() {}
    
    //CONSTRUTOR DE INSERT
    public PessoaJuridica(String razaoSocial, String cnpj, Usuario usuario, Anuncio anuncio){
    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;
    this.usuario = usuario;
    this.anuncio = anuncio;
    }
    
    //CONTRUTOR DE UPDATE
    public PessoaJuridica(String razaoSocial, String cnpj) {this.razaoSocial = razaoSocial; this.cnpj = cnpj;}

    
    //GETTRS E SETTRS
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
    
    
    //METODOS DE CRUD
    public void inserirPessoaJuridica(PessoaJuridica pessoaJuridica, Pessoa pessoa, TipoAnunciante tipoAnunciante, TipoPessoa tipoPessoa) throws ExceptionDAO {
        new PJDAO().inserirPessoaJuridica(pessoaJuridica, pessoa, tipoAnunciante, tipoPessoa);
        
    }
    
    public void alterar(PessoaJuridica pessoaJuridica, Pessoa pessoa, Usuario usuario) throws SQLException, SQLException, SQLException {
        //TRATAMENTO DE ERRO COM TRY CATCH
        try {
            new PJDAO().alterarPJ(pessoaJuridica, pessoa, usuario);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void remover(Pessoa pessoa) throws SQLException {
        new PFDAO().remove(pessoa);
    
    }
}
