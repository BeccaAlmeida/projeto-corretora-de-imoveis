
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.controller;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model.Usuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//CLASSE USUARIO CONTROLADORA
public class UsuarioController {
    
    //METODO DE INSERÇÃO
    public boolean cadastrarUsuario(String email, String senha) throws Exception {
        
        //CONDIÇÃO DE VÁLIDAÇÃO
        if(isValidEmailAddressRegex(email) && !senha.isEmpty()){
            
            //OBJETO USUÁRIO INSTANCIADO COM CONSTRUTOR
            Usuario usuario = new Usuario(email, senha);
            //CHAMADA DE METODO
            usuario.cadastrarUsuario(usuario);

            return true;
        }
        return false;
    }
    
    //METODO DE VÁLIDAÇÃO DE EMAIL
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
    
    //METODO DE VÁLIDAÇÃO DE USUARIO  CLIENTE EXISTENTE 
    public boolean validarUsuarioCliente(String email, String senha) {
        
        if(isValidEmailAddressRegex(email) && !senha.isEmpty()) {
            
            Usuario loginUsuario = new Usuario(email, senha);
            loginUsuario.validarUsuarioCliente(loginUsuario);
            return true;
        }        
        return false;
    }
    //METODO DE VÁLIDAÇÃO DE USUARIO ANUNCIANTE/PESSOA EXISTENTE 
    public boolean validarUsuarioAnunciante (String email, String senha) {
        if(isValidEmailAddressRegex(email) && !senha.isEmpty()){
            
            Usuario loginUsuario = new Usuario(email, senha);
            loginUsuario.validarUsuarioAnunciante(loginUsuario);
            return true;
        }        
        return false;
    }
}
