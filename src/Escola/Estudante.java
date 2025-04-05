package Escola;

/**
 *
 * @author aluno
 */
public class Estudante implements PessoaInterface {
    //Exibe a função do estudante
    @Override
    public void funcao(){
        System.out.println("Assistir aula");
    };
    //Exibe a altura do estudante
    @Override
    public void altura(){
        System.out.println("1.85");
    };
    //Exibe o peso do estudante 
    @Override
    public void peso(){
        System.out.println("77");
    };
}
