package Teste;

/**
 *
 * @author aluno
 */
public class Somar extends OperacaoMatematica {
    /*
        Indica que o meodo sobreposto (exmplo clássico de polimorfismo)
    */
    @Override
    public double calcular(double x, double y){
        return x + y;
    }
}
