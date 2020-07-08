
package com.mycompany.topicosintegradores2projetouninabuco2020.corretora.model;

import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ClientDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ExceptionDAO;
import com.mycompany.topicosintegradores2projetouninabuco2020.corretora.dao.ImovelDAO;
import java.sql.SQLException;

// CAMADA MODEL DA CLASSE CLIENTE. ATRIBUTOS, PARAMETROS E METODOS (GETTERS E SETTERS).
    /*Classe que contém todos os atributos e metódos necessários para do sistema. Os dados de entrada estarão armazenados nas váriaveis 
      com a ajudada DA camada controller*/
public class Cliente extends Usuario {
   
    //AQUI SÃO OS ATRIBUTOS COM ACESSO PRIVADO.
    private int id_cliente;
    private String nome, sobrenome, telefone;
    private Usuario usuario;
	
        //AQUI É O CONSTRUTOR DA CLASSE CLIENTE QUE PERMITE CONSTRUIR OS PARAMETROS DA PRÓPRIA CLASSE EM OUTRA CLASSE ATRAVÉS DA INSTÂNCIA DO OBJETO;
	public Cliente() {}
        
        //CONSTRUTOR UTILIZADO PARA O CRUD
        //AQUI É A DEFINIÇÃO DE PARAMETROS DA CLASSE.
	public Cliente(String nome, String sobrenome, String telefone, Usuario usuario) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.telefone = telefone;
        this.usuario = usuario;
        }

    //METODOS GETTERS E SETTERS
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    //METODOS DO CRUD
    //METODO DE CADASTRO
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
	new ClientDAO().cadastrarCliente(cliente);
    }  
    
    public void alterar(Cliente cliente) {
    
    }
    
    public void remover(Cliente cliente) {
    
    }
    
    //METÓDO DE VISUALIZAR ANUCIOS;
    public void verAnuncios(Cliente anuncio) throws SQLException {
        new ImovelDAO().listarPorCliente();
    }
}
