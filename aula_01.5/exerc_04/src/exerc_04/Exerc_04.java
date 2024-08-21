/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_04;

import java.text.DecimalFormat;
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
        // TODO code application logic here
        String nome;
        double quantmax, estoque, comprar;
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.println("Digite o nome do produto: ");
        nome = ler.next();
        
        System.out.println("Digite a quantidade máxima do produto: ");
        quantmax = ler.nextDouble();
        
        System.out.println("Digite a quatidade em estoque do produto: ");
        estoque = ler.nextDouble();
        
        comprar = quantmax - estoque;
                
        System.out.println("Você deveria comprar "+conv.format(comprar)+" "+nome+".");
        
    }
    
}
