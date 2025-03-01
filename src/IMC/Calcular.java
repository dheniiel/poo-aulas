package IMC;

public class Calcular {
    
    
    public static float calcularIMC(Pessoa pessoa){
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
        
    }
    
    public String verificarIMC(float imc){
        String resultadoFaixa = "";
        
        if(imc < 18.50){
           resultadoFaixa = "Magreza.";
        }
        else if(imc >= 18.5 && imc <= 24.99){
           resultadoFaixa = "Peso normal.";
        }
        else if(imc >= 25 && imc <= 29.99){
            resultadoFaixa = "Pré obesidade.";
        }
        else if(imc >= 30 && imc <= 34.99){
            resultadoFaixa = "Obesidade Grau I.";
        }
        else if(imc >= 35.00 && imc <= 39.99){
            resultadoFaixa = "Obesidade Grau II.";
        }
        else if(imc >= 40){
            resultadoFaixa = "Obesidade Grau III.";
        }
    
        return resultadoFaixa;
    }
}
