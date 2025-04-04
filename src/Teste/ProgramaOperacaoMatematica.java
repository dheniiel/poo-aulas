package Teste;

/**
 *
 * @author aluno
 */
public class ProgramaOperacaoMatematica {
    
    // Exemplo de utilização de polimofismo
    // Utilizando o método static para poder chamá-lo na mesmas classe 
    public static void calculaOperacao(OperacaoMatematica operacaoMat, double x, double y){
        System.out.println(operacaoMat.calcular(x,y));
    }
    
    public static void main(String[] args) {
        calculaOperacao(new Somar(),10,10);
        calculaOperacao(new Subtrair(),10,10);
        calculaOperacao(new Multiplicacao(),10,10);
        calculaOperacao(new Divisao(),10,10);
    }
}
