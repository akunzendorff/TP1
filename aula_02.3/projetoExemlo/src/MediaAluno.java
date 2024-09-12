
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
public class MediaAluno {
    private Double nota1;
    private Double nota2;
    private Double media;
    
    Scanner ler = new Scanner(System.in);

    public MediaAluno() {
        this(0.0, 0.0, 0.0);
    }

    public MediaAluno(Double nota1, Double nota2, Double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
    
    public void calcularMedia(){
       
        System.out.println("Digite a primeira nota: ");
        setNota1(ler.nextDouble());
        
        System.out.println("Digite a segunda nota: ");
        setNota2(ler.nextDouble());
        
        setMedia((getNota1() + getNota2())/2);
        
        System.out.println("A sua média é: " + getMedia());
    }
    
    public void verificarAprovacao(){
        
        if(getMedia() >= 5){
            
            System.out.println("Aluno aprovado!");
            
        }else{
            
        System.out.println("Aluno reprovado.");
        
        } 
    }
    
    public void verificarExame(){
        
        if((getMedia() >= 3) && (getMedia() < 5)){
            
            System.out.println("Aluno classificado para Exame.");
            
        }else if ((getMedia() < 3) || (getMedia() == 0)){
        
            System.out.println("Aluno não classificado para Exame.");
        
        }
    }
}
