
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
public class Triangulo {
    
    private double area;
    private double base;
    private double altura;

    public Triangulo() {
        this(0.0, 0.0, 0.0);
    }

    public Triangulo(double area, double base, double altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void inserirDadosTriangulo(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a altura do triangulo: ");
        altura = ler.nextDouble();
        
        System.out.println("Insira a base do triangulo: ");
        base = ler.nextDouble();
    }
    
    public void calcularArea(){
        area = (getBase() * getAltura())/2;
    }
    
    public double mostrarAreaTriangulo(){
        System.out.println("A area do triangulo é " + getArea());
        return area;
    }
    
}
