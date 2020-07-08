
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Pessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.PessoaFisica;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import java.sql.SQLException;

//CAMADA  CONTROLLER SÓ EXISTIRÁ SE OUVER A CAMADA MODEL JA EXISTENTE
//CAMADA CONTROLLER DA CLASSE PFCONTROLLER
//CLASSE CONTROLLER CONTROLA OS DADOS QUE ENTRAM.
public class PFController {
    
    //CLASSE CONTROLLER PESSOA FISICA
    //METÓDO DE CADASTRO DE PESSOA FISICA E SEUS PARAMETROS
    public boolean inserirPessoaFisica(TipoPessoa tipoPessoa, String cpf, String telefone, String celular, TipoAnunciante tipoAnunciante, String nome, 
                                       String sobrenome, Usuario usuario, Anuncio anuncio) throws Exception {
        
        //CONDIÇÃO DE VÁLIDAÇÃO DE PARAMETROS
        if(!nome.isEmpty() && !sobrenome.isEmpty() && !cpf.equals("   .   .   -  ") && !cpf.equals("000.000.000-00") 
                           && !celular.equals("(  )     -    ") && !celular.equals("(00)00000-0000") && !celular.equals("(00)00000-1234")) {
            
            //OBJETO PESSOAFISICA ESTANCIADO DA CLASSE PESSOAFISICA COM SEUS PARAMETROS COM COMPOSIÇÃO PARA INSERT
            TipoPessoa tpPessoa = TipoPessoa.PESSOAFÍSICA;
            TipoAnunciante tpAnunciante;
            Pessoa pessoa = new Pessoa(tipoPessoa, telefone, celular, tipoAnunciante);
            PessoaFisica pessoaFisica = new PessoaFisica(nome, sobrenome, cpf, usuario, anuncio);
            
            
            //OBJETO PESSOAFISICA CRIADO ATRAVEZ DO METÓDO CADASTRAR PESSOA FISICA
            pessoa.cadastrarPessoa(pessoa);
            pessoaFisica.inserirPessoaFisica(pessoaFisica, pessoa, tipoAnunciante, tipoPessoa);
            
            //VALOR BOOLEANO RETORNADO CASO OS DADOS FOREM VÁLIDOS.
                //SE DADOS VÁLIDOS ELE CRIA UMA NOVA PESSOAFISICA.
            return true;
        }
        //VALOR BOOLEANO RETORNADO CASO OS DADOS NÃO SEJAM VÁLIDOS
            //SE DADOS INVÁLIDOS ELE NÃO CRIA UM NOV OBJETO PESSOAFISICA
        return false;
    }

    //METODO UPDATE
    public boolean alterar(String razaoSocial, String cnpj, String telefone, String celular, String email, String senha) {
        
        //OBJETOS INSTANCIADOS NECESSÁRIOS PARA UPDATE
        Pessoa pessoa = new Pessoa(telefone, celular);
        Usuario usuario = new Usuario(email, senha);
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.alterar(pessoaFisica, pessoa, usuario);
        
        return true;
    }
    
    //METODO DELETE
    public boolean remove(Integer id_pessoa) throws SQLException {
        if(id_pessoa != null) {
            
            Pessoa pessoa = new Pessoa(id_pessoa);
            pessoa.removePF(pessoa);
            return true;
        }
        return false;
    }
}
