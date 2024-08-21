
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
public class Cliente {
    
    private String nome;
    private String endereco;
    private String RG;

    public Cliente() {
        this("","","");
    }

    public Cliente(String nome, String endereco, String RG) {
        this.nome = nome;
        this.endereco = endereco;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void cadastrarCliente(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente: ");
        setNome(ler.next());
        
        System.out.println("Digite o endereço do cliente: ");
        setEndereco(ler.next());
        
        System.out.println("Digite o RG do cliente: ");
        setRG(ler.next());
    }
   
    public void listarCliente(){
        
        System.out.println("\n Dados do Cliente: ");
        
        System.out.println("\n Nome: " + getNome() +
                "\n Endereço: " + getEndereco() + 
                "\n RG: " + getRG()
        );
    }
    
}
