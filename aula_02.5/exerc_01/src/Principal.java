
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
        
        CustoPiso piso = new CustoPiso();
        
        int op;
        
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1 - Inserir os valores\n 2 - Calcular o preço\n 3 - Mostrar valores\n 0 - Sair"));
        
        switch(op){
            case 1:
                piso.inserirValores();
                break;
                
            case 2:
                piso.calcularprecoArea();
                break;
            
            case 3:
                piso.mostrarValores();
                break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando...");
                break;
                
            default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
        }
        
        } while(op != 0);
    }
    
}
