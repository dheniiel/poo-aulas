package Escola;

/**
 *
 * @author aluno
 */
public abstract class Professor implements PessoaInterface{
    //exibe a função do professor
    @Override
    public void funcao(){
        System.out.println("Dar aula");
    };
    //Exibe a altura do professor 
    @Override
    public void altura(){
        System.out.println("1.75");
    };
    //Exibe o peso do professor
    @Override
    public void peso(){
        System.out.println("80");
    };
}
