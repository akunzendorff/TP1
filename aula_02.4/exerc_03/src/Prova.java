
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
public class Prova {
    private String nome;
    private Double pontos;
    private String nivel;

    public Prova() {
        this("", 0.0, "");
    }

    public Prova(String nome, Double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPontos() {
        return pontos;
    }

    public void setPontos(Double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o nome: ");
        setNome(ler.next());
        
        System.out.println("Insira os pontos obtidos: ");
        setPontos(ler.nextDouble());
        
        if (getPontos() <= 100) {
            
            setNivel("nível 1");
        
        } else if ((getPontos() > 100) && (getPontos() < 200)) {
            
            setNivel("nível 2");
            
        }else if (getPontos() >= 200) {
            
            setNivel("nível 3");
        
        }
        
    }
    
    public void listarResultado(){
        
        System.out.println("** Dados da prova **");
               
        System.out.println("\nNome: " + getNome() + "\nPontos: " + getPontos() + "\nNível: " + getNivel());
    }
    
}
