
import javax.swing.JOptionPane;

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
        
        Quadrado quad = new Quadrado();
        
        int op;
        int ladoA;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite:"
                    + "\n1 - Calcular Area Quadrado."
                    + "\n2 - Calcular Perímetro Quadrado."
                    + "\n3 - Mostrar valores."
                    + "\n0 - Sair."));
            switch(op){
                case 1:
                    ladoA = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado do quadrado: "));
                    quad.calcularArea(ladoA);
                    break;
                case 2:
                    ladoA = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado do quadrado: "));
                    quad.calcularPerimetro(ladoA);
                    break;
                case 3:
                    quad.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }while( op != 0);
        
    }
    
}
