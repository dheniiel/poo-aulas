package Abstratic;

/**
 *
 * @author aluno
 */
public class ProgramaAnimalAbstract {
   
    public static void main(String[] args) {
        AnimalAbstratic gato = new GatoAbstract();
        System.out.println("A cota diária de leite do gato é:  " + gato.obterCotaDiariaDeLeite());
        
        AnimalAbstratic rato = new RatoAbstract();
        System.out.println("A cota diária de leite do rato é:  " + rato.obterCotaDiariaDeLeite());
    }
}
