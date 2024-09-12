
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
public class Loja {
    
    private String razaoSocial;
    private String cpfCliente;
    private Double qtdItensComp;
    private Double valorCompra;
    private Double valorTotalComp;

    Scanner ler = new Scanner(System.in);
    
    public Loja() {
        this("", "", 0.0, 0.0, 0.0);
    }

    public Loja(String razaoSocial, String cpfCliente, Double qtdItensComp, Double valorCompra, Double valorTotalComp) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.qtdItensComp = qtdItensComp;
        this.valorCompra = valorCompra;
        this.valorTotalComp = valorTotalComp;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(Double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorTotalComp() {
        return valorTotalComp;
    }

    public void setValorTotalComp(Double valorTotalComp) {
        this.valorTotalComp = valorTotalComp;
    }
    
    public void inserirDadosLoja(){
        System.out.println("Digite a Razão Social da Loja: ");
        setRazaoSocial(ler.next());
        
        System.out.println("Digite o CPF do Cliente: ");
        setCpfCliente(ler.next());
        
        System.out.println("Digite o valor unitário do item comprado: ");
        setValorCompra(ler.nextDouble());
        
        System.out.println("Digite a quantidade compradas: ");
        setQtdItensComp(ler.nextDouble());
        
    }
    
    public String mostrarDadosLoja(){
        return "\nRazão Social: " + getRazaoSocial() + "\nCPF do Cliente: " + getCpfCliente();
    }
    
    public Double calcularCompraLoja(){
        setValorTotalComp(getQtdItensComp() * getValorCompra());
        
        return getValorTotalComp();
    }
    
}
