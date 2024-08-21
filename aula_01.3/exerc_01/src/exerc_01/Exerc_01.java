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
        
        int num1, num2, dobro, triplo;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();
        
        dobro = num1*2;
        triplo = num2*3;
        
        System.out.println("O primeiro número digitado foi: " +num1+ ", o dobro deste número é:" +dobro);
        System.out.println("O segundo número digitado foi: " +num2+ ", o triplo deste número é:" +triplo);
        
    }
    
}
