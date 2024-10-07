/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    
    private String nome;
    private String login;
    private String senha;
    private String email;

    Conexao con = new Conexao();
    
    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarUsuario(){
        String sql;
        sql = "Insert into Usuario(nome, email, login, senha) values" +
              "('" + getNome() + "', '" + getEmail() + "', '" + getLogin() +
              "', '" + getSenha() + "')";
        
        con.executeSQL(sql);
        
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
    }
    
    public ResultSet listarUsuario(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from Usuario";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
}
