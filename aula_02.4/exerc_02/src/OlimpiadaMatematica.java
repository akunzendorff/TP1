
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private Double media;
    private Double notamaior;
    private Double notamenor;
    
    Scanner ler = new Scanner(System.in);

    public OlimpiadaMatematica() {
        this("", "", 0.0, 0.0, 0.0);
    }

    public OlimpiadaMatematica(String nome, String endereco, Double media, Double notamaior, Double notamenor) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamaior = notamaior;
        this.notamenor = notamenor;
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(Double notamaior) {
        this.notamaior = notamaior;
    }

    public Double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(Double notamenor) {
        this.notamenor = notamenor;
    }
    
    public void calcularMedia(){
        
        System.out.println("Insira o nome: ");
        setNome(ler.next());
        
        System.out.println("Insira o endereço: ");
        setEndereco(ler.next());
     
        System.out.println("Insira a menor nota: ");
        setNotamenor(ler.nextDouble());
        
        System.out.println("Insira a maior nota: ");
        setNotamaior(ler.nextDouble());
        
        setMedia((getNotamaior() + getNotamenor())/2);
        
        System.out.println("A média de " + getNome() + " é de " + getMedia());
        
    }
        
        public void verificarMedia(){
            
            if(getMedia() > 9){
                
                System.out.println( getNome() + " está inscrito na Olimpíada de Matemática!");
                
            } else {
                
                System.out.println("A média é insuficiente. Infelizmente, " + getNome() + " não está inscrito na Olimpíada de Matemática.");
                
            }
            
        }
}


