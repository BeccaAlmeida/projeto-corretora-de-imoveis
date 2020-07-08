
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.LocationDAO;

//CLASSE LOCATION QUE CONTEM O ENDEREÇO DO IMÓVEL
public class Location {
    
    //ATRIBUTOS DEFINIDOS
    private int codigo_localizacao, numero, andar;
    private String cep, rua, bairro, cidade, complemento, uf;
    private Imovel imovel;
    
    
    public Location() {}
    
    //CONTRUTOR UTILIZADO PARA METODO CRUD INSERT
    public Location(String cep, int numero, int andar, String rua, String bairro, String cidade, String complemento, String uf, Imovel imovel) {
    this.cep = cep;
    this.numero = numero;
    this.andar = andar;
    this.rua = rua;
    this.bairro = bairro;
    this.cidade = cidade;
    this.complemento = complemento;
    this.uf = uf;
    this.imovel = imovel;
    }

    
    //GETTRS E SETTRS
    public int getCodigo_localizacao() {
        return codigo_localizacao;
    }

    public void setCodigo_localizacao(int codigo_localizacao) {
        this.codigo_localizacao = codigo_localizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    //METODE DE CRUD
     public void cadastrarEndereco(Location location) throws ExceptionDAO {
        //INSTANCIA DA CLASSE DE CONEXÃO
        new LocationDAO().cadastrarEndereco(location);
    }
    
    public void alterar(Location location) {
    
    }
    
    public void buscarPorBairro(Location bairro) {
    
    }
    
    public void buscarPorCidade(Location cidade) {
    
    }
    
    public void buscarPorUf(Location uf) {
    
    } 
}
