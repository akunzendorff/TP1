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
        int la, lb, perimetro, area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a medida do primeiro lado: ");
        la = entrada.nextInt();
        
        System.out.println("Digite a medida do segundo lado: ");
        lb = entrada.nextInt();
        
        perimetro = (2*la)+(2*lb);
        
        area = la*lb;
        
        System.out.println("A área é " + area + " e o perímetro é " + perimetro + ".");
    }
    
}
