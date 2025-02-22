package aula2;
import java.util.Scanner;

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
    
    /**
     * 
     * Acumula um valor X mais 10%
     * @param valorDeposito 
     * 
     */
    
    public void efetuarDeposito(double valorDeposito, double percentualDeposito){
        this.saldo += valorDeposito +(valorDeposito * (percentualDeposito / 100));
    }
}
