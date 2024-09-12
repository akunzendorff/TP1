/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Combustivel comb = new Combustivel();
        comb.calcularLitros();
        System.out.println("O total gasto de combustível é " + comb.calcularTotalGasto());
    }
    
}
