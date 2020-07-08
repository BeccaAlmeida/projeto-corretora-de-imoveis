
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;


//CLASSE ENUM QUE DEFINE O TIPO DE ANUNCIANTE
public enum TipoAnunciante {
    
    //TIPOS EXISTENTES NO SISTEMA
    PROPRIETÁRIO(1),
    CORRETOR(2),
    IMOBILIÁRIA(3);
    
    //INDEX
    private int valor;
    
    TipoAnunciante(int valor){this.valor = valor;}
    
    //METODO DE CHAMADA DE INDEX
    public int getValor() {
        return this.valor;
    }
    
 }


