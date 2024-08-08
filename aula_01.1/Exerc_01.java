/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_01;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exerc_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, soma, mult, div, sub;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextint();
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextint();
        
        soma = n1+n2;
        mult = n1*n2;
        div = n1/n2;
        sub = n1-n2;
        
        system.out.println("A soma dos números é: " + soma);
        system.out.println("A multiplicação dos números é: " + mult);
        system.out.println("A divisão dos números é: " + div);
        system.out.println("A subtração dos números é: " + sub);
        
    }
    
}
