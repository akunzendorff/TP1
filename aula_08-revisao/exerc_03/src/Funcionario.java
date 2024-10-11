
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
public class Funcionario {
    
    private String nomeFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
    private double salarioHora;
    private double salarioFinal;

    public Funcionario() {
    this("", "", "", 0.0, 0.0);
    }

    public Funcionario(String nomeFuncionario, String telefoneFuncionario, String enderecoFuncionario, double salarioHora, double salarioFinal) {
        this.nomeFuncionario = nomeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.salarioHora = salarioHora;
        this.salarioFinal = salarioFinal;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    public void cadastrarFuncionario(){
        setNomeFuncionario(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
        setTelefoneFuncionario(JOptionPane.showInputDialog("Insira o telefone do funcionário: "));
        setEnderecoFuncionario(JOptionPane.showInputDialog("Insira o endereço do funcionário: "));
        setSalarioHora(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário por hora do funcionário: ")));
    }
    
    public double calcularSalarioFinal(int hrTrab){
        setSalarioFinal(hrTrab* getSalarioHora());
        return getSalarioFinal();
    }
    
     public void listarFuncionario(){
         JOptionPane.showMessageDialog(null, "**Dados do Funcionário**"
                 + "\n\nNome: " + getNomeFuncionario()
                 + "\nTelefone: " + getTelefoneFuncionario()
                 + "\nEndereço: " + getEnderecoFuncionario()
                 + "\nSalário por hora: " + getSalarioHora()
                 + "\nSalário final: " + getSalarioFinal());
     }
}
