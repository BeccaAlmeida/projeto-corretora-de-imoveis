
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.PFDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.PJDAO;
import java.sql.SQLException;

//CLASSE PESSOA QUE ANUNCIA O IMOVEL
public class Pessoa {
    
    
    
    //ATRIBUTO DE COMPOSIÇÃO COM A CLASSE ENUM TIPO PESSOA
    private TipoPessoa tipoPessoa;
    
    //ATRIBUTOS DEFINIDOS
    private int id_pessoa;
    private String telefone, celular;
    
    //ATRIBUTO DE COMPISOÇÃO  COM  A CLASSE ENUM TIPO ANUNCIANTE
    private TipoAnunciante tipoAnunciante;

    public Pessoa() {}
    
    //CONSTRUTOR UTILIZADO PARA CRUD  DELETE
    public Pessoa(int id_Pessoa) {this.id_pessoa = id_Pessoa;}
    
    //CONSTRUTOR UTILIZADO PARA CRUD DE INSERÇÃO
    public Pessoa(TipoPessoa tipoPessoa, String telefone, String celular, TipoAnunciante tipoAnunciante) {
    this.telefone = telefone;
    this.celular = celular;
    }
    
    //CONSTRUTOR UTILIZADO PARA CRUD DE UPDATE
    public Pessoa(String telefone, String celular) {this.telefone = telefone; this.celular = celular;}

    //GETTRS E SETTRS
    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public TipoAnunciante getTipoAnunciante() {
        return tipoAnunciante;
    }

    public void setTipoAnunciante(TipoAnunciante tipoAnunciante) {
        this.tipoAnunciante = tipoAnunciante;
    }

    //METODOS DE CRUD
    public void cadastrarPessoa(Pessoa pessoa) {
    
    }
    
    public void alterarPJ(PessoaJuridica pessoaJuridica, Pessoa pessoa, Usuario usuario) throws SQLException {
        //INSTANCIA DA CLASSE DE CONEXÃO
        new PJDAO().alterarPJ(pessoaJuridica, pessoa, usuario);
    }
    
    public void alterarPF(PessoaFisica pessoaFisica, Pessoa pessoa, Usuario usuario){
        new PFDAO().alterar(pessoaFisica, pessoa, usuario);
    }
    
    public void removePJ(Pessoa pessoa) throws SQLException {
        new PJDAO().remove(pessoa);
    }
    
    public void removePF(Pessoa pessoa){
    
    }
}
