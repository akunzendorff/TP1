
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Combustivel {
    
    private Double litros;
    private Double totalGasto;
    private Double km;
    private Double valorComb;

    public Combustivel() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public Combustivel(Double litros, Double totalGasto, Double km, Double valorComb) {
        this.litros = litros;
        this.totalGasto = totalGasto;
        this.km = km;
        this.valorComb = valorComb;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(Double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Double getValorComb() {
        return valorComb;
    }

    public void setValorComb(Double valorComb) {
        this.valorComb = valorComb;
    }
    
    public void calcularLitros(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de quilometros rodados: ");
        setKm(ler.nextDouble());
        
        System.out.println("Digite o valor do combustível: ");
        setValorComb(ler.nextDouble());
        
        setLitros(getKm()/12);
        
        System.out.println("Nesse trajeto foram gastos " + getLitros() + " litros.");
        
        
    }
    
    public Double calcularTotalGasto(){
              
        setTotalGasto(getLitros()*getValorComb());
        
        return getTotalGasto();
        
    }
}
