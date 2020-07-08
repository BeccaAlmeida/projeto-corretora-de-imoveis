
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Comodo;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;

//CLASSE COMODO CONTROLLADORA
public class ComodoController {
    
    //METODO DE INSERÇÃO DE COMODOS
    public boolean adicionarComodo(Integer quartos, Integer banheiros, Integer suites, Integer vagas, Imovel imovel) throws Exception{
 
        if(quartos > 0 && banheiros > 0){
            
                Comodo comodo = new Comodo(quartos, banheiros, suites, vagas, imovel);
                comodo.adicionarComodo(comodo);

                return true;
        }
        return false;
    }
}
