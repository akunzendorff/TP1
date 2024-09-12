
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
        Caixa cx = new Caixa();
       
        int op;
        //Comando DO-WHILE de repetição para o menu
        do{ 
            //JOptionPane.showInputDialog - Caixa para entrada de valor
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Saldo\n 0 - Sair"));
            
            //Comando de condição SWITCH-CASE para verificar qual opção foi selecionada
            
            switch(op){
                case 1:
                    cx.depositar();
                    break;
                    
                case 2:
                    cx.sacar();
                    break;
                    
                case 3:
                    //JOptionPane.showMessageDialog - Caixa de mensagem para mostrar os valores
                    JOptionPane.showMessageDialog(null, "Saldo Atual: "+ cx.mostrarSaldo());
                    break;
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }while(op != 0);
    }
    
}
