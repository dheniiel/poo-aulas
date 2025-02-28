package IMC;

public class Calcular {
    
    
    public static float calcularIMC(float peso, float altura){
        float imc = peso / (altura * altura);
        return imc;
    };
    public static void verificarIMC(float imc){
        if(imc < 18.50){
            System.out.print("Magreza.");
        }
        else if(imc >= 18.5 && imc <= 24.99){
            System.out.print("Peso normal.");
        }
        else if(imc >= 25 && imc <= 29.99){
            System.out.print("Pré obesidade.");
        }
        else if(imc >= 30 && imc <= 34.99){
            System.out.print("Obesidade Grau I.");
        }
        else if(imc >= 35.00 && imc <= 39.99){
            System.out.print("Obesidade Grau II");
        }
        else if(imc >= 40){
            System.out.print("Obesidade Grau III.");
        }
    };
}
