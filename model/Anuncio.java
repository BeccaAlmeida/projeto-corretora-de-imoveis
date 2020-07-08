
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.AnuncioDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import java.sql.SQLException;

//CLASSE ANUNCIO QUE GUARDA A DATA DO ANUNCIO CRIADO
public class Anuncio {
    
    //ATRIBUTOS DEFINIDOS
    private int codigo_anuncio;
    private String dataAtual;
    
    //COMPOSIÇÃO DAS COM OUTRAS CLASSES EXISTENTE PARA FACILITAR A BUSCA OU INSERÇÃO
    private Imovel imoveis;
    private Imagem imagens;
    
    //CONTRUTOR VAZIO FACILITANDO A ATUAÇÃO DA CAMADA CONTROLLER
    public Anuncio () {}
    
    
    //CONTRUTOR UTILIZADO PARA O CRUD
    @SuppressWarnings("unchecked")
    public Anuncio(String dataAtual, Imovel imoveis, Imagem imagens){
        this.dataAtual = dataAtual;
        this.imoveis = imoveis;
        this.imagens = imagens;                
    }

    //METODOS GETTRS E SETTRS
    public int getCodigo_anuncio() {
        return codigo_anuncio;
    }

    public void setCodigo_anuncio(int codigo_anuncio) {
        this.codigo_anuncio = codigo_anuncio;
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Imovel getImoveis() {
        return imoveis;
    }

    public void setImoveis(Imovel imoveis) {
        this.imoveis = imoveis;
        imoveis.setCodigoImovel(1);
    }

    public Imagem getImagens() {
        return imagens;
    }

    public void setImagens(Imagem imagens) {
        this.imagens = imagens;
        imagens.setIdImagem(1);
    }
    
    
    //METODOS DE CRUD
    public void adicionarAnuncio(Anuncio anuncio) throws ExceptionDAO {
        //INSTANCIA DA CLASSE DE CONEXÃO
        new AnuncioDAO().adicionarAnuncio(anuncio);
    }
    
    public void aditar(Anuncio anuncio) {
    
    }
    
    public void remover(Anuncio anuncio) {
    
    }
    
    //METODOS DE CRUD MELHORADOS PARA ACESSO DE USUARIO
    public void listarPorAnunciante(Anuncio anuncio) throws SQLException {
        new AnuncioDAO().listarPorAnunciante();
    
    }
    
    public void listarPorCliente(Anuncio anuncio) throws SQLException {
       new AnuncioDAO().listarPorCliente();
    } 
}
