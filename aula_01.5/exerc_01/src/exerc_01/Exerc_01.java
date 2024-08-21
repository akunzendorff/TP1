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
        // TODO code application logic here
        
        double area, raio;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a medida do raio da circunferência: ");
        raio = ler.nextDouble();
        
        area = 3.14*(raio*raio);
        
        System.out.println("A área da circunferência é "+area);
    }
    
}
