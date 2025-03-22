package aula3;

/**
 *
 * @author aluno
 */
public class Cavalo extends Animal {

    private String raca;

    public Cavalo(String raca, Float tamanho, String cor) {
        super(tamanho, cor);
        this.raca = raca;
    }

    Cavalo() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void fugir(String fuga) {
        System.out.println("O cavalo fugiu para " + fuga);
    }

    public void mostrarCavalo(String fugaCav, String alimentoCav) {
        System.out.println("Cavalo | " + getTamanho() + " | " + getTamanho() + " | " + getCor() + " | " + getRaca() + " | " + fugaCav + " | ");
        comer(alimentoCav);
    }
}
