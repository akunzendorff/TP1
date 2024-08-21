/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc_02;

import java.text.DecimalFormat;
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
        // TODO code application logic here
        String n1, n2, n3;
        double q1, q2, q3, v1, v2, v3, total, vt1, vt2, vt3;
        
        DecimalFormat conv = new DecimalFormat("0.00");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do primeiro produto: ");
        n1 = ler.next();
        
        System.out.println("Digite o valor do primeiro produto: ");
        v1 = ler.nextDouble();
        
        System.out.println("Digite a quatidade do primeiro produto: ");
        q1 = ler.nextDouble();
        
        System.out.println("Digite o nome do segundo produto: ");
        n2 = ler.next();
        
        System.out.println("Digite o valor do segundo produto: ");
        v2 = ler.nextDouble();
        
        System.out.println("Digite a quatidade do segundo produto: ");
        q2 = ler.nextDouble();
        
        System.out.println("Digite o nome do terceiro produto: ");
        n3 = ler.next();
        
        System.out.println("Digite o valor do terceiro produto: ");
        v3 = ler.nextDouble();
        
        System.out.println("Digite a quatidade do terceiro produto: ");
        q3 = ler.nextDouble();
        
        vt1 = v1*q1;
        vt2 = v2*q2;
        vt3 = v3*q3;
        
        total = vt1+vt2+vt3;
        
        System.out.println("Você comprou "+conv.format(q1)+" "+n1+" por R$"+conv.format(v1)+" cada. E pagou R$"+conv.format(vt1)+".");
        System.out.println("Você comprou "+conv.format(q2)+" "+n2+" por R$"+conv.format(v2)+" cada. E pagou R$"+conv.format(vt2)+".");
        System.out.println("Você comprou "+conv.format(q3)+" "+n3+" por R$"+conv.format(v3)+" cada. E pagou R$"+conv.format(vt3)+".");
        System.out.println("No total, você gastou R$"+conv.format(total)+" nos três diferentes itens.");
        
    }
    
}
