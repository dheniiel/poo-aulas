package heranca;

/**
 *
 * @author DHENIEL
 */
public class Fornecedor extends Pessoa {

    public Fornecedor(String cnpj, String nome, String idade, String endereco) {
        super(nome, idade, endereco);
        this.cnpj = cnpj;
    }
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirFornecedor() {
        System.out.println("CPF do Fornecedor: " + this.getCnpj());
        System.out.println("Nome do Fornecedor: " + this.getNome());
        System.out.println("Idade do Fornecedor: " + this.getIdade());
        System.out.println("Endereço do Fornecedor: " + this.getEndereco());
    }
}
