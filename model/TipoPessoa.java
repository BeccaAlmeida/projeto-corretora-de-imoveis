
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

//CLASSE ENUM QUE DEFINE TIPOS DE PESSOA E FACILITA A INSERÇÃO NO BANCO
public enum TipoPessoa {
    //TIPO DE PESSOAS ANUNCIANTES DO SISTEMA
    PESSOAFÍSICA(1),
    PESSOAJURÍDICA(2);
    
    //ATRIBUIÇÃO DE INDEX DO TIPO
    private int valor;
    
    TipoPessoa(int valor){this.valor = valor;}
    
    //METODO DE BUSCA
    public int getValor(){
        return this.valor;
    }
}
