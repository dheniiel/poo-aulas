package aula3;

/**
 *
 * @author aluno
 */
public class Animal {

    float tamanho;
    String cor;

    public Animal(Float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    Animal() {
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(String comida) {
        System.out.println(comida);
    }

}
