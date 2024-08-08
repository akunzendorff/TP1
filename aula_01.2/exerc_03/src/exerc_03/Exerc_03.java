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
        int qtd, valor,total;
        String  produto;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        produto = entrada.next();
        
        System.out.println("Digite a quantidade comprada: ");
        qtd = entrada.nextInt();
        
        System.out.println("Digite o valor unitário do produto: ");
        valor = entrada.nextInt();
        
        total = qtd*valor;
        
        System.out.println("O produto comprado foi " + produto + " e o valor a ser pago é " + total + ".");
    }
    
}
