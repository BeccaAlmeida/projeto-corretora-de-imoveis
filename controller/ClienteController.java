
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Cliente;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;

//CAMADA  CONTROLLER SÓ EXISTIRÁ SE OUVER A CAMADA MODEL JA EXISTENTE
// CAMADA CONTROLLER DA CLASSE CLIENTECONTROLLER
//CLASSE CONTROLLER CONTROLA OS DADOS QUE ENTRAM.
public class ClienteController {
    
    //METÓDO DE CADASTRO DE CLIENTES E SEUS PARAMETROS
    public boolean cadastrarCliente (String nome, String sobrenome, String telefone, Usuario usuario) throws Exception {
		
        //CONDIÇÃO DE VÁLIDAÇÃO DE PARAMETROS
	if(!nome.isEmpty() && nome.length() > 2 && !sobrenome.isEmpty() && sobrenome.length() > 2 && !telefone.equals("(  )     -    ")
                           && !telefone.equals("(00)00000-0000") && !telefone.equals("(00)00000-4234") 
                           && !telefone.equals("(23)00000-3424")) {                                 
            
            //OBJETO CLIENTE ESTANCIADO DA CLASSE CLIENTE COM SEUS PARAMETROS
            Cliente cliente = new Cliente(nome, sobrenome, telefone, usuario);
            
            //OBJETO CLIENTE CRIADO ATRAVEZ DO METÓDO CADASTRARCLIENTE
            cliente.cadastrarCliente(cliente);
            
            //VALOR BOOLEANO RETORNADO CASO OS DADOS FOREM VÁLIDOS.
                //SE DADOS VÁLIDOS ELE CRIA UM NOVO.
            return true;					
	}
        //VALOR BOOLEANO RETORNADO CASO OS DADOS NÃO SEJAM VÁLIDOS
            //SE DADOS INVÁLIDOS ELE NÃO CRIA UM NOVO OBJETO CLIENTE.
	return false;
    }
}
