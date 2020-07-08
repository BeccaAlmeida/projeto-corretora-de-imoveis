
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;

//CLASSE ANUNCIO CONTROLLER
public class AnuncioController {
    
    //METODO DE VÁLIDAÇÃO 
    public boolean adicionarAnuncio(String dataAtual, Imovel imoveis, Imagem imagens) throws Exception{
        
        //CONDIÇÃO DE VÁLIDAÇÃO
        if(!dataAtual.equals("00-00-0000")) {
            
            //INSTANCIANDO CLASSE ANUNCIO
            Anuncio anuncio = new Anuncio(dataAtual, imoveis, imagens);
            //CHAMANDO O METODO DE DE INSERÇÃO
            anuncio.adicionarAnuncio(anuncio);
            
            return true;
        }
        return false;
    }

}
