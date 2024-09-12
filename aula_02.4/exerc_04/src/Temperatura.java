
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
public class Temperatura {
    
    private Double celsius;
    private Double fahrenheit;
    
    Scanner ler = new Scanner(System.in);

    public Temperatura() {
        this(0.0, 0.0);
    }

    public Temperatura(Double celsius, Double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public void calcularTempCelsius(double F){
                       
        
        setCelsius((F-32)*(5/9.0));
        
        System.out.println("A temperatura inserida convertida em Celsius é: " + getCelsius());
        
    }
    
    public void calcularTempFahrenheit(double C){
              
        setFahrenheit((C*1.8)+32);
        
        System.out.println("A temperatura inserida convertida em Fahrenheit é: " + getFahrenheit());
        
    }
}
