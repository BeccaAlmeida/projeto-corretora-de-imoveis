
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.PFDAO;
import java.sql.SQLException;

//CLASSE PESSOA FISICA QUE HERDA ATRIBUTOS DE PESSOA
public class PessoaFisica extends Pessoa{
    
    //ATRIBUTOS DEFINIDOS
    private String nome, sobrenome, cpf;
    
    //COMPOSIÇÃO DA CLASSE DE USUARIO
    private Usuario usuario;
    
    //COMPOSIÇÃO DA CLASSE DE ANUNCIO
    private Anuncio anuncio;
    
    public PessoaFisica(){}
    
    //CONSTRUTOR DE UPDATE 
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    //CONTRUTOR DE INSERÇÃO
    public PessoaFisica(String nome, String sobrenome, String cpf, Usuario usuario, Anuncio anuncio){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
    this.usuario = usuario;
    this.anuncio = anuncio;
   
    }

    //GETTRS E SETTRS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     public void inserirPessoaFisica(PessoaFisica pessoaFisica, Pessoa pessoa, TipoAnunciante tipoAnunciante, TipoPessoa tipoPessoa) throws ExceptionDAO {
        new PFDAO().inserirPessoaFisica(pessoaFisica, pessoa, tipoAnunciante, tipoPessoa);
    
    }
    
    public void alterar(PessoaFisica pessoaFisica, Pessoa pessoa, Usuario usuario) {
        new PFDAO().alterar(pessoaFisica, pessoa, usuario);
    }
    
    public void remover(Pessoa pessoa) throws SQLException {
        new PFDAO().remove(pessoa);
    }     
}
