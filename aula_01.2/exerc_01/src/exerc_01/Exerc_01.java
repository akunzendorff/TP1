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
        int salfunc, perc, novosal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario mensal atual: ");
        salfunc = entrada.nextInt();
        
        System.out.println("Digite o percentual de reajuste: ");
        perc = entrada.nextInt();
        
        novosal = salfunc+(salfunc*perc)/100;
        
        System.out.println("O novo salario sera: " + novosal);
    }
    
}
