package Model;


import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Paciente {
    
    private int codigoPaciente;
    private String nomePaciente;
    private String enderecoPaciente;
    private String complementoPaciente;
    private String rgPaciente;
    private String cpfPaciente;
    private String dataNascPaciente;
    
    Conexao con = new Conexao();

    public Paciente() {
        this(0, "", "", "", "", "", "");
    }

    public Paciente(int codigoPaciente, String nomePaciente, String enderecoPaciente, String complementoPaciente, String rgPaciente, String cpfPaciente, String dataNascPaciente) {
        this.codigoPaciente = codigoPaciente;
        this.nomePaciente = nomePaciente;
        this.enderecoPaciente = enderecoPaciente;
        this.complementoPaciente = complementoPaciente;
        this.rgPaciente = rgPaciente;
        this.cpfPaciente = cpfPaciente;
        this.dataNascPaciente = dataNascPaciente;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getComplementoPaciente() {
        return complementoPaciente;
    }

    public void setComplementoPaciente(String complementoPaciente) {
        this.complementoPaciente = complementoPaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getDataNascPaciente() {
        return dataNascPaciente;
    }

    public void setDataNascPaciente(String dataNascPaciente) {
        this.dataNascPaciente = dataNascPaciente;
    }
    
    public void cadastrar(){           
      String sql= "Insert into Pacientes(codigo, nome, endereco, complemento, rg, cpf, dataNasc)values "+
                "("+this.getCodigoPaciente()+",'"+ this.getNomePaciente()+"','"+this.getEnderecoPaciente()+"', '"+this.getComplementoPaciente()+"', '"+this.getRgPaciente()+"','"+ this.getCpfPaciente()+"', '" + this.getDataNascPaciente() + "' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
        
    public ResultSet consultar(){
       ResultSet tabela;
       tabela = null;
        
        String sql= "Select * from Pacientes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }

    public void excluir(){
        String sql;
        sql= "Delete from Pacientes where codigo = "+ getCodigoPaciente();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterar(){
        String sql;
        sql="Update Pacientes set nome = '" + getNomePaciente() + "', endereco = '" + getEnderecoPaciente() + "', complemento = '" + getComplementoPaciente() + "', rg = '" + getRgPaciente() + "', cpf = '" + getCpfPaciente() + "', dataNasc = '" + getDataNascPaciente() + "' where codigo = " + getCodigoPaciente();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }

    public ResultSet consultarCampoEspecifico(){
           ResultSet tabela;
           tabela = null;

           try{
             String sql="Select * from Pacientes where nome like '"+ getNomePaciente()+"%'";
             tabela= con.RetornarResultset(sql);                  

              }
              catch(Exception sqle){
                   JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
              }
           return tabela;    
       }
    
    
}
