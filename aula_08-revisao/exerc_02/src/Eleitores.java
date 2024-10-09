
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
public class Eleitores {
    
    private int numeroTotalEleitores;
    private int numeroVotosBrancos;
    private int numeroVotosNulos;
    private int numeroVotosValidos;
    private double percBrancos;
    private double percNulos;
    private double percValidos;

    public Eleitores() {
        this(0, 0, 0, 0, 0.0, 0.0, 0.0);
    }

    public Eleitores(int numeroTotalEleitores, int numeroVotosBrancos, int numeroVotosNulos, int numeroVotosValidos, double percBrancos, double percNulos, double percValidos) {
        this.numeroTotalEleitores = numeroTotalEleitores;
        this.numeroVotosBrancos = numeroVotosBrancos;
        this.numeroVotosNulos = numeroVotosNulos;
        this.numeroVotosValidos = numeroVotosValidos;
        this.percBrancos = percBrancos;
        this.percNulos = percNulos;
        this.percValidos = percValidos;
    }

    public int getNumeroTotalEleitores() {
        return numeroTotalEleitores;
    }

    public void setNumeroTotalEleitores(int numeroTotalEleitores) {
        this.numeroTotalEleitores = numeroTotalEleitores;
    }

    public int getNumeroVotosBrancos() {
        return numeroVotosBrancos;
    }

    public void setNumeroVotosBrancos(int numeroVotosBrancos) {
        this.numeroVotosBrancos = numeroVotosBrancos;
    }

    public int getNumeroVotosNulos() {
        return numeroVotosNulos;
    }

    public void setNumeroVotosNulos(int numeroVotosNulos) {
        this.numeroVotosNulos = numeroVotosNulos;
    }

    public int getNumeroVotosValidos() {
        return numeroVotosValidos;
    }

    public void setNumeroVotosValidos(int numeroVotosValidos) {
        this.numeroVotosValidos = numeroVotosValidos;
    }

    public double getPercBrancos() {
        return percBrancos;
    }

    public void setPercBrancos(double percBrancos) {
        this.percBrancos = percBrancos;
    }

    public double getPercNulos() {
        return percNulos;
    }

    public void setPercNulos(double percNulos) {
        this.percNulos = percNulos;
    }

    public double getPercValidos() {
        return percValidos;
    }

    public void setPercValidos(double percValidos) {
        this.percValidos = percValidos;
    }
    
    public void inserirQtdVotos(){
        setNumeroVotosBrancos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quatidade de votos em branco: ")));
        setNumeroVotosNulos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quatidade de votos em nulos: ")));
        setNumeroVotosValidos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quatidade de votos em válidos: ")));
    }
    
    public void calcularTotalEleitores(){
        setNumeroTotalEleitores(getNumeroVotosBrancos() + getNumeroVotosNulos() + getNumeroVotosValidos());
    }
    
    public void calcularPercentualVotos(){
        setPercBrancos((getNumeroVotosBrancos()*100)/getNumeroTotalEleitores());
        setPercNulos((getNumeroVotosNulos()*100)/getNumeroTotalEleitores());
        setPercValidos((getNumeroVotosValidos()*100)/getNumeroTotalEleitores());
    }
    
    public String mostrarPercentual(){
        JOptionPane.showMessageDialog(null, "Percentual de brancos: " + getPercBrancos());
        JOptionPane.showMessageDialog(null, "Percentual de nulos: " + getPercNulos());
        JOptionPane.showMessageDialog(null, "Percentual de válidos: " + getPercValidos());
        return "";
    }
    
}
