
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Anuncio;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Pessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.PessoaJuridica;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoAnunciante;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.TipoPessoa;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//CLASSE PESSOA JURIDICA CONTROLLADORA
public class PJController {
    
    //METODO DE CADASTRO DE PESSOA
    public boolean cadastrarPessoaJuridica(TipoPessoa tipoPessoa, String razaoSocial, String cnpj, String telefone, String celular, 
                                           TipoAnunciante tipoAnunciante, Usuario usuario, Anuncio anuncio) throws Exception {
        
        //CONDIÇÃO DE VÁLIDAÇÃO
        if(!razaoSocial.isEmpty() && razaoSocial.length() > 10 && !cnpj.equals("  .   .   /    -  ") 
                                  && !cnpj.equals("00.000.000/0000-00") && !celular.equals("(  )     -    ") && !celular.equals("(00)00000-0000")){
            
            
            //OBJETOS DE TIPO INSTANCIADOS PARA INSERÇÃO
            TipoPessoa tpPessoa = TipoPessoa.PESSOAJURÍDICA;
            TipoAnunciante tpAnunciante;
            
            //OBJETO INSTANCIADO PESSOA PARA INSERIR DADOS EM PESSOA
            Pessoa pessoa = new Pessoa(tipoPessoa, telefone, celular, tipoAnunciante);
            //OBJETO INSTANCIADO PESSOAJURIDICA PARA INSERIR DADOS EM PESSOA
            PessoaJuridica pessoaJuridica = new PessoaJuridica(razaoSocial, cnpj, usuario, anuncio);
            
            pessoa.cadastrarPessoa(pessoa);
            pessoaJuridica.inserirPessoaJuridica(pessoaJuridica, pessoa, tipoAnunciante, tipoPessoa);
            
            
            return true;
        }
        return false;
    }
    
    //METODO DE UPDATE
    public boolean alterar(String razaoSocial, String cnpj, String telefone, String celular, String email, String senha) throws SQLException {
        
        //CONDIÇÃO DE VÁLIDAÇÃO
        if(!razaoSocial.isEmpty() && !cnpj.equals("  .   .   /    -  ") && !cnpj.equals("00.000.000/0000-00") && !celular.equals("(  )     -    ") 
                                  && !celular.equals("(00)00000-0000") && isValidEmailAddressRegex(email) && !senha.isEmpty()) {
            
            //OBJETOS INSTANCIADOS PARA UPDATE COM COMPOSIÇÃO
            Pessoa pessoa = new Pessoa(telefone, celular);
            Usuario usuario = new Usuario(email, senha);
            PessoaJuridica pessoaJuridica = new PessoaJuridica(razaoSocial, cnpj);
            pessoaJuridica.alterarPJ(pessoaJuridica, pessoa, usuario);

            return true;
        }
        return false;
    }
    
    //METODO DELETE
    public boolean remove(Integer id_pessoa) throws SQLException {
        if(id_pessoa != null) {
            
            Pessoa pessoa = new Pessoa(id_pessoa);
            pessoa.removePJ(pessoa);
            return true;
        }
        return false;
    }
    
    //VÁLIDAÇÃO DE EMAIL
    public static boolean isValidEmailAddressRegex(String email) {
    boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
}
