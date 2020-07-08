
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImovelDAO;
import java.sql.SQLException;

//CLASSE IMOVEL 
public class Imovel {
    
    //ATRIBUTOS DEFINIDOS
    private int codigoImovel;
    private String tipoUso, tipoNegociacao, tipoImovel,diferencial, preco, iptu, condominio;
    private Integer area;
    
    //COMPOSIÇÃO DO IMOVEL
    private Anuncio anuncio;
    private Location endereco;
    private Comodo comodo;
    private Imagem imagem;
    private Pessoa pessoa;
    private Cliente cliente;
    
    public Imovel(){}
    
    //CONSTRUTOR DE DELETE
    public Imovel(int codigoImovel) {this.codigoImovel = codigoImovel;}
    
    //CONSTRUTOR DE UPDATE
    public Imovel(String preco, String condominio, String iptu, int area, String diferencial) {
        this.preco = preco;
        this.condominio = condominio;
        this.iptu = iptu; 
        this.area = area;
        this.diferencial = diferencial;
    }
    
    //CONSTRUTOR DE INSERT
    public Imovel(String tipoUso, String tipoNegociacao, String tipoImovel,String diferencial, String preco, String iptu, String condominio, int area){
    
        this.tipoUso = tipoUso;
        this.tipoNegociacao = tipoNegociacao;
        this.tipoImovel = tipoImovel;
        this.diferencial = diferencial;
        this.preco = preco;
        this.iptu = iptu;
        this.condominio = condominio;
        this.area = area;
    
    }

    //GETTRS E SETTRS
    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getTipoNegociacao() {
        return tipoNegociacao;
    }

    public void setTipoNegociacao(String tipoNegociacao) {
        this.tipoNegociacao = tipoNegociacao;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(String diferencial) {
        this.diferencial = diferencial;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getIptu() {
        return iptu;
    }

    public void setIptu(String iptu) {
        this.iptu = iptu;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public Location getEndereco() {
        return endereco;
    }

    public void setEndereco(Location endereco) {
        this.endereco = endereco;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //METODOS DE CRUD
    public void cadastrarImovel(Imovel imovel) throws ExceptionDAO{
        new ImovelDAO().cadastrarImovel(imovel);    
    }
    
    public void alterar(Imovel Imovel) throws SQLException {
        new ImovelDAO().alterar(Imovel);
    }
    
    public void remove(Imovel imovel) throws SQLException {
        new ImovelDAO().remove(imovel);
    }

    public void listarPorCliente(Imovel imoveis) throws SQLException {
        new ImovelDAO().listarPorCliente();
        
    }
    
     public void listarPorAnunciante(Imovel imoveis) throws SQLException {
        new ImovelDAO().listarPorAnunciante();
        
    }
    
    public void listar() {
        new ImovelDAO().listar();
    } 
}
