package heranca;

/**
 *
 * @author DHENIEL
 */
public class Pessoa {

    private String nome, idade, endereco, etnia, sexo;

    public Pessoa(String nome, String idade, String endereco, String etnia, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.etnia = etnia;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
