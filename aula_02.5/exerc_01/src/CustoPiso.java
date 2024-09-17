
import java.util.Scanner;
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
public class CustoPiso {
    
    private Double comprimentoComodo;
    private Double larguraComodo;
    private Double precoporArea;
    private Double custoTotalComodo;
    
    Scanner ler = new Scanner(System.in);

    public CustoPiso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public CustoPiso(Double comprimentoComodo, Double larguraComodo, Double precoporArea, Double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoporArea = precoporArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public Double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(Double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public Double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(Double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public Double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(Double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public Double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(Double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do comôdo: ")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Inisra a largura do comôdo: ")));
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Inisra o preço do piso por m²: ")));
    }
    
    public void calcularprecoArea(){
        setCustoTotalComodo(getComprimentoComodo()*getLarguraComodo()*getPrecoporArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "O comprimento do comôdo é: " + getComprimentoComodo());
        JOptionPane.showMessageDialog(null, "A largura do comôdo é: " + getLarguraComodo());
        JOptionPane.showMessageDialog(null, "O preço por área para assentar o piso é: " + getPrecoporArea());
        JOptionPane.showMessageDialog(null, "O preço para assentar o piso neste comôdo é: " + getCustoTotalComodo());
    }
    
}
