
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
        Triangulo triang = new Triangulo();
    int op;
    
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira: "
            + "\n 1- Inserir os dados do triangulo."
            + "\n 2- Calcular a área do triangulo."
            + "\n 3- Mostrar a área do triangulo."
            + "\n 0- Sair."));
        switch(op){
            case 1:
                triang.inserirDadosTriangulo();
            break;

            case 2:
                triang.calcularArea();
            break;

            case 3:
                triang.mostrarAreaTriangulo();
            break;

            case 0:
                System.out.println("Finalizando...");
            break;

            default:
                System.out.println("Opção inválida!");
            break;
        }
    }while(op != 0);
    }
    
}
