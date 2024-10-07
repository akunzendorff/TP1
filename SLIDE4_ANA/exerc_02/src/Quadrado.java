
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
public class Quadrado {
    
    private Double areaQuadrado;
    private Double perimetroQuadrado;

    public Quadrado() {
        this(0.0, 0.0);
    }

    public Quadrado(Double areaQuadrado, Double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public Double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(Double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public Double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(Double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double ladoA){
        setAreaQuadrado(Math.pow(ladoA, 2));
        return getAreaQuadrado();
    }
    
    public double calcularPerimetro(double ladoA){
        setPerimetroQuadrado(4*ladoA);
        return getPerimetroQuadrado();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Área Quadrado: " + getAreaQuadrado());
        JOptionPane.showMessageDialog(null, "Perímetro Quadrado: " + getPerimetroQuadrado());
    }
    
}
