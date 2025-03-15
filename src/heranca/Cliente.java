package heranca;

/**
 *
 * @author DHENIEL
 */
public class Cliente extends Pessoa {
    private String cpf;
    private double salario, impostoRenda;

    public Cliente(String cpf, double salario, double impostoRenda, String nome, String idade, String endereco, String etnia, String sexo) {
        super(nome, idade, endereco, etnia, sexo);
        this.cpf = cpf;
        this.salario = salario;
        this.impostoRenda = impostoRenda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImpostoRenda() {
        return impostoRenda;
    }

    public void setImpostoRenda(double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }
    
    public double cacularSalario(){
        double salarioLiquido = this.salario - this.impostoRenda;
        return salarioLiquido;
    }
    
    public void imprimirCliente() {
        System.out.println("\n\nCPF do Cliente: " + this.getCpf());
        System.out.println("Nome do Cliente: " + this.getNome());
        System.out.println("Idade do Cliente: " + this.getIdade());
        System.out.println("Endereço do Cliente: " + this.getEndereco());
        System.out.println("Etnia do Cliente: " + this.getEtnia());
        System.out.println("Sexo do Cliente: " + this.getSexo());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Imposto de renda: " + this.getImpostoRenda());
        System.out.println("Salário líquido: " + this.cacularSalario());
    }
}
