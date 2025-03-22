package aula3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo();
        Leao leao = new Leao();
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o tamanho do cavalo: ");
        float tamanhoCav = scan.nextFloat();
        scan.nextLine();
        cavalo.setTamanho(tamanhoCav);

        System.out.print("Informe a cor do cavalo: ");
        cavalo.setCor(scan.nextLine());

        System.out.print("Informe a raça do cavalo: ");
        cavalo.setRaca(scan.nextLine());

        System.out.print("Informe o que o cavalo come: ");
        String alimentoCav = scan.nextLine();

        System.out.print("Informe para onde o cavalo fugiu: ");
        String fugaCav = scan.nextLine();

        System.out.println("\n");

        System.out.print("Informe o tamanho do leão: ");
        float tamanhoLeao = scan.nextFloat();
        scan.nextLine();
        leao.setTamanho(tamanhoCav);

        System.out.print("Informe a cor do leão: ");
        leao.setCor(scan.nextLine());

        System.out.print("Informe se o leão tem juba: ");
        boolean jubaLeao = scan.nextBoolean();
        scan.nextLine();
        leao.setJuba(jubaLeao);

        System.out.print("Informe o que o leão come: ");
        String alimentoLeao = scan.nextLine();

        System.out.print("Informe o que o leão caçou : ");
        String cacaLeao = scan.nextLine();

        System.out.println("\n");
        System.out.print("Animal | Tamanho | Cor | Raça | Especificidade | Especificade | Comida");

        cavalo.mostrarCavalo(fugaCav, alimentoCav);
        leao.mostrarLeao(cacaLeao, alimentoLeao);
    }
}
