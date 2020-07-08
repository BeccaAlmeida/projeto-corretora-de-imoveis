
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.LoginDAO;

//CLASSE USUÁRIO QUE ACESSA O SISTEMA
public class Usuario {
    
    //ATRIBUTOS DEFINIDOS
    private int login;
    private String email, senha;
    
    public Usuario() {}
    
    //CONSTRUTOR PARA CRUD DE INSERÇÃO
    public Usuario(String email, String senha) {
    this.email = email;
    this.senha = senha;
    }

    //GETTRS E SETTRS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
    
    //METODOS DE CRUD
    public void cadastrarUsuario(Usuario usuario){
        new LoginDAO().cadastrarUsuario(usuario);
    }
    
    public void validarUsuarioCliente(Usuario usuario){
        new LoginDAO().validarUsuarioCliente(usuario);
    }
    
    public void validarUsuarioAnunciante(Usuario usuario){
        new LoginDAO().validarUsuarioAnunciante(usuario);
    }
    
    public void alterar(Usuario usuario) {

    }
}
