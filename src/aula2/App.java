package aula2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        int contador = 0;

        do {
            System.out.println("Selecione a opção: ");
            System.out.println("1 - Depositar usuário 1");
            System.out.println("2 - Depositar usuário 2");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                        System.out.print("\n\nDigite o nome do usuário: ");
                        String nome = scan.nextLine();
                        conta1.setNome(nome);
                        conta1.setSaldo(0);

                        System.out.println("Digite o valor que deseja depositar: ");
                        double valor1 = scan.nextDouble(); scan.nextLine();
                        System.out.println("Digite o percentual: ");
                        double percentual1 = scan.nextDouble(); scan.nextLine();
                        conta1.efetuarDeposito(valor1, percentual1);

                        System.out.print("\n" + conta1.getNome() + ", você tem: ");
                        System.out.printf("%.2f na sua conta. \n", conta1.getSaldo());
                        
                        System.out.println("Deseja depositar novamente?");
                        String respota = scan.nextLine();
                    
                    break;

                case 2:
                    System.out.print("\n\nDigite o nome do usuário: ");
                    String nome2 = scan.nextLine();
                    conta2.setNome(nome2);
                    conta2.setSaldo(0);
                    
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valor2 = scan.nextDouble(); scan.nextLine();
                    System.out.println("Digite o percentual: ");
                    double percentual2 = scan.nextDouble(); scan.nextLine();
                    conta1.efetuarDeposito(valor2, percentual2);
                    
                    System.out.print("\n" + conta2.getNome() + ", você tem: ");
                    System.out.printf("%.2f na sua conta. \n", conta2.getSaldo());
                    scan.nextLine();
                    break;
                    
                default:
                    System.out.println("\nDigite uma opção válida!");
                    scan.nextLine();
                    break;
                    
                case 0:
                    System.out.println("Obrigado por usar o sistema!");
                    scan.nextLine();

                    break;
            }
        } while (opc != 0);
    }
}
