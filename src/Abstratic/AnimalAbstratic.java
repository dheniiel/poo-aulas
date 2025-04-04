package Abstratic;

/**
 *
 * @author aluno
 */
public abstract class AnimalAbstratic {
    
    public abstract double obterCotaDiariaDeLeite();
    
    //também é permitido criar métodos não abstratos 
    public void imprimir(){
        System.out.println("Este é um animal");
    }
}
