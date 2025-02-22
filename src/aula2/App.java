package aula2;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do primeiro usuário: ");
        String nome1 = scan.nextLine();
        conta1.setNome(nome1);
        conta1.setSaldo(0);
        
        System.out.print("\nDigite o valor que gostaria de depositar: ");
        double saldo1 = scan.nextDouble(); scan.nextLine();
        System.out.print("\nDigite o valor percentual do depósito: ");
        double percentual1 = scan.nextDouble(); scan.nextLine();
        conta1.efetuarDeposito(saldo1, percentual1);
        
        System.out.print("Digite o nome do segundo usuário: ");
        String nome2 = scan.nextLine();
        conta2.setNome(nome2);
        conta2.setSaldo(0);
        
        System.out.print("\nDigite o valor que gostaria de depositar: ");
        double saldo2 = scan.nextDouble(); scan.nextLine();
        System.out.print("\nDigite o valor percentual do depósito: ");
        double percentual2 = scan.nextDouble(); scan.nextLine();
        conta2.efetuarDeposito(saldo2, percentual2);
      
        System.out.print("\n" + conta1.getNome() + ", você tem: ");
        System.out.printf("%.2f na sua conta. \n", conta1.getSaldo()) ;
        
        System.out.print("\n"+ conta2.getNome() + ", você tem: ");
        System.out.printf("%.2f na sua conta.", conta2.getSaldo()) ;
    }
}
