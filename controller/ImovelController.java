
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Imovel;
import java.sql.SQLException;

//CAMADA  CONTROLLER SÓ EXISTIRÁ SE OUVER A CAMADA MODEL JA EXISTENTE
// CAMADA CONTROLLER DA CLASSE IMOVELCONTROLLER
//CLASSE CONTROLLER CONTROLA OS DADOS QUE ENTRAM.
public class ImovelController {
    
    //METÓDO DE CADASTRO DE IMOVEIS E SEUS PARAMETROS
    public boolean cadastrarImovel(String tipoUso, String tipoNegociacao, String tipoImovel,String diferencial, String preco, String iptu, 
                                   String condominio, int area) throws Exception {

        //CONDIÇÃO DE VÁLIDAÇÃO DE PARAMETROS
        if(!tipoNegociacao.equals("") && !tipoUso.equals("") && !tipoImovel.equals("") && !preco.equals("") && !preco.equals("0")){
            
            //OBJETO IMOVEL ESTANCIADO DA CLASSE IMOVEL COM SEUS PARAMETROS
            Imovel imovel = new Imovel(tipoUso, tipoNegociacao, tipoImovel, diferencial, preco, iptu, condominio, area);
            
            //OBJETO IMOVEL CRIADO ATRAVEZ DO METÓDO CADASTRARIMOVEL
            imovel.cadastrarImovel(imovel);

            //VALOR BOOLEANO RETORNADO CASO OS DADOS FOREM VÁLIDOS.
                //SE DADOS VÁLIDOS ELE CRIA UM NOVO IMOVEL.
            return true;
            }
        
        //VALOR BOOLEANO RETORNADO CASO OS DADOS NÃO SEJAM VÁLIDOS
            //SE DADOS INVÁLIDOS ELE NÃO CRIA UM NOVO OBJETO IMOVEL
        return false;
    }
    
    //METODO DE UPDATE
    public boolean alterar(String preco, String condominio, String iptu, Integer area, String diferencial) throws SQLException {
        
        //CONDIÇÃO DE VÁLIDAÇÃO DE UPDATE
        for(int i=0; i < preco.length(); i++ ) {
            if(Character.isDigit(preco.charAt(i)) && Character.isDigit(condominio.charAt(i)) && Character.isDigit(iptu.charAt(i))){
                
                //OBJETO INSTANCIADO COM O CONSTRUTOR DE UPDATE
                Imovel imovel = new Imovel(preco, condominio, iptu, area, diferencial);
                imovel.alterar(imovel);
                return true;
            }
        }
        return false;
    }
    
    //METODO DELETE REMOVENDO IMOVEL
    public boolean remove (Integer codigoImovel) throws SQLException {
        
        //CONDIÇÃO DE EXECUÇÃO
        if(codigoImovel != 0)  {
            
            Imovel imovel = new Imovel(codigoImovel);
            imovel.remove(imovel);
        }  
        return false;
    }
    
}

