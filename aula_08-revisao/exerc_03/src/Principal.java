
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
        Funcionario func = new Funcionario();
        
        int op, hrTrab;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira:"
                    + "\n1- Cadastrar funcionário."
                    + "\n2- Calcular salário."
                    + "\n3- Listar funcionário."
                    + "\n0- Sair"));
            
            switch(op){
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                break;
                    
                case 1:
                    func.cadastrarFuncionario();
                break;
                    
                case 2:
                    hrTrab = (Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de horas trabalhadas pelo funcionário: " + func.getNomeFuncionario())));
                    func.calcularSalarioFinal(hrTrab);
                break;
                    
                case 3:
                    func.listarFuncionario();
                break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida...");
                break;
                
            }
        }while(op != 0);
    }
    
}
