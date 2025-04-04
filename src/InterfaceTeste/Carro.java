package InterfaceTeste;

/**
 *
 * @author aluno
 */
public class Carro implements Veiculo {

    @Override
    public void iniciar() {
        System.out.println("Iniciando...");
    };
    
    @Override
    public void parar() {
        System.out.println("Parando...");
    };
    
}
