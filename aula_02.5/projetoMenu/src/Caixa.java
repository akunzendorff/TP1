
import java.util.Scanner;
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
public class Caixa {
    
    private Double saldo;
    private Double valor;
    
    Scanner ler = new Scanner(System.in);

    public Caixa() {
        this(0.0, 0.0);
    }

    public Caixa(Double saldo, Double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void depositar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: ")));
        
        setSaldo(getSaldo() + getValor());
    }
    
    public void sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));
        
        setSaldo(getSaldo() - getValor());
    }
    
    public double mostrarSaldo(){
        return getSaldo();
    }
    
}
