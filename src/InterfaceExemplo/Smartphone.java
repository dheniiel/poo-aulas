package InterfaceExemplo;

/**
 *
 * @author aluno
 */
public class Smartphone implements GPS, Radio{
    
    @Override
    public void obterCoordenadas(){
        System.out.println("Coordenada: X, Y.");
    }
    @Override
    public void ligarRadio(){
        System.out.println("Ligar rádio.");
    };
    @Override
    public void pararRadio(){
        System.out.println("Parar rádio.");
    };
}
