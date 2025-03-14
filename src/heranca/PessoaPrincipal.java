package heranca;

/**
 *
 * @author DHENIEL 
 */
public class PessoaPrincipal {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setCpf("000.000.000-17");
        cliente1.setNome("Deno");
        cliente1.setIdade("19");
        cliente1.setEndereco("Rua t1\n\n");
        cliente1.imprimirCliente();
        
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setCnpj("00.000.000/0001-17");
        fornecedor1.setNome("Salame");
        fornecedor1.setIdade("24");
        fornecedor1.setEndereco("Rua t3");
        fornecedor1.imprimirFornecedor();
        
    }
}
