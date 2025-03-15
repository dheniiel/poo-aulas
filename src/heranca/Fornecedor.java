package heranca;

/**
 *
 * @author DHENIEL
 */
public class Fornecedor extends Pessoa {
    private String cnpj;
    private double valorProduto, valorImposto;

    public Fornecedor(String cnpj, double valorProduto, double valorImposto, String nome, String idade, String endereco, String etnia, String sexo) {
        super(nome, idade, endereco, etnia, sexo);
        this.cnpj = cnpj;
        this.valorProduto = valorProduto;
        this.valorImposto = valorImposto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double calcularProduto(){
        double produtoLiquido = this.valorProduto + this.valorImposto;
        return produtoLiquido;
    }
    public void imprimirFornecedor() {
        System.out.println("\n\nCPF do Fornecedor: " + this.getCnpj());
        System.out.println("Nome do Fornecedor: " + this.getNome());
        System.out.println("Idade do Fornecedor: " + this.getIdade());
        System.out.println("Endereço do Fornecedor: " + this.getEndereco());
        System.out.println("Etnia do Fornecedor: " + this.getEtnia());
        System.out.println("Sexo do Fornecedor: " + this.getSexo());
        System.out.println("Valor do produto: " + this.getValorProduto());
        System.out.println("Valor do imposto: " + this.getValorImposto());
        System.out.println("Valor líquido: " + this.calcularProduto());
    }
}
