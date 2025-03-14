package heranca;

/**
 *
 * @author DHENIEL
 */
public class Fornecedor extends Pessoa {

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
