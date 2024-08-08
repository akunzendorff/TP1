/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_02;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exerc_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5 ,n6;
        double media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextInt();
        
        System.out.println("Digite a quarta nota: ");
        n4 = entrada.nextInt();
        
        System.out.println("Digite a quinta nota: ");
        n5 = entrada.nextInt();
        
        System.out.println("Digite a sexta nota: ");
        n6 = entrada.nextInt();
        
        media = (n1+n2+n3+n4+n5+n6)/6;
        
        System.out.println("A media aritmetica das notas inseridas sao " + media);
        
    }
    
}
