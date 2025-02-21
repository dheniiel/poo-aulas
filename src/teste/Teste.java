package teste;

import java.util.Date;
import java.util.Scanner;

public class Teste {
    
    public static void imprimir(){
        Date objDate = new Date();
        System.out.println("A data de hoje em mil segundos é: " + objDate.getTime());
    }
    
    public static int mostrarMaior(int a, int b){
        if (a > b){
            System.out.println("O primeiro número é maior! ");
        } else if (a < b){
            System.out.println("O segundo número é maior! ");
        } else {
            System.out.println("os números são iguais! ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int a = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();
        scan.nextLine();
        scan.nextLine();
        
        mostrarMaior(a, b);
        scan.nextLine();
        
        imprimir();
    }
}