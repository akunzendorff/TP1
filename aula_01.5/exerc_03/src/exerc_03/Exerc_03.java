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
        // TODO code application logic here
        double volume, raio, altura;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a medida do raio do cilindro: ");
        raio = ler.nextDouble();
        
        System.out.println("Insira a medida da altura do cilindro: ");
        altura = ler.nextDouble();
        
        volume = 3.14159*(raio*raio)*altura;
        
        System.out.println("A volume do cilindro é "+volume);
    }
    
}
