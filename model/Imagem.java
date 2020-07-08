
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImagemDAO;
import java.sql.SQLException;

//CLASSE IMAGEM DOS IMÓVEIS
public class Imagem {
    
    //ATRIBUTOS DEFINIDOS
    private int idImagem;
    private byte[] img;
    private String nomeImagem;

    //CONSTRUTOR VAZIO COMO OPÇÃO DE CHAMADA DE METODO
    public Imagem() {}
    
    //CONSTRUTOR UTILIZADO PARA CRUD 
    public Imagem(int idImagem, byte[] img, String nomeImagem) {
    this.img = img;
    this.idImagem = idImagem;

    }
    
    //CONTRUTOR UTILIZADO PARA CRUD DE SELECT
    public Imagem(byte[] img, String nomeImagem) {this.img = img;}

    //GETTRS E SETTRS
    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
        
    }
    
    //METODOS DE CRUD
    public void adicionarImagem(Imagem imagem) throws ExceptionDAO { 
        new ImagemDAO().adicionarImagem(imagem);
    }
    
    public void remover(Imagem imagem) {
    
    }
    
    public void alterar(Imagem imagem) {
    
    }
    
    //METODOS CRUD MELHORADOS PARA ACESSO
    public void listarPorCliente(Imagem imagens) throws SQLException {
        //INSTANCIA DA CLASSE DE CONEXÃO
        new ImagemDAO().listarPorCliente(idImagem);
    }
    
    public void listarPorAnunciante(Imagem imagens) throws SQLException {
        new ImagemDAO().listarPorAnunciante(nomeImagem);
    }
}
