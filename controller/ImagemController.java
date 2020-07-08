
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imagem;

//CLASSE IMAGEM CONTROLLADORA
public class ImagemController {
    
    //METODO DE CADASTRO DE IMAGENS
    public boolean adiconarImagem(byte[] img, String nomeImagem) throws Exception {
        
            Imagem imagem = new Imagem(img, nomeImagem);
            imagem.adicionarImagem(imagem);
            
            return true;
    }
}
