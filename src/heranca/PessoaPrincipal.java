package heranca;
import java.util.Scanner;
/**
 *
 * @author DHENIEL
 */
public class PessoaPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo!");
        System.out.println("Cadastro do cliente, responda abaixo: ");
        
        System.out.print("Digite o cpf: ");
        String cpf = scan.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite a idade: ");
        String idade = scan.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = scan.nextLine();
        System.out.print("Digite a etnia: ");
        String etnia  = scan.nextLine();
        System.out.print("Digito o sexo: ");
        String sexo = scan.nextLine();
        System.out.print("Digite o valor do salário: ");
        double salario = scan.nextDouble();
        scan.nextLine();
        System.out.print("Digite o valor do imposto: ");
        double impostoRenda = scan.nextDouble();
        scan.nextLine();
        
        Cliente cliente1 = new Cliente(cpf, salario, impostoRenda, nome, idade, endereco, etnia, sexo);

        System.out.println("\n\nCadastro do fornecedor, responda abaixo: ");
        
        System.out.print("Digite o cnpj: ");
        String cnpj = scan.nextLine();
        System.out.print("Digite o nome: ");
        String nomef = scan.nextLine(); 
        System.out.print("Digite a idade: ");
        String idadef = scan.nextLine();
        System.out.print("Digite o endereço: ");
        String enderecof = scan.nextLine();
        System.out.print("Digite a etnia: ");
        String etniaf  = scan.nextLine();
        System.out.print("Digito o sexo: ");
        String sexof = scan.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scan.nextDouble();
        scan.nextLine();
        System.out.print("Digite o valor do imposto: ");
        double imposto = scan.nextDouble();
        scan.nextLine();
        
        Fornecedor fornecedor1 = new Fornecedor(cnpj,  valorProduto,  imposto, nomef, idadef, enderecof, etniaf, sexof);
        
        cliente1.imprimirCliente();
        fornecedor1.imprimirFornecedor();
        
//        Cliente cliente1 = new Cliente();
//        cliente1.setCpf("000.000.000-17");
//        cliente1.setNome("Deno");
//        cliente1.setIdade("19");
//        cliente1.setEndereco("Rua t1\n\n");
//        cliente1.imprimirCliente();
//        
//        Fornecedor fornecedor1 = new Fornecedor();
//        fornecedor1.setCnpj("00.000.000/0001-17");
//        fornecedor1.setNome("Salame");
//        fornecedor1.setIdade("24");
//        fornecedor1.setEndereco("Rua t3");
//        fornecedor1.imprimirFornecedor();

    }
}
