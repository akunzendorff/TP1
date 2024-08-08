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
        double valorpago, litros, valorgas = 5.89;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros abastecidos: ");
        litros = entrada.nextInt();
        
        valorpago = litros*valorgas;
        
        System.out.println("O valor a ser pago e " + valorpago);
    }
    
}
