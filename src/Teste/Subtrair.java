package Teste;

/**
 *
 * @author aluno
 */
public class Subtrair extends OperacaoMatematica {
    /*
        Indica que o meodo sobreposto (exmplo clássico de polimorfismo)
    */
    @Override
    public double calcular(double x, double y){
        return x - y;
    }
}
