
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
public class IdadePessoa {
    
    private int ano;
    private int idade;

    public IdadePessoa() {
        this(0,0);
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o ano em que você nasceu: ");
        setAno(ler.nextInt());
        
        idade =  2024 - ano;
    }
    
    public void mostrarIdade(){
        System.out.println("Sua idade é: " + getIdade());
    }
}
