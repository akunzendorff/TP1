
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class CategoriaCliente {
    
    private String nome;
    private Double numeroConta;
    private Double saldoMedio;

    public CategoriaCliente() {
        this("", 0.0, 0.0);
    }

    public CategoriaCliente(String nome, Double numeroConta, Double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(Double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o nome do cliente: ");
        setNome(ler.next());
        
        System.out.println("Insira o número da conta desse cliente: ");
        setNumeroConta(ler.nextDouble());
        
        System.out.println("Insira o saldo médio dessa conta: ");
        setSaldoMedio(ler.nextDouble());
        
        System.out.println("O saldo média dessa conta é R$" + getSaldoMedio() + ". Portanto, " + getNome() + " é um(a) ");
        
        if(getSaldoMedio() < 1000){
            
            System.out.println("cliente comum!");
        
        } else if ((getSaldoMedio() >= 1000) && (getSaldoMedio() < 2500)){
            
            System.out.println("cliente prata!");
            
        } else if (getSaldoMedio() >= 2500){
            
            System.out.println("cliente ouro!");
            
        }
    }
    
}
