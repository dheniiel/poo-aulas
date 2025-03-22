package aula3;

/**
 *
 * @author aluno
 */
public class Leao extends Animal {

    private boolean juba;

    public Leao(boolean juba, Float tamanho, String cor) {
        super(tamanho, cor);
        this.juba = juba;
    }

    Leao() {
    }

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar(String caca) {
        System.out.println("O leão caçou " + caca);
    }

    public void mostrarLeao(String cacaLeao, String alimentoLeao) {
        System.out.println("Leao | " + getTamanho() + " | " + getTamanho() + " | " + getCor() + " | " + isJuba() + " | " + cacaLeao + " | ");
        comer(alimentoLeao);
    }
}
