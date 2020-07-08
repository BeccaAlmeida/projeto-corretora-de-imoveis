
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Location;

//CAMADA  CONTROLLER SÓ EXISTIRÁ SE OUVER A CAMADA MODEL JA EXISTENTE
// CAMADA CONTROLLER DA CLASSE LOCATIONCONTROLLER
//CLASSE CONTROLLER CONTROLA OS DADOS QUE ENTRAM.
public class LocationController {
    
    //CLASSE ENDERECO CONTROLADORA
    //MÉTODO DE CADASTRO DE ENDEREÇO E SEUS PARAMETROS
    public boolean cadastrarEndereco(String cep, int numero, int andar, String rua, String bairro, String cidade, String complemento, String uf, 
                                     Imovel imovel) throws Exception {
        
        //CONDIÇÃO DE VÁLIDAÇÃO DE PARAMETROS
        if(!cep.equals("00000-000")&& !cep.equals("     -   ") && numero > 0 && rua.length() > 2 && !rua.isEmpty() 
                            && bairro.length() > 2 && !bairro.isEmpty() && cidade.length() > 2 && !cidade.isEmpty() 
                            && uf.length() == 2 && !uf.isEmpty()){
            
            //OBJETO LOCATION ESTANCIADO DA CLASSE LOCATION COM SEUS PARAMETROS
            Location location = new Location(cep, numero, andar, rua, bairro, cidade, complemento, uf, imovel);
            
            //OBJETO LOCATION CRIADO ATRAVEZ DO METÓDO CADASTRARENDERECO
            location.cadastrarEndereco(location);
            
            //VALOR BOOLEANO RETORNADO CASO OS DADOS FOREM VÁLIDOS.
                //SE DADOS VÁLIDOS ELE CRIA UM NOVO ENDERECO.
            return true;
        }
        //VALOR BOOLEANO RETORNADO CASO OS DADOS NÃO SEJAM VÁLIDOS
            //SE DADOS INVÁLIDOS ELE NÃO CRIA E PEDE CORREÇÃO DOS DADOS PRENCHIDOS.
        return false;
    }   
}
