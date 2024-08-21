/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_04;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exerc_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salminimo, salfunc, qtdsal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo: ");
        salminimo = entrada.nextDouble();
        
        System.out.println("Digite o valor do seu salario: ");
        salfunc = entrada.nextDouble();
        
        qtdsal = salfunc/salminimo;
        
        System.out.println("A quantidade de salarios minimos que voce recebe e " + qtdsal);
    }
    
}
