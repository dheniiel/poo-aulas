package aula2;

public class Conta {
    private double saldo;
    private String nome;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
