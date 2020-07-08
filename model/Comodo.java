
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ComodoDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import java.sql.SQLException;

//CLASSE COMODO (COMODOS EXISTENTES NO IMOVEL)
public class Comodo {
    
    //ATRIBUTOS DEFINIDOS
    private int codigoQtdComodos, quartos, banheiros, suites, vagas;
    private Imovel imovel;
    
    //CONTRUTOR VAZIO
    public Comodo() {}
    
    //CONTRUTOR UTILIZADO NO CRUD METODO DE INSERÇÃO
    public Comodo(int quartos, int banheiros, int suites, int vagas, Imovel imovel) {
    this.quartos = quartos;
    this.banheiros = banheiros;
    this.suites = suites;
    this.vagas = vagas;
    this.imovel = imovel;
    
    }

    //GETTRS E SETTRS
    public int getCodigo_comodo() {
        return codigoQtdComodos;
    }

    public void setCodigo_comodo(int codigoQtdComodo) {
        this.codigoQtdComodos = codigoQtdComodo;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
    
    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
    //METODOS DO CRUD
     public void adicionarComodo(Comodo comodo) throws ExceptionDAO {
        //INSTANCIA DA CLASSE CONEXÃO
        new ComodoDAO().adicionarComodo(comodo);
        
    }
    
    public void alterar(Comodo comodo) throws SQLException {
        new ComodoDAO().alterar(comodo);
    }
    
    public void listarPorAnunciante() throws SQLException {
        new ComodoDAO().listarPorAnunciante();
    }
    
    public void listarPorCliente() throws SQLException {
        new ComodoDAO().listarPorAnunciante();
    }    
}
    
    
