/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_03;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exerc_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias, idade = 17;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        dias = idade * 365; 
        System.out.println("Voce já viveu " + dias + " dias.");
    }
    
}
