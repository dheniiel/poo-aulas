package heranca;

/**
 *
 * @author DHENIEL
 */
public class Cliente extends Pessoa {

    public Cliente(String cpf, String nome, String idade, String endereco) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirCliente() {
        System.out.println("CPF do Cliente: " + this.getCpf());
        System.out.println("Nome do Cliente: " + this.getNome());
        System.out.println("Idade do Cliente: " + this.getIdade());
        System.out.println("Endereço do Cliente: " + this.getEndereco());
    }
}
