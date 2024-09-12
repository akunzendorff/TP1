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
        Loja lj = new Loja();
        lj.inserirDadosLoja();
        
        System.out.println("\n**Dados da loja**" + lj.mostrarDadosLoja());
        System.out.println("O cálculo total é " + lj.calcularCompraLoja());
           
}
}
