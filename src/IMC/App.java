package IMC;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calcular calculo = new Calcular();
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int opc = 0;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Calcular IMC");

            System.out.print("\nDigite uma opção: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 0:
                    System.out.println("\nObrigado por usar o sistema!");
                    scan.nextLine();
                    break;
                case 1:
                    System.out.println("\nCÁLCULO DE IMC");

                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scan.nextLine();
                    System.out.print("\nDigite o CPF:  ");
                    String cpf = scan.nextLine();
                    System.out.print("\nDigite o peso: ");
                    float peso = scan.nextFloat();
                    scan.nextLine();
                    System.out.print("\nDigite a altura: ");
                    float altura = scan.nextFloat();
                    scan.nextLine();

                    pessoa.setNome(nome);
                    pessoa.setCpf(cpf);
                    pessoa.setPeso(peso);
                    pessoa.setAltura(altura);
                    float imc = calculo.calcularIMC(peso, altura);

                    System.out.println("-------------------------------");
                    System.out.println("Ficha técnica: ");
                    System.out.print("\nNome: " + pessoa.getNome());
                    System.out.print("\nCPF: " + pessoa.getCpf());
                    System.out.printf("\nPeso: %.2f", pessoa.getPeso());
                    System.out.printf("\nAltura: %.2f", pessoa.getAltura());
                    System.out.printf("\nIMC: %.2f\n", imc);
                    calculo.verificarIMC(imc);
                    System.out.println("\n-----------------------------");

                    scan.nextLine();

                    break;

                default:
                    System.out.println("\nDigite uma opção válida! ");
                    scan.nextLine();
                    break;
            }
        } while (opc != 0);
    }
}
