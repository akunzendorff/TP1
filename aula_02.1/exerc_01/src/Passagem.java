
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
public class Passagem {
    
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    Scanner ler = new Scanner(System.in); 
    
    public Passagem() {
        this("","","","","","","");
    }

    public Passagem(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrarDadosPassageiros(){
        
        System.out.println("Digite o nome do passageiro: ");
        setNomePassageiro(ler.next());
        
        System.out.println("Digite o telefone do passageiro: ");
        setTelefone(ler.next());
        
        System.out.println("Digite o RG do passageiro: ");
        setRG(ler.next());
        
    }
    
    public void cadastrarDadosPassagem(){
              
        System.out.println("Digite o local da viagem: ");
        setLocalViagem(ler.next());
        
        System.out.println("Digite a data da viagem: ");
        setData(ler.next());
        
        System.out.println("Digite o horário da viagem: ");
        setHorario(ler.next());
        
        System.out.println("Digite o número da poltrona: ");
        setNumPoltrona(ler.next());
        
    }
    
    public void mostrarDadosPassageiros(){
        
        System.out.println("\n Dados do Passageiro: ");
        
        System.out.println("\n Nome: " + getNomePassageiro() +
                "\n Telefone: " + getTelefone() + 
                "\n RG: " + getTelefone()
        );
    }
    
    public void mostrarDadosPassagem(){
        
        System.out.println("\n Dados da Passagem: ");
        
        System.out.println("\n Local: " + getLocalViagem() +
                "\n Data: " + getData() + 
                "\n Horário: " + getHorario() +
                "\n Número da poltrona: " + getNumPoltrona()
        );
    }
}
